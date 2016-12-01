package polynomials;

public class Polynomials {
	public int dgr;
	public int cfs[];
	public Polynomials(int cfs[])
	{
		this.cfs=cfs;
		dgr=cfs.length-1;
	}
	public int evaluate(int pct)
	{
		int S=0;
		for(int x=0;x<cfs.length;x++)
			S+=Math.pow(pct,x)*cfs[x];
		return S;
	}
	public String strCon()
	{
		String con="";
		for(int x=dgr;x>=0;x--)
			if(cfs[x]>=0)
				con+="+"+ cfs[x]+"x^"+x+" ";
			else
				con+=cfs[x]+"x^"+x+" ";
		return con;
	}
}
