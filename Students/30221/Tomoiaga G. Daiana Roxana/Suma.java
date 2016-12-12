package assignment;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
	
	System.out.println("Introduceti valoarea: ");
	
	Scanner in = new Scanner (System.in);
	int Valoare = in.nextInt();
	
	int Suma=0;
	
	
	for (int i=0; i<=Valoare; i++)
		{
			if (i%3==0)
				Suma=Suma+i;
			if (i%5==0)
				Suma=Suma+i;
		}
	System.out.println("Suma multiplilor de 3 si 5 este: " +Suma);
	
				
	
	

	}

}
