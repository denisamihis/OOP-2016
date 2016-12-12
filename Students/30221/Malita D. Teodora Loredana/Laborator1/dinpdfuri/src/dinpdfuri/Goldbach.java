package dinpdfuri;

import java.util.Scanner;

public class Goldbach {

	public static void main(String[] args) {
		int n, m;
		Scanner in = new Scanner(System.in);
		System.out.println("Dati primul numar, n:");
		n = in.nextInt();
		System.out.println("Dati al doilea numar, m:");
		m = in.nextInt();
		Numar i = new Numar();
		Numar j = new Numar();
		if (n % 2 == 1)
			n = n + 1;
		for (; n <= m; n = n + 2) {
			i.x = n / 2;
			if (i.x % 2 == 0)
				i.x = i.x - 1;
			j.x = n - i.x;
			while (!(i.prim() && j.prim())) {
				i.x = i.x - 2;
				j.x = j.x + 2;
			}
			System.out.println("Numarul " + n + "=" + i.x + "+" + j.x);

		}

	}

}
