public class Polynomial {

	private int []coef=new int[100];;
	private int degree;
	public Polynomial(int []value,int d)
	{
		for(int i=0;i<d;i++)
			coef[i]=value[i];
		degree=d;
	}
	public  void construct()
	{
		int i,deg=degree-1;
		for(i=0;i<degree-1;i++)
		{
			if(coef[i]!=0)
				System.out.print(coef[i]+"x^"+deg+"+");
			deg--;
		}
		System.out.println(coef[degree-1]+"\n");
	}
	

	public int getDegree()
	{
		return degree;
	}
	public void setDegree(int value)
	{
		degree=value;
	}
	public void setCoef(int []coef1 )
	{
		for(int i=0;i<degree;i++)
			coef[i]=coef1[i];
	}
	public int getCoef(int deg)
	{
		if(degree<deg)
			return 0;
		else
		return coef[deg];
	}

	
}
