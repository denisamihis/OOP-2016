package secondAssignment;

import java.math.BigDecimal;
import java.util.*;

public class TestMatrixOperations {

	static Scanner in = new Scanner(System.in);

	public static void readMatrix(BigDecimal[][] matrix) {
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("[%d][%d] = ", i, j);
				matrix[i][j] = in.nextBigDecimal();
			}
	}

	public static void displayMatrix(BigDecimal[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		System.out.println("Rows Matrix 1:");
		int m1Rows = in.nextInt();
		System.out.println("Columns Matrix 1: ");
		int m1Columns = in.nextInt();
		System.out.println("Rows Matrix 2:");
		int m2Rows = in.nextInt();
		System.out.println("Columns Matrix 2: ");
		int m2Columns = in.nextInt();

		BigDecimal[][] matrix1 = new BigDecimal[m1Rows][m1Columns];
		BigDecimal[][] matrix2 = new BigDecimal[m2Rows][m2Columns];

		// First matrix
		System.out.println("Matrix 1:");
		readMatrix(matrix1);
		// Second matrix
		System.out.println("Matrix 2:");
		readMatrix(matrix2);

		// For adding, subtracting and checking if two matrices are equal 
		// it verifies if the matrices have the same dimension
		if (MatrixOperations.checkDimension(matrix1, matrix2)) {
			// add
			// matrix3 = matrix1 + matrix2
			System.out.println("Matrix 1 + Matrix 2:");
			BigDecimal[][] addMatrix = MatrixOperations.add(matrix1, matrix2);
			displayMatrix(addMatrix);
			
			// subtract
			// matrix 3 = matrix1 - matrix2
			System.out.println("Matrix 1 - Matrix 2:");
			BigDecimal[][] subMatrix = MatrixOperations.subtract(matrix1, matrix2);
			displayMatrix(subMatrix);
			
			// areEqual
			// matrix1 == matrix2
			System.out.println("Matrix 1 = Matrix 2:");
			System.out.println(MatrixOperations.areEqual(matrix1, matrix2));
		}

		// For multiplying two matrices it checks if the condition is true
		if (MatrixOperations.checkMultiply(matrix1, matrix2)) {
			// multiply
			// matrix 3 = matrix1 * matrix2
			System.out.println("Matrix 1 * Matrix 2:");
			BigDecimal[][] mulMatrix = MatrixOperations.multiply(matrix1, matrix2);
			displayMatrix(mulMatrix);
		}

		// multiplyScalar
		// matrix3 = n * matrix1 (n == 2 in this case)
		System.out.println("Scalar multiplicatiom (2 * Matrix 1):");
		BigDecimal n = new BigDecimal(2);
		BigDecimal[][] mulScalar = MatrixOperations.multiplyScalar(matrix1, n);
		displayMatrix(mulScalar);

		// For determinant calculation and identity matrix it checks if the matrix is square
		if (MatrixOperations.checkSquare(matrix1)) {
			// determinant
			// determinant (matrix1)
			System.out.println("Determinant (Matrix 1):");
			System.out.println(MatrixOperations.determinant(matrix1));
			
			// isIdentityMatrix
			// matrix1 = I
			System.out.println("Identity Matrix (Matrix 1):");
			System.out.println(MatrixOperations.isIdentityMatrix(matrix1));
		}
	
		// isZeroMatrix
		// matrix1 = 0
		System.out.println("Zero Matrix (Matrix 1):");
		System.out.println(MatrixOperations.isZeroMatrix(matrix1));

		// fillDegree
		System.out.println("Fill Degree (Matrix 1):");
		System.out.println(MatrixOperations.fillDegree(matrix1));
	}
}
