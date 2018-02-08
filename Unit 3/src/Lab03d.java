//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		//add test cases
		Distance test1 = new Distance();
		test1.setCoordinates(1,1,2,1);
		test1.calcDistance();
		test1.print();
		
		Distance test2 = new Distance();
		test2.setCoordinates(1,1,-2,2);
		test2.calcDistance();
		test2.print();
		
		Distance test3 = new Distance();
		test3.setCoordinates(1,1,0,0);
		test3.calcDistance();
		test3.print();
		
		
		
			
	}
}