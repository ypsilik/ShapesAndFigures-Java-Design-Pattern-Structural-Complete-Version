package fr.iutvalence.info.dut.m3105.decorator;

import fr.iutvalence.info.dut.m3105.preamble.Shape;

public class BorderShapeDecorator extends ShapeDecorator
{
	private final int thickness;
	
	public BorderShapeDecorator(int thickness, Shape decoratedShape)
	{
		super(decoratedShape);
		this.thickness = thickness;
	}
	
	public String toString()
	{
		return super.toString()+", border (t=" + this.thickness + ")";
	}
}
