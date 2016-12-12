package firstAssignment;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestPolynomial {
	
	//Converts from string to integer array
	//Used to convert the polynomial
	public static int[] stringConvert (String string) {
		String[] parts = string.split(" ");
		int[] array = new int[parts.length];
		int i = 0; int j = parts.length-1;
		
		for (i = 0; i < parts.length; i++) {
			array[j] = Integer.parseInt(parts[i]);
			j--;
		}
		return array;
	}

	public static void main(String[] args) {
		
		String sourceFile = "pol.txt";
		String outputFile = "output.txt";
		
		//For reading the source file
		Scanner in = null;
		try {
			in = new Scanner (new File  (sourceFile));
		} 
		catch (Exception e) {
			System.out.println("File could not be opened.");
		}
		
		//For writing in the destination file
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(outputFile));
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//First polynomial
		String polynomialString = in.nextLine();
		Polynomial p1 = new Polynomial (stringConvert (polynomialString));
		//Second polynomial
		polynomialString = in.nextLine();
		Polynomial p2 = new Polynomial (stringConvert (polynomialString)); 
		
		//Writing the polynomials in the output file
		pw.write("P1: " + p1 + "\r\n");
		pw.write("P2: " + p2 + "\r\n");
		
		//Reading commands and printing the results
		while (in.hasNext()) {
			String command = in.nextLine();
			
			//If the command contains spaces, it's either MUL_SCAL 'n' or EVAL 'n'
			//The command will be stored in 'command' and the number in 'value'
			int value = 1;
			if (command.contains(" ")) {
				String[] parts = command.split(" ");
				command = parts[0];
				value = Integer.parseInt(parts[1]);
			}
			
			switch (command) {
			case "ADD": 
				Polynomial add = p1.add(p2);
				pw.write ("ADD (P1 + P2): " + add + "\r\n");
				break;
			case "SUBTRACT":
				Polynomial subtract = p1.subtract(p2);
				pw.write("SUBTRACT (P1 - P2): " + subtract + "\r\n");
				break;
			case "MULTIPLY":
				Polynomial multiply = p1.multiply(p2);
				pw.write("MULTIPLY (P1 * P2): " + multiply + "\r\n");
				break;
			case "MUL_SCAL":
				Polynomial mulScal = p1.scalarMultiplication(value);
				pw.write("MULT_SCAL " + value + " P1: " + mulScal + "\r\n");
				mulScal = p2.scalarMultiplication(value);
				pw.write("MULT_SCAL " + value + " P2: " + mulScal + "\r\n");
			case "EVAL":
				int eval = p1.evaluate(value);
				pw.write("EVAL " + value + " P1: " + eval + "\r\n");
				eval = p2.evaluate(value);
				pw.write("EVAL " + value + " P2: " + eval + "\r\n");
			}
		}
		pw.close();
	}
}