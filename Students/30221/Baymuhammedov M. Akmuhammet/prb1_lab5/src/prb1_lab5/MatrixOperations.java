package prb1_lab5;
import java.util.Scanner;
import java.util.*;

public class MatrixOperations {
	
		private static int[][] matrix1=new int[10][10];
		private static int[][] matrix2=new int[10][10];
		private static int[][] sum=new int[10][10];
		private static int nr;
		
		public static void insert(){
			System.out.println("Dimensions for the matrices:");
			Scanner read = new Scanner(System.in);
			nr= read.nextInt();
			System.out.println("numbers for matrix1:");
			for(int i=0; i<nr; i++)
				for(int j=0;j<nr;j++)
					matrix1[i][j]=read.nextInt();
			System.out.println("numbers for matrix2:");
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
		
		public static void Scalar(){
			System.out.println("Scalar:");
			Scanner read = new Scanner(System.in);
			int scalar= read.nextInt();
			System.out.println("Sum of matrix divided by:"+scalar);
			for(int i=0;i<nr;i++){
				for(int j=0;j<nr;j++){
					sum[i][j]=matrix1[i][j]/scalar;
					System.out.println(sum[i][j]);
				}
			}
				
		}
	public static void main(String[] args) {
		System.out.println("Inserting:");
		insert();
		System.out.println("Subtract:");
		subtract();
		System.out.println("Adding:");
		add();
		System.out.println("Multiplying:");
		multiply();
		System.out.println("Dividing by a scalar:");
		Scalar();

	}

}
