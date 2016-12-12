package assignments;

import java.util.Scanner;

public class Assig2Tw 
	{
	
	public static long fibUltimate (int n)
	{
		int i; long next, back1 = 1, back2 = 1;
		if (n == 0)
			return 0;
		for (i = 2; i < n; i++)
		{
			next = back1 + back2;
			back2 = back1;
			back1 = next;
		}
		return (back1 + back2);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		input.close();
		
		System.out.println("Suma primilor " + n + " termeni este " + fibUltimate(n) + ".");
	}
}
