package lab1;

import java.util.Scanner;

public class LargestPalindrome {

	public static void main(String[] args) {
		int palindrome = 0;
		int answer, digits;
		Scanner in = new Scanner(System.in);
		digits = in.nextInt();
		if (digits == 3)
			palindrome = 998899;
		if (digits == 4)
			palindrome = 99977999;
		while (true)
		{
			answer = isProduct(palindrome, digits);
			if (answer != 0)
				break;
			else
			{
				if (digits == 3)
				{
					if (palindrome/10%10000 == 0)
						palindrome = palindrome - 11;
					else if (palindrome/100%100 == 0)
						palindrome = palindrome - 110;
					else
						palindrome = palindrome - 1100;
				}
				if (digits == 4)
				{
					if (palindrome/10%1000000 == 0)
						palindrome = palindrome - 11;
					else if (palindrome/1000%100 == 0)
						palindrome = palindrome - 1100;
					else 
						palindrome = palindrome - 11000;
				}
			}
			
		}
		System.out.println("Cel mai mare palindrom din produsul a 2 numere de "+digits+" cifre este "+palindrome+"= "+ answer+" * "+ palindrome/answer);
	}
	public static int isProduct(int number, int digits)
	{
		int count;
		int product = 1;
		int pow = 1;
		for (count = 1; count < digits; count++)
			pow = pow * 10;
		for (count = 2; number != 0; count++)
		{
			while (number != 0 && number % count == 0)
			{
				number /= count;
				product *= count;
				if (product > pow*10 || number < pow )
					return 0;
				if (product > pow && number < pow*10 && number > pow )
					return product;
			}
		}
		return 0;
	}

}
