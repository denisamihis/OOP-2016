package matrix;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixOp {
	public static BigDecimal[][] add(BigDecimal[][] m1, BigDecimal[][] m2){
		BigDecimal[][] result= new BigDecimal[m1.length][m1.length];                                           
			for(int i=0;i<m1.length;i++){
				for(int j=0;j<m1.length;j++){
					result[i][j]=m1[i][j].add(m2[i][j]);
				}
		}
		return result;
	}		
	
	public static BigDecimal[][] subtract(BigDecimal[][] m1, BigDecimal[][] m2){
		BigDecimal[][] result=new BigDecimal[m1.length][m1.length];
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++){
				result[i][j]=m1[i][j].subtract(m2[i][j]);
			}
	}
	return result;
	}
	
	public static BigDecimal[][] multiply(BigDecimal[][] m1, BigDecimal[][] m2){
		BigDecimal[][] result=new BigDecimal[m1.length][m2.length];
		
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++){
				for(int p=0;i<m1.length;p++){
					result[i][j]=result[i][j].add(m1[i][p].multiply(m2[p][j]));		
				}
			}
		}
		return result;
	}
	
	public static BigDecimal[][] multiplyScalar(BigDecimal scalar, BigDecimal[][] m1){
		BigDecimal[][] result=new BigDecimal[m1.length][m1.length];
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++){
				result[i][j]=scalar.multiply(m1[i][j]);
			}
		}
		return result;
		
	}
	
	
	public static boolean areEqual(BigDecimal[][] m1, BigDecimal[][] m2){
		boolean equal=true;
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++){
				if(m1[i][j]!=m2[i][j])
					return equal;
			}
		}
		return equal;
	}
	
	public static boolean isZeroMatrix(BigDecimal[][] m1){
		boolean zero=true;
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++){
				if((m1[i][j].compareTo(BigDecimal.ZERO))!=0)
					zero=false;
			}
		}
		return zero;
	}
	
	public static boolean isIdentityMatrix (BigDecimal[][] m1){
		boolean itIsI=true;
		
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++){
				if(i!=j && (m1[i][j].compareTo(BigDecimal.ZERO)!=0)){
					itIsI=false;
				}
				
				if(i==j && (m1[i][j].compareTo(BigDecimal.ONE)!=0)){
					itIsI=false;
				}
			}
		}
		return itIsI;
	}
	
	public static BigDecimal fillDegree(BigDecimal[][] m1){
		BigDecimal ctr=new BigDecimal(0);
		BigDecimal nrOfElements=new BigDecimal(m1.length*m1.length);
		
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m1.length;j++){
				if((m1[i][j].compareTo(BigDecimal.ZERO))!=0)
					ctr=ctr.add(BigDecimal.ONE);
			}
		}
		ctr=ctr.divide(nrOfElements);
		ctr=ctr.multiply(new BigDecimal(100));
		return ctr;
	}
	
	public static BigDecimal determinant(BigDecimal[][] m1, int n){
		BigDecimal det=new BigDecimal(0);
		int sign=1,p=0,q=0;
		
		if(n==1){
			det=m1[0][0];
		}
		else{
			BigDecimal b[][]=new BigDecimal[n-1][n-1];
			for(int x=0;x<n;x++){
				p=0;
				q=0;
				for(int i=1;i<n;i++){
					for(int j=0;j<n;j++){
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
