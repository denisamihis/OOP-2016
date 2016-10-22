package secondAssignment;

import java.math.BigDecimal;

public class MatrixOperations {
	
	//Note: variable 'dim' is used for clearer code; matrix.length could be used instead
	
	public static BigDecimal[][] add (BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		int dim = matrix1.length; 
		BigDecimal[][] matrix3 = new BigDecimal[dim][dim];
		for (int i = 0; i < dim; i++)
			for (int j = 0; j < dim; j++) {
				matrix3[i][j] = matrix1[i][j].add(matrix2[i][j]);
			}
		return matrix3;
	}
	
	public static BigDecimal[][] subtract (BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		int dim = matrix1.length;
		BigDecimal[][] matrix3 = new BigDecimal[dim][dim];
		for (int i = 0; i < dim; i++)
			for (int j = 0; j < dim; j++) {
				matrix3[i][j] = matrix1[i][j].subtract(matrix2[i][j]);
			}
		return matrix3;
	}
	
	public static BigDecimal[][] multiply (BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		int dim = matrix1.length;
		BigDecimal[][] matrix3 = new BigDecimal[dim][dim];
		
		//Matrix initialization
		for (int i = 0; i < dim; i++)
			for (int j = 0; j < dim; j++)
				matrix3[i][j] = BigDecimal.ZERO;
		
		for (int i = 0; i < dim; i++)
			for (int j = 0; j < dim; j++)
				for (int k = 0; k < dim; k++) {
					matrix3[i][j] = matrix3[i][j].add(matrix1[i][k].multiply(matrix2[k][j]));
				}
		return matrix3;
	}
	
	public static BigDecimal[][] multiplyScalar (BigDecimal[][] matrix1, BigDecimal scalar) {
		int dim = matrix1.length;
		BigDecimal[][] matrix2 = new BigDecimal[dim][dim];
		for (int i = 0; i < dim; i++)
			for (int j = 0; j < dim; j++) {
				matrix2[i][j] = matrix1[i][j].multiply(scalar);
			}
		return matrix2;
	}
	
	public static BigDecimal determinant (BigDecimal[][] matrix) {
		int dim = matrix.length;
		BigDecimal sum = BigDecimal.ZERO;
		BigDecimal sign = BigDecimal.ZERO;
		
		if (dim == 1)
			return (matrix[0][0]);
		for (int i = 0; i < dim; i++) {
			BigDecimal[][] smaller = new BigDecimal[dim-1][dim-1];
			for (int a = 1; a < dim; a++)
				for (int b = 0; b < dim; b++)
					if (b < i) 
						smaller[a-1][b] = matrix[a][b];
					else if (b > i) 
						smaller[a-1][b-1] = matrix[a][b];
			if (i % 2 == 0)
				sign = BigDecimal.ONE;
			else
				sign = new BigDecimal(-1);
			
			//sum = sum + s * matrix[0][i] * determinant(smaller)
			BigDecimal firstProd = sign.multiply(matrix[0][i]);
			BigDecimal secondProd = firstProd.multiply(determinant(smaller));
			sum = sum.add(secondProd);
			
		}
		return sum;
	}
	
	public static boolean areEqual (BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		int dim = matrix1.length;
		for (int i = 0; i < dim; i++)
			for (int j = 0; j < dim; j++) 
				if (!matrix1[i][j].equals(matrix2[i][j]))
					return false;
		return true;
	}
	
	public static boolean isZeroMatrix (BigDecimal[][] matrix){
		int dim = matrix.length;
		for (int i = 0; i < dim; i++)
			for (int j = 0; j < dim; j++)
				if (!matrix[i][j].equals(BigDecimal.ZERO)) 
					return false;
		return true;
	}
		
	public static boolean isIdentityMatrix (BigDecimal[][] matrix) {
		int dim = matrix.length;
		for (int i = 0; i < dim; i++)
			for (int j = 0; j < dim; j++) {
				if (i == j && !matrix[i][j].equals(BigDecimal.ONE))
					return false;
				if (i != j && !matrix[i][j].equals(BigDecimal.ZERO))
					return false;
			}
		return true;
	}
	
	public static BigDecimal fillDegree (BigDecimal[][] matrix) {
		int dim = matrix.length;
		BigDecimal counter = BigDecimal.ZERO, total = BigDecimal.ZERO;
		for (int i = 0; i < dim; i++)
			for (int j = 0; j < dim; j++)
				if (!matrix[i][j].equals(BigDecimal.ZERO)) {
					counter = counter.add(BigDecimal.ONE);
					total = total.add(BigDecimal.ONE);
				}
				else
					total = total.add(BigDecimal.ONE);
		return counter.divide(total);
	}
	
}
