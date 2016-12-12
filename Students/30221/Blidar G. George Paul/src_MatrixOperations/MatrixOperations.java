import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
/**
 * A simple class which handles some operations between two BigDecimal 2D Arrays (Matrix)
 */

public class MatrixOperations{
	
	/**
	 * Addition of two Matrix
	 * @param a = the first one
	 * @param b = the second one
	 * @return c = the resulted matrix
	 */
	private static BigDecimal[][] addMatrix(BigDecimal[][]a, BigDecimal[][]b)
	{
		int m = a.length; // gets the first dimension which is the number of rows
		
		int n = a[0].length; // gets the second dimension, which is the number of columns
		// But be aware that there's no real two-dimensional array in Java.
		// Each "first level" array contains another array. 
		// Each of these array can be of different sizes.
		// We assume that each of these array are the same size
		
		BigDecimal[][] c = new BigDecimal[m][n]; // The resulted matrix must be of MxN size
		
		for(int i=0;i<m;i++) // the adding operation
		{
			for(int j=0;j<n;j++)
			{
				c[i][j] = b[i][j].add(a[i][j]); // BigDecmal class doesn't allow the "+" operator
												// so obviously we need to use its subroutines
			}
		}
		return c;
	}
	
	/**
	 * Substraction of Matrix
	 * @param a the first one
	 * @param b the second one
	 * @return the result
	 */
	private static BigDecimal[][] subMatrix(BigDecimal[][]a, BigDecimal[][]b)
	{
		int m = a.length;
		int n = a[0].length;
		
		BigDecimal c[][] = new BigDecimal[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j] = a[i][j].subtract(b[i][j]); // Using BigDecimal's subroutines
			}
		}
		return c;
	}
	
	/**
	 * Create a random Matrix using Math's function Random. The values can be within 0 and 100;
	 * @param m = row size
	 * @param n = col size
	 * @return the matrix
	 */
	private static BigDecimal[][] randomMatrix(int m, int n) 
	{
        BigDecimal[][] a = new BigDecimal[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
            {
            	a[i][j] = new BigDecimal(100*Math.random());
            	a[i][j] = a[i][j].setScale(2, RoundingMode.CEILING);
            } 
        return a;
     }
	
	/**
	 * Create a zero valued Matrix
	 * @param m row size
	 * @param n col size
	 * @return the matrix
	 */
	private static BigDecimal[][] createZeroMatrix(int m, int n) 
	{
        BigDecimal[][] a = new BigDecimal[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = new BigDecimal(0);
        return a;
     }
	
	/**
	 * Just prints out a Matrix
	 * @param a the Matrix to be printed
	 */
	private static void printMatrix(BigDecimal[][] a) 
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/*
	 * Something doesn't work here. It gives me a NullPointerException when constructing the c matrix
	 * Maybe you can help me out with this thing.
	public static BigDecimal[][] multiplyMatrix(BigDecimal[][]a, BigDecimal[][]b)
	{
		int m1 = a.length;
		int n1 = a[0].length;
		int m2 = b.length;
		int n2 = b[0].length;
		if (n1 != m2) 
		{
			throw new RuntimeException("Illegal matrix dimensions.");
		}
		
		BigDecimal[][] c = new BigDecimal[m1][n2];
		
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				for(int k=0;k<n1;k++)
				{
					c[i][j] = (a[i][k].multiply(b[k][j])).add(c[i][j]); // <- Here; NullPointerException
				}
			}
		}
		return c;
	}
	*/
	
	/**
	 * Multiplies a matrix with a scalar
	 * @param a the matrix
	 * @param value the value
	 * @return the result
	 */
	private static BigDecimal[][] multiplyScalar(BigDecimal[][]a, BigDecimal value)
	{
		int m = a.length;
		int n = a[0].length;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = a[i][j].multiply(value);
			}
		}
		return a;
	}
	
	/*
	 * A method that calculates the determinant of the matrix...
	 */
	private static BigDecimal determinant(BigDecimal[][] a)
	{ 
	    BigDecimal sum = new BigDecimal(0);
	    BigDecimal s = new BigDecimal(1);
	    if(a.length==1)  //bottom case of recursion. size 1 matrix determinant is itself.
	    { 
	      return(a[0][0]);
	    }
	    for(int i=0;i<a.length;i++)  //finds determinant using row-by-row expansion
	    { 
	      BigDecimal[][]smaller= new BigDecimal[a.length-1][a.length-1]; //creates smaller matrix- 
	      																		  //values not in same row, column
	      for(int j=1;j<a.length;j++)
	      {
	        for(int k=0;k<a.length;k++)
	        {
	          if(k<i)
	          {
	            smaller[j-1][k] = a[j][k];
	          }
	          else if(k>i)
	          {
	            smaller[j-1][k-1] = a[j][k];
	          }
	        }
	      }
	      if(i%2==0) //sign changes based on i
	      { 
	        s = new BigDecimal(1);
	      }
	      else
	      {
	        s = new BigDecimal(-1);
	      }
	      sum = sum.add(s.multiply(a[0][i].multiply(determinant(smaller)))); //recursive step: determinant of larger determined by smaller.
	    }
	    return(sum); //returns determinant value. once stack is finished, returns final determinant.
	  }
	
	/**
	 * Checks whether the two matrix are equal or not
	 * @param a first one
	 * @param b second one
	 * @return the answer
	 */
	private static boolean areEqual(BigDecimal[][]a, BigDecimal[][]b)
	{
		int m = a.length;
		int n = a[0].length;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j].equals(b[i][j]))
				{
					continue;
				}
				else
				{
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Checks whether a matrix is zero-valued
	 * @param a the matrix
	 * @return the answer
	 */
	private static boolean isZeroMatrix(BigDecimal[][]a)
	{
		int m = a.length;
		int n = a[0].length;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j].equals(new BigDecimal(0)))
				{
					continue;
				}
				else
				{
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Creates one identity matrix
	 * @param m rows
	 * @param n cols
	 * @return the matrix
	 */
	private static BigDecimal[][] createIdentityMatrix(int m, int n)
	{
		BigDecimal c[][] = new BigDecimal[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if (i==j)
				{
					c[i][j] = new BigDecimal(1); // fill with "1" in the principal diagonal
				}
				else
				{
					c[i][j] = new BigDecimal(0); // zero in rest
				}
			}
		}
		return c;
	}
	
	/**
	 * Checks whether a matrix is identity matrix or not
	 * @param a the matrix
	 * @return the answer
	 */
	private static boolean isIdentityMatrix(BigDecimal[][]a)
	{
		int m = a.length;
		int n = a[0].length;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					if(a[i][j].equals(new BigDecimal(1)))
					{
						continue;
					}
					else
					{
						return false;
					}
				}
			}
		}
		return true;
	}
	/**
	 * Computes the fill degree of the matrix ( numbers != 0 )
	 * @param a the matrix
	 * @return the percentage
	 */
	private static double fillDegree(BigDecimal[][]a)
	{
		int m = a.length;
		int n = a[0].length;
		int nonZeroValues = m*n;
		double percentage = 0;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j].equals(new BigDecimal(0)))
				{
					nonZeroValues--;
				}
			}
		}
		percentage = (double)(100 * nonZeroValues) / (m*n) ;
		return percentage;
	}
	
	/**
	 * Main function, in which we can test the subroutines
	 */
	public static void main(String[] args)
	{
		 System.out.println("Please insert a value!:");
		 Scanner scanner = new Scanner(System.in);
		 int scalar = scanner.nextInt();
		 BigDecimal scalarBigDecimal = new BigDecimal(scalar);
		 BigDecimal[][] a = randomMatrix(2,2); // Not necessarily a square matrix, but the values must corespond
		 BigDecimal[][] b = randomMatrix(2,2);// in each matrix in order to do certain operations with them
		 BigDecimal[][] c = createIdentityMatrix(2,2);
		 BigDecimal[][] d = createZeroMatrix(2,2);
		 BigDecimal[][] addedMatrix = createZeroMatrix(2,2);
		 BigDecimal[][] substractedMatrix = createZeroMatrix(2,2);
		 BigDecimal theDeterminant = new BigDecimal(0);
		 boolean result;
		 double percentage;
		 System.out.println("The first matrix:");
		 printMatrix(a);
		 System.out.println();
		 System.out.println("The second matrix:");
		 printMatrix(b);
		 System.out.println();
		 addedMatrix = addMatrix(a,b);
		 System.out.println("The added matrix:");
		 printMatrix(addedMatrix);
		 System.out.println();
		 substractedMatrix = subMatrix(a,b);
		 System.out.println("The substracted matrix:");
		 printMatrix(substractedMatrix);
		 System.out.println();
		 a = multiplyScalar(a,scalarBigDecimal);
		 System.out.println("The multiplied matrix is:");
		 printMatrix(a);
		 System.out.println();
		 theDeterminant = determinant(b);
		 System.out.println("The determinant of the choosed matrix is:");
		 System.out.println(theDeterminant);
		 System.out.println();
		 result = areEqual(a,b);
		 if(result)
		 {
			 System.out.println("Matrix a and b are equal");
		 }
		 else
		 {
			 System.out.println("Matrix a and b are not equal");
		 }
		 System.out.println();
		 result = isZeroMatrix(d);
		 if(result)
		 {
			 System.out.println("Matrix d is zero valued");
		 }
		 else
		 {
			 System.out.println("The matrix d is not zero-valued");
		 }
		 System.out.println();
		 result = isIdentityMatrix(c);
		 if(result)
		 {
			 System.out.println("Matrix c is identity matrix");
		 }
		 else
		 {
			 System.out.println("Matrix c is not identity matrix");
		 }
		 System.out.println();
		 percentage = fillDegree(a);
		 System.out.print("The percentage of filling of matrix a is: ");
		 System.out.print(percentage+"%");
		 scanner.close();
	}

}
