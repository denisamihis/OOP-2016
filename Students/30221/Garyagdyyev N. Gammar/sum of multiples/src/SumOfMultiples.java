import java.util.Scanner;

public class SumOfMultiples {

	private static Scanner cevaNUM;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cevaNUM = new Scanner(System.in);
		int numSum, numar;
		numar = cevaNUM.nextInt();
		numSum = 0;
		for (int count = 1; count < numar; count++) {
			if (count % 3 == 0 || count % 5 == 0) {
				numSum = numSum + count;
			}
		}

		System.out.print(numSum);

	}

}
