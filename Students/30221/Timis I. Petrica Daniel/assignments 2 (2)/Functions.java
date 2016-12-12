package firstAssignment;

import java.util.Arrays;

public class Functions {
	
	//It returns an array full of zeros
	private static int[] initialization (int degree) {
		int[] initialization = new int[degree + 1];
		Arrays.fill(initialization, 0);
		return initialization;
	}
	
	public static Polynomial add (Polynomial p1, Polynomial p2) {
		int maxDegree = Math.max(p1.getDegree(), p2.getDegree());
		Polynomial polynomialSum = new Polynomial (initialization(maxDegree));
		
		for (int i = 0; i <= p1.getDegree(); i++)
			polynomialSum.coeffs[i] += p1.coeffs[i];
		for (int i = 0; i <= p2.getDegree(); i++) 
			polynomialSum.coeffs[i] += p2.coeffs[i];
		
		return polynomialSum;
	}
	
	public static Polynomial subtract (Polynomial p1, Polynomial p2) {
		int maxDegree = Math.max(p1.getDegree(), p2.getDegree());
		Polynomial polynomialSub = new Polynomial (initialization(maxDegree)); 
		
		for (int i = 0; i <= p1.getDegree(); i++)
			polynomialSub.coeffs[i] += p1.coeffs[i];
		for (int i = 0; i <= p2.getDegree(); i++) 
			polynomialSub.coeffs[i] -= p2.coeffs[i];
		
		return polynomialSub;
	}
	
	public static Polynomial multiply (Polynomial p1, Polynomial p2) {
		int degreeSum = p1.getDegree() + p2.getDegree();
		Polynomial polynomialMul = new Polynomial (initialization(degreeSum));
		
		for (int i = 0; i <= p1.getDegree(); i++)
			for (int j = 0; j <= p2.getDegree(); j++)
				polynomialMul.coeffs[i+j] += (p1.coeffs[i] * p2.coeffs[j]);
		
		return polynomialMul;
	}
	
	public static Polynomial scalarMultiplication (Polynomial p, int scalar) {
		for (int i = 0; i <= p.getDegree(); i++)
			p.coeffs[i] *= scalar;
		
		Polynomial newP = new Polynomial (p.coeffs);
		
		return newP;
	}

	public static int evaluate (Polynomial p, int value) {
		int result = 0;
		
		for (int i = p.getDegree(); i >= 0; i--)
			result += Math.pow(value, i) * p.coeffs[i];
		
		return result;
	}
	
}
