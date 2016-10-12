package tema;

public class Fibonacci {
	public static long fibonacci(long x)
	{if (x==1||x==0)
		return 1;
	else return fibonacci(x-1)+fibonacci(x-2);}

	public static void main(String[] args) {
		int contor=-1;
		long Suma=0;
		while(fibonacci(contor+3)<4000000)
			{Suma+=fibonacci(contor+2);
			contor+=2;
			}
		System.out.println(Suma);
	//  1  		1 		!2 		3 		5 		!8 		13 		21 		!34 		55 		89 		!144... 
	// f(0)		f(1)	f(2)	f(3)	f(4)	f(5)	f(6)	f(7)	f(8)		f(9)	f(10)	f(11)	
	

	}

}
