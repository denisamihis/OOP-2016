
public class Calcul {
	private static int[] sch = new int[1000];

	public void addFunction(int Array[], int Array1[], int ans[], int exp, int exp1) {

		System.arraycopy(Array1, 0, sch, exp - exp1, exp1);
		/*
		 * for (int i = 0; i < exp; i++) { System.out.print(" " + sch[i]); }
		 */
		for (int i = 0; i < exp; i++) {
			ans[i] = Array[i] + sch[i];
		}

	}

	public void subtractFunction(int Array[], int Array1[], int ans[], int exp, int exp1) {

		System.arraycopy(Array1, 0, sch, exp - exp1, exp1);
		/*
		 * for (int i = 0; i < exp; i++) { System.out.print(" " + sch[i]); }
		 */

		for (int i = 0; i < exp; i++) {
			ans[i] = Array[i] - sch[i];
		}

	}

	public void multiply(int Array[], int Array1[], int ans[], int exp, int exp1, int max) {

		System.arraycopy(Array1, 0, sch, exp - exp1, exp1);
		max = 0;
		
		
	}
}
