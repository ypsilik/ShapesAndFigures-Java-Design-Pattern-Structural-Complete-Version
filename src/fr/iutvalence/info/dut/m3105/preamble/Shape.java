package fr.iutvalence.info.dut.m3105.preamble;

// This class, even if it has no abstract method, is declared as abstract.
// Since shape is a too much abstract concept, it should be forbidden to instanciate such object since
// the draw leads to nothing concrete.

// Defining the class as abstract allows to define a common type for all concrete shapes (circle, rectangle, ...)
// as well as to factorize the code of the draw method (that relies on proper overriding of toString in each subclass)

public abstract class Shape
{
	public void draw (Position position)
	{
		String message = "Drawing [" + this.toString() + "] at "+position.toString(); 
		System.out.println(message);
	}
}
