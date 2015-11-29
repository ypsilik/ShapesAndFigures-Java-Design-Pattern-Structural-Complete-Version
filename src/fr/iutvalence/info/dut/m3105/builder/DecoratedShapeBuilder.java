package fr.iutvalence.info.dut.m3105.builder;

import fr.iutvalence.info.dut.m3105.decorator.BorderShapeDecorator;
import fr.iutvalence.info.dut.m3105.decorator.Color;
import fr.iutvalence.info.dut.m3105.decorator.ShadowShapeDecorator;
import fr.iutvalence.info.dut.m3105.decorator.SolidFillShapeDecorator;
import fr.iutvalence.info.dut.m3105.preamble.Shape;

public class DecoratedShapeBuilder
{
	private Shape decoratedShape;
	
	public DecoratedShapeBuilder(Shape shape)
	{
		this.decoratedShape = shape;
	}
	
	public Shape getDecoratedShape()
	{
		return this.decoratedShape;
	}

	public DecoratedShapeBuilder addBorder(int thickness)
	{
		this.decoratedShape = new BorderShapeDecorator(thickness, this.decoratedShape);
		return this;
	}
	
	public DecoratedShapeBuilder addShadow(int angle, int intensity)
	{
		this.decoratedShape = new ShadowShapeDecorator(angle, intensity, this.decoratedShape);
		return this;
	}
	
	public DecoratedShapeBuilder addSolidFill(Color color)
	{
		this.decoratedShape = new SolidFillShapeDecorator(color, this.decoratedShape);
		return this;
	}
}
