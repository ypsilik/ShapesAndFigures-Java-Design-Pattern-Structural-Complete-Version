package fr.iutvalence.info.dut.m3105.decorator;

import fr.iutvalence.info.dut.m3105.preamble.Shape;

public class ShadowShapeDecorator extends ShapeDecorator
{
	private final int angle;
	private final int intensity;
	
	public ShadowShapeDecorator(int angle, int intensity, Shape decoratedShape)
	{
		super(decoratedShape);
		this.angle = angle;
		this.intensity = intensity;
	}
	
	public String toString()
	{
		return super.toString()+", shadow (a=" + this.angle + ", i=" + this.intensity+")";
	}
}
