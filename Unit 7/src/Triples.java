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


	}

	public void setNum(int num)
	{


	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;



		return 1;
	}

	public String toString()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		String output="";
    		for (int x = 1; x < limit; ++x) 
		{
       			int xx = x * x;
        		int y = x + 1;
        		int z = y + 1;
        		while (z <= limit) 
			{
            			int zz = xx + y * y;
            			while (z * z < zz) 
				{
					++z;
				}
            			if (z * z == zz && z <= limit) 
				{
					if 
                			int a = x;
					int b = y;
					int c = z;
					output = output+ a + ", " + b + ", " + c + "\n";
            			}
            			++y;
        		}
    		}
    		return output + "\n";
	}
