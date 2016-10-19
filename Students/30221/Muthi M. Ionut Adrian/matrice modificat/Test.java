
import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		
    Read matrice=new Read();
    
    
    BigDecimal[][] a,b,c;
    BigDecimal determinant;
    int n,p;
    n=matrice.getn();
    a=matrice.scrie(n);
    b=matrice.scrie(n);
    
  
 
  c=MatrixOperations.add(a, b);
  System.out.println("Suma matriciolor este " );
  matrice.citire(c);
  c=MatrixOperations.substract(a, b);
  System.out.println("Diferenta matriciolor este " );
  matrice.citire(c);
  c=MatrixOperations.multiply(a, b);
  System.out.println("Produsul matricilor este ");
  matrice.citire(c);
  c=MatrixOperations.multiplyScalar(a);
  System.out.println("Matricea inmultita cu n este ");
  matrice.citire(c);
  determinant=MatrixOperations.determinant(a);
  System.out.println("Determinantul matricii este " + determinant);
  System.out.println("Egale: ");
  MatrixOperations.areEqual(a, b);
  System.out.println("Este zero : ");
  MatrixOperations.isZeroMatrix(a);
  System.out.println("Este matricea identiate ");
  MatrixOperations.identityMatrix(a);
  System.out.println("Matricea este plina ");
  MatrixOperations.fillDegree(a); System.out.println("%");
 

   
	}

}
