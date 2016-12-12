
public class Fibonacci {

	public static void main(String[] args) {
	
		int n=13;
		int a=0;
		int b=1;
		int c = 0 ; 
		int Sum= 0 ;
		for (int i=1;i<=n;i++){
		c= a+b;
		a=b;
		b=c;
		System.out.print(" " + c + " " );
		if ( c> 4000000) break;
		if (c%2 == 0)
			Sum += c;
		
	}
		
		System.out.println(Sum);
	}
}
