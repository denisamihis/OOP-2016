package problema2;

import java.util.Scanner;

public class Twist2 {

	public static void main(String[] args) {
		int[][] matrice = new int[2][2];
		matrice[0][0] = matrice[0][1] = matrice[1][0] = 1;
		matrice[1][1] = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduceti o valoare pentru n:");
		int n;
		n = in.nextInt();
		matrice = putere(matrice, n);
		System.out.println("Al n-ulea element este:" + matrice[0][1]);

	}

	public static int[][] putere(int[][] M, int n) {
		if (n == 1)
			return M;
		else if (n % 2 == 0)
			return inmultire_matrici(putere(M, n / 2), putere(M, n / 2));
		else
			return inmultire_matrici(inmultire_matrici(putere(M, (n - 1) / 2), putere(M, (n - 1) / 2)), M);
	}

	public static int[][] inmultire_matrici(int[][] A, int[][] B) {
		int[][] C = new int[2][2];
		C[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0];
		C[0][1] = A[0][0] * B[1][0] + A[0][1] * B[1][1];
		C[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0];
		C[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1];
		return C;
	}

}
