//© A+ Computer Science  -  www.apluscompsci.com
//Name - Mina Burns
//Date - 2/7/18
//Class - APCSPA
//Lab  - 02f


public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		setCoordinates( x1, y1, x2, y2);
		calculateSlope();
		print();
	
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope( )
	{
		slope = (((double)yOne - (double)yTwo))/ ((double)xOne-(double)xTwo);



	}

	public void print( )
	{
		System.out.println("the slope is " + slope);



	}
}