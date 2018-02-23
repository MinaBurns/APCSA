//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	private int length;
	double[] grades;

	public Grades()
	{
		length = 0;
	}

	/*public Grades(int distance)
	{
		length = distance;
	}
	*/
	public void setArray(double[] scores)
	{
		grades = scores;
	}

	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.length; i++)
		{
			sum = sum + grades[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/grades.length;
		return average;
	}


	public String toString()
	{
		String output= "";
		System.out.println(length);
		for (int i = 0; i<grades.length; i++)
		{
			output += "\ngrade " + (i+1) + ":: " + grades[i];
		}
		output += "\n" + getAverage();
		return output;
	}
	



}