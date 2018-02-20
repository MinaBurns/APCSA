//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int randomnum;

	public GuessingGame(int stop)
	{
		upperBound = stop;
		randomnum = (int) Math.random()*upperBound;

	}

	public void playGame()
	{
		randomnum = (int) Math.random()*upperBound;
		Scanner keyboard = new Scanner(System.in);
		int counter = 1;
		System.out.println("Enter a number between 1 and " + upperBound);
		int num = keyboard.nextInt();
		while(num != randomnum)
		{
			if (num >= 1 && num <= randomnum)
			{
				System.out.println("out of bounds");
			}
			System.out.println("Enter a number between 1 and " + upperBound);
			num = keyboard.nextInt();
			counter++;
		}
		System.out.println("It took you " + counter + " guesses to guess" + randomnum + " correctly");
		System.out.println("You guessed wrong " + (double)((counter-1)/counter) + " percent of the time");
	}

	public String toString()
	{
		String output="";
		return output;
	}
}