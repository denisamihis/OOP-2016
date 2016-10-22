package matrixOperations;
import java.math.BigDecimal;



//we take under consideration only square matrix, both of the same size=3
public class Matrix {
	public static BigDecimal[][] add(BigDecimal[][] matrix1, BigDecimal[][] matrix2){
		BigDecimal[][] matrixSum= new BigDecimal[3][3];
		
		for (int i=0; i<matrix1.length; i++){
			for (int j=0; j<matrix2.length; j++){
				matrixSum[i][j]=matrix1[i][j].add(matrix2[i][j]);
			}
			
		}
		return matrixSum;
	}
	
	public static BigDecimal[][] substract (BigDecimal[][] matrix1, BigDecimal[][] matrix2){
		BigDecimal[][] matrixDiff= new BigDecimal[matrix1.length][matrix2.length];
		
		for (int i=0; i<matrix1.length; i++){
			for (int j=0; j<matrix2.length; j++){
				matrixDiff[i][j]= matrix1[i][j].subtract(matrix2[i][j]);
		}
	}
		return matrixDiff;
	}
	
	public static BigDecimal[][] multiply(BigDecimal[][] matrix1 , BigDecimal[][] matrix2){
		BigDecimal[][] matrix3= new BigDecimal[matrix1.length][matrix2.length];
		for(int row=0;row<matrix1.length;row++){
			for(int col=0;col<matrix1.length;col++){
				BigDecimal multiple= BigDecimal.ZERO;
				for(int k=0;k<matrix1.length;k++){
					multiple=multiple.add(matrix1[row][k].multiply(matrix2[k][col]));
				}
			matrix3[row][col]=multiple;
			}
		}
		return matrix3;
		}
		
	public static BigDecimal[][] multiplyScalar (BigDecimal[][] matrix1 , BigDecimal multiplicand){
		BigDecimal[][] matrix3= new BigDecimal[matrix1.length][matrix1.length];
		for (int i=0; i<matrix1.length; i++){
			for (int j=0; j<matrix1.length; j++){
				matrix3[i][j]= matrix1[i][j].multiply(multiplicand);
		}
	}
		return matrix3;
}
	public static BigDecimal determinant (BigDecimal[][] matrix){
		//det(A)= A11(A22A33-A23A32)-A12(A21A33-A23A31)+A13(A21A32-A22A31), only here 1st index=0
		BigDecimal diff1= (matrix[1][1].multiply(matrix[2][2])).subtract((matrix[1][2].multiply(matrix[2][1])));
		BigDecimal diff2= (matrix[1][0].multiply(matrix[2][2])).subtract((matrix[1][2].multiply(matrix[2][0])));
		BigDecimal diff3= (matrix[1][0].multiply(matrix[2][1])).subtract((matrix[1][1].multiply(matrix[2][0])));
		BigDecimal product1= matrix[0][0].multiply(diff1);
		BigDecimal product2= matrix[0][1].multiply(diff2);
		BigDecimal product3= matrix[0][2].multiply(diff3);
		BigDecimal determinant=(product1.subtract(product2)).add(product3);
		return determinant;
		}
	
	public static boolean areEqual (BigDecimal[][] matrix1, BigDecimal[][] matrix2){
		for (int i=0; i<matrix1.length; i++)
		{
			for (int j=0; j<matrix1.length; j++)
			{
				if ((matrix1[i][j].equals(matrix2[i][j])) == false)
						return false;
			}
		}
		return true;
		}
	
	public static boolean isZeroMatrix (BigDecimal[][] matrix){
		for (int i=0; i<matrix.length; i++)
		{
			for (int j=0; j<matrix.length; j++)
			{
				if ((matrix[i][j].compareTo(BigDecimal.ZERO)) !=0)
				return false;
			}
		}
		return true;
	}
	
	public static boolean isIdentityMatrix(BigDecimal[][] matrix){
		for (int i=0; i<matrix.length; i++){
			for (int j=0; j<matrix.length; j++){
				if (i==j) {
					if (matrix[i][j].compareTo(BigDecimal.ONE) !=0) return false;
				}
				if (i!= j) {
					if (matrix[i][j].compareTo(BigDecimal.ZERO) !=0) return false;
				}
			}
			
		}
		return true;
	}
	
	public static BigDecimal FillDegree (BigDecimal[][] matrix){
		int fill=0;
		BigDecimal degree= BigDecimal.ZERO;
		for (int i=0; i<matrix.length; i++){
			for (int j=0; j< matrix.length; j++){
				if ((matrix[i][j].compareTo(BigDecimal.ZERO)) !=0) fill++;
				
			}
		int totalElem=matrix.length*matrix.length;
		float fillDegree= (float) (fill/totalElem)*100;
		degree= BigDecimal.valueOf(fillDegree);
		}
		return degree;
		
	}
	
}

