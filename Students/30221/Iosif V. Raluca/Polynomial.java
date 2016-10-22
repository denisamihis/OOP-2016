package polynomials;

public class Polynomial {
	private double[] coeffs;
	
	public Polynomial(double... coeffs){
		this.coeffs=coeffs;
	}
	
	public double getCoef(int index){
		return coeffs[index];
	}
	
	public void setCoeffs(double...coeffs){
		this.coeffs=coeffs;
	}
	public int getDegree(){
		return coeffs.length-1;
	}
	
	public String toString(){
		String s="";
		int degree=this.getDegree();
		for (double c: coeffs){
			s+=c+"*x^"+degree;
			--degree;
		}
		return s;
	}
		
	//x=the value in which the polynomial is evaluated
	
	
	public Polynomial maxPol(Polynomial pol){
		if (this.getDegree() > pol.getDegree())
			return this;
		else return pol;
	}
	
	
	
		
	}


