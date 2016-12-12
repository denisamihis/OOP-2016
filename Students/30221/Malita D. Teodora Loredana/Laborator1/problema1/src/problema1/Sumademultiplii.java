package problema1;

import java.util.Scanner;

public class Sumademultiplii {

	public static void main(String[] args) {
		// int i, numar;
		long i, numar;
		long sum;
		// int sum;
		// numar=1000;
		Scanner in = new Scanner(System.in);
		// Cea mai mare valoare pentru care limita lui int nu este depasita e :
		// 2355783
		System.out.println("Cititi o valoare de la tastatura:");
		// numar= in.nextInt();
		numar = in.nextLong();
		sum = 0;
		for (i = 3; i < numar; i = i + 3)
			if (i % 5 != 0)
				sum = sum + i;
		for (i = 5; i < numar; i = i + 5)
			sum = sum + i;
		System.out.println("Suma multiplitor de 3 si 5 este :" + sum);

	}

}
