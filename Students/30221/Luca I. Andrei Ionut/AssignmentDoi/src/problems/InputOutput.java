package problems;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InputOutput {

	public void read() {

		try {
			Scanner input = new Scanner(System.in);
			File file = new File("pol.txt");

			input = new Scanner(file);

			String currentLine = input.nextLine();
			String[] items = currentLine.split(" ");
			Polynomial firstPolynom = new Polynomial();
			firstPolynom.coef = new int[items.length];
			for (int i = 0; i < items.length; i++) {
				firstPolynom.coef[i] = Integer.parseInt(items[i]);
			}

			currentLine = input.nextLine();
			items = currentLine.split(" ");
			Polynomial secondPolynom = new Polynomial();
			secondPolynom.coef = new int[items.length];
			for (int i = 0; i < items.length; i++) {
				secondPolynom.coef[i] = Integer.parseInt(items[i]);
			}
			Function function = new Function();
			while (input.hasNextLine()) {

				currentLine = input.nextLine();

				if (currentLine.equals("ADD")) {
					function.ADD(firstPolynom, secondPolynom);
				}
				if (currentLine.equals("SUBSTRACT")) {
					function.SUBSTRACT(firstPolynom, secondPolynom);
				}
				if (currentLine.equals("MULTIPLY")) {
					function.MULTIPLY(firstPolynom, secondPolynom);
				}
				if (currentLine.contains("MUL_SCAL")) {
					function.MUL_SCAL(firstPolynom, secondPolynom,
							Integer.parseInt(currentLine.replaceAll("[\\D]", "")));
				}
				if (currentLine.contains("EVAL")) {
					function.EVAL(firstPolynom, Integer.parseInt(currentLine.replaceAll("[\\D]", "")));
				}

				input.close();
			}

		} catch (FileNotFoundException ex) {
			System.err.format("File does not exist.");
		}
	}

	public void print(Polynomial polynome) {
		Function function=new Function();
		PrintWriter writer = new PrintWriter("outputPol.txt", "UTF-8");
		writer.println("%s", function.convertToString(polynome));
		writer.close();
	}
}
