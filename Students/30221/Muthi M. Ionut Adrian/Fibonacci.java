import java.util.Scanner;

public class Fibonacci {
	
      
	public static void main(String[] args) {
		
		int n,n1=1,n2=2,fib=0,i;
		Scanner input=new Scanner(System.in );
		
		System.out.println("Introduceti termenul ");
		n=input.nextInt();
		
		for(i=3;i<=n;i++){
			fib=n1+n2;
			n1=n2;
			n2=fib;
		}
		System.out.println("termenul  " + n + " are valoarea " + fib);
		
	}

}
