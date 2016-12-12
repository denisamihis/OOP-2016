package assignments;

public class Assig4 
{
	
	public static boolean primeNr (long number)
	{
		int i;
		for (i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0) 
				return false; 
		return true; // Daca numarul este prim se returneaza TRUE
	} 

	public static void createMatrix (long mat[][], int arg)
	{
		long n = arg * arg; int c1, c2, r1, r2;
		c1 = 0; c2 = arg - 1;
		r1 = 0; r2 = arg - 1;
		while (n >= 1)
		{
			for (int i = c2; i >= c1; i--)
				mat[r2][i] = n--;
			for (int j = r2 - 1; j >= r1 + 1; j--)
				mat[j][c1] = n--;
			for (int i = c1; i <= c2; i++)
				mat[r1][i] = n--;
			for (int j = r1 + 1; j <= r2 - 1; j++)
				mat[j][c2] = n--;
			
			c1++;
			c2--;
			r1++;
			r2--;
		}
	}
	
	public static void displayMatrix (long mat[][], int arg)
	{	
		for (int i = 0; i < arg; i++)
		{
			for (int j = 0; j < arg; j++)	
				System.out.print(mat[i][j] + "\t");
			System.out.println ();
		}
	}
	
	public static double ratio (long mat[][], int arg)
	{
		int prime = 0, total = 0;
		for (int i = 0; i < arg; i++)
			for (int j = 0; j < arg; j++)
			{
				if (i == j) 
				{
					if (primeNr(mat[i][j]) == true) 
					{
						prime++;
						total++;
					}
					else
						total++;
				}
				if (i + j == arg - 1)
				{
					if (primeNr(mat[i][j]) == true) 
					{
						prime++;
						total++;
					}
					else
						total++;
				}
			}
		return (double)(prime - 2) / (total - 1);
	}

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		long matrix[][] = new long[15000][15000];
		int n = 3; double r;
		do 
		{
			createMatrix(matrix, n);
			r = ratio (matrix, n);
			System.out.println("Dimensiune = " + n);
			System.out.println("Ratie = " + r);
			n += 1000;

		} while (r >= 0.1);
	}
}
