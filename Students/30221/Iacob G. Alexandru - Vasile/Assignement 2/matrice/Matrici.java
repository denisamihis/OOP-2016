package matrice;

import java.util.Scanner;
import java.math.BigDecimal;

public class Matrici {

	static Scanner in = new Scanner(System.in);
	public static void Citeste (BigDecimal[][] Matrice) {
		int i,j;
		for ( i = 0; i < Matrice.length; i++)
			for ( j = 0; j < Matrice.length; j++) {
				Matrice[i][j] = in.nextBigDecimal();
	 	}
	}
	public static void Afiseaza (BigDecimal[][] matrice)
	{
		int i , j;
		for ( i = 0; i < matrice.length; i++) {
			for (j = 0; j < matrice.length; j++) 
			{
					System.out.print(matrice[i][j]);
					System.out.print(" ");
			}
			System.out.print("\n");
			
		}
	 }
	public static BigDecimal[][] Add (BigDecimal[][] matrice1 , BigDecimal[][] matrice2)
	{
		int n=matrice1.length,i,j;
		BigDecimal[][] sum=new BigDecimal[n][n];
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				sum[i][j]=matrice1[i][j].add(matrice2[i][j]);
		return sum;
	}
	public static BigDecimal[][] Subtract (BigDecimal[][] matrice1, BigDecimal[][] matrice2) {
		 int n = matrice1.length,i,j;
		 BigDecimal[][] matrice3 = new BigDecimal[n][n];
		 for ( i = 0; i < n; i++)	
			 for ( j = 0; j < n; j++) {
					matrice3[i][j] = matrice1[i][j].subtract(matrice2[i][j]);
				}
		 	return matrice3;
		}
	public static BigDecimal[][] Multiply (BigDecimal[][] matrice1, BigDecimal[][] matrice2) {		
			int n= matrice1.length,i,j,k;
			BigDecimal[][] matrice3 = new BigDecimal[n][n];		
		 		for ( i = 0; i < n; i++)
		 			for ( j = 0; j < n; j++)
		 				matrice3[i][j] = BigDecimal.ZERO;
		 		
		 		for ( i = 0; i < n; i++)
		 			for (j = 0; j < n; j++)
		 				for ( k = 0; k < n; k++) {
		 					matrice3[i][j] = matrice3[i][j].add(matrice1[i][k].multiply(matrice2[k][j]));
		 				}
		 		return matrice3;
		 	}
	public static boolean AreEqual (BigDecimal[][] matrice1, BigDecimal[][] matrice2) {
 		int n = matrice1.length,i,j;
 		for ( i = 0; i < n; i++)
 			for ( j = 0; j < n; j++) 
 				if (!matrice1[i][j].equals(matrice2[i][j]))
 					return false;
 		return true;
 	}
 	
 	public static boolean IsZeroMatrix (BigDecimal[][] matrice){
 		int n = matrice.length,i,j;
 		for ( i = 0; i < n; i++)
 			for ( j = 0; j < n; j++)
 				if (!matrice[i][j].equals(BigDecimal.ZERO)) 
 					return false;
 		return true;
 	}
 	
}

