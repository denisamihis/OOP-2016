package polynomials;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InputOutput {

	public void read() {
		try {
			Scanner input = new Scanner(System.in);
			File file = new File("polynomials.txt");

			input = new Scanner(file);

			// retin coeficientii primului polinom
			String currentLine = input.nextLine();
			String[] items = currentLine.split(" ");
			Polynomials polynomeOne = new Polynomials(items.length);
			polynomeOne.coeficients = new int[items.length];
			polynomeOne.degree = items.length;

			for (int i = 0; i < polynomeOne.degree; i++) {
				polynomeOne.coeficients[i] = Integer.parseInt(items[i]);
			}

			// retin coeficientii celui de-al doilea polinom
			currentLine = input.nextLine();
			items = currentLine.split(" ");
			Polynomials polynomeTwo = new Polynomials(items.length);
			polynomeTwo.coeficients = new int[items.length];
			polynomeTwo.degree = items.length;
			for (int i = 0; i < polynomeTwo.degree; i++) {
				polynomeTwo.coeficients[i] = Integer.parseInt(items[i]);
			}

			Functions functions = new Functions();

			while (input.hasNextLine()) {

				currentLine = input.nextLine();

				if (currentLine.equals("ADD")) {
					functions.ADD(polynomeOne, polynomeTwo);
				}
				if (currentLine.equals("SUBSTRACT")) {
					functions.SUBSTRACT(polynomeOne, polynomeTwo);
				}
				if (currentLine.equals("MULTIPLY")) {
					functions.MULTIPLY(polynomeOne, polynomeTwo);
				}
				if (currentLine.contains("MUL_SCAL")) {
					functions.MUL_SCAL(polynomeOne, polynomeTwo, Integer.parseInt(currentLine.replaceAll("[\\D]", "")));
				}
				if (currentLine.contains("EVAL")) {
					functions.EVAL(polynomeOne, Integer.parseInt(currentLine.replaceAll("[\\D]", "")));
					functions.EVAL(polynomeTwo, Integer.parseInt(currentLine.replaceAll("[\\D]", "")));
				}

			}

		} catch (FileNotFoundException ex) {
			System.err.format("File does not exist.");

		}

	}

	public void print(Polynomials poly, boolean isEval, int evaluation) {
		Functions functions = new Functions();
		try {
			PrintWriter writer = new PrintWriter("outputPolynomials.txt", "UTF-8");
			if (isEval) {
				writer.println("The asked evaluation for this polynome: ");
				writer.print(functions.polyToString(poly));
				writer.print(" is: ");
				writer.print(evaluation);
			} else {
				writer.println(functions.polyToString(poly));
				writer.close();
			}
		} catch (FileNotFoundException | UnsupportedEncodingException ex) {
			System.err.format("File does not exist.");
		}

	}

}
