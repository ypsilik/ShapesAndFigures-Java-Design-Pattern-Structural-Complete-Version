package fr.iutvalence.info.dut.m3105.builder;

import fr.iutvalence.info.dut.m3105.decorator.Color;
import fr.iutvalence.info.dut.m3105.preamble.Circle;
import fr.iutvalence.info.dut.m3105.preamble.Position;
import fr.iutvalence.info.dut.m3105.preamble.Rectangle;
import fr.iutvalence.info.dut.m3105.preamble.Shape;

public class BuilderApplication
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
		
		aSolidFilledCircle.draw(new Position(0,0));
		aShadowedAndBordedRectangle.draw(new Position(3,2));
	}
}