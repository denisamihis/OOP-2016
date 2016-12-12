
import java.util.Scanner;
import java.math.BigDecimal;

public class MatrixOperations {
	
	static Scanner input=new Scanner(System.in);

	public static BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b){
		BigDecimal c[][]=new BigDecimal [a.length][a.length];
		
		int row, col;
		
		
       	
		for(row=0;row<a.length;row++){
			for(col=0;col<a.length;col++){
				c[row][col]=a[row][col].add(b[row][col]);
			}
		}
		return c;
	}
	
	public static BigDecimal[][] substract(BigDecimal[][] a,BigDecimal[][] b){
		BigDecimal[][] c=new BigDecimal[a.length][a.length];
		
		int row,col;
		
		for(row=0;row<a.length;row++){
			for(col=0;col<a.length;col++){
				c[row][col]=a[row][col].subtract(b[row][col]);
			}
		}
		
		
		
		return c;
	}
	
	public static BigDecimal[][] multiply(BigDecimal[][] a,BigDecimal[][] b){
		BigDecimal c[][]=new BigDecimal[a.length][a.length];
		
		int row,col;
		double multiple=0;
		BigDecimal multiplu= BigDecimal.valueOf(multiple);
		
		
		for(row=0;row<a.length;row++){
			for(col=0;col<a.length;col++){
				multiplu=BigDecimal.valueOf(0);
				for(int k=0;k<a.length;k++){
					multiplu=multiplu.add(a[row][k].multiply(b[k][col]));
				}
				c[row][col]=multiplu;
			}
		}
		return c;
	}
	
	public static BigDecimal[][] multiplyScalar(BigDecimal[][] a){
		BigDecimal c[][]=new BigDecimal [a.length][a.length];
		
		double scalar1=0;
		BigDecimal scalar=BigDecimal.valueOf(scalar1);
		System.out.println("Numarul cu care inmultim matricea este = ");
		scalar=input.nextBigDecimal();
		int row,col;
		
		for(row=0;row<a.length;row++){
			for(col=0;col<a.length;col++){
				c[row][col]=scalar.multiply(a[row][col]);
			}
		}
		return c;
	}
	
	public static  BigDecimal determinant(BigDecimal[][] a){
		
		int dete=0,dete1=0,dete2=0;
		BigDecimal det=BigDecimal.valueOf(dete);
		BigDecimal det1=BigDecimal.valueOf(dete1);
		BigDecimal det2=BigDecimal.valueOf(dete2);
		
		switch(a.length){
		 case 1:
			det=a[0][0];
			break;
		 case 2:
			 det=(a[0][0].multiply(a[1][1])).subtract(a[0][1].multiply(a[1][0]));
			 break;
		 case 3:
			det1=(((a[0][0].multiply(a[1][1])).multiply(a[2][2])).add((a[0][2].multiply(a[1][0])).multiply(a[2][1]))).add((a[0][1].multiply(a[1][2])).multiply(a[2][0]));
			det2=(((a[0][2].multiply(a[1][1])).multiply(a[2][1])).add((a[0][1].multiply(a[1][0])).multiply(a[2][2]))).add((a[0][0].multiply(a[1][2])).multiply(a[2][1]));
			det=det1.subtract(det2);
			break;
			 default:
				System.out.println("Inca nu am reusit sa gasesc o modalitate de a calcula determinanti cu rang mai mare de 3 doar cateva posibilitati filozofice  ");
				 break;
			 
		}
		
		return det;
	}
	

	
	public static void areEqual(BigDecimal[][] a,BigDecimal[][] b){
	    int da=0;
		 
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a.length;col++){
				if(a[row][col].equals(b[row][col])==false)
					da=1;
			}
		}
		
		   if(da==0)
		    System.out.println("Matricile sunt egale ");
		   else 
		    System.out.println("Matricile nu sunt egale ");;
	}

	public static boolean isZeroMatrix(BigDecimal[][] a){
		int row,col,element=0;
		BigDecimal el=BigDecimal.valueOf(element);
		for(row=0;row<a.length;row++){
			for(col=0;col<a.length;col++){
				el=el.add(a[row][col]);
			}
		}
		int zero1=0;
		BigDecimal zero=BigDecimal.valueOf(zero1);
		if (el!=zero)
		  return false;
		
	return true;
	}
	
	
	public static  boolean identityMatrix(BigDecimal[][] a){
		int row,col;
	
		int da=0;
		
	
		for( row=0;row<a.length;row++){
			for( col=0;col<a.length;col++){
				
			if(row==col){
		
				if(a[row][col].compareTo(BigDecimal.ONE)!=0)
					return false;
			}
			if(row!=col){
				if(a[row][col].compareTo(BigDecimal.ZERO)!=0)
					return false;
			}
		}
					
		}	
		return true;
	}
	
	 public static double fillDegree(BigDecimal[][] a){
		 int row,col,sum=0,n;
		 float procent;
		 int zero1=0;
		 BigDecimal zero=BigDecimal.valueOf(zero1);
		 for(row=0;row<a.length;row++){
			 for(col=0;col<a.length;col++){
				if(a[row][col].equals(zero)==false)
					 sum++;
			
			 }
		 }
		 n=a.length;
		 procent=(float)sum/(n*n);
         procent*=100;
		 return procent;
		 
	 }
	
}
