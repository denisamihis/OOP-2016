package firstAssignment;

public class Polynomial {
	
	int[] coeffs;
	
	public Polynomial (int... coeffs) {
		this.coeffs = coeffs;
	}
	
	public int getDegree () {
		int degree = 0;
		for (int i = 0; i < coeffs.length; i++)
			if (coeffs[i] != 0)
				degree = i;
		return degree;
	}
	
	public String toString () {
		if (getDegree() == 0) return "" + coeffs[0];
		if (getDegree() == 1) {
			if (coeffs[0] >= 0) return coeffs[1] + "x + " + coeffs[0];
			else return coeffs[1] + "x - " + (-coeffs[0]);
		}
		
		String polString = coeffs[getDegree()] + "x^" + getDegree();
		
		for (int i = getDegree()-1; i >= 0; i--) {
			if (coeffs[i] == 0) continue;
			else if (coeffs[i] > 0) polString = polString + " + " + (coeffs[i]);
			else if (coeffs[i] < 0) polString = polString + " - " + (-coeffs[i]);
			if (i == 1) polString = polString + "x";
			else if (i > 1) polString = polString + "x^" + i;
		}
		
		return polString;
	}

}
