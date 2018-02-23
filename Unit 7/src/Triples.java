//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
		toStirng();
	}
	
	private boolean requirementOne(int a, int b, int c)
	{
		if ((a%2 == 0 && b%2 == 1 && c%2 == 1)||(a== 1 && b%2 == 0 && c%2 ==1))
		{
					return true;
		}
		return false;
	}
	
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i = 2; i <= a; i++)
		{
			if(a%i==0 && b%i == 0 && c%i ==0)
			{
				return 0;
			}
		}
		return 1;
	}

	public String toString()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		String output="";
		for (int x = 1; x <number; x++)
		{
			for (int y = 1; y < number; y++)
			{
				for (int z = 1; z < number; z++)
				{
					if (requirementOne(x, y, z) ==true)
					{
						if (greatestCommonFactor(x, y, z) ==1 )
						{
							if (z*z == y*y + x*x)
							{
								a = x;
								b = y;
								c = z;
								output = output + a + ", "+ b + ", "+ c + "\n";
							}
						}
					}
				}
			}
		}

		return output+"\n";
	}
}
    		