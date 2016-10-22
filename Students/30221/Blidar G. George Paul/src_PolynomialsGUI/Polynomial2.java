/*
 * The same thing as the Polynomial class
 */
public class Polynomial2 {
	
	private int n;
	private int[] coeffs = new int[10];
	
	public Polynomial2()
	{
		this.initializeCoeffs();
	}
	
	public void initializeCoeffs()
	{
		TextIO.readFile("data2.txt");
		int i = 0;
		while(!TextIO.eoln())
		{
			coeffs[i] = TextIO.getInt();
			i++;
		}
		n=i;
	}
	
	public void writeCoeffs()
	{
		int n = getDegree()+1;
		for(int i=0;i<n;i++)
		{
			System.out.println(this.coeffs[i]);
		}
	}
	
	public int getCoeffs(int position)
	{
		return coeffs[position];
	}
	
	public int getDegree()
	{
		return n-1;
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
