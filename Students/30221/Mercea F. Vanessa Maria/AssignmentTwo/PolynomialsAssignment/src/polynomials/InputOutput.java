package polynomials;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class InputOutput {

	public void read() {
		try {
			Scanner input = new Scanner(System.in);
			File file = new File("polynomials.txt");
			input = new Scanner(file);
			Functions functions = new Functions();

			// retin coeficientii primului polinom
			String currentLine = input.nextLine();
			String[] items = currentLine.split(" ");
			// creez obiect nou
			Polynomials polynomeOne = new Polynomials(items.length);
			polynomeOne.coeficients = new int[items.length];
			polynomeOne.degree = items.length;
			// initializez coeficientii
			for (int i = polynomeOne.degree - 1; i >= 0; i--) {
				polynomeOne.coeficients[polynomeOne.degree - i - 1] = Integer.parseInt(items[i]);
			}

			print(polynomeOne, 6, 0);

			// retin coeficientii celui de-al doilea polinom
			currentLine = input.nextLine();
			items = currentLine.split(" ");
			// creez obiect nou
			Polynomials polynomeTwo = new Polynomials(items.length);
			polynomeTwo.coeficients = new int[items.length];
			polynomeTwo.degree = items.length;
			// initializez coeficientii
			for (int i = polynomeTwo.degree - 1; i >= 0; i--) {
				polynomeTwo.coeficients[polynomeTwo.degree - i - 1] = Integer.parseInt(items[i]);
			}

			print(polynomeTwo, 7, 0);

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
	//what to do folosesc pentru a diferentia operatiile cand le scriu in fisier, 
	//chiar daca folosesc acelasi print la toate functiile
	//evaluation il folosesc pentru EVAL 
	public void print(Polynomials poly, int whatToDo, int evaluation) {
		Functions functions = new Functions();
		try {
			//folosesc buffered sa pot face append, ca altfel face rewrite de fiecare data 
			Writer writer;
			writer = new BufferedWriter(new FileWriter("outputPolynomials.txt", true));

			if (whatToDo == 1) {
				writer.append("Sum of the polynomials is: ");
				writer.append(functions.polyToString(poly));
				writer.append(System.lineSeparator());
			}
			if (whatToDo == 2) {
				writer.append("Substraction of the polynomials is: ");
				writer.append(functions.polyToString(poly));
				writer.append(System.lineSeparator());
			}
			if (whatToDo == 3) {
				writer.append("Multiplication of the polynomials is: ");
				writer.append(functions.polyToString(poly));
				writer.append(System.lineSeparator());
			}
			if (whatToDo == 4) {
				writer.append("Multiplication by given scalar of ");
				if (evaluation == 0)
					writer.append("the first polynome is: ");
				if (evaluation == 1)
					writer.append("the second polynome is: ");
				writer.append(functions.polyToString(poly));
				writer.append(System.lineSeparator());
			}
			if (whatToDo == 5) {
				writer.append("The asked evaluation for this polynome: ");
				writer.append(functions.polyToString(poly));
				writer.append(" is: ");
				writer.append(String.valueOf(evaluation));
				writer.append(System.lineSeparator());
			}
			if (whatToDo == 6) {
				writer.append("The first read polynome is: ");
				writer.append(functions.polyToString(poly));
				writer.append(System.lineSeparator());
			}
			if (whatToDo == 7) {
				writer.append("The second read polynome is: ");
				writer.append(functions.polyToString(poly));
				writer.append(System.lineSeparator());
			}
			writer.close();

		} catch (IOException ex) {
			System.err.format("File does not exist.");
		}
	}
}
