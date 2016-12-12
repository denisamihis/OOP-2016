package lab1;

import java.util.Scanner;

public class SumaMultipli {

	public static void main(String[] args) {
		// twist1:  Cea mai mare valoare pentru care limitele int nu sunt depasite este 2355783
		// twist2:  long : 40.257*10^9
		int i;
		long s = 0, bound;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduceti numarul: ");
		bound = in.nextLong();
		for (i=1; i*3 < bound; i++)
		{
			if (i*5 < bound)
				s+=i*5;
			if ((i*3)%5!=0)
				s+=i*3;
		}
		System.out.println("Suma este "+s);
	}
}
