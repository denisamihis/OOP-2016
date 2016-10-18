
public class Prime {
	
	
	public static boolean Nprim(int n)
	{   if(n==1)
		 return false;
		int i;
		for(i=2;i<=n/2;i++)
			if(n%i==0) return false;
		return true;
		
	}
public static void main(String[] args)
{
	int i=3,k=0,nr_tot;
	float a;
	int dr_jos,dr_sus,st_jos,st_sus;
	boolean indicator=false;
	while(!indicator)
	{  { dr_jos = i*i;
	    if(Nprim(dr_jos))
	        k++;
	    st_jos = dr_jos - (i-1);
		if(Nprim(st_jos))
	    	k++;
		st_sus = st_jos - (i-1);
		if(Nprim(st_sus))
	    	k++;
		dr_sus = st_sus - (i-1);
		if(Nprim(dr_sus))
	    	k++;
	    }
		nr_tot= (2*i-1); // numerele totale de pe diagonale 
		 a=(float)k/nr_tot; // face ceva figuri cu a-u asta , de nu imi merge calumea .. in rest creca e bine problema
	     if(a<=0.1 && a!=0.0)
	    	 indicator=true;
	     else
	    	 i=i+2;
	}
	System.out.printf("Matricea trebe sa aiba dimensiunea "+i);
	
}
}
