package assignment_two_two;

import java.math.BigDecimal;
import java.math.MathContext;

public class MatrixOperations {
	public static BigDecimal[][] add (BigDecimal[][] m1 , BigDecimal [][] m2 )
	{
		BigDecimal[][] m3 = new BigDecimal[m1.length][m1[0].length];
		int i,j,n,m;
		n=m1.length;
		m=m1[0].length;
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				m3[i][j]=m1[i][j].add(m2[i][j]);
		return m3;	
	}
	
	public static BigDecimal[][] subtract (BigDecimal[][] m1, BigDecimal[][] m2)
	{
		BigDecimal[][] m3 = new BigDecimal[m1.length][m1[0].length];
		int i,j,m,n;
		n=m1.length;
		m=m1[0].length;
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				m3[i][j]=m1[i][j].subtract(m2[i][j]);
		return m3;
	}
	public static BigDecimal[][] multiply ( BigDecimal[][] m1 , BigDecimal[][] m2)
	{
		int i,j,n,k;
		n=m1.length;
		BigDecimal [][] m3 = new BigDecimal [m1.length][m1[0].length];
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				m3[i][j] = BigDecimal.ZERO;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				for(k=0;k<n;k++)
					m3[i][j]=m3[i][j].add(m1[i][k].multiply(m2[k][j]));
		return m3;
	}
	public static BigDecimal[][] multiplyScalar ( BigDecimal[][]matrix, BigDecimal s)
	{
		BigDecimal[][] ms = new BigDecimal[matrix.length][matrix[0].length];
		int i,j,n,m;
		n=matrix.length;
		m=matrix[0].length;
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				ms[i][j]=matrix[i][j].multiply(s);
		return ms;
	}
	public static  boolean areEqual ( BigDecimal[][] m1, BigDecimal[][] m2)
	{
		int i,j,n,m,ok=1;
		n=m1.length;
		m=m1[0].length;
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				if(!m1[i][j].equals(m2[i][j]))
					return false;
		 return true;
	}
	public static boolean zeroMatrix ( BigDecimal[][] matrix)
	{
		int i,j,n,m;
		n=matrix.length;
		BigDecimal zero = new BigDecimal ("0");
		m=matrix[0].length;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				if(!matrix[i][j].equals(zero))
					return false;
		return true;
	}
	public static boolean identityMatrix ( BigDecimal [][] matrix)
	{
		int i,j,n,m;
		n=matrix.length;
		m=matrix[0].length;
		BigDecimal zero = new BigDecimal("0");
		BigDecimal one = new BigDecimal("1");
		for(i=0;i<n;i++)
			if(!matrix[i][i].equals(one))
				return false;
		for (i=1;i<n-1;i++)
			for(j=i+1;j<m;j++)
				if(!matrix[i][j].equals(zero))
					return false;
		for (i=2;i<n;i++)
			for(j=1;j<i-1;j++)
				if(!matrix[i][i].equals(zero))
					return false;
		return true;		
	}
	public static BigDecimal fillDegree( BigDecimal [][] matrix)
	{
		int i,j,n,m;
		BigDecimal counter = new BigDecimal("0");
		BigDecimal one = new BigDecimal("1");
		n=matrix.length;
		m=matrix[0].length;
		BigDecimal zero = new BigDecimal("0");
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				if(!matrix[i][j].equals(zero))
					counter=counter.add(one);
		BigDecimal total = new BigDecimal(m*n);
		return counter.divide(total,MathContext.DECIMAL128);		
	}
	public static BigDecimal determinant ( BigDecimal [][] matrix)
	{
		int n,m,i,k,j;
		n=matrix.length;
		if(n==1)
			return matrix[0][0];
		BigDecimal sign;
		BigDecimal det = new BigDecimal("0");
		BigDecimal[][] smallMatrix = new BigDecimal[n-1][n-1];
		for(i=0;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				for(k=0;k<n;k++)
				{
					if(k<i)
						smallMatrix[j-1][k]=matrix[j][k];
					if(k>i)
						smallMatrix[j-1][k-1]=matrix[j][k];
				}
			}
			if(i%2==0)
				sign=new BigDecimal("1");
			else
				sign=new BigDecimal("-1");
			sign=sign.multiply(matrix[0][i]);
			det=det.add(sign.multiply(determinant(smallMatrix)));
		}
		return det;
	}
}
