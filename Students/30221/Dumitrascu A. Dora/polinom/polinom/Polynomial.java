package vegsopolinomlofasz;

public class Polynomial {
	private int[] coef;
	private int degree;
	
	public Polynomial(int[] coef){
		this.coef=coef;
		this.degree=coef.length;
	}
	
	public int getDegree(){
		return degree;
	}
	
	public void setDegree(int degree){
		this.degree=degree;
	}
	
	public int[] getCoef(){
		return coef;
	}
	
	public void setCoef(int[] coef){
		this.coef=coef;
	}
}
