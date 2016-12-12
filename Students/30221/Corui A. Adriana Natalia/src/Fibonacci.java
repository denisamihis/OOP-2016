
public class Fibonacci {
	public static int fib1(int n)
	{
		int a=1, b=1;
		if(n<2) return 0;
		if(n==2) return n;
		int s=0;
		for(int i=3;i<=n;i++)
		{	
			int c=a+b;
			a=b;
			b=c;
			if(c%2==0)
				s=s+c;
		}
		return s;
	}
	public static void main ( String [] args )
	{
		int rez=fib1(10);
		System.out.println(rez);
	}
}
