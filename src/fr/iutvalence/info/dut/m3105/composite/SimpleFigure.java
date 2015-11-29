package fr.iutvalence.info.dut.m3105.composite;

import fr.iutvalence.info.dut.m3105.preamble.Position;
import fr.iutvalence.info.dut.m3105.preamble.Shape;

public class SimpleFigure extends Figure
{
	private final Shape shape;
	private final Position position;
	
	public SimpleFigure(Shape shape, Position position)
	{
		super();
		this.shape = shape;
		this.position = position;
	}

	@Override
	public String toString()
	{
		return this.shape.toString() + " at "+ this.position.toString(); 
	}	
	
}
