//Suma numerelor Fibonacci
import java.util.Scanner;
import java.util.Random;
public class fib {

	public static void main(String[] args) {
		int a=1,b=2,c,sum=0;
		while(b<4000000)
		{
			if(b%2==0)
				sum=sum+b;
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(sum);
	}
}

