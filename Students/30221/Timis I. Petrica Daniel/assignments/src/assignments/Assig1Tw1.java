package assignments;

import java.util.Scanner;

public class Assig1Tw1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int dim, i, sum = 0;
		
		System.out.print("Introduceti numarul: ");
		Scanner input = new Scanner (System.in);
		dim = input.nextInt();
		input.close();
		
		for (i = 0; i < dim; i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		
		System.out.println("Suma numerelor este " + sum + ".");
	}

}
