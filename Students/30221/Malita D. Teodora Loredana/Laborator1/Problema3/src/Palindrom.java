
public class Palindrom {

	public static void main(String[] args) {
		int x, nr;
		// nr=998899;
		nr = 99977999;

		while (true) {
			System.out.println(nr);
			// x=gasit3(nr);
			x = gasit4(nr);
			if (x != 0)
				break;
			else {
				/*
				 * 3 cifre if(nr/10%10000==0) nr=nr-11; else if(nr/100%100!=0)
				 * nr=nr-1100; else nr=nr-110;
				 */
				if (nr / 10 % 1000000 == 0)
					nr = nr - 11;
				else if (nr / 1000 % 100 == 0)
					nr = nr - 1100;
				else
					nr = nr - 11000;
			}
		}
		System.out.println("Cel mai mare palindrom format din 2 numere de 3 cifre este:" + nr + " " + x + " " + nr / x);

	}

	public static int gasit3(int y) {
		int p;
		int i;
		i = 2;
		p = 1;
		while (y != 0) {
			while (y % i == 0 && y != 0) {
				p = p * i;
				y = y / i;
				if (p > 1000 || y < 100)
					return 0;
				if (p > 100 && y < 1000 && y > 100)
					return p;
			}
			i++;
		}
		return 0;
	}

	public static int gasit4(int y) {
		int p;
		int i;
		i = 2;
		p = 1;
		while (y != 0) {
			while (y % i == 0 && y != 0) {
				p = p * i;
				y = y / i;
				if (p > 10000 || y < 1000)
					return 0;
				if (p > 1000 && y < 10000 && y > 1000)
					return p;
			}
			i++;
		}
		return 0;
	}
}
