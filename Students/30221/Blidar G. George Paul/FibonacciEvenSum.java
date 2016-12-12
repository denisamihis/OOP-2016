/**
 * Doar twist-ul unu l-am facut, n-am prea prins ideea complexitatilor la SDA
 * semestrul trecut, ca nu mi-a placut materia in general.. :). Am rezulvat-o cu 
 * complexitatea O(n)...
 */
public class FibonacciEvenSum {
	
	private static int firstPreviousTerm = 2; // Primul numar precedent
	// care este imediat inaintea sumei rezultata in urma adunarii celor 2 nr.
	private static int secondPreviousTerm = 1; // Al doilea numar precedent
	private static long theSum = 0; // Suma totala
	
	/**
	 * O functie care calculeaza si returneaza suma acelor numere din sirul lui
	 * Fibonacci, care sunt mai mici decat 4 milioane si care sunt pare
	 */
	
	private static long calcSum(int firstPrevNum, int secondPrevNum, long sum)
	{
		while(firstPrevNum <= 4000000)
		{
			if (firstPrevNum % 2 == 0)
			{
				sum = sum + firstPrevNum;
			}
			firstPrevNum = secondPrevNum;
			secondPrevNum= firstPrevNum + secondPrevNum;
		}
		return sum;
	}
	
	/**
	 * Functia main, care apeleaza functia "calcSum()" si afiseaza suma ceruta 
	 */
	
	public static void main(String[] args)
	{
		theSum = calcSum(secondPreviousTerm, firstPreviousTerm, 0);
		System.out.println("The sum is: " + theSum);
	}
}
