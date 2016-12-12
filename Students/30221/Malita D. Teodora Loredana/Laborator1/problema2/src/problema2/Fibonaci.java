package problema2;

public class Fibonaci {

	public static void main(String[] args) {
		int i, primul, aldoilea, urmatorul, suma;
		suma = 0;
		primul = 0;
		aldoilea = 1;
		for (urmatorul = primul + aldoilea; urmatorul < 4000000; urmatorul = primul + aldoilea) {

			primul = aldoilea;
			aldoilea = urmatorul;
			if (urmatorul % 2 == 0)
				suma = suma + urmatorul;

		}
		System.out.println("Suma este:" + suma);

	}

}
