package fr.iutvalence.info.dut.m3105.composite;

import fr.iutvalence.info.dut.m3105.builder.DecoratedShapeBuilder;
import fr.iutvalence.info.dut.m3105.decorator.Color;
import fr.iutvalence.info.dut.m3105.preamble.Circle;
import fr.iutvalence.info.dut.m3105.preamble.Position;
import fr.iutvalence.info.dut.m3105.preamble.Rectangle;
import fr.iutvalence.info.dut.m3105.preamble.Shape;

public class CompositeApplication
{
	public static void main(String[] args)
	{
		Shape aCircle = new Circle(3);		
		Shape aRectangle = new Rectangle(2, 7);
		
		Shape aSolidFilledCircle = new DecoratedShapeBuilder(aCircle)
								   .addSolidFill(Color.BLACK)
								   .getDecoratedShape();
		
		Shape aShadowedAndBordedRectangle = new DecoratedShapeBuilder(aRectangle)
											.addShadow(90, 10)
											.addBorder(2)
											.getDecoratedShape();
				
		Figure aFirstSimpleFigure = new SimpleFigure(aCircle, new Position(0,0));
		Figure aSecondSimpleFigure = new SimpleFigure(aRectangle, new Position(1,1));
		Figure aThirdSimpleFigure = new SimpleFigure(aShadowedAndBordedRectangle, new Position(3,2));
		
		Figure aComplexFigure = new ComplexFigure(Operator.UNION, aFirstSimpleFigure, aSecondSimpleFigure);
		Figure aMoreComplexFigure = new ComplexFigure(Operator.INTERSECTION, aComplexFigure, aThirdSimpleFigure);
		
		aMoreComplexFigure.draw();
	}
}