//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 0;
<<<<<<< HEAD
		letter = "a";
=======
		letter = a;
>>>>>>> e1aa3b63ddb5ee05711507732c3132ae4086305d
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		for (int i = 0; i < sz; i++)
		{
<<<<<<< HEAD
			for (int j = 0; j < sz-i; j++)
			{
				out.print(" ");
			}
			for(int k = 1; k <= i; k++)
=======
			for (int j = 0; j < count-i; j++)
			{
				out.print( );
			}
			for(int k = 0; k < i-1; k++)
>>>>>>> e1aa3b63ddb5ee05711507732c3132ae4086305d
			{
				out.print(let);
			}
			out.println(let);
		}
	}

	public String getLetter()
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}
