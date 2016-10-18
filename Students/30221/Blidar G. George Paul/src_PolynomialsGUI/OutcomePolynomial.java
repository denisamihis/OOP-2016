/*
 * A class which can create resulted polynomials after doing some operations between 2 other polynomials
 */
public class OutcomePolynomial {

	private int[] coeffs = new int[20];
	
	public OutcomePolynomial()
	{
		this.initializeCoeffs();
	}
	
	public void initializeCoeffs()
	{
		for(int i=0;i<20;i++)
		{
			coeffs[i] = 0;
		}
	}
	
	public void writeCoeffs()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(this.coeffs[i]);
		}
	}
	
	public void setCoeffs(int position, int value)
	{
		coeffs[position] = value;
	}
	
	public int getCoeffs(int position)
	{
		return coeffs[position];
	}
	
	public String get(int i)
	{
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
	
	public String toString()
	{
		String polynomialString="";
		for (int i=0;i<20;i++ ) 
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

