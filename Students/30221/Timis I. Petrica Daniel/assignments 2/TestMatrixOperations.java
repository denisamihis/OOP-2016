package secondAssignment;

import java.math.BigDecimal;
import java.util.*;

public class TestMatrixOperations {
	
	static Scanner in = new Scanner(System.in);
	
	public static void readMatrix (BigDecimal[][] matrix) {
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix.length; j++) {
				System.out.printf("[%d][%d] = ", i, j);
				matrix[i][j] = in.nextBigDecimal();
			}
	}
	
	public static void displayMatrix (BigDecimal[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) 
				System.out.print(matrix[i][j] + "\t");
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Matrices dimension:");
		int dim = in.nextInt ();
		
		BigDecimal[][] matrix1 = new BigDecimal[dim][dim];
		BigDecimal[][] matrix2 = new BigDecimal[dim][dim];
		
		//First matrix
		System.out.println("Matrix 1:");
		readMatrix (matrix1);
		//Second matrix
		System.out.println("Matrix 2:");
		readMatrix (matrix2);
		
		//add
		//matrix3 = matrix1 + matrix2
		System.out.println("Matrix 1 + Matrix 2:");
		BigDecimal[][] matrix3 = MatrixOperations.add(matrix1, matrix2);
		displayMatrix(matrix3);
		
		//subtract
		//matrix 3 = matrix1 - matrix2
		System.out.println("Matrix 1 - Matrix 2:");
		matrix3 = MatrixOperations.subtract(matrix1, matrix2);
		displayMatrix(matrix3);
		
		//multiply
		//matrix 3 = matrix1 * matrix2
		System.out.println("Matrix 1 * Matrix 2:");
		matrix3 = MatrixOperations.multiply(matrix1, matrix2);
		displayMatrix(matrix3);
		
		//multiplyScalar
		//matrix3 = n * matrix1 (n == 2 in this case)
		System.out.println("Scalar multiplicatiom (2) for Matrix 1:");
		BigDecimal n = new BigDecimal (2);
		matrix3 = MatrixOperations.multiplyScalar(matrix1, n);
		displayMatrix(matrix3);
		
		//determinant
		//det (matrix1)
		System.out.println("Determinant (Matrix 1):");
		System.out.println(MatrixOperations.determinant(matrix1));
		
		//areEqual
		//matrix1 == matrix2
		//true == yes | false == no
		System.out.println("Matrix 1 equal to Matrix 2:");
		System.out.println(MatrixOperations.areEqual(matrix1, matrix2));
		
		//isZeroMatrix
		//matrix1 = 0
		//true == yes | false == no
		System.out.println("Zero Matrix (Matrix 1):");
		System.out.println(MatrixOperations.isZeroMatrix(matrix1));
		
		//isIdentityMatrix
		//matrix1 = I
		//true == yes | false = no
		System.out.println("Identity Matrix (Matrix 1):");
		System.out.println(MatrixOperations.isIdentityMatrix(matrix1));
		
		//fillDegree
		System.out.println("Fill Degree (Matrix 1):");
		System.out.println(MatrixOperations.fillDegree(matrix1));
	}

}
