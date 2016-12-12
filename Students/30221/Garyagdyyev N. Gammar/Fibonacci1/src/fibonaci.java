import java.util.Scanner;

public class fibonaci {

	private static long[] fibo = new long[40000000];
	private static int unknow = -1;
	private static Scanner numD;

	public static long fib(int k) {
		if (fibo[k] == unknow) {
			fibo[k] = fib(k - 1) + fib(k - 2);
		}
		return (fibo[k]);
	}

	public static long fib_c(int k) {
		int i;
		fibo[0] = 0;
		fibo[1] = 1;
		for (i = 2; i <= k; i++) {
			fibo[i] = unknow;
		}
		return (fib(k));
	}

	public static void main(String[] args) {

		int n, i;
		long suma;
		System.out.print("Enter a number for the first number termens: ");
		numD = new Scanner(System.in);
		n = numD.nextInt();
		suma = 0;
		fib_c(n);
		for (i = 0; i < n; i++) {
			if (fibo[i] % 2 == 0) {
				suma += fibo[i];
			}
			System.out.printf("%d \n", fibo[i]);
		}
		System.out.printf("\nSuma = %d ", suma);
	}

}
