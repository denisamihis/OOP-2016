package p1;

public class Functions {
	public Polynomials ADD(Polynomials firstPol,Polynomials secondPol){
		Polynomials result = new Polynomials();
		int[] copy = new int[Math.max(firstPol.getDegree() + 1, secondPol.getDegree() + 1)];
			for (int counter = 0;counter <=firstPol.getDegree(); counter ++)
				copy[counter] += firstPol.getCoeffs(counter);
			for (int counter = 0;counter <=secondPol.getDegree(); counter ++)
				copy[counter] += secondPol.getCoeffs(counter);
 		
		result.setCoeffs(copy);
		
	return result;
	}
	public Polynomials SUBSTRACT(Polynomials firstPol,Polynomials secondPol){
		Polynomials result = new Polynomials();
		int[] copy = new int[Math.max(firstPol.getDegree() + 1, secondPol.getDegree() + 1)];
		
			for (int counter = 0;counter <=firstPol.getDegree(); counter ++)
				copy[counter] += firstPol.getCoeffs(counter);
			for (int counter = 0;counter <=secondPol.getDegree(); counter ++)
				copy[counter] -= secondPol.getCoeffs(counter);
		result.setCoeffs(copy);
		return result;
	}
	public Polynomials MULTIPLY(Polynomials firstPol,Polynomials secondPol){
		Polynomials result = new Polynomials();
		int[] copy = new int[firstPol.getDegree() +  secondPol.getDegree() + 2];
		for (int firstCounter = 0; firstCounter<=firstPol.getDegree();firstCounter++)
			for (int secondCounter = 0; secondCounter <= secondPol.getDegree(); secondCounter++)
				copy[firstCounter + secondCounter] += (firstPol.getCoeffs(firstCounter) * secondPol.getCoeffs(secondCounter));
		result.setCoeffs(copy);
		return result;
	}
	public Polynomials MUL_SCAL (Polynomials poly, int scalar){
		int[] copy = new int[poly.getDegree() +1];
		for (int counter = 0;counter<=poly.getDegree();counter++){
			copy[counter] = poly.getCoeffs(counter) * scalar;
		}
		poly.setCoeffs(copy);
		return poly;
	}
	public int EVAL(Polynomials poly, int value){
		int result = 0;
		for (int counter = poly.getDegree(); counter >= 0; counter--){
			result = poly.getCoeffs(counter) + (value * result);
		}
		return result;
	}
}
