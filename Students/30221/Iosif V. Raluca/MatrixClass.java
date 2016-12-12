package matrixOperations;
import java.math.BigDecimal;
import java.util.Scanner;

public class MatrixClass {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		Matrix matrixOperations= new Matrix();
		BigDecimal[][] matrix1= new BigDecimal[3][3];
		BigDecimal[][] matrix2= new BigDecimal[3][3];
		System.out.println("Enter the two matrix\n");
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++){
				double element= input.nextDouble();
				matrix1[i][j]=BigDecimal.valueOf(element);
				}
		}
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++){
				double element= input.nextDouble();
				matrix2[i][j]=BigDecimal.valueOf(element);
				}
		}
		BigDecimal[][] matrixSum=  matrixOperations.add(matrix1, matrix2);
		System.out.println("The sum of the two matrix: ");
		printMatrix(matrixSum);
		BigDecimal[][] matrixDiff=  matrixOperations.substract(matrix1, matrix2);
		System.out.println("The difference of the two matrix:");
		printMatrix(matrixDiff);
		System.out.println("The product of the two matrix:");
		BigDecimal[][] matrixProd= matrixOperations.multiply(matrix1, matrix2);
		printMatrix(matrixProd);
		System.out.println("Enter a scalar" );
		int n=input.nextInt();
		BigDecimal scalar= BigDecimal.valueOf(n);
		input.close();
		BigDecimal[][] matrix1Scalar= matrixOperations.multiplyScalar(matrix1, scalar);
		System.out.println("The product of the first matrix with the scalar:");
		printMatrix(matrix1Scalar);
		BigDecimal[][] matrix2Scalar= matrixOperations.multiplyScalar(matrix2, scalar);
		System.out.println("The product of the 2nd matrix with the scalar:");
		printMatrix(matrix2Scalar);
		System.out.println("The determinant of the 1st matrix= "+ matrixOperations.determinant(matrix1));
		System.out.println("The determinant of the 2nd matrix= "+ matrixOperations.determinant(matrix2));
		if (matrixOperations.areEqual(matrix1, matrix2) )
			System.out.println("The 2 matrix are equal");
		else System.out.println("The 2 matrix are distinct");
		
		if (matrixOperations.isZeroMatrix(matrix1))
			System.out.println("The first matrix is a zero matrix");
		if (matrixOperations.isZeroMatrix(matrix2))
			System.out.println("The second matrix is a zero matrix");
		
		if (matrixOperations.isIdentityMatrix(matrix1)){
			System.out.println("The first matrix is identity matrix");
		}
		if (matrixOperations.isIdentityMatrix(matrix2)){
			System.out.println("The second matrix is identity matrix");
		}
		
		System.out.println("Fill degree for 1st matrix= "+matrixOperations.FillDegree(matrix1));
		System.out.println("Fill degree for 2nd matrix= "+matrixOperations.FillDegree(matrix2));
		

	}
	private static void printMatrix (BigDecimal[][] matrix){
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
