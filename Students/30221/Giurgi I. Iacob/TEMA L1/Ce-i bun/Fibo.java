import java.util.Scanner;

public class Fibo {
  public static int Fib(int n)
  {  
	  if(n<=1)
		  return n;
	  return Fib(n-1)+Fib(n-2);
  } // Teoretic asta ar avea O(log n) alta varianta de implementare eficienta nu stiu 
  
  public static int Fibv2(int n)
  {
	  if(n==1 || n==2)
		  return 1;
	  int f1=1,f2=2,f3=1;
	  int i;
	  for(i=3;i<=n;i++)
	  { f3=f1+f2;
	    f1=f2;
	    f2=f3;
	  }
	  return f3;
  } // Are complexitate O(n) pentru ca se foloseste numa un for
  
  
  public static long Sum(long n)
  {
	  int i;
	  long s=0;
	  for(i=1;i<=n;i++)
		  if(Fib(i)%2==0)
		    s += Fib(i);
	  return s;
  }
  
  public static void Mils4()
  {
	  int i;
	  long s=0;
	  for(i=0;i<4000000;i++)
		  if(Fib(i)%2==0)
			    s += Fib(i);
	 System.out.printf("Suma ii : %ld",s);
	  
  }
  
  public static void main(String[] args)
  {
	  Scanner in= new Scanner(System.in);
	  int n=in.nextInt();
	  long result;
	  result=Sum(n);
	  System.out.printf("Suma terminilor pari din Fibo ii %d\n",result) ;
	  Mils4();
	  
 }
  
}
