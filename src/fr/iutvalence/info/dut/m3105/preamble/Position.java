package fr.iutvalence.info.dut.m3105.preamble;

public class Position
{
	private final int x;
	private final int y;
	
	public Position(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}

	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}

	@Override
	public String toString()
	{
		return "(" + this.x + "," + this.y + ")";
	}
}
