package assignment;

public class Palindrom {
	public static int palindr(int i) {
		int x, y = 0;

		x = i;

		while (i > 0) {
			y = y * 10 + i % 10;
			i = i / 10;
		}
		if (x == y)
			return 1;
		else
			return 0;

	}

	public static void main(String[] args) {
		int max = 0;

		for (int i = 999; i > 100; i--) {

			for (int j = i; j > 100; j--) {
				int produs = j * i;

				if (palindr(produs) == 1 && produs > max) {
					max = i * j;
				}
			}

		}
		System.out.println(max);

	}
}
