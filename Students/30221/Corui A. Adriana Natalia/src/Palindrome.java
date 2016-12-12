
public class Palindrome {
	public static int palindrom(int nr)
	{
		int inv=0,nrs=nr;
		while(nr>0)
		{
			inv=inv*10+nr%10;
			nr=nr/10;
		}
		if(inv==nrs)
			return 1;
		return 0;
	}
	public static int max()
	{
		for(int i =999; i>100; i--)
		{
	        for(int j = 999; j>100; j--)
	        {
	            int nr = j*i;
	            if(palindrom(nr)==1)
	                return i*j;
	        }
	     }
		return 0;
	}
	public static void main ( String [] args )
	{
		int p=max();
		System.out.println(p);
	}
}
