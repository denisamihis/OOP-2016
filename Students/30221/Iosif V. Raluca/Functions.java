package polynomials;

public class Functions {
	Polynomial pol1= new Polynomial();
	Polynomial pol2= new Polynomial();
	
	/* We assume: 
	 * pol1= maxPol
	 * pol2=minPol
	 * we calculate these in InputOutput class
	 */
	
	public void add(Polynomial pol1, Polynomial pol2){
		int maxDegree, minDegree;
		
		maxDegree=pol1.getDegree();
		minDegree=pol2.getDegree();
		double[] coef= new double[maxDegree];
		
		Polynomial pol3= new Polynomial();
		
		//I'm starting to create the sum polynomail from the last position
		while (minDegree>=0){
			coef[maxDegree]= pol1.getCoef(maxDegree) + pol2.getCoef(minDegree);
			--maxDegree;
			--minDegree;
		}
		
		//Countinuing only with the coeffs. of the bigger polynomial
		while (maxDegree>=0){
			coef[maxDegree]= pol1.getCoef(maxDegree);
			--maxDegree;
		}
		
		pol3.setCoeffs(coef);

		System.out.println(pol3);
	}
	
	public void substract(Polynomial pol1, Polynomial pol2){
		int maxDegree, minDegree;
		
		
		maxDegree=pol1.getDegree();
		minDegree=pol2.getDegree();
		double[] coef= new double[maxDegree];
		
		Polynomial pol3= new Polynomial();
		
		//I'm starting to create the sum polynomail from the last position
		while (minDegree>=0){
			coef[maxDegree]= pol1.getCoef(maxDegree) - pol2.getCoef(minDegree);
				--maxDegree;
				--minDegree;
			}
			
		//Countinuing only with the coeffs. of the bigger polynomial
		while (maxDegree>=0){
			coef[maxDegree]= pol1.getCoef(maxDegree);
				--maxDegree;
			}
		pol3.setCoeffs(coef);		
		System.out.println(pol3);
	}
	
	public void multiply(Polynomial pol1, Polynomial pol2){
		int maxDegree, minDegree;
	
		maxDegree=pol1.getDegree();
		minDegree=pol2.getDegree();
		
		Polynomial pol3= new Polynomial();
		double[] coef= new double[maxDegree];
		
		//I'm starting to create the sum polynomail from the last position
		while (minDegree>=0){
			coef[maxDegree]= pol1.getCoef(maxDegree) * pol2.getCoef(minDegree);
				--maxDegree;
				--minDegree;
			}
			
		//Countinuing only with the coeffs. of the bigger polynomial
		while (maxDegree>=0){
			coef[maxDegree]= pol1.getCoef(maxDegree);
				--maxDegree;
			}
				
		pol3.setCoeffs(coef);
		System.out.println(pol3);
	}
	
	//multiply a polynomial with a scalar
	public void mulScal (Polynomial pol, double scalar){
		Polynomial multipliedPol= new Polynomial();
		int degree=pol.getDegree();
		double[] coef= new double[degree];
		
		for (int i=degree; i>=0; i--){
			coef[degree]= pol.getCoef(i)*scalar;
		}
		multipliedPol.setCoeffs(coef);
		System.out.println(multipliedPol);
	}
	
	public double eval( Polynomial polToEval, double x){	
		double polValue=0;
		int degree=polToEval.getDegree();
		
		for (int i=degree; i>=0; i--){
			polValue+=polToEval.getCoef(i)*Math.pow(x, degree);
		
			
		}
		
		return polValue;
		
	}
}
