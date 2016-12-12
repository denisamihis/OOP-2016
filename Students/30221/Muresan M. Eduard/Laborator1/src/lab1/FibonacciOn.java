package lab1;

import java.util.Scanner;

public class FibonacciOn {

	public static void main(String[] args) {
		int n, first, second, next=0;
		Scanner in = new Scanner(System.in);
		first = 0;
		second = 1;
		n = in.nextInt();
		if (n == 0)
			System.out.println(0);
		else if (n == 1)
			System.out.println(1);
		else
		{
			n-=2;
			while (n>=0)
			{
				next = first + second;
				first = second;
				second = next;
				--n;
			}
			System.out.println(next);
			
		}

	}
}
