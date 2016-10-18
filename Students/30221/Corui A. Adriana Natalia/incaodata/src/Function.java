
public class Function {

	int []x=new int[10];int []c=new int [10];
	int nrX,nrC;
	private Polynomial p1,p2;
	public Function(Polynomial pol1,Polynomial pol2)
	{
		nrX=pol1.getDegree();
		nrC=pol2.getDegree();
		for(int i=0;i<nrX;i++)
			x[i]=pol1.getCoef(i);
		for(int i=0;i<nrC;i++)
			c[i]=pol2.getCoef(i);
		  p1= new Polynomial(x,nrX);
		  p2=new Polynomial(c,nrC);
	}
	public void add()
	{
		int []temp=new int [10];
		int deg=(Math.max(p1.getDegree(),p2.getDegree()));
		for(int i=0;i<p1.getDegree();i++)
			temp[i]+=p1.getCoef(i);
		for(int i=0;i<p2.getDegree();i++)
			temp[i]+=p2.getCoef(i);
		Polynomial p3=new Polynomial(temp,deg);
		p3.construct();
			
	}

	public void substract()
	{
		int []temp=new int [10];
		int deg=(Math.max(p1.getDegree(),p2.getDegree()));
		for(int i=0;i<p1.getDegree();i++)
			temp[i]+=p1.getCoef(i);
		for(int i=0;i<p2.getDegree();i++)
			temp[i]-=p2.getCoef(i);	
		Polynomial p3=new Polynomial(temp,deg);
		p3.construct();
	}
	public void multiply()
	{
		int []temp=new int [10];
		int deg=p1.getDegree() + p2.getDegree();
		for(int i=0;i<p1.getDegree();i++)
			for(int j=0;j<p2.getDegree();j++)
			temp[i+j]+=p1.getCoef(i)*p2.getCoef(j);
		Polynomial p3=new Polynomial(temp,deg);
		p3.construct();
			
	}
	public void mul_scal(int scalar)
	{
		int []temp=new int [10];
		int deg=p1.getDegree();
		for(int i=0;i<p1.getDegree();i++)
			temp[i]=scalar* p1.getCoef(i);
		Polynomial p3=new Polynomial(temp,deg);
		p3.construct();
		deg=p2.getDegree();
		for(int j=0;j<p2.getDegree();j++)
			temp[j]=scalar* p2.getCoef(j);
		Polynomial p4=new Polynomial(temp,deg);
		p4.construct();
			
	}
	public void eval(int value)
	{
		int sumP1=0,sumP2=0;
		for(int i=p1.getDegree();i>=0;i--)
			sumP1=p1.getCoef(i)+(value*sumP1);
		System.out.printf("P1(%d)=%d\n",value,sumP1);
		for(int i=p2.getDegree();i>=0;i--)
			sumP1=p2.getCoef(i)+(value*sumP2);
		System.out.printf("P2(%d)=%d",value,sumP2);
			
	}

}
