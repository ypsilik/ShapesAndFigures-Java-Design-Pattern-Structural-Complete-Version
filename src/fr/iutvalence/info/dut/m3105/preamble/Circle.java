package fr.iutvalence.info.dut.m3105.preamble;

public class Circle extends Shape
{
	private final int radius;

	public Circle(int radius)
	{
		this.radius = radius;
	}

	public String toString()
	{
		return "Circle (r="+this.radius+")";
	}
}
