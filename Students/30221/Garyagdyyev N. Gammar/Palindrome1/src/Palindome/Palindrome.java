package Palindome;

public class Palindrome {
	private static int[] compare = new int[10000];
	private static int n ;

	public static void find3Number() { // two 3-digit numbers
		int product = 0, found;
		n=0;
		for (int i = 999; i > 100; i--) {
			for (int j = 999; j > 100; j--) {
				product = i * j;
				found = palindromefind(product);
				if (found == 1 && n < 1000) {
					compare[n++] = product;
				}
			}
		}
	}

	public static void find4Number() { // two 4-digit numbers
		int product = 0, found;
		n=0;
		for (int i = 9999; i > 1000; i--) {
			for (int j = 9999; j > 1000; j--) {
				product = i * j;
				found = palindromefind(product);
				if (found == 1 && n < 1000) {
					compare[n++] = product;
				}
			}
		}
	}

	public static void compareNum() {

		int i, max = compare[0];
		for (i = 0; i < n; i++) {
			if (compare[i] > max) {
				max = compare[i];
			}
		}
		System.out.printf(" %d", max);
	}

	public static int palindromefind(int product) {
		int temp, reverse = 0, remainder;
		temp = product;
		while (product != 0) {
			remainder = product % 10;
			reverse = reverse * 10 + remainder;
			product /= 10;
		}
		if (temp == reverse) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.print("Found the largest palindrome made from the product of two 3-digit numbers: ");
		find3Number();
		compareNum();
		System.out.print("\n\nFound the largest palindrome made from the product of two 4-digit numbers: ");
		find4Number();
		compareNum();

	}

}
