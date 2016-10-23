import java.util.Scanner;

public class calcul {
	private static Scanner numInsert;

	public void insert(int matrex[][]) { // insert
		numInsert = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				matrex[i][j] = numInsert.nextInt();
			}
		}
	}

	public void show(int matrex[][]) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.printf("%d ", matrex[i][j]);
			}
			System.out.println();
		}
		System.out.printf("\n\n");
	}

	public void add(int matrex1[][], int matrex2[][], int answer[][]) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				answer[i][j] = matrex1[i][j] + matrex2[i][j];
			}
		}
	}
	public void subtract(int matrex1[][], int matrex2[][], int answer[][]) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				answer[i][j] = matrex1[i][j] - matrex2[i][j];
			}
		}
	}

	public void multiply(int m1[][], int m2[][], int answer[][]) {
		for (int i = 1; i <=3; i++)
            for (int j = 1; j <=3; j++)
                for (int k = 1; k <= 3; k++)
                    answer[i][j] += (m1[i][k] * m2[k][j]);

	}
	
	public int equals(int m1[][], int m2[][]){
		for (int i = 1; i <=3; i++)
            for (int j = 1; j <=3; j++){
            	if(m1[i][j]!=m2[i][j]) {
            		return 0;
            	}
            }
		return 1;
		
	}
	
		
	 public  void isZeroMat(int matr[][])
	    {
	    int ok=0;
	    for(int i=1;i<=3;i++)
	    {
	        for(int j=1;j<=3;j++)
	        {
	            if(matr[i][j]!=0)
	            {
	                ok=1;
	                break;
	            }
	        }
	        if(ok==1)
	            break;
	    }
	    if(ok==1)
	        System.out.println("Matrix nu e NULL!.");
	    else
	        System.out.println("Matrix e NULL!.");
	}
	

}
