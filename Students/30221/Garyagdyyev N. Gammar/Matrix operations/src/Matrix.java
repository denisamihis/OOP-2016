import java.util.Scanner;

public class Matrix {
	private static int[][] matrex1 = new int[10][10];
	private static int[][] matrex2 = new int[10][10];
	private static int[][] answer = new int[10][10];
	private static String ch;
	private static Scanner carc;

	public static void main(String[] args) {
		carc = new Scanner(System.in);
		calcul calculObject = new calcul();
		System.out.println("Introduce matrixelor(dimentiunea 3x3):");
		calculObject.insert(matrex1);
		calculObject.show(matrex1);
		calculObject.insert(matrex2);
		calculObject.show(matrex2);
		do {
			System.out.println("Vreti sa faceti operatile prin matrex('+','-','*','E','Z'):");
			ch = carc.nextLine();

			switch (ch) {
			case "+":
				calculObject.add(matrex1, matrex2, answer);
				System.out.println("Adunare 2 matrix:");
				calculObject.show(answer);
				break;
			case "-":
				calculObject.subtract(matrex1, matrex2, answer);
				System.out.println("Scadere 2 matrix:");
				calculObject.show(answer);
				break;
			case "*":
				System.out.println("Inmultire 2 matrix:");
				calculObject.multiply(matrex1, matrex2, answer);
				calculObject.show(answer);
				break;
			case "E":
				System.out.println("Compare 2 matrix:");
				int boo;
				boo = calculObject.equals(matrex1, matrex2);
				if(boo==0){
					System.out.println("Nu sunt egal!");
				} else System.out.println("Sunt egal!");
				
				break;
			case "Z": 
				System.out.println("Verificare matrix ZERO sau nu:");
				calculObject.isZeroMat(matrex1);
				calculObject.isZeroMat(matrex2);
			
				break;

			default:
				System.out.print("Nu ati facut inci un operati!!!");

			}
			System.out.println("Mai vreti sa faceti operatile prin matrex('y'/'Y'):");
			ch = carc.nextLine();
		} while (ch != "y" || ch != "Y");

	}

}
