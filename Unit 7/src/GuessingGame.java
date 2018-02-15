//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{


	}

	public void playGame()
	{
		int counter = 1;
		int known = (Math.random()*upperBound);
		out.println("Enter a number between 1 and " + upperBound);
		Scanner keyboard = new Scanner(System.in);
		double num = keyboard.nextInt();
		if (num == known)
		{
			out.println("It took you " + counter + "guesses to guess" + Math.random()*upperBound + "correctly");
		}



	}

	public String toString()
	{
		String output="";
		return output;
	}
}