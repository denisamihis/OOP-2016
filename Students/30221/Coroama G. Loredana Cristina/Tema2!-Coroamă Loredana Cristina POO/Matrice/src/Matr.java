
public class Matr {
	private final int m;
	private final int n;
	private final double[][] data;
	public Matr (int m,int n){
		this.m=m;
		this.n=n;
		data=new double[m][n];
		
		
	}
public Matr(double[][] data){
	m=data.length;
	n=data[0].length;
	this.data=new double[m][n];
	for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
			this.data[i][j]=data[i][j];
}
private Matr (Matr A) {this(A.data);}
/*
public static Matr random(int m, int n) {
    Matr A = new Matr(m,n);
    for (int i = 0; i <m; i++)
        for (int j = 0; j <n; j++)
            A.data[i][j] = Math.random();
    return A;
}

// create and return the N-by-N identity matrix
public static Matr identity(int N) {
    Matr I = new Matr(N, N);
    for (int i = 0; i < N; i++)
        I.data[i][i] = 1;
    return I;
}*/

	public void show()
	{
		System.out.println("elementele sunt ");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				System.out.println(data[i][j]);
	}
	
	public Matr ADD(Matr B)
	{
		Matr A=this;
		if(B.m!=A.m||B.n!=A.n)
			System.out.println("nu se pot aduna");
		Matr C=new Matr(m,n);
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
	C.data[i][j]=A.data[i][j]+B.data[i][j];
	return C;
	}
	
	public Matr SUBTRACT(Matr B)
	{
		Matr A=this;
		if(B.m!=A.m||B.n!=A.n)
			System.out.println("nu se pot scadea");
		Matr C=new Matr(m,n);
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
	C.data[i][j]=A.data[i][j]-B.data[i][j];
	return C;
	}
	public static void identitate(Matr A,int n)
	{
		
		for(int i=0;i<n;i++)
		if(A.data[i][i]==1)
			System.out.println("matrice identitate");
		else
			System.out.println("nu e matr identitate");
				
		
	}
	public boolean id(Matr B) {
   
		  Matr A = this;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if ( B.data[i][j]!=1)
                	return false;
        return true;
    }
	public boolean eq(Matr B) {
        Matr A = this;
        if (B.m != A.m || B.n != A.n) System.out.println("nu se pot compara");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (A.data[i][j] != B.data[i][j]) return false;
        return true;
    }
	
	public Matr OR(Matr B) {
        Matr A = this;
        if (A.n!= B.m) System.out.println("nu se pot inmulti");
        Matr C = new Matr(A.m, B.n);
        for (int i = 0; i < C.m; i++)
            for (int j = 0; j < C.n; j++)
                for (int k = 0; k < A.n; k++)
                    C.data[i][j] += (A.data[i][k] * B.data[k][j]);
        return C;
    }
	public Matr O2(int g)
	{
        Matr A = this;
       
        
        for (int i = 0; i < A.m; i++)
            for (int j = 0; j < A.n; j++)
               
                    A.data[i][j]=A.data[i][j] * g;
        return A;
    }
	
    public double determinant(double A[][],int n)

    {

        double det=0;

        if(n == 1)

        {

            det = A[0][0];

        }

        else if (n == 2)

        {

            det = A[0][0]*A[1][1] - A[1][0]*A[0][1];

        }

        else

        {

            det=0;

            for(int j1=0;j1<n;j1++)

            {

                double[][] m = new double[n-1][];

                for(int k=0;k<(n-1);k++)

                {

                    m[k] = new double[n-1];

                }

                for(int i=1;i<n;i++)

                {

                    int j2=0;

                    for(int j=0;j<n;j++)

                    {

                        if(j == j1)

                            continue;

                        m[i-1][j2] = A[i][j];

                        j2++;

                    }

                }

                det += Math.pow(-1.0,1.0+j1+1.0)* A[0][j1] * determinant(m,n-1);

            }

        }

        return det;

    }
	
    
    public  void IsZeroMatrix(Matr A)
    {
    int flag=0;
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(A.data[i][j]!=0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            break;
    }
    if(flag==1)
        System.out.println("The matrix entered is not a Null or Zero Matrix.");
    else
        System.out.println("The matrix entered is a Null or Zero Matrix.");
}
    
    
    
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[][] d={{1,2,3},{4,5,6},{9,1,3}};
double[][] d1={{1,1,1},{1,1,2},{8,5,5}};
Matr D=new Matr(d);
D.show();
Matr B=new Matr(d1);
B.show();
D.ADD(B).show();
D.SUBTRACT(B).show();
 identitate(D,3);
 B.OR(D).show(); 
 System.out.println("sunt egale?");
 System.out.println(D.eq(B));
 System.out.println(D.id(B));
 D.O2(10).show();
 Matr I=new Matr(d);
 
 System.out.println("The determinant of the Matrix is : "+I.determinant(d,3));

D.IsZeroMatrix(B);
	
	}

}
