package matrix;
import java.util.Scanner;
import java.math.BigDecimal;

public class Matrix {
	private static Scanner in=new Scanner(System.in);
	public static void main(String[] args){
		int n;
		
		System.out.print("n=");
		n=in.nextInt();
		
		BigDecimal[][] matrix1=new BigDecimal[n][n];
		BigDecimal[][] matrix2=new BigDecimal[n][n];
		BigDecimal[][] matrix3=new BigDecimal[n][n];
		
		matrix1=Matrix.read(n, matrix1);
		System.out.print("Second matrix:");
		matrix2=Matrix.read(n, matrix2);
		
		System.out.print("Determinant="+MatrixOp.determinant(matrix1,matrix1.length));
		
		System.out.print("Please enter a scalar with which we will multiply the matrix:");
		BigDecimal bd=in.nextBigDecimal();
		matrix3=MatrixOp.multiplyScalar(bd, matrix2);
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
	public static BigDecimal[][] read(int n, BigDecimal[][] m){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				m[i][j]=in.nextBigDecimal();
			}
		}
		return m;
	}
	
	

}
