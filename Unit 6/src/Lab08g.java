//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		//add test cases
		LoopStats test1 = new LoopStats();
		test1.setNums(1,5);
		System.out.println(test1.toString());
		System.out.println("Even Count = "+ test1.getEvenCount());
		System.out.println(test1.getOddCount());
		System.out.println(test1.getTotal() + "\n");
		
		LoopStats test2 = new LoopStats();
		test2.setNums(2,8);
		System.out.println(test2.toString());
		System.out.println(test2.getEvenCount());
		System.out.println(test2.getOddCount());
		System.out.println(test2.getTotal() + "\n");
		
		LoopStats test3 = new LoopStats();
		test3.setNums(5,15);
		System.out.println(test3.toString());
		System.out.println(test3.getEvenCount());
		System.out.println(test3.getOddCount());
		System.out.println(test3.getTotal() + "\n");
					
	}
}