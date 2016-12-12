/*
 * A function class which contains all needed operations.
 * Instead of division of polynomials, I implemented the differentiation and integration operations. 
 */
public class Functions {
	
	public OutcomePolynomial add(Polynomial p1, Polynomial2 p2)
	{
		int maxDegree = 0;
		OutcomePolynomial p3 = new OutcomePolynomial();
		if(p1.getDegree() >= p2.getDegree())
		{
			maxDegree = p1.getDegree();
		}
		else
		{
			maxDegree = p2.getDegree();
		}
		
		for(int i=0;i<=maxDegree;i++)
		{
			p3.setCoeffs(i, p1.getCoeffs(i)+p2.getCoeffs(i));
		}
		
		return p3;
	}
	
	public OutcomePolynomial substract(Polynomial p1, Polynomial2 p2)
	{
		int maxDegree = 0;
		OutcomePolynomial p3 = new OutcomePolynomial();
		if(p1.getDegree() >= p2.getDegree())
		{
			maxDegree = p1.getDegree();
		}
		else
		{
			maxDegree = p2.getDegree();
		}
		
		for(int i=0;i<=maxDegree;i++)
		{
			if(p1.getCoeffs(i) == 0)
			{
				p3.setCoeffs(i, p2.getCoeffs(i));
			}
			else
			{
				p3.setCoeffs(i, p1.getCoeffs(i)-p2.getCoeffs(i));
			}
		}
		
		return p3;
	}
	
	public OutcomePolynomial multiply(Polynomial p1, Polynomial2 p2)
	{
		OutcomePolynomial p3 = new OutcomePolynomial();
		for(int i=0;i<=p1.getDegree();i++)
		{
			if(p1.getCoeffs(i)==0)
			{
				continue;
			}
			for(int j=0;j<=p2.getDegree();j++)
			{
				if(p2.getCoeffs(j)==0)
				{
					continue;
				}
				p3.setCoeffs(i+j, p3.getCoeffs(i+j) + p1.getCoeffs(i) * p2.getCoeffs(j));
			}
		}
		
		return p3;
	}
	
	public OutcomePolynomial scalarMultiply(Polynomial p1, int value)
	{
		OutcomePolynomial p3 = new OutcomePolynomial();
		for(int i=0;i<=p1.getDegree();i++)
		{
			p3.setCoeffs(i, value*p1.getCoeffs(i));
		}
		return p3;
	}
	
	public OutcomePolynomial scalarMultiply2(Polynomial2 p2, int value)
	{
		OutcomePolynomial p3 = new OutcomePolynomial();
		for(int i=0;i<=p2.getDegree();i++)
		{
			p3.setCoeffs(i, value*p2.getCoeffs(i));
		}
		return p3;
	}
	
	public long evaluatePolynom1(Polynomial p1, int value)
	{
		int result=0;
		for(int i=0;i<=p1.getDegree();i++)
		{
			result += p1.getCoeffs(i)*(int)Math.pow(value, i);
		}
		return result;
	}
	
	public long evaluatePolynom2(Polynomial2 p2, int value)
	{
		int result=0;
		for(int i=0;i<=p2.getDegree();i++)
		{
			result += p2.getCoeffs(i)*(int)Math.pow(value, i);
		}
		return result;
	}
	
	public OutcomePolynomial diferentiate(Polynomial p1)
	{
		OutcomePolynomial p3 = new OutcomePolynomial();
		for(int i=0;i<=p1.getDegree();i++)
		{
			p3.setCoeffs(i,p1.getCoeffs(i+1)*(i+1));
		}
		return p3;
	}
	
	public OutcomePolynomial diferentiate2(Polynomial2 p2)
	{
		OutcomePolynomial p3 = new OutcomePolynomial();
		for(int i=0;i<=p2.getDegree();i++)
		{
			p3.setCoeffs(i,(p2.getCoeffs(i+1)*(i+1)));
		}
		return p3;
	}
	
	public IntegralPolynomial integration(Polynomial p1) {
	     IntegralPolynomial p3 = new IntegralPolynomial();
	     for(int i=0;i<=p1.getDegree()+1;i++)
	     {
	    	 if(i==0)
	    	 {
	    		 p3.setCoeffs(i, 0);
	    	 }
	    	 else
	    	 {
	    		p3.setCoeffs(i, (double)(p1.getCoeffs(i-1))/i);
	    	 }
	     }
	     return p3;
	 }
     
	public IntegralPolynomial integration2(Polynomial2 p2) 
	{
	     IntegralPolynomial p3 = new IntegralPolynomial();
	     for(int i=0;i<=p2.getDegree()+1;i++)
	     {
	    	 if(i==0)
	    	 {
	    		 p3.setCoeffs(i, 0);
	    	 }
	    	 else
	    	 {
	    		p3.setCoeffs(i, (double)(p2.getCoeffs(i-1))/i);
	    	 }
	     }
	     return p3;
	
	
	}
}
