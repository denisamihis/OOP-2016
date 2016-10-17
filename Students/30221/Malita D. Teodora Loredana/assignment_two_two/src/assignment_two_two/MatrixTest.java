package assignment_two_two;

import java.math.BigDecimal;

public class MatrixTest {

	public static void main(String[] args) {
		BigDecimal[][] m = { { new BigDecimal(4), new BigDecimal(6), new BigDecimal(1996) },
				{ new BigDecimal(13), new BigDecimal(1), new BigDecimal(1997) },
				{ new BigDecimal(8), new BigDecimal(1), new BigDecimal(2003) } };
		BigDecimal[][] a;
		int i, j;
		 System.out.print("Matricea este :\n");
		for (i = 0; i < 3; i++, System.out.print(" \n"))
			for (j = 0; j < 3; j++)
				System.out.print(m[i][j] + " ");
		a = MatrixOperations.add(m, m);
		 System.out.print("Suma celor doua matrici este :\n");
		for (i = 0; i < 3; i++, System.out.print(" \n"))
			for (j = 0; j < 3; j++)
				System.out.print(a[i][j] + " ");
		a = MatrixOperations.subtract(m, m);
		System.out.print("Diferenta celor doua matrici este : \n");
		for (i = 0; i < 3; i++, System.out.print(" \n") )
			for(j = 0; j < 3; j++)
				System.out.print(a[i][j] + " ");
		a = MatrixOperations.multiply(m, m);
		 System.out.print("Produsul celor doua matrici este\n");
		for (i = 0; i < 3; i++,System.out.print(" \n"))
			for (j = 0; j < 3; j++)
				System.out.print(a[i][j] + " ");
		a = MatrixOperations.multiplyScalar(m, new BigDecimal(5));
		System.out.print("Inmultirea cu scalar este :\n");
		for (i = 0; i < 3; i++,System.out.print(" \n")) 
			for (j = 0; j < 3; j++)
				System.out.print(a[i][j] + " ");
		System.out.println("Rezultatul comparatiilor este(prima-true,a doua-false) :");
		System.out.println(MatrixOperations.areEqual(m, m));
		System.out.println(MatrixOperations.areEqual(a, m));
		System.out.println("Rezultatul comparatiei cu zero este(prima-false, a doua-true:");
		System.out.println(MatrixOperations.zeroMatrix(m));
		System.out.println(MatrixOperations.zeroMatrix(MatrixOperations.subtract(m, m)));
		System.out.println("Comparatia cu matricea identitate: ");
		System.out.println(MatrixOperations.identityMatrix(m));
		System.out.println("Determinantul matricii este :");
		System.out.println(MatrixOperations.determinant(m));
		System.out.println("Gradul de umplere a matricii este :");
		System.out.println(MatrixOperations.fillDegree(m));

	}

}
