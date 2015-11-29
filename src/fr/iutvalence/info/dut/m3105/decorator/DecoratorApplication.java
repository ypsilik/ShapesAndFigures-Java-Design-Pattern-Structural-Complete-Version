package fr.iutvalence.info.dut.m3105.decorator;

import fr.iutvalence.info.dut.m3105.preamble.Circle;
import fr.iutvalence.info.dut.m3105.preamble.Position;
import fr.iutvalence.info.dut.m3105.preamble.Rectangle;
import fr.iutvalence.info.dut.m3105.preamble.Shape;

public class DecoratorApplication
{
	public static void main(String[] args)
	{
		Shape aCircle = new Circle(3);		
		Shape aRectangle = new Rectangle(2, 7);
		
		Shape aSolidFilledCircle = new SolidFillShapeDecorator(Color.BLACK, aCircle);
		Shape aShadowedAndBordedRectangle = new ShadowShapeDecorator(90, 10, new BorderShapeDecorator(2, aRectangle));
		
		aSolidFilledCircle.draw(new Position(0,0));
		aShadowedAndBordedRectangle.draw(new Position(3,2));
	}
}