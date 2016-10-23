import java.io.*;
import java.util.*;

public class reader {
	public static Scanner text;
	public static int exp, exp1, max;
	private static int[] ans = new int[100];

	Convertor cObject = new Convertor();
	Convertor cObject1 = new Convertor();
	Calcul calOb = new Calcul();
	private static int p = 0;

	public void openFile() {
		try {
			text = new Scanner(new File("pol.txt"));
		} catch (Exception e) {
			System.out.println("Error!");
		}
	}

	public void readFile(String str, int numArray[], int numArray1[])
			throws FileNotFoundException, UnsupportedEncodingException { // citeste
		// in
		// fisier

		while (text.hasNext()) {

			str = text.nextLine();

			// System.out.printf("%s \n", str); // show line to line
			// System.out.println(str.length());

			if (str.equals("ADD")) {
				System.out.print("\nFunction ADD:\n");
				// System.out.println(maxNum());

				max = maxNum();
				calOb.addFunction(numArray, numArray1, ans, max, exp1);
				afisareFile(ans, max);

			} else if (str.equals("SUBTRACT")) {
				System.out.print("\nFunction SUBTRACT:\n");
				max = maxNum();
				calOb.subtractFunction(numArray, numArray1, ans, max, exp1);
				afisareFile(ans, max);

			} else if (str.equals("MULTIPLY")) {
				System.out.print("\nFunction MULTIPLY:\n");
				// calOb.multiply(numArray, numArray1, ans, exp, exp1,max);
				// afisareFile(ans, max);

			} else {
				if (p == 0) {
					exp = cObject.convertStrToInt(str, numArray);
					afisareFile(numArray, exp);
					/*
					 * PrintWriter writer = new PrintWriter("output.txt",
					 * "UTF-8"); writer.println(exp); //writer.println();
					 * writer.close();
					 */
				} else if (p == 1) {
					exp1 = cObject1.convertStrToInt(str, numArray1);
					// System.out.println(exp1);
					afisareFile(numArray1, exp1);
				}
				p++;
			}
		}
	}

	public int maxNum() {
		return exp > exp1 ? exp : exp1;
	}

	public void afisareFile(int Array[], int count) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		int exponent = --count;
		for (int i = 0; i <= count; i++) {
			if (Array[i] != 0) {
				if (exponent == 1) {
					if (Array[i] > 0) {
						writer.printf("+ %dx ", Array[i]);
						System.out.printf("+ %dx ", Array[i]);

					} else {
						writer.printf("%dx ", Array[i]);
						System.out.printf("%dx ", Array[i]);
					}
				} else if (exponent == 0) {
					if (Array[i] > 0) {
						writer.printf("+ %d ", Array[i]);
						System.out.printf("+ %d ", Array[i]);
					} else {
						writer.printf("%d ", Array[i]);
						System.out.printf("%d ", Array[i]);
					}

				} else {
					if (Array[i] > 0) {
						writer.printf("+ %dx^%d ", Array[i], exponent);
						System.out.printf("+ %dx^%d ", Array[i], exponent);
					} else {
						writer.printf("%dx^%d ", Array[i], exponent);
						System.out.printf("%dx^%d ", Array[i], exponent);
					}
				}
			}
			--exponent;
		}
		System.out.println();
		writer.printf("\n");
		writer.close();
	}

	public void closeFile() {
		text.close();
	}
}

/*
 * citire in fisier method 1;
 * 
 * private static void readFile1(File fin) throws IOException { FileInputStream
 * fis = new FileInputStream(fin);
 * 
 * //Construct BufferedReader from InputStreamReader BufferedReader br = new
 * BufferedReader(new InputStreamReader(fis));
 * 
 * String line = null; while ((line = br.readLine()) != null) {
 * System.out.println(line); }
 * 
 * br.close(); }
 * 
 * method 2;
 * 
 * try (BufferedReader br = new BufferedReader(new FileReader(file))) { String
 * line; while ((line = br.readLine()) != null) { // process the line. } }
 * 
 */
