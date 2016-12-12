/**
 * Pentru singurul twist al problemei, doar schimbam cei doi indexi, i si j, ca ei sa
 * mearga de la 9999 la 1000, in functia "largestPal()" .
 */
public class LargestPalindrom {
	
	/**
	 * O functie care gaseste si returneaza palindromul cerut conform cerintei
	 */
	private static long largestPal()
	{
		long maxPal = 0; // Largest palindrome;
		for(int i=999;i>100;i--) // finding the two numbers
		{
			for(int j=i;j>100;j--)
			{
				long product;
				product = i*j; // the product of the two ones
				if(isPal(product) && product > maxPal) // checking if the product is a palindrome
				{
					maxPal = product; 
				}
			}
		}
		return maxPal;
	}
	
	/**
	 * A boolean function which uses some predefined string functions in Java
	 * to check whether the product is indeed a palindrome or not. We don't need
	 * a try..catch statement at the two conversion lines, because an error could
	 * never appear.
	 */
	private static boolean isPal(long pal)
	{
		String palString; // the product (palindrome) converted into a string;
		String reversePalString; // the reverse form of the product (palindrome)
		palString = Long.toString(pal); // conversion of the product (palindrome)
		reversePalString = new StringBuffer(palString).reverse().toString(); // We
		// reverse the already converted product (palindrome) by using a special
		// predefined function in Java. Insted of this, we could have used the popular
		// alternative "int to string" conversion: "" + i for example.
		
		if(palString.equals(reversePalString)) // checking
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) // main function
	{
		long maximumPalindrome;
		maximumPalindrome = largestPal();
		System.out.println("The largest palindrome made from the product of two numbers of 3-digits is: " + maximumPalindrome);
	}

}
