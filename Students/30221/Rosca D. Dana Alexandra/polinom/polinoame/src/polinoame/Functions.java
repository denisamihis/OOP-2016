package polinoame;

public class Functions {
	public static  Polynomials sum  (Polynomials p1,Polynomials p2){
		Polynomials p3=new Polynomials();
		Polynomials p4=new Polynomials();
		if (p1.getGrad()>p2.getGrad())
			{
			p3=p1;
			p4=p2;
			}
		else 
			{
			p3=p2;
			p4=p1;
			}
		for(int i=0;i<=p4.getGrad();i++)
			{
			
			p3.setCoef(i,p3.getCoef()[i]+p4.getCoef()[i]);
			
			}
	
		return p3;
	 }
		
	public static  Polynomials sub  (Polynomials p1,Polynomials p2){
		Polynomials p3=new Polynomials();
		Polynomials p4=new Polynomials();
		if (p1.getGrad()>p2.getGrad())
			{
			p3=p1;
			p4=p2;
			}
		else 
			{
			p3=p2;
			p4=p1;
			}
		for(int i=0;i<=p4.getGrad();i++)
			{
			
			p3.setCoef(i,p3.getCoef()[i]-p4.getCoef()[i]);
			
			}
	
		return p3;
	 }	
	
	 public static Polynomials multiply (Polynomials p1,Polynomials p2){
		 Polynomials p3=new Polynomials();
		 p3.setGrad(p1.getGrad()+p2.getGrad());
		 for(int i=0;i<=p1.getGrad();i++)
			 for(int j=0;j<=p2.getGrad();j++)
			  p3.setCoef(i+j, p3.getCoef()[i]+p1.getCoef()[i]*p2.getCoef()[i]);
			 
		 return p3;
	 
	 }
	 public static Polynomials multiplyScale (Polynomials p1)
	 {
		 for(int i=1;i<=p1.getGrad();i++)
			 p1.setCoef(i, p1.getCoef()[i]*4);
		 return p1;
}
	 
	 public static int evalNr( Polynomials p1,int nr)
	 {	 int s,rez;
	 	 rez=0;
		for(int i=p1.getGrad();i>=1;i--)
			{s=1;
			if(p1.getCoef()[i]!=0)
				for(int j=1;j<=i;j++)
				{
					s=s*nr;
					rez=rez+s*p1.getCoef()[i];
			   		
			    }
					
			}
		return rez;
	 }
	 
}
