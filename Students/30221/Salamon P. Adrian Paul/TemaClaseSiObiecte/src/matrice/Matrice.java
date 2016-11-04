package matrice;

import java.math.BigDecimal;

public class Matrice {
	public static BigDecimal[][] add(BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		
		BigDecimal[][] sum;
		int lengthMatrix1 = matrix1.length;
		int widthMatrix1 = matrix1[0].length;
		int lengthMatrix2 = matrix2.length;
		int widthMatrix2 = matrix2[0].length;
		int maxLength = 0, maxWidth = 0;
		if (lengthMatrix1 > lengthMatrix2)
			maxLength = lengthMatrix1;
		else
			maxLength = lengthMatrix2;
		if (widthMatrix1 > widthMatrix2)
			maxWidth = widthMatrix1;
		else
			maxWidth = widthMatrix2;
		for(int rowCounter=0; rowCounter<maxLength;rowCounter++)
			for(int columnCounter=0; columnCounter<maxWidth;columnCounter++)
			{
				
			}
			return sum;
	}

	public static BigDecimal[][] substract() {
		BigDecimal[][] a = new BigDecimal[3][3];
		return a;
	}

	public static BigDecimal[][] multiply() {
		BigDecimal[][] a = new BigDecimal[3][3];
		return a;
	}

	public static BigDecimal[][] multiplyScalar() {
		BigDecimal[][] a = new BigDecimal[3][3];
		return a;
	}

	public static BigDecimal[][] determinant() {
		BigDecimal[][] a = new BigDecimal[3][3];
		return a;
	}

	public static boolean areEquals() {
		BigDecimal[][] a = new BigDecimal[3][3];
		return true;
	}

	public static boolean isZeroMatrix() {
		BigDecimal[][] a = new BigDecimal[3][3];
		return true;
	}

	public static boolean isIdentityMatrix() {
		BigDecimal[][] a = new BigDecimal[3][3];
		return true;
	}

	public static int fillDegree() {
		BigDecimal[][] a = new BigDecimal[3][3];
		return a;
	}

}
