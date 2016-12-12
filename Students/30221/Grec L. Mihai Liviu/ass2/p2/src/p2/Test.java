/*
 * La functia de inmultire imi da ceva eroare ciudata desi am facut pe acealasi
 * algoritm ca si la int,nu vad de ce ar avea probleme.La fillDegree imi da eroare
 * cand am un 0 si imi iese din fereastra de variabile cand ii dau debugger in momentul
 * in care ajunge la return helper, cand nu are niciun 0 functioneaza normal si 
 * returneaza valoarea.
 * */

package p2;
import java.math.BigDecimal;
public class Test {

	public static void main(String[] args) {
		BigDecimal [][] matrix1 = Matrix.randomMatrix();
		BigDecimal [][] matrix2 = Matrix.randomMatrix();
		Matrix.writeMatrix(matrix1);
		Matrix.writeMatrix(matrix2);
		BigDecimal [][] addedMatrix = Matrix.add(matrix1, matrix2);
		Matrix.writeMatrix(addedMatrix);
		BigDecimal [][] subMatrix = Matrix.substract(matrix1, matrix2);
		Matrix.writeMatrix(subMatrix);
		//BigDecimal [][] mulMatrix = Matrix.multiply(matrix1, matrix2);
		//Matrix.writeMatrix(mulMatrix);
		BigDecimal [][] mulScalMatrix = Matrix.multiplyScalar(matrix1, new BigDecimal("2"));
		Matrix.writeMatrix(mulScalMatrix);
		if (Matrix.areEqueal(matrix1, matrix2))
			System.out.println("tare randomizeru asta");
		else System.out.println("si'o facut treaba randomizerul");
		if (Matrix.isZeroMatrix(matrix1))
			System.out.println("numa 0 stie da randomizerul");
		else System.out.println("randomizerul se comporta normal");
		if (Matrix.isIdentityMatrix(matrix2))
			System.out.println("interesanta alegere a randomizerului");
		else System.out.println("nu'i matricea I");
		BigDecimal procent = new BigDecimal("0");
		procent = Matrix.fillDegree(matrix1);
		System.out.printf("procentul in varianta reala este = %.2f" , procent);
		
		
		
	}

}
