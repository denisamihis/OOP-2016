package dinpdfuri;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Numar n = new Numar();
		Numar m = new Numar();
		Numar z = new Numar();
		Scanner in = new Scanner(System.in);
		System.out.println("Introduceti 2 valori de format y din x (x>y):\nx= ");
		n.x = in.nextInt();
		System.out.println("y= ");
		m.x = in.nextInt();
		z.x = n.x - m.x;
		System.out.println(z.factorial() + " " + m.factorial());
		System.out.println("Sansa de castig este : " + 1 / (double) (z.factorial() * m.factorial()));
	}

}
