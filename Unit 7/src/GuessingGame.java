//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.Random;

import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	//private int randomnum;

	public GuessingGame(int stop)
	{
		upperBound = stop;
		
	}

	public void playGame()
	{
		
		Random rand = new Random();
		int rands = rand.nextInt(upperBound+1) + 1;
		
		Scanner keyboard = new Scanner(System.in);
		out.print("Let's play Guessing Game.");
		int upperBound = keyboard.nextInt();
		
		out.print("Enter a number between 1 and " + upperBound + " :");
		int response = keyboard.nextInt();
		int runnumber = 1;
		
		while(response != rands)
		{
			//if (response >= 1 && response > upperBound)
			//{
				//System.out.println("out of bounds");
			//}
			out.print("Enter a number between 1 and " + upperBound);
			int responseB = keyboard.nextInt();
			response = responseB;
			runnumber++;
		}
		if (response == rands)
		{
		double percent = 1-(1/(runnumber));
		System.out.println("It took you " + (runnumber) + " guesses to guess " + rands + " correctly");
		System.out.println("You guessed wrong " + percent + " percent of the time");
		}
	}

}