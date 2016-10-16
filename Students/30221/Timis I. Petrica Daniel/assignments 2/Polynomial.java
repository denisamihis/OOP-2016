package firstAssignment;

import java.util.Arrays;

public class Polynomial {
	
	private int[] coeffs;
	
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
	
	public Polynomial add (Polynomial another) {
		int maxDegree = Math.max(getDegree(), another.getDegree());
		int[] initialization = new int[maxDegree + 1];
		Arrays.fill(initialization, 0);
		
		Polynomial polynomialSum = new Polynomial (initialization);
		for (int i = 0; i <= getDegree(); i++)
			polynomialSum.coeffs[i] += coeffs[i];
		for (int i = 0; i <= another.getDegree(); i++) 
			polynomialSum.coeffs[i] += another.coeffs[i];
		
		return polynomialSum;
	}
	
	public Polynomial subtract (Polynomial another) {
		int maxDegree = Math.max(getDegree(), another.getDegree());
		int[] initialization = new int[maxDegree + 1];
		Arrays.fill(initialization, 0);
		
		Polynomial polynomialDiff = new Polynomial (initialization);
		for (int i = 0; i <= getDegree(); i++)
			polynomialDiff.coeffs[i] += coeffs[i];
		for (int i = 0; i <= another.getDegree(); i++) 
			polynomialDiff.coeffs[i] -= another.coeffs[i];
		
		return polynomialDiff;
	}
	
	public Polynomial multiply (Polynomial another) {
		int degreeSum = getDegree() + another.getDegree();
		int[] initialization = new int [degreeSum + 1];
		Arrays.fill(initialization, 0);
		
		Polynomial polynomialProd = new Polynomial (initialization);
		for (int i = 0; i <= getDegree(); i++)
			for (int j = 0; j <= another.getDegree(); j++)
				polynomialProd.coeffs[i+j] += (coeffs[i] * another.coeffs[j]);
		
		return polynomialProd;
	}
	
	public Polynomial scalarMultiplication (int scalar) {
		for (int i = 0; i <= getDegree(); i++)
			coeffs[i] *= scalar;
		Polynomial p1 = new Polynomial (coeffs);
		return p1;
	}
	
	public int evaluate (int value) {
		int result = 0;
		for (int i = getDegree(); i >= 0; i--) {
			result += Math.pow(value, i) * coeffs[i];
		}
		return result;
	}
	
	public String toString () {
		if (getDegree() ==  0) return "" + coeffs[0];
        if (getDegree() ==  1) return coeffs[1] + "x + " + coeffs[0];
        String s = coeffs[getDegree()] + "x^" + getDegree();
        for (int i = getDegree()-1; i >= 0; i--) {
            if (coeffs[i] == 0) continue;
            else if (coeffs[i] > 0) s = s + " + " + (coeffs[i]);
            else if (coeffs[i] < 0) s = s + " - " + (-coeffs[i]);
            if  (i == 1) s = s + "x";
            else if (i >  1) s = s + "x^" + i;
        }
        return s;
	}
	
}
