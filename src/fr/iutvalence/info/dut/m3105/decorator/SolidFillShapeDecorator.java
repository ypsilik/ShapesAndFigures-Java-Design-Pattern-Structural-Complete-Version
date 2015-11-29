package fr.iutvalence.info.dut.m3105.decorator;

import fr.iutvalence.info.dut.m3105.preamble.Shape;

public class SolidFillShapeDecorator extends ShapeDecorator
{
	private final Color color;
	
	public SolidFillShapeDecorator(Color color, Shape decoratedShape)
	{
		super(decoratedShape);
		this.color = color;
	}
	
	public String toString()
	{
		return super.toString()+", solidFill (c=" + this.color.toString() + ")";
	}
}
