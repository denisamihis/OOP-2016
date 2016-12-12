package Assignmentunu;

public class Problemadoi {
	public static void main(String[] args) {
		int numberOne = 1, numberTwo = 1, limita = 0, sumaNumerePare = 0;

		while (limita < 4000000) {
			limita = numberOne + numberTwo;
			if (limita % 2 == 0)
				sumaNumerePare = sumaNumerePare + limita;
			numberOne = numberTwo;
			numberTwo = limita;
		}
		System.out.println("Suma numerelor pare in Fibonacci este " + sumaNumerePare);
	}
}//O(n)

