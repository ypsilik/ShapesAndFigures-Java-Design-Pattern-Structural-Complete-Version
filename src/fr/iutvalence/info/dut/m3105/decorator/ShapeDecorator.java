package fr.iutvalence.info.dut.m3105.decorator;

import fr.iutvalence.info.dut.m3105.preamble.Shape;


// Defining this class as abstract allows to define a common type for all concrete decorators (border, shadow, solid fill, ...)
// as well as to factorize the definition of decoratedShape field, its initialization, and part of the toString method overriding

public abstract class ShapeDecorator extends Shape
{
	private final Shape decoratedShape;
	
	protected ShapeDecorator(Shape decoratedShape)
	{
		this.decoratedShape = decoratedShape;
	}
	
	public String toString()
	{
		return this.decoratedShape.toString();
	}
}
