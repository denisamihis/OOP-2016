package vegsopolinomlofasz;

public class TestPolinom {
	public static void main(String[] args){
		int[] tomb; //array for coefficients
		tomb=InputOutput.readFile();
		Polynomial poli1=new Polynomial(tomb);
		InputOutput.printP(poli1);
		
		tomb=InputOutput.readFile();
		Polynomial poli2=new Polynomial(tomb);
		InputOutput.printP(poli2);
		InputOutput.readFunctions(poli1,poli2); //will execute functions from file
		
		
	}
	
	public static Polynomial MUL_SCAL(int scal, Polynomial pol){ //multiplying with a number
		for(int i=0;i<pol.getDegree();i++)
			pol.getCoef()[i]=pol.getCoef()[i]*scal;
		return pol;
	
	}
	
	public static double EVAL(int scal, Polynomial pol){ //evaluating a polynomial
		int c;
		double result=0;
		for(int i=0;i<pol.getDegree();i++){
			c=pol.getCoef()[i];
			result=result+c*Math.pow(scal, pol.getDegree()-1-i);
		}
		return result;
	}
	
	public static Polynomial subtractPoli(Polynomial pol1, Polynomial pol2){ //substraction of two polynomials
		Polynomial result;
		if(pol1.getDegree()>=pol2.getDegree()){
			int d=pol1.getDegree()-pol2.getDegree();
			result=new Polynomial(pol1.getCoef());
			
			for(int i=pol2.getDegree()-1;i>=0;i--){
				result.getCoef()[d+i]=result.getCoef()[d+i]-pol2.getCoef()[i];
			}
		}
		else{
			int d=pol2.getDegree()-pol1.getDegree();
			result=new Polynomial(pol2.getCoef());
			
			for(int i=pol1.getDegree()-1;i>=0;i--){
				result.getCoef()[d+i]=result.getCoef()[d+i]-pol1.getCoef()[i];
			}
		}
		return result;
	}
	
	public static Polynomial addPoli(Polynomial pol1, Polynomial pol2){ //addition of two polynomials
		Polynomial result;
		if(pol1.getDegree()>=pol2.getDegree()){
			int d=pol1.getDegree()-pol2.getDegree();
			result=new Polynomial(pol1.getCoef());
			
			for(int i=pol2.getDegree()-1;i>=0;i--){
				result.getCoef()[d+i]=result.getCoef()[d+i]+pol2.getCoef()[i];
			}
		}
		else{
			int d=pol2.getDegree()-pol1.getDegree();
			result=new Polynomial(pol2.getCoef());
			
			for(int i=pol1.getDegree()-1;i>=0;i--){
				result.getCoef()[d+i]=result.getCoef()[d+i]+pol1.getCoef()[i];
			}
		}
		return result;
	}
}
