package matrix;
import java.math.BigDecimal;

public class MatrixOOP {
	public static BigDecimal[][] add(BigDecimal[][] m1,BigDecimal[][] m2){
		BigDecimal[][] matrix1=new BigDecimal[m1.length][m1.length];
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++)
				matrix1[i][j]=m1[i][j].add(m2[i][j]);
	    }
		return matrix1;
    }
	public static BigDecimal[][] substract(BigDecimal[][] m1,BigDecimal[][] m2){
		BigDecimal[][] matrix1=new BigDecimal[m1.length][m1.length];
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++)
				matrix1[i][j]=m1[i][j].subtract(m2[i][j]);

	    }
		return matrix1;
    }
	public static BigDecimal[][] multiply(BigDecimal[][] m1,BigDecimal[][] m2){
		BigDecimal[][] matrix1=new BigDecimal[m1.length][m1.length];
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++)
				for(int p=0;p<m1.length;p++)
					matrix1[i][j]=matrix1[i][j].add(m1[i][p].multiply(m2[p][j]));
	     }
		return matrix1;
	}
	public static BigDecimal[][] multiply(BigDecimal[][] m1,BigDecimal d){
		BigDecimal[][] matrix1=new BigDecimal[m1.length][m1.length];
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++)
				matrix1[i][j]=m1[i][j].multiply(d);
	    }
		return matrix1;
    }
	public static boolean areEqual(BigDecimal[][] m1, BigDecimal[][] m2){
		boolean equal=true;
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++)
				if(m1[i][j]!=m2[i][j])
					equal=false;				
	     }
		return equal;
		
	}
	public static boolean isZeroMatrix(BigDecimal[][] m1){
		boolean yes=true;
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++){
				if(m1[i][j].compareTo(BigDecimal.ZERO)!=0) 
                  yes=false;
			}
	   }
		return yes;
    }
	public static boolean isIdentityMatrix(BigDecimal[][] m1){
		boolean yes=true;
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++){
				if(i!=j && (m1[i][j].compareTo(BigDecimal.ONE)!=0)){
					yes=false;
					}	
			}
	}
		return yes;
}
public static BigDecimal FillDegree(BigDecimal[][] m1){
	BigDecimal counter=new BigDecimal(0);
	BigDecimal length= new BigDecimal(m1.length*m1.length);
	for(int i=0;i<m1.length;i++)
		for(int j=0;j<m1.length;j++){
			if(m1[i][j].compareTo(BigDecimal.ZERO)!=0)
				counter=counter.add(BigDecimal.ONE);
		}
	counter=counter.divide(length);
	counter=counter.multiply(new BigDecimal(100));
	return counter;
}
public static BigDecimal determinant(BigDecimal[][] m1,int n){
	BigDecimal det=new BigDecimal(0);
	int p=0,q=0,sign=1;
	
	if(n==1){
		det=m1[0][0];}
	else{
		BigDecimal b[][]=new BigDecimal[n-1][n-1];
		for(int x=0;x<n;x++){
			p=0;q=0;
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				if(j!=x){
					b[p][q++]=m1[i][j];
					if(q%(n-1)==0){
						p++;
						q=0;
					}
				}
			}
		}
		det=det.add((m1[0][x].multiply(determinant(b,n-1))).multiply(new BigDecimal(sign)));
		sign=-sign;
	}
}
	return det;
}
}
