//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   //A

		//add more test cases
		out.print("Enter a letter :: ");
		char letter2 = keyboard.next().charAt(0);
		CharacterAnalyzer test2 = new CharacterAnalyzer(letter2);
		test2.setChar(letter2);
		test2.getASCII();
		out.println(test2); 
		
		out.print("Enter a letter :: ");
		char letter3 = keyboard.next().charAt(0);
		CharacterAnalyzer test3 = new CharacterAnalyzer(letter3);
		test3.setChar(letter3);
		test3.getASCII();
		out.println(test3); 
		
		out.print("Enter a letter :: ");
		char letter4 = keyboard.next().charAt(0);
		CharacterAnalyzer test4 = new CharacterAnalyzer(letter4);
		test4.setChar(letter4);
		test4.getASCII();
		out.println(test4); 
		
		out.print("Enter a letter :: ");
		char letter5 = keyboard.next().charAt(0);
		CharacterAnalyzer test5 = new CharacterAnalyzer(letter5);
		test5.setChar(letter5);
		test5.getASCII();
		out.println(test5.toString()); 
		
		out.print("Enter a letter :: ");
		char letter6 = keyboard.next().charAt(0);
		CharacterAnalyzer test6 = new CharacterAnalyzer(letter6);
		test6.setChar(letter6);
		test6.getASCII();
		out.println(test6); 
		
		out.print("Enter a letter :: ");
		char letter7 = keyboard.next().charAt(0);
		CharacterAnalyzer test7 = new CharacterAnalyzer(letter7);
		test7.setChar(letter7);
		test7.getASCII();
		out.println(test7); 
		
		out.print("Enter a letter :: ");
		char letter8 = keyboard.next().charAt(0);
		CharacterAnalyzer test8 = new CharacterAnalyzer(letter8);
		test8.setChar(letter8);
		test8.getASCII();
		out.println(test8); 
		
		out.print("Enter a letter :: ");
		char letter9 = keyboard.next().charAt(0);
		CharacterAnalyzer test9 = new CharacterAnalyzer(letter9);
		out.println(test9); 
		
		
		
		

	}
}