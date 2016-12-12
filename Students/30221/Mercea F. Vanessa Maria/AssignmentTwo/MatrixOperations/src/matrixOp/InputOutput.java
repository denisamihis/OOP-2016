package matrixOp;

import java.util.Scanner;
import java.math.BigDecimal;

public class InputOutput {

	public BigDecimal[][] readMatrix() {
		Scanner input = new Scanner(System.in);
		int m, n;
		System.out.print("give matrix size, noRows and noCollumns: ");
		m=input.nextInt();
		n=input.nextInt();
		
		BigDecimal matrix[][] = new BigDecimal[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("matrix" + i + " " + j + "= ");
				matrix[i][j] = input.nextBigDecimal();
			}
			System.out.println();
		}
		return matrix;
		
	}

	public void printMatrix(BigDecimal[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}

	}
}