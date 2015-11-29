package fr.iutvalence.info.dut.m3105.composite;

public class ComplexFigure extends Figure
{
	private final Operator operator;
	private final Figure firstFigure;
	private final Figure secondFigure;
	
	public ComplexFigure(Operator operator, Figure fisrtFigure, Figure secondFigure)
	{
		super();
		this.operator = operator;
		this.firstFigure = fisrtFigure;
		this.secondFigure = secondFigure;
	}
	
	public String toString()
	{
		return this.operator+" of (" + this.firstFigure + ") and (" + this.secondFigure+")"; 
	}
}
