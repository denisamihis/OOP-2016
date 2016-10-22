import java.math.*;
public class Matrice {
    public static void main(String[] args)
    {   MatrixOperations obj = new MatrixOperations() ;
        BigDecimal n = new BigDecimal(5);
        BigDecimal[][] m1 = new BigDecimal[10][10] ;
        BigDecimal[][] m2 = new BigDecimal[10][10] ;
        m1=obj.create();
    	obj.afisare(m1);
    	m2=obj.create();
    	obj.afisare(m2);
    	BigDecimal[][] sum = new BigDecimal[10][10] ;
    	BigDecimal[][] dif = new BigDecimal[10][10] ;
    	BigDecimal[][] scalar = new BigDecimal[10][10] ;
    	sum=obj.add(m1,m2);
    	dif=obj.subtract(m1, m2);
    	scalar=obj.scalar(m1,n); // multiplicam cu 5
    	obj.afisare(sum);
    	obj.afisare(dif);
    	obj.afisare(scalar);
    	if(obj.nula(m1))
    		System.out.println("Matricea ii goala");
    	if(obj.identitate(m1))
    		System.out.println("Matricea ii unitara");
    	
    }

}
