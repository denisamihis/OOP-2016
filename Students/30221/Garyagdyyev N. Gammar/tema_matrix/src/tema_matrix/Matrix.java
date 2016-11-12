package tema_matrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner nrs = new Scanner(System.in);
		int n, m, i, j;
		System.out.println("Intraduceti dimensiunile MAT0(mXn): ");
		m = nrs.nextInt();
		n = nrs.nextInt();

		System.out.println("Intraduceti dimensiunile MAT1(mXn): ");
		i = nrs.nextInt();
		j = nrs.nextInt();

		int[][] mat = new int[m][n];
		int[][] mat1 = new int[i][j];
		System.out.printf("Intraduceti elementele mat(%dX%d): \n", m, n);
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				mat[i][j] = nrs.nextInt();
		System.out.printf("Intraduceti elementele mat1(%dX%d): \n", m, n);
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				mat1[i][j] = nrs.nextInt();

		Calcul calObj = new Calcul(mat);
		System.out.println("mat elements: ");
		calObj.show();
		Calcul calObj1 = new Calcul(mat1);
		System.out.println("mat1 elements: ");
		calObj1.show();
		calObj.add(calObj1).show();
		calObj.sub(calObj1).show();
		calObj.multiplication(calObj1).show();
	}

}
