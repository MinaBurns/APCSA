//© A+ Computer Science  -  www.apluscompsci.com
//Name - Mina Burns
//Date - 2/7/18
//Class - APCSPA
//Lab  - 02e

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
		area = 3.14159*radius*radius;
	}

	public void print( )
	{
		System.out.println("The area is :: " + area);
	}
}