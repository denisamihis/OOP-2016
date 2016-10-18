package p1;

public class Polynomials {
	private int [] coeffs;
	
	public Polynomials(int...coeffs){
		this.coeffs=coeffs;
	}
	public int getDegree(){
		int degreeHolder = 0;
		for (int counter = 0; counter < coeffs.length ; counter++){
			if (coeffs[counter]!=0) degreeHolder = counter;
			
		}
		return degreeHolder;
	}
	public int getCoeffs(int coef){
		return coeffs[coef];
		
	}
	public void setCoeffs(int[] coeffs){
		this.coeffs = coeffs;
	}
	public String toString(){
		if (getDegree() == 0) return "" + coeffs[0];
		if (getDegree() == 1) return coeffs[1] + "x +" + coeffs[0];
		String helper = coeffs[getDegree()] + "x^" + getDegree();
		for (int counter = getDegree()-1; counter>=0; counter--){
			if (coeffs[counter]==0) continue;
			else if (coeffs[counter] > 0) helper = helper + " + " +(coeffs[counter]);
			else if (coeffs[counter] < 0) helper = helper + " - " + (-coeffs[counter]);
			if (counter == 1) helper = helper + "x";
			else if (counter > 1) helper = helper + "x^" + counter;
			}
		return helper;
	}
	
}
