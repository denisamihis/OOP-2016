package problema2;

import java.util.Scanner;

public class Twist1 {

	public static void main(String[] args) {
		int n, i;
		int[] f;

		System.out.println("Introduceti o valoare pentru n:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		f = new int[n];
		f[0] = 1;
		f[1] = 2;
		for (i = 2; i < n; i++)
			f[i] = f[i - 1] + f[i - 2];
		System.out.println("Al n-ulea termen din sir este : " + f[n - 1]);

	}

}
