/*
 * First polynomial class
 * The reason why I created the two same classes ( Polynomial and Polynomial2 ) for creating the two same polynomials
 * is that I couldn't find a way to corectly read from a .txt file using TextIO class.
 * That's the same reason why I used two .txt files, both of them containg the coefficients of the two polynomials
 */
public class Polynomial {
	
	private int n;
	private int[] coeffs = new int[10];
	
	public Polynomial()
	{
		this.initializeCoeffs(); // constructor
	}
	
	public void initializeCoeffs() // read from text file and initialize the coeffs
	{
		TextIO.readFile("data.txt");
		int i = 0;
		while(!TextIO.eoln())
		{
			coeffs[i] = TextIO.getInt();
			i++;
		}
		n=i;
	}
	
	public void writeCoeffs() // prints out the coeffs of the polynomial
	{
		int n = getDegree()+1;
		for(int i=0;i<n;i++)
		{
			System.out.println(this.coeffs[i]);
		}
	}
	
	public int getCoeffs(int position) // returns the coefficient on the <position> index
	{
		return coeffs[position];
	}
	
	public int getDegree() // the degree
	{
		return n-1;
	}
	
	public String get(int i) // a subroutine that handles the sign situation, in order to corectly print out the polynomial
	{                       // in String format
		String iString="";
		
		if(coeffs[i]>0 && i==0)
		{
			iString += coeffs[i];
		}
		else if (coeffs[i] > 0)
		{
			iString += "+" + coeffs[i];
		}
		else if ( coeffs[i]==0 )
		{
			iString += "+0";
		}
		
		else if (coeffs[i]<0)
		{
			iString += coeffs[i];
		}
			
		return iString;
	}
	
	public String toString() // transform the polynomial into a String
	{
		String polynomialString="";
		for (int i=0;i<getDegree()+1;i++ ) 
		{
			if(get(i).equals("+0"))
			{
				continue;
			}
			if(i==0)
			{
				polynomialString +=(get(i)+ " ");
				continue;
			}
		    polynomialString += (get(i) + "x^" +i + " ") ;
		}
		return polynomialString;
	}
	

}
