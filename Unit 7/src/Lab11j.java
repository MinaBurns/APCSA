//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Lab11j
{
   public static void main(String args[])
   {

		Triples one = new Triples();
		one.setNum(110);
		out.println(one.toString());
		Scanner keyboard = new Scanner(System.in);
		//char response;
		out.print("Enter the upper limit");
		int limit = keyboard.nextInt();
		Triples one = new Triples(limit);
		one.toString();
	}
}
