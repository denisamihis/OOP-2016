import java.math.*;
import java.util.*;
public class MatrixOperations {

	Scanner scan;
	BigDecimal matrice[][];
	int linie , coloana;
	
	public BigDecimal[][] create()
	{
		scan = new Scanner(System.in);
		System.out.println("Dati numaru de linii : ");
		linie = Integer.parseInt(scan.nextLine());
		
		System.out.println("Dati numaru de coloane : ");
		coloana = Integer.parseInt(scan.nextLine());
		
		BigDecimal[][] matrice= new BigDecimal[10][10];
		System.out.println("Dati elementele matricii:");

		for(int i=0;i<linie;i++)
		{
			for(int j=0;j<coloana;j++)
				matrice[i][j]=scan.nextBigDecimal();
		}
		return matrice;
	}
	
	void afisare(BigDecimal matrice[][]) {
		
		System.out.println("\n Matrice arata asa :");
		
		for(int i=0; i<linie; i++) {
			
			for(int j=0; j<coloana; j++) {
				
				System.out.print("\t" + matrice[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public  BigDecimal[][] add(BigDecimal[][] m1 ,BigDecimal[][] m2)
			{   
	            BigDecimal[][] sum=new BigDecimal[linie][coloana];
	            for(int i=0;i<linie;i++){
	               for(int j=0;j<coloana;j++){
	            		sum[i][j] = m1[i][j].add(m2[i][j]);
	               }
	            }
	            return sum;
			}
	
	
	
	public  BigDecimal[][] subtract(BigDecimal[][] m1 ,BigDecimal[][] m2)
	{  
        BigDecimal[][] dif=new BigDecimal[linie][coloana];
        for(int i=0;i<linie;i++){
           for(int j=0;j<coloana;j++){
        		dif[i][j] = m1[i][j].subtract(m2[i][j]);
           }
        }
        return dif;
	}
	
	public  BigDecimal[][] multiply(BigDecimal[][] m1 ,BigDecimal[][] m2)
	{   int d=m1.length;
        BigDecimal[][] mul=new BigDecimal[d][d];
        for(int i=0;i<d;i++)
           for(int j=0;j<d;j++)
        	   for(int p=0;p<d;p++)
        		 mul[i][j] = mul[i][j].add(m1[i][j].multiply(m2[i][j])); 
        return mul;
	}
	
	
	public  BigDecimal[][] scalar(BigDecimal[][] m1,BigDecimal scalar)
	{   int d=m1.length;
        BigDecimal[][] sca=new BigDecimal[d][d];
        for(int i=0;i<linie;i++){
           for(int j=0;j<coloana;j++){
        		sca[i][j] = m1[i][j].multiply(scalar);
           }
        }
        return sca;
	}
	
	public  boolean egale(BigDecimal[][] m1 ,BigDecimal[][] m2)
	{   
        for(int i=0;i<linie;i++){
           for(int j=0;j<coloana;j++){
        	   if(!m1[i][j].equals(m2[i][j]))
        	      return false;
           }
        }
        return true;
	}
	
	public  boolean nula(BigDecimal[][] m1)
	{   
        for(int i=0;i<linie;i++){
           for(int j=0;j<coloana;j++){
        	   if(!m1[i][j].equals(BigDecimal.ZERO))
        	      return false;           }
        }
        return true;
	}
	
	public  boolean identitate(BigDecimal[][] m1)
	{   
        for(int i=0;i<linie;i++){
           for(int j=0;j<coloana;j++){
        	   if( i!=j && !m1[i][j].equals(BigDecimal.ZERO))
        	      return false;
        	   if(i==j && !m1[i][j].equals(BigDecimal.ONE))
                   return false;
           }
           
        }
        return true;
	}
	 public BigDecimal determinant(BigDecimal m1[][])
	    {
	        BigDecimal det=BigDecimal.ZERO;
	        if(linie == 1 && coloana==1)
	           return m1[0][0];
	        else
	        {
	            det=BigDecimal.ZERO;
	            for(int j1=0;j1<linie;j1++)
	            {
	                BigDecimal[][] m = new BigDecimal[linie-1][];
	                for(int k=0;k<(linie-1);k++)
	                {
	                    m[k] = new BigDecimal[linie-1];
	                }
	                for(int i=1;i<linie;i++)
	                {
	                    int j2=0;
	                    for(int j=0;j<linie;j++)
	                    {
	                        if(j == j1)
	                            continue;
	                        m[i-1][j2] = m1[i][j];
	                        j2++;
	                    }
	                }
	              //  det += Math.pow(-1.0,1.0+j1+1.0)* m1[0][j1] * determinant(m,linie-1);
	            } //nu stiu ce ar trebui sa scriu sa imi calculeze determinatu calumea in BigDecimal
	        }
	        return det;
	    }
	
	
	
}
	

