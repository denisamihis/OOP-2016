package Polinom;

public class Polinom {
	public int[] coeficienti;
	public  Polinom (int[] coeficienti)
	{
		this.coeficienti=coeficienti;
	}
	public int Grad()
	{
		int i,grad=-1;
		for(i=0;i<coeficienti.length;i++)
			if(coeficienti[i]!=0)
				grad=i;
		return grad;
	}
	public String creare()
	{
		int i;
		if(Grad()==0) return "" + coeficienti[0];
		if(Grad()==1) return + coeficienti[1] +"x+" + coeficienti[0];
		String s=coeficienti[Grad()] + "x^"+Grad();
		for(i=Grad()-1;i>=0;i--)
		{
			   if (coeficienti[i] == 0) continue;
		            else if (coeficienti[i] > 0) s = s + " + " + (coeficienti[i]);
		            else if (coeficienti[i] < 0) s = s + " - " + (-coeficienti[i]);
		            if  (i == 1) s = s + "x";
		            else if (i >  1) s = s + "x^" + i;
		}
		return s;
	}
}


