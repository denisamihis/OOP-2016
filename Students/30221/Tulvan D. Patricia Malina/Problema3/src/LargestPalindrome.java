
public class LargestPalindrome {
	
	public static int palindrom (int n){
		int x,d,oglindit=0;
		x=n;
		while(x!=0)
		{
			d=x%10;
			x=x/10;
			oglindit=oglindit*10+d;
		}
		if(oglindit==n) 
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		int i,j,product=1,maxPalindrom=0;
		for(i=100;i<=999;i++)
			for(j=100;j<=999;j++)
			{
				product=i*j;
				if( palindrom(product)==1 && product>maxPalindrom)
					maxPalindrom=product;
			}
		System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " +maxPalindrom);
		for(i=1000;i<=9999;i++)
			for(j=1000;j<=9999;j++)
			{
				product=i*j;
				if( palindrom(product)==1 && product>maxPalindrom)
					maxPalindrom=product;
			}
		System.out.println("The largest palindrome made from the product of two 4-digit numbers is: " +maxPalindrom);
	}

}
