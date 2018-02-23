//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		Grades test = new Grades();
		double[] scores =  {100,90,85,72.5,95.6};
		test.setArray(scores);
		System.out.println(test);
		
		Grades test2 = new Grades();
		double[] scores2 =  {50,100,80};
		test2.setArray(scores2);
		System.out.println(test2);
		
		Grades test3 = new Grades();
		double[] scores3 =  {93.40,-90,90};
		test3.setArray(scores3);
		System.out.println(test3);
		
		Grades test4 = new Grades();
		double[] scores4 =  {1.00,2.00,3.00,4.00,5.00,6.00,7.00,8.00,9,00};
		test4.setArray(scores4);
		System.out.println(test4);
		
		
	}
}