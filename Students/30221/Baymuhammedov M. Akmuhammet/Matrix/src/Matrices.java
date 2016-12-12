
import java.util.Scanner;
import java.util.*;
public class Matrices {
	private static int[][] matrix1=new int[10][10];
	private static int[][] matrix2=new int[10][10];
	private static int[][] sum=new int[10][10];
	private static int nr;
	
	public static void insert(){
		System.out.println("Dimensions for the matrices:");
		Scanner read = new Scanner(System.in);
		nr= read.nextInt();
		System.out.println("numbers:");
		for(int i=0; i<nr; i++)
			for(int j=0;j<nr;j++)
				matrix1[i][j]=read.nextInt();
		System.out.println("numbers:");
		for(int i=0; i<nr; i++)
			for(int j=0;j<nr;j++)
				matrix2[i][j]=read.nextInt();
	}
	
	public static void add(){
		System.out.println("sum of addition:");
		for(int i=0;i<nr;i++){
			for(int j=0;j<nr;j++){
			sum[i][j]=matrix1[i][j]+matrix2[i][j];
			System.out.println(sum[i][j]);
			}
		}
	}
	public static void subtract(){
		System.out.println("sum of subtraction:");
		for(int i=0;i<nr;i++){
			for(int j=0;j<nr;j++){
			sum[i][j]=matrix1[i][j]-matrix2[i][j];
			System.out.println(sum[i][j]);
	}
	}
}
	public static void multiply(){
		int temp=0;
		for(int i=0;i<nr;i++){
			for(int j=0;j<nr;j++){
				for(int k=0;k<nr;k++){
					temp=temp+matrix1[i][k]*matrix2[k][j];
				}
				sum[i][j]=temp;
				temp=0;
			}
		}
		System.out.println("Sum after multiplication");
		for(int i=0;i<nr;i++)
			for(int j=0;j<nr;j++)
				System.out.println(sum[i][j]);
	}
	public static int determinant(int matrix[][],int n){
		int det=0;
        if(n == 1)
        {
            det = matrix[0][0];
        }
        else if (n == 2)
        {
            det = matrix[0][0]*matrix[1][1] - matrix[1][0]*matrix[0][1];
        }
        else
        {
            det=0;
            for(int j1=0;j1<n;j1++)
            {
                int[][] m = new int[n-1][];
                for(int k=0;k<(n-1);k++)
                {
                    m[k] = new int[n-1];
                }
                for(int i=1;i<n;i++)
                {
                    int j2=0;
                    for(int j=0;j<n;j++)
                    {
                        if(j == j1)
                            continue;
                        m[i-1][j2] = matrix[i][j];
                        j2++;
                    }
                }
                det += Math.pow(-1.0,1.0+j1+1.0)* matrix[0][j1] * determinant(m,n-1);
            }
        }
        System.out.println("The determinant of the 1st matrix:"+det);
        return 1;
	}
	
	public static int check_identical(){
		for(int i=0;i<nr;i++)
			for(int j=0;j<nr;j++)
				if(matrix1[i][j]==matrix2[i][j])
					return 1;
				else
					return 0;
		return 0;
		}
	
	public static int check_zero(){
		for(int i=0;i<nr;i++)
			for(int j=0;j<nr;j++)
				if(matrix1[i][j]==0 || matrix2[i][j]==0)
					return 1;
				else
					return 0;
		return 0;
	}
	public static void Scalar(){
		System.out.println("Scalar:");
		Scanner read = new Scanner(System.in);
		int scalar= read.nextInt();
		System.out.println("Sum of matrix multiplied by:"+scalar);
		for(int i=0;i<nr;i++){
			for(int j=0;j<nr;j++){
				sum[i][j]=matrix1[i][j]*scalar;
				System.out.println(sum[i][j]);
			}
		}
			
	}
	public static void Identity_check(){
		int flag=0;
		for(int i=0;i<nr;i++){
			for(int j=0;j<nr;j++){
				if((i==j&&matrix1[i][j]!=1) || (i!=j&&matrix1[i][j]!=0))
					flag=1;
				break;
			}
			if(flag==1)
				break;
		}
		if(flag==1)
			System.out.println("Matrix is NOT an identity matrix!");
		else
			System.out.println("Matrix is an identity matrix!");
	}
	
	public static void Percentage(){
		float percent=0,rest=0,total=0;
		for(int i=0;i<nr;i++)
			for(int j=0;j<nr;j++)
				if(matrix1[i][j]!=0)
					percent++;
		int n=nr*2;
		rest=percent/n;
		total=rest*100;
		System.out.println("Matrix filled percentage:"+total);
	}
	public static void main(String[] args) {
		
		insert();
		int[][] a = new int[10][10];
		for(int i=0;i<nr;i++)
			for(int j=0;j<nr;j++)
				a[i][j]=matrix1[i][j];
		add();
		subtract();
		int n=nr;
		multiply();
		determinant(a,n);
		int check=check_identical();
        if(check==1)
        	System.out.println("Matrices are identical!");
        else
        	System.out.println("Matrices are NOT identical!");
        check=check_zero();
        if(check==1)
        	System.out.println("Matrix contains only zeros!");
        else
        	System.out.println("Matrix doesn't contain zeros!");
        Scalar();
        Identity_check();
        Percentage();
   

	}

}

