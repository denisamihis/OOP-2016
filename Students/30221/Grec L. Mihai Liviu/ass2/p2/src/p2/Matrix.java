package p2;
import java.math.BigDecimal;
public class Matrix {
	 
	public static BigDecimal[][] randomMatrix(){
		BigDecimal[][] matrix = new BigDecimal[3][3];
		for (int row = 0; row < matrix.length; row++)
			for (int column = 0; column < matrix.length; column++){
				matrix[row][column] = new BigDecimal(Math.random());
				matrix[row][column] = matrix[row][column].multiply(BigDecimal.TEN);
				matrix[row][column] = matrix[row][column].setScale(0, BigDecimal.ROUND_FLOOR);
			}
		return matrix;
	}
	public static BigDecimal[][] add(BigDecimal[][] matrix1 , BigDecimal[][] matrix2){
		int rowLength = matrix1.length;
		int columnLength = matrix2.length;
		BigDecimal[][] result = new BigDecimal[rowLength][columnLength];
		for (int row = 0 ; row < rowLength ; row++){
			for (int column = 0; column < columnLength; column++){
				result[row][column] = matrix1[row][column].add(matrix2[row][column]);
			}
		}
		return result;
	}
	
	public static BigDecimal[][] substract(BigDecimal[][] matrix1 , BigDecimal[][] matrix2){
		int rowLength = matrix1.length;
		int columnLength = matrix2.length;
		BigDecimal[][] result = new BigDecimal[rowLength][columnLength];
		for (int row = 0 ; row < rowLength ; row++){
			for (int column = 0; column < columnLength; column++){
				result[row][column] = matrix1[row][column].subtract(matrix2[row][column]);
			}
		}
		return result;
	}
	
	public static BigDecimal[][] multiply(BigDecimal[][] matrix1 , BigDecimal[][] matrix2){
		int rowLength1 = matrix1.length;
		int columnLength1 = matrix1[0].length;
		int rowLength2 = matrix2.length;
		int columnLength2 = matrix2[0].length;
		BigDecimal helper = new BigDecimal("0");
		if (columnLength1 != rowLength2) throw new RuntimeException("Illegal matrix dimension.");
		BigDecimal[][] result = new BigDecimal[rowLength1][columnLength2];
		for (int row = 0; row < rowLength1; row++)
			for (int column = 0; column < columnLength2 ; column++)
				for (int counter = 0; counter < columnLength2 ; counter++){
					helper = matrix1[row][counter].multiply(matrix2[counter][column]);
					result[row][column] = result[row][column].add(helper);
				}
		return result;
	}
	
	public static BigDecimal[][] multiplyScalar(BigDecimal[][] matrix, BigDecimal scalar){
		for (int row = 0; row < matrix.length; row++)
			for (int column = 0; column< matrix[0].length; column++)
				matrix[row][column]=matrix[row][column].multiply(scalar);
		return matrix;
	}
	
	public static boolean areEqueal (BigDecimal[][] matrix1,BigDecimal[][] matrix2){
		if (matrix1.length != matrix2.length) return false;
		for (int row = 0; row < matrix1.length; row++)
			for (int column = 0; column < matrix1.length; column++){
				if (!matrix1[row][column].equals(matrix2[row][column]))
				
					return false;
				
			}
		return true;
	}
	
	public static boolean isZeroMatrix(BigDecimal[][] matrix){
		for (int row = 0; row < matrix.length; row++)
			for (int column = 0; column < matrix.length; column++)
				if (!matrix[row][column].equals(BigDecimal.ZERO))
					
					return false;
		return true;
	}
	
	public static boolean isIdentityMatrix(BigDecimal[][] matrix){
		for (int row = 0; row < matrix.length; row++)
			for (int column = 0; column < matrix.length; column++){
				if (row == column)
					if (!matrix[row][column].equals(BigDecimal.ONE))
						return false;
					else
				if (!matrix[row][column].equals(BigDecimal.ZERO))
					return false;
				}
		return true;	
	}
	public static BigDecimal fillDegree(BigDecimal[][] matrix){
		BigDecimal total = new BigDecimal("0");
		BigDecimal numbers = new BigDecimal("0");
		BigDecimal helper = new BigDecimal("0");
		for (int row = 0; row < matrix.length; row++)
			for (int column = 0; column < matrix.length; column++)
				if (matrix[row][column].equals(BigDecimal.ZERO)){
					total = total.add(BigDecimal.ONE);
				}
				else {
					total = total.add(BigDecimal.ONE);
					numbers = numbers.add(BigDecimal.ONE);
				}
		return helper;
	}
	public static void writeMatrix(BigDecimal[][] matrix){
		for (int row = 0; row < matrix.length; row++){
			for (int column = 0;column < matrix.length; column++)
				System.out.print(matrix[row][column] + "\t");
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
}
