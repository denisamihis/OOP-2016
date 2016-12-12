
public class Polynomials {

	Functions fct=new Functions();
	InputOutput file=new InputOutput();
	public void main(){
		file.read();
		
		
	}
	
	
	

	
	public String toString(int[] pol){
		String str="";
	
		int degree=pol.length;
		for(int i=0;i<degree;i++){
			
			str+=pol[i]+"x^"+degree;
			
			
		}
		return str;
	}
	
	public int[] maxPol(int[] pol1, int[] pol2){
		int degree1,degree2;
		degree1=pol1.length;
		degree2=pol2.length;
		if(degree1>degree2)
			return pol1;
		else 
			return pol2;
	}
	
	public int[] minPol(int[] pol1, int[] pol2){
		int degree1,degree2;
		degree1=pol1.length;
		degree2=pol2.length;
		if(degree1<degree2)
			return pol1;
		else 
			return pol2;
	}
}
