package polinoame;

public class Polynomials {
	private int n;       //campuri
	protected int[] coef;
	
	public Polynomials () {
		n=0;
		coef=null;
	}
	public Polynomials(int grad){
		this.n=grad;
		coef=new int[grad+1];
	}
 
	public int getGrad() {
	  return n;
	}
	public void  setGrad(int grad)
	 { n=grad;
	 }
	
	public int [] getCoef(){ 
		return coef;
	}
 public void  setCoef(int[] coef) {
	 this.coef=coef;
 	}
 public void setCoef(int poz, int val){
	 this.coef[poz]=val;
 }
 public String toString(){
	String s="";
	for(int i=n;i>=0;i--)
	{
		if(coef[i]!=0)
		{	int g=i;
			s=s+coef[i]+"x^"+ g+"+";
		}
 }		
		return s;
	}
 
}
