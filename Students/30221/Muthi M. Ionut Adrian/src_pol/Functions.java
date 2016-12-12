import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.math.*;

public class Functions {

	private Polynomials pol;
    InputOutput out_file=new InputOutput();
	public void add(int[] pol1, int[] pol2) throws FileNotFoundException, UnsupportedEncodingException {
		int maxDegree, minDegree;
	
		int[] maxpol,minpol;
		
		maxpol = pol.maxPol(pol1, pol2);
		minpol = pol.minPol(pol1, pol2);

		maxDegree = maxpol.length;
		minDegree = minpol.length;

	int[] pol_add = new int[maxpol.length];
		
		for(int i=0;i<=minpol.length;i++)
		{
			pol_add[i]=maxpol[i]+minpol[i];
		}
	   
		for(int i=minpol.length;i<=maxpol.length;i++){
			pol_add[i]=maxpol[i];
		}

		out_file.print_pol(pol_add);

		
	}

	
	public void substract(int[] pol1, int[] pol2) throws FileNotFoundException, UnsupportedEncodingException{
		int maxDegree,minDegree;
        int[] minpol,maxpol;
       
        maxpol=pol.maxPol(pol1, pol2);
		minpol=pol.minPol(pol1, pol2);
		
		maxDegree=maxpol.length;
		minDegree=minpol.length;
		
		 int[] pol_sub=new int[maxpol.length];
		
		 for(int i=0;i<=minpol.length;i++)
			{
				pol_sub[i]=maxpol[i]-minpol[i];
			}
		   
			for(int i=minpol.length;i<=maxpol.length;i++){
				pol_sub[i]=maxpol[i];
			}
			
			out_file.print_pol(pol_sub);
	}
	
	public void Mul_Scal(int[] pol1,int scalar) throws FileNotFoundException, UnsupportedEncodingException{
	
	    int degree;
	  
	    degree=pol1.length;
	    int[] rez=new int[degree];
	    for(int i=0;i<degree;i++)
	    {
	    	rez[i]=scalar*pol1[i];
	    }
	    out_file.print_pol(rez);
	}
	
	public void Multiply(int [] pol1,int[] pol2) throws FileNotFoundException, UnsupportedEncodingException{
		int degree1,degree2;
		
		degree1=pol1.length;
		degree2=pol2.length;
		int pol_multiply[]=new int[degree1+degree2];
		for(int i=0;i<degree1;i++){
			for(int j=0;j<degree2;j++){
				pol_multiply[i+j]+=(pol1[i]*pol2[j]);
				
			}
		}
		out_file.print_pol(pol_multiply);
	}
	
	public void Eval(int[] pol1,int val){
		int degree;
		double val_pol=0;
		degree=pol1.length;
		
		for(int i=0;i<degree;i++){
			val_pol+=pol1[i]*(val^i);
		}
		System.out.println(val_pol);
	}
	

}

public class Functions {

}
