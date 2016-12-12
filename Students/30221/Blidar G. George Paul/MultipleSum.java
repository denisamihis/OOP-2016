/**
 * Am rezolvat direct twist-ul 1, n-am mai pus "1000" initial, ci am
 * citit din prima, era banal...:))
 * Twist 2: Pentru int-uri, in Java, stiam ca storage space-ul e de la 
 * -2^(31) pana la 2^(31)-1. Pentru long-uri, de la -2^(63) pana la 2^(63)-1...
 */
import java.util.Scanner;

public class MultipleSum {
	
	private static int sum = 0;
	
	public static int getSum(int number) // find the sum of all multiples of 3 and 5
	                                    // of a given number
	{
		for(int i=0;i<number;i++)
		{
			if(i%3 == 0 || i%5 == 0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) // main function
	{
		Scanner in = new Scanner(System.in);
		int readNumber = in.nextInt();
		System.out.printf("Suma este: %d",getSum(readNumber));
	}

}
