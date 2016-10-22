package assignment_two_one;

public class Functions {
	public static Polynomials add ( Polynomials a, Polynomials b)
	{
		int [] sum;
		sum = new int [a.degree>b.degree?a.degree+1:b.degree+1];
		int counter;
		counter = 0;
		while(counter<a.coef.length && counter<b.coef.length)
		{
			sum[counter] = a.coef[counter]+b.coef[counter];
			counter++;
		}
		while(counter<a.coef.length)
		{
			sum[counter]=a.coef[counter];
			counter++;
		}
		while(counter<b.coef.length)
		{
			sum[counter]=b.coef[counter];
			counter++;
		}
		return new Polynomials( sum,sum.length);
	}
	public static Polynomials substract ( Polynomials a, Polynomials b)
	{
		int [] sub;
		sub = new int [a.degree>b.degree?a.degree+1:b.degree+1];
		int counter;
		counter = 0;
		while(counter<a.coef.length && counter<b.coef.length)
		{
			sub[counter] = a.coef[counter]-b.coef[counter];
			counter++;
		}
		while(counter<a.coef.length)
		{
			sub[counter]=a.coef[counter];
			counter++;
		}
		while(counter<b.coef.length)
		{
			sub[counter]=b.coef[counter];
			counter++;
		}
		return new Polynomials( sub,sub.length);
	}
	
	public static Polynomials multiplyScalar(Polynomials x, int s)
	{
		Polynomials multi = new Polynomials(x.coef,x.coef.length);
		int counter;
		for(counter=0;counter<multi.coef.length;counter++)
			multi.coef[counter]=s*multi.coef[counter];
		return multi;
	}
	public static Polynomials multiply ( Polynomials a, Polynomials b)
	{
		int [] multy= new int [a.coef.length+b.coef.length];
		int ca, cb;
		for(ca=0;ca<a.coef.length;ca++)
			for(cb=0;cb<b.coef.length;cb++)
				multy[ca+cb]+=a.coef[ca]*b.coef[cb];
		return new Polynomials(multy,multy.length);
	}

}
