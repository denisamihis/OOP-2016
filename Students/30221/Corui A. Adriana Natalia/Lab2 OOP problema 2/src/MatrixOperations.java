
public class MatrixOperations {

	static int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
	static int[][] b = {{1,2,3 },{4,5,6},{9,1,3}};
	static Matrix A =new Matrix(a);
	static Matrix B=new Matrix(b);
	
	public static Matrix add() {
        if (B.getRows()!=A.getRows()||B.getCols()!=A.getCols()) 
        	System.out.println("Dimensions dont match");
        Matrix C=new Matrix(A.getRows(),A. getCols());
        for (int i=0;i<A.getRows();i++)
            for (int j=0;j<A.getCols();j++)
                C.setData(i,j,A.getData(i,j)+B.getData(i,j)) ;
        return C;
    }
	
	public static Matrix substract() {

        if (B.getRows()!= A.getRows()||B.getCols()!=A.getCols()) 
        	System.out.println("Dimensions dont match");
        Matrix C =new Matrix(A.getRows(),A.getCols());
        for (int i=0; i< A.getRows();i++)
            for (int j=0; j<A.getCols();j++)
            	 C.setData(i,j,A.getData(i,j)-B.getData(i,j)) ;
        return C;
    }
	
    public static Matrix multiply() {
        if (A.getCols() != B.getRows()) 
        	System.out.println("Dimensions dont match");
        Matrix C = new Matrix(A.getRows(), B.getCols());
        for (int i=0;i<C.getRows();i++)
            for (int j=0;j<C.getCols();j++)
                for (int k=0;k<A.getCols();k++)
                	 C.setData(i,j,C.getData(i,j)+(A.getData(i,k)*B.getData(k,j))) ;
        return C;
    }
    
    public static boolean equal() 
    {
        if (B.getRows()!= A.getRows()||B.getCols()!=A.getCols()) 
        	System.out.println("Dimensions dont match");
        for (int i=0; i<A.getRows();i++)
            for (int j=0;j<A.getCols();j++)
                if (A.getData(i,j)!=B.getData(i,j))
                	return false;
        return true;
    }
    
    private static boolean identity(Matrix A)
    {
    	if(A.getRows()!=A.getCols())
    	{
    		System.out.println("Cant be identity matrix");
    		return false;
    	}
    	for (int i=0;i<A.getRows();i++)
            for (int j=0;j<A.getCols();j++)
            	if((i==j&&A.getData(i,j)!=1)||(i!=j&&A.getData(i,j)!=0))
            		return false;
        return true;
    }
    
    private static boolean zero(Matrix A)
    {
    	for (int i=0;i <A.getRows();i++)
            for (int j=0;j<A.getCols();j++)
            	if(A.getData(i,j)!=0)
            		return false;
        return true;
    }
    public static void main(String[] args) {
    	A.type();
    	System.out.println("Adunare");
    	add().type();
    	System.out.println("Scadere");
    	substract().type();
    	System.out.println("Inmultire");
    	multiply().type();
    	System.out.println("Matrice identitate?");
    	if(identity(A)==true)
    		System.out.println("DA");
    	else
    		System.out.println("NU");
    	System.out.println("Matrice zero?");
    	if(zero(A)==true)
    		System.out.println("DA");
    	else
    		System.out.println("NU");
    }
}
