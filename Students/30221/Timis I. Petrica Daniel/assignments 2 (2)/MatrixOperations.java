package secondAssignment;

import java.math.BigDecimal;

public class MatrixOperations {

	public static BigDecimal[][] add(BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		int m = matrix1.length;
		int n = matrix1[0].length;
		BigDecimal[][] matrix3 = new BigDecimal[m][n];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				matrix3[i][j] = matrix1[i][j].add(matrix2[i][j]);

		return matrix3;
	}

	public static BigDecimal[][] subtract(BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		int m = matrix1.length; 
		int n = matrix1[0].length;
		BigDecimal[][] matrix3 = new BigDecimal[m][n];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				matrix3[i][j] = matrix1[i][j].subtract(matrix2[i][j]);
			}
		return matrix3;
	}

	public static BigDecimal[][] multiply(BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		int m1Rows = matrix1.length; 
		int m1Columns = matrix1[0].length;
		// int m2Rows = matrix2.length;
		int m2Columns = matrix2[0].length;
		
		BigDecimal[][] matrix3 = new BigDecimal[m1Rows][m2Columns];

		// Matrix initialization
		for (int i = 0; i < m1Rows; i++)
			for (int j = 0; j < m2Columns; j++)
				matrix3[i][j] = BigDecimal.ZERO;

		for (int i = 0; i < m1Rows; i++)
			for (int j = 0; j < m2Columns; j++)
				for (int k = 0; k < m1Columns; k++) {
					matrix3[i][j] = matrix3[i][j].add(matrix1[i][k].multiply(matrix2[k][j]));
				}
		
		return matrix3;
	}

	public static BigDecimal[][] multiplyScalar(BigDecimal[][] matrix1, BigDecimal scalar) {
		int m = matrix1.length; 
		int n = matrix1[0].length;
		BigDecimal[][] matrix2 = new BigDecimal[m][n];
		
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) 
				matrix2[i][j] = matrix1[i][j].multiply(scalar);
			
		return matrix2;
	}

	public static BigDecimal determinant(BigDecimal[][] matrix) {
		int m = matrix.length;
		
		BigDecimal sum = BigDecimal.ZERO;
		BigDecimal sign = BigDecimal.ZERO;

		if (m == 1)
			return (matrix[0][0]);
		for (int i = 0; i < m; i++) {
			BigDecimal[][] smaller = new BigDecimal[m - 1][m - 1];
			for (int a = 1; a < m; a++)
				for (int b = 0; b < m; b++)
					if (b < i)
						smaller[a - 1][b] = matrix[a][b];
					else if (b > i)
						smaller[a - 1][b - 1] = matrix[a][b];
			if (i % 2 == 0)
				sign = BigDecimal.ONE;
			else
				sign = new BigDecimal(-1);

			// sum = sum + s * matrix[0][i] * determinant(smaller)
			BigDecimal firstProd = sign.multiply(matrix[0][i]);
			BigDecimal secondProd = firstProd.multiply(determinant(smaller));
			sum = sum.add(secondProd);

		}
		
		return sum;
	}

	public static boolean areEqual(BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		int m = matrix1.length;
		int n = matrix1[0].length;
		
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if (!matrix1[i][j].equals(matrix2[i][j]))
					return false;
		return true;
	}

	public static boolean isZeroMatrix(BigDecimal[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if (!matrix[i][j].equals(BigDecimal.ZERO))
					return false;
		return true;
	}

	public static boolean isIdentityMatrix(BigDecimal[][] matrix) {
		int m = matrix.length;
		
		for (int i = 0; i < m; i++)
			for (int j = 0; j < m; j++) {
				if (i == j && !matrix[i][j].equals(BigDecimal.ONE))
					return false;
				if (i != j && !matrix[i][j].equals(BigDecimal.ZERO))
					return false;
			}
		return true;
	}

	public static BigDecimal fillDegree(BigDecimal[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		
		BigDecimal counter = BigDecimal.ZERO, total = BigDecimal.ZERO;
		
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if (!matrix[i][j].equals(BigDecimal.ZERO)) {
					counter = counter.add(BigDecimal.ONE);
					total = total.add(BigDecimal.ONE);
				} else
					total = total.add(BigDecimal.ONE);
		return counter.divide(total);
	}
	
	// It verifies if two matrices have the same dimension
	public static boolean checkDimension (BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		int m1Rows = matrix1.length; 
		int m1Columns = matrix1[0].length;
		int m2Rows = matrix2.length;
		int m2Columns = matrix2[0].length;
		
		if (m1Rows != m2Rows) return false;
		if (m1Columns != m2Columns) return false;
		
		return true;
	}
	
	// It verifies if a matrix is square
	public static boolean checkSquare (BigDecimal[][] matrix) {
		int m = matrix.length; 
		int n = matrix[0].length;
		
		if (m != n) return false;
		return true;
	}
	
	// It verifis if two matrices can pe multiplied
	public static boolean checkMultiply (BigDecimal[][] matrix1, BigDecimal[][] matrix2) { 
		int m1Columns = matrix1[0].length;
		int m2Rows = matrix2.length;
		
		if (m1Columns != m2Rows) return false;
		return true;
	}

}
