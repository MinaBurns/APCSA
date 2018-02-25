//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;
		number = 0;
		//setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;
		roman = "";
		//setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		for (int i = 0; i < NUMBERS.Length; i++)
		{
			if (num >= NUMBERS[i])
			{
				roman = roman + LETTERS[i];
				num = num - NUMBERS[i];
			}
		}
	}

	public void setRoman(String rom)
	{
		for (int i = 0; i < rom.length; i++)
		{
			if (rom.charAt(i) = LETTERS[i])
			{
				number = number + NUMBERS[i];
				else if (rom.substring(i, i+1) = LETTERS[i])
				{
					number = number + NUMBERS[i];
				}
			}
		}
	}

	public Integer getNumber()
	{
		return number;
	}

	public String toString()
	{
		return roman + "\n";
	}
}
