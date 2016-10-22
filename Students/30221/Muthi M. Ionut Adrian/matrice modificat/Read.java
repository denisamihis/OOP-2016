import java.util.Scanner;
import java.math.BigDecimal;
public class Read {
	Scanner input=new Scanner(System.in);
	public int getn(){
		int n;
	    
	    System.out.println("Matrix rang is = ");
	    n=input.nextInt();
	
	    return n;
	}
	
	public BigDecimal[][] scrie(int n){
     

	
	BigDecimal a[][]=new BigDecimal[n][n];

	int row,col;
	
	
    for( row=0; row<n;row++){
    	for( col=0;col<n;col++){
    		System.out.printf("a[%d][%d]= ",row,col);
    
			a[row][col]=input.nextBigDecimal();
    		
    	}
    
    }
	System.out.println(" ");
    return a;
    
	}
	

	public void citire(BigDecimal[][] a){
		
		
		int row,col;
		 for( row=0; row<a.length;row++){
		    	for( col=0;col<a.length;col++){
		    		System.out.print(a[row][col] + " ");
		         
					
		    		
		    	}
		    	System.out.println();
		    	 
		
	}
		 
	}
	}	
	
 	

