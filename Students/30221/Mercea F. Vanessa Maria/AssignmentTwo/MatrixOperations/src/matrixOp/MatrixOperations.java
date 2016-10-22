package matrixOp;

import java.util.Scanner;
import java.math.BigDecimal;

public class MatrixOperations {

	public BigDecimal[][] add(BigDecimal[][] firstMatrix, BigDecimal[][] secondMatrix) {

		BigDecimal matrixSum[][] = new BigDecimal[firstMatrix.length][firstMatrix[0].length];

		for (int i = 0; i < firstMatrix.length; i++)
			for (int j = 0; j < firstMatrix[0].length; j++)
				matrixSum[i][j] = firstMatrix[i][j].add(secondMatrix[i][j]);
		return matrixSum;
	}

	public BigDecimal[][] substract(BigDecimal[][] firstMatrix, BigDecimal[][] secondMatrix) {

		BigDecimal matrixSubstract[][] = new BigDecimal[firstMatrix.length][firstMatrix[0].length];

		for (int i = 0; i < firstMatrix.length; i++)
			for (int j = 0; j < firstMatrix[0].length; j++)
				matrixSubstract[i][j] = firstMatrix[i][j].subtract(secondMatrix[i][j]);
		return matrixSubstract;
	}

	public BigDecimal[][] multiply(BigDecimal[][] firstMatrix, BigDecimal[][] secondMatrix) {

		BigDecimal matrixProduct[][] = new BigDecimal[firstMatrix.length][secondMatrix[0].length];
		BigDecimal zero = BigDecimal.ZERO;
		BigDecimal sum = zero;
		for (int i = 0; i < firstMatrix.length; i++) {
			for (int j = 0; j < secondMatrix[0].length; j++) {
				for (int k = 0; k < secondMatrix.length; k++) {
					sum = (firstMatrix[i][k].multiply(secondMatrix[k][j])).add(sum);
				}
				matrixProduct[i][j] = sum;
				sum = zero;
			}
		}

		return matrixProduct;
	}

	public BigDecimal[][] multiplyScalar(BigDecimal[][] matrix, BigDecimal scalar) {

		BigDecimal result[][] = new BigDecimal[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				result[i][j] = matrix[i][j].multiply(scalar);
		return result;
	}

	public BigDecimal determinant(BigDecimal[][] matrix) {

		BigDecimal zero = BigDecimal.ZERO;
		BigDecimal one = BigDecimal.ONE;
		BigDecimal sum = zero;
		BigDecimal s;
		
		if (matrix.length == 1) {
			return (matrix[0][0]);
		}
		for (int i = 0; i < matrix.length; i++) {
			BigDecimal[][] smaller = new BigDecimal[matrix.length - 1][matrix.length - 1]; // creates
																							// smaller
																							// matrix
			for (int a = 1; a < matrix.length; a++) {
				for (int b = 0; b < matrix.length; b++) {
					if (b < i) {
						smaller[a - 1][b] = matrix[a][b];
					} else if (b > i) {
						smaller[a - 1][b - 1] = matrix[a][b];
					}
				}
			}
			if (i % 2 == 0) { // sign changes based on i
				s = one;
			} else {
				s = one.negate();
			}
			sum = sum.add(s.multiply(matrix[0][i]).multiply(determinant(smaller)));
		}
		return (sum);

	}

	public boolean areEqual(BigDecimal[][] firstMatrix, BigDecimal[][] secondMatrix) {
		
		boolean equal = true;

		for (int i = 0; i < firstMatrix.length; i++)
			for (int j = 0; j < secondMatrix[0].length; j++)
				if (!firstMatrix[i][j].equals(secondMatrix[i][j]))
					equal = false;
		return equal;
	}

	public boolean isZeroMatrix(BigDecimal[][] matrix) {
		
		boolean isZero = true;
		BigDecimal zero = BigDecimal.ZERO;
		
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				if ((matrix[i][j].compareTo(zero)) != 0)
					isZero = false;
		return isZero;
	}

	public boolean isIdentityMatrix (BigDecimal[][] matrix) {
		
		boolean isIdentity = true;
		BigDecimal one = BigDecimal.ONE;
		BigDecimal zero = BigDecimal.ZERO;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (i == j) {
					if (matrix[i][j].compareTo(one) != 0)
						isIdentity = false;
				} else {
					if (matrix[i][j].compareTo(zero) != 0)
						isIdentity = false;
				}	
			}
		}
		return isIdentity;
	}
	
	public BigDecimal fillDegree (BigDecimal[][] matrix) {
		
		BigDecimal zero = BigDecimal.ZERO;
		double nonZeroElements=0;
		double fdegree;
		double noElements;
		
		
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				if (matrix[i][j].compareTo(zero)!=0)
					nonZeroElements=nonZeroElements+1;
		
		noElements=matrix.length*matrix[0].length;
		fdegree=(nonZeroElements/noElements)*100;
		return BigDecimal.valueOf(fdegree);
	}
}
	

