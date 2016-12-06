package Polinom;

public class Functii {

	public Polinom Add (Polinom a, Polinom b)
	{
		int max=Math.max(a.Grad(), b.Grad());
		int i;
		int[] j;
		for(i=0;i<max;i++)
		{
			j[i]=0;
		}
		Polinom sum= new Polinom (j);
		for(i=0;i<=a.Grad();i++)
			sum.coeficienti[i]+=a.coeficienti[i];
		for(i=0;i<=b.Grad();i++)
			sum.coeficienti[i]+=b.coeficienti[i];
		return sum;	
				
	}
	public Polinom Substract (Polinom a, Polinom b)
	{
		int max=Math.max(a.Grad(), b.Grad());
		int i;
		int[] j;
		for(i=0;i<max;i++)
		{
			j[i]=0;
		}
		Polinom dif= new Polinom (j);
		for(i=0;i<=a.Grad();i++)
			dif.coeficienti[i]+=a.coeficienti[i];
		for(i=0;i<=b.Grad();i++)
			dif.coeficienti[i]-=b.coeficienti[i];
		return dif;	
	}
	public Polinom Multiply (Polinom a, Polinom b)
	{
		int sum=a.Grad()+b.Grad();
		int i,k;
		int[] j;
		for(i=0;i<sum;i++)
		{
			j[i]=0;
		}
		Polinom prod= new Polinom (j);
		for(i=0;i<=a.Grad();i++)
			for(k=0;k<=b.Grad();k++)
				prod.coeficienti[i+k]+=(a.coeficienti[i]*b.coeficienti[k]);
		return prod;	
	}
	public Polinom Mul_scal (int scalar, Polinom a)
	{
		int i;
		for(i=0;i<a.Grad();i++)
			a.coeficienti[i]*=scalar;
		return a;
			
	}
	public int Eval ( int value, Polinom a)
	{
		int sum=0,i;
		for(i=0;i<a.Grad();i++)
			sum+=(value^i)*a.coeficienti[i];
		return s;
		
	}
}

