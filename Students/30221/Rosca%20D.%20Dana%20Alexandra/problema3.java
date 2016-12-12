package asigment1;

public class problema3 {
public static boolean palindrom(int n)
{int nr=n;
	int c=0;
	while(n!=0)
		{c=c*10+(n%10);
		n=n/10;
		}
if(c==nr) return true;
return false;

}
public static int big()
{for(int i=999;i>=100;i--)
	for(int j=999;j>=100;j--)
		if (palindrom(i*j))
			return i*j;
return -1;
			

}
public static void main(String[] arg)
{
 System.out.println(big());
}
}


