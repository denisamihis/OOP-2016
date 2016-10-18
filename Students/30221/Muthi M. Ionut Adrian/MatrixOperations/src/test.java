
import java.math.BigDecimal;

public class test {

	public static void main(String[] args) {
		
    read matrice=new read();
    
    
    BigDecimal[][] a,b,c;
    BigDecimal determinant;
    int n,p;
    n=matrice.getn();
    a=matrice.scrie(n);
    b=matrice.scrie(n);
    
  
 
  MatrixOperations.identityMatrix(a);
 //  MatrixOperations.fillDegree(a); 
 

   
	}

}
