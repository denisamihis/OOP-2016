package tema;



import java.util.Scanner;

public class SumOfMultiples {
	public static int sumOfMultiples(int numar) {
		int potentialMultiplu = 3, rezultatFunctie = 0;
		for (potentialMultiplu = 3; potentialMultiplu < numar; potentialMultiplu++)
			if ((potentialMultiplu % 3 == 0) || (potentialMultiplu % 5 == 0))
				rezultatFunctie += potentialMultiplu;
		return rezultatFunctie;

	}

	public static void main(String[] args) {
		System.out.println(sumOfMultiples(1000));
		Scanner in= new Scanner(System.in);
		int numarCitit=in.nextInt();
		System.out.println(sumOfMultiples(numarCitit));
	
	}
}
