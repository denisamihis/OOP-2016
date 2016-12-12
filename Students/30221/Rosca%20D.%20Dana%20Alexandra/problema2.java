package asigment1;

public class problema2 {
	public static long fibsum()
	{ long a=1;
	  long b=1;
	  long c=a+b;
	  long s=0;
	  while(c<=4000000)
	  {if(c%2==0)
		  s=s+c;
	  a=b;
	  b=c;
	  c=a+b;
	  }
	  return s;
	  
		  
	  }
	
	public static void main(String[] arg)
	{
	 System.out.println(fibsum());
	}
}
