package lab2;

import java.math.BigDecimal;

public class MatrixTest {
	public static void printMatrix( BigDecimal [][] matrix)
	{
		int i,j,n,m;
		n= matrix.length;
		m=matrix[0].length;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		BigDecimal[][] m = { { BigDecimal.valueOf(2),  BigDecimal.valueOf(-1) },
				{  BigDecimal.valueOf(1),BigDecimal.valueOf(1)}};
		BigDecimal[][] t = { { BigDecimal.valueOf(9),  BigDecimal.valueOf(10)},
				{  BigDecimal.valueOf(12),BigDecimal.valueOf(13)},
				{ BigDecimal.valueOf(15), BigDecimal.valueOf(16)}};
		BigDecimal [] freeTerms = { BigDecimal.valueOf(1), BigDecimal.valueOf(2)};
		BigDecimal [] solutions ;
		BigDecimal[][] matrix;
		System.out.println("The matrix m is :");
		printMatrix(m);
		solutions = MatrixOperations.solveSystem(m, freeTerms);
		int count;
		for (count = 0; count < solutions.length; count++)
			System.out.println(solutions[count]);
		
		/*
		 * Operations with matrices with return type == matrix;
		 System.out.println("The matrix t is:");
		printMatrix(t);
		matrix = MatrixOperations.add(m, t);
		if (matrix != null)
		{
			System.out.println("The sum is :");
			printMatrix(matrix);
		} else
			System.out.println("Matrix(ces) not compatible with given operation!");
		matrix = MatrixOperations.subtract(t, m);
		if (matrix != null) 
		{
			System.out.println("The difference is : ");
			printMatrix(matrix);
		} else
			System.out.println("Matrix(ces) not compatible with given operation!");
		matrix = MatrixOperations.multiply(m, t);
		if (matrix != null) 
		{
			System.out.println("The result of the two multiplied matrices is :");
			printMatrix(matrix);
		} else
			System.out.println("Matrix(ces) not compatible with given operation!");
		matrix = MatrixOperations.multiplyScalar(m, BigDecimal.valueOf(3));
		if (matrix != null) 
		{
			System.out.println("The result of the matrix multiplied with a scalar is :");
			printMatrix(matrix);
		} else
			System.out.println("Matrix(ces) not compatible with given operation!");
		*/
		/*
		 * Operations with return tipe != matrix
		 * System.out.print("The result of the comparation is :");
		System.out.println(MatrixOperations.areEqual(t, m));
		System.out.print("The result of the comparation with the Zero Matrix is :");
		System.out.println(MatrixOperations.isZeroMatrix(m));
		System.out.print("The result of the comparation whit the Identity Matrix is : ");
		System.out.println(MatrixOperations.isIdentityMatrix(m));
		System.out.print("The determinant of the matrix is :");
		System.out.println(MatrixOperations.determinant(m));
		System.out.print("The fill degree of the matrix is :");
		System.out.println(MatrixOperations.fillDegree(m));*/
	}
}