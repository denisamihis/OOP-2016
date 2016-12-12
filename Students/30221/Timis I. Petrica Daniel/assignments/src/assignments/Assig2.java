package assignments;

import java.util.Scanner;

public class Assig2 {

	public static long fib (int n)
	{
		if (n <= 1)
			return n;
		else
			return fib (n-1) + fib (n-2);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n; long sum = 0;
		
		Scanner input = new Scanner (System.in);
		System.out.print("n = ");
		n = input.nextInt();
		input.close ();
		
		for (int i = 1; i <= n; i++)
		{
			if (fib(i) % 2 == 0)
				sum += fib (i);
		}
		System.out.println("Suma termenilor pari pentru n = " + n + " este " + sum + ".");
	}

}
