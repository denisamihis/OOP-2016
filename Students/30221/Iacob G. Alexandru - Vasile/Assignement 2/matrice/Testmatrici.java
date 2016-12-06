package matrice;
import java.math.BigDecimal;
import java.util.Scanner;
public class Testmatrici {
	
	public static void main(String[] args) {
		
		static Scanner in = new Scanner(System.in);
		int n;// numarul de elemente ale matricii
		n=in.nextInt ();
		BigDecimal[][] matrice1 = new BigDecimal[n][n];
		BigDecimal[][] matrice2 = new BigDecimal[n][n];
		BigDecimal[][] matrice3 = new BigDecimal[n][n];
		Matrici.Citeste(matrice1);
		Matrici.Citeste(matrice2);
		System.out.println("Matrice 1:");
		Matrici.Afiseaza(matrice1);
		System.out.println("Matrice 2:");
		Matrici.Afiseaza(matrice2);
		matrice3 = Matrici.Add(matrice1, matrice2);
		Matrici.Afiseaza(matrice3);
		matrice3 = Matrici.Subtract(matrice1, matrice2);
		Matrici.Afiseaza(matrice3);
		matrice3 = Matrici.Multiply(matrice1, matrice2);
		Matrici.Afiseaza(matrice3);
		System.out.print( Matrici.AreEqual(matrice1, matrice2));
		System.out.print( Matrici.IsZeroMatrix(matrice1));
		
	}
	

}
