package tema;

public class Palindrom {
	public static boolean palindrom(int numar) {
		int oglinda = 0, ultimaCifra, rebut;
		rebut = numar;
		while (rebut != 0) {
			ultimaCifra = rebut % 10;
			rebut = rebut / 10;
			oglinda = oglinda * 10 + ultimaCifra;
		}
		return oglinda == numar;
	}

	public static void main(String[] args) {
		int number1 = 999, number2 = 998;
		while (!palindrom(number1 * number2)) {
			if (number1 > number2)
				number1--;
			else
				number2--;
		}
		System.out.println(number1 + "*" + number2 + "=" + number1 * number2);
		int number3=9999, number4=9999;
		while (!palindrom(number3 * number4)) {
			if (number3 > number4)
				number3--;
			else
				number4--;
		}
		System.out.println(number3 + "*" + number4 + "=" + number3 * number4);
	}
}
