package assignment_two_one;

public class Polynomials {
	int degree;
	int[] coef;
	public Polynomials(int[]coef)
	{
		this.coef = new int[coef.length];
		this.degree = coef.length- 1;
		int counter;
		for(counter=0;counter<coef.length;counter++)
			this.coef[counter]=coef[coef.length - counter - 1];
		
	}
	public Polynomials(int[]coef, int degree)
	{
		int counter,zeroes=0;
		for(counter=coef.length-1;coef[counter]==0;counter--)
			zeroes++;
		this.coef= new int[coef.length-zeroes];
		this.degree=this.coef.length-1;
		for(counter=0;counter<=this.degree;counter++)
			this.coef[counter]=coef[counter];
		
		
	}
	public int evaluate (int x)
	{
		int counter,sum;
		sum=0;
		for(counter=0;counter<=degree;counter++)
			sum = sum+ coef[counter]*(int)Math.pow(x, counter);
		return sum;
	}
}
