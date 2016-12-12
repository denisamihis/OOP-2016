package lab1;

import java.util.Scanner;

public class FibonacciOlogn {

	public static void main(String[] args) {
		int[][] fibo = new int[2][2];
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		fibo[0][0] = fibo [0][1] = fibo [1][0] = 1;
		fibo[1][1] = 0;
		if (n == 0)
			System.out.println(0);
		else
		{
			fibo = putere(fibo,n);
			System.out.println(fibo[0][1]);
		}
		

	}
	public static int[][] inmultire(int[][] a, int[][] b)
	{
		int[][] c = new int[2][2];
		c[0][0] = a[0][0]*b[0][0]+ a[0][1]*b[1][0];
		c[0][1] = a[0][0]*b[1][0]+ a[0][1]*b[1][1];
		c[1][0] = a[1][0]*b[0][0]+ a[1][1]*b[1][0];
		c[1][1] = a[1][0]*b[1][0]+ a[1][1]*b[1][1];
		
		return c;
	}
	public static int[][] putere(int[][] a, int n)
	{
		if (n == 1)
			return a;
		if (n%2 == 1)
			return inmultire(a,inmultire(putere(a,(n-1)/2),putere(a,(n-1)/2)));
		else return inmultire(putere(a,n/2),putere(a,n/2));
	}

}