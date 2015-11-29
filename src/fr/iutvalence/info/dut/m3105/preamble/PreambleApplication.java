package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Shape aCircle = new Circle(3);
		Shape aRectangle = new Rectangle(2, 7);
		
		aCircle.draw(new Position(0,0));
		aRectangle.draw(new Position(3,2));
	}
}