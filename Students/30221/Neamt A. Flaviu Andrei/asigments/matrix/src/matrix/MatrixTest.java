package matrix;
import java.util.Scanner;
import java.math.BigDecimal;

public class MatrixTest {
	private static Scanner input=new Scanner(System.in);
	public static void main(String[] args){
		int n;
		
		System.out.print("n=");
		n=input.nextInt();
		BigDecimal[][] matrix1=new BigDecimal[n][n];
		BigDecimal[][] matrix2=new BigDecimal[n][n];
		matrix1=MatrixTest.read(n,matrix1);
		matrix2=MatrixTest.read(n,matrix2);
		
	}
	public static BigDecimal[][] read(int n,BigDecimal [][] m){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				m[i][j]=input.nextBigDecimal();}
		return m;
	}
	
	
}
