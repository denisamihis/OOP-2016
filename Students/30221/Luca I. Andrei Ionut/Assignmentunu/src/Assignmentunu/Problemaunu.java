package Assignmentunu;

import java.util.Scanner;

public class Problemaunu {
	public static int Suma (int anInt)
	{
		int Sumaa;
		int i;
		Sumaa=0;
		for(i=0;i<anInt;i++)
			if (i%3==0 || i%5==0) Sumaa=Sumaa+i;
	return Sumaa;
	}
	
public static void main(String[] args)
	{
	int anInt=10;
		System.out.println("Introduceti numarul");
		Scanner input=new Scanner (System.in);
		anInt=input.nextInt();
		System.out.println("Suma numerelor divizibile cu 3 si 5 din intervalul [0,"+anInt+"] este "+Suma(anInt));
	}
}


