package lab2;

import java.math.BigDecimal;
import java.math.MathContext;

public class MatrixOperations {
	public static boolean isMatrix (BigDecimal[][] a)
	{
		int nrCols = a[0].length;
		int count;
		for (count = 0; count < a.length; count++)
			if (a[count].length != nrCols)
				return false;
		return true;
	}
	public static boolean isSquareMatrix (BigDecimal[][] a)
	{
		int count;
		int nrRows;
		nrRows = a.length;
		for (count = 0; count < nrRows; count++)
			if (a[count].length != nrRows)
				return false;
		return true;
	}
	public static boolean areSameSize (BigDecimal[][] a, BigDecimal[][] b)
	{
		int nrRows = a.length;
		if (nrRows != b.length)
			return false;
		int nrCols = a[0].length;
		int count;
		for (count = 0; count < nrRows; count++)
			if (b[count].length != nrCols || a[count].length != nrCols)
				return false;
		return true;
	}
	public static boolean areCompatible (BigDecimal[][] a, BigDecimal[][] b)
	{
		int nrColsA = a[0].length;
		int nrColsB = b[0].length;
		if (nrColsA != b.length)
			return false;
		int count;
		for (count = 0; count < a.length; count++)
			if (a[count].length != nrColsA)
				return false;
		for (count = 0; count < b.length; count++)
			if (b[count].length != nrColsB)
				return false;
		return true;
	}
	public static BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b)
	{
		if (!areSameSize(a,b))
			return null;
		BigDecimal[][] result = new BigDecimal[a.length][a[0].length];
		int counta, countb;
		for (counta = 0; counta < a.length; counta++)
			for (countb = 0; countb < a[0].length; countb++)
				result[counta][countb] = a[counta][countb].add(b[counta][countb]);
		return result;
	}
	public static BigDecimal[][] subtract(BigDecimal[][] a, BigDecimal[][] b)
	{
		if (!areSameSize(a,b))
			return null;
		BigDecimal[][] result = new BigDecimal[a.length][a[0].length];
		int counta, countb;
		for (counta = 0; counta < a.length; counta++)
			for (countb = 0; countb < a[0].length; countb++)
				result[counta][countb] = a[counta][countb].subtract(b[counta][countb]);
		return result;
	}
	public static BigDecimal[][] multiply(BigDecimal[][] a, BigDecimal[][] b)
	{
		if (!areCompatible(a,b))
			return null;
		BigDecimal[][] result = new BigDecimal[a.length][b[0].length];
		BigDecimal aux;
		int c1, c2, c3;
		for (c1 = 0; c1 < a.length; c1++)
			for (c2 = 0; c2 < b[0].length; c2++)
				result[c1][c2] = BigDecimal.ZERO;
		for (c1 = 0; c1 < a.length; c1++)
			for (c2 = 0; c2 < b[0].length; c2++)
				for (c3 = 0; c3 < a[0].length; c3++)
				{
					aux = a[c1][c3].multiply(b[c3][c2]);
					result [c1][c2] = result[c1][c2].add(aux);
				}
		return result;
	}
	public static BigDecimal[][] multiplyScalar(BigDecimal[][] a, BigDecimal scalar)
	{
		if (!isMatrix(a))
			return null;
		BigDecimal[][] result = new BigDecimal[a.length][a[0].length];
		int count1, count2;
		for (count1 = 0; count1 < a.length; count1++)
			for (count2 = 0; count2 < a[0].length; count2++)
				result[count1][count2] = a[count1][count2].multiply(scalar);
		return result;
	}
	public static BigDecimal determinant(BigDecimal[][] a)
	{
		if (!isSquareMatrix(a))
		{
			System.out.println("Given matrix is not a square matrix!");
			return null;
		}
		if (a.length == 1)
			return a[0][0];
		BigDecimal sign;
		BigDecimal result = new BigDecimal(0);
		BigDecimal[][] miniMatrix = new BigDecimal[a.length - 1][a[0].length - 1];
		int c1, c2, c3;
		for (c1 = 0; c1 < a[0].length; c1++)
		{
			for (c2 = 1; c2 < a.length; c2++)
			{
				for (c3 = 0; c3 < a[0].length; c3++)
				{
					if (c3 < c1)
						miniMatrix[c2-1][c3] = a[c2][c3];
					if (c3 > c1)
						miniMatrix[c2-1][c3-1] = a[c2][c3];
				}
			}
			if (c1 % 2 == 0)
				sign = new BigDecimal(1);
			else
				sign = new BigDecimal(-1);
			sign = sign.multiply(a[0][c1]);
			result = result.add(sign.multiply(determinant(miniMatrix)));
		}
		return result;
	}
	public static boolean areEqual(BigDecimal[][] a, BigDecimal[][] b)
	{
		int c1, c2;
		for (c1 = 0; c1 <a.length; c1++)
			for (c2 = 0; c2 <a[0].length; c2++)
				if (!a[c1][c2].equals(b[c1][c2]))
					return false;
		return true;
	}
	public static boolean isZeroMatrix(BigDecimal[][] a)
	{
		int c1, c2;
		for (c1 = 0; c1 <a.length; c1++)
			for (c2 = 0; c2 <a[0].length; c2++)
				if (!a[c1][c2].equals(new BigDecimal(0)))
					return false;
		return true;
	}
	public static boolean isIdentityMatrix(BigDecimal[][] a)
	{
		int c1, c2;
		for (c1 = 0; c1 <a.length; c1++)
			for (c2 = 0; c2 <a[0].length; c2++)
				if (c1 == c2)
				{
					if (!a[c1][c2].equals(BigDecimal.ONE))
						return false;
				}
				else
				{
					if (!a[c1][c2].equals(BigDecimal.ZERO))
						return false;
				}
		return true;
	}
	public static BigDecimal fillDegree(BigDecimal[][] a)
	{
		BigDecimal counter = BigDecimal.ZERO;
		int count1, count2;
		for (count1 = 0; count1 < a.length; count1++)
			for (count2 = 0; count2 < a[0].length; count2++)
				if (!a[count1][count2].equals(BigDecimal.ZERO))
					counter = counter.add(BigDecimal.ONE);
		return counter.divide(BigDecimal.valueOf(a.length*a.length), MathContext.DECIMAL128);
	}
	public static BigDecimal[][] replaceColumn(BigDecimal[][] matrix, BigDecimal[] val, int column)
	{
		BigDecimal[][] ret = new BigDecimal[matrix.length][matrix.length];
		int c1, c2;
		for (c1 = 0; c1 < matrix.length; c1++)
			for (c2 = 0; c2 < matrix.length; c2++)
				if (c2 == column)
					ret[c1][c2] = val[c1];
				else
					ret[c1][c2] = matrix[c1][c2];
		return ret;
	}
	public static BigDecimal[] solveSystem(BigDecimal[][] sys, BigDecimal[] free)
	{
		if (sys.length != free.length || !isSquareMatrix(sys) || BigDecimal.ZERO.equals(determinant(sys)))
			return null;
		BigDecimal [] solutions = new BigDecimal[sys.length];
		int count;
		for (count = 0 ; count < sys.length; count++)
			if (!free[count].equals(BigDecimal.ZERO))
				break;
		if (count == sys.length)
			return free;
		for (count = 0; count < sys.length; count++)
			solutions[count] = determinant(replaceColumn(sys, free, count)).divide(determinant(sys), MathContext.DECIMAL128);
		return solutions;
	}
}
