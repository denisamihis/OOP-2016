package dinpdfuri;

import java.util.Random;

public class Extragere {

	public static void main(String[] args) {
		int i, ok, j;
		int[] extragere = new int[6];
		Random rand = new Random();
		for (i = 0; i < 6; i++) {
			do {
				ok = 1;
				extragere[i] = rand.nextInt(48) + 1;
				for (j = i - 1; j >= 0 && ok == 1; j--)
					if (extragere[i] == extragere[j])
						ok = 0;
			} while (ok == 0);
		}
		System.out.println(" Numerele sunt :");
		for (i = 0; i < 6; i++)
			System.out.println(extragere[i] + " ");

	}

}
