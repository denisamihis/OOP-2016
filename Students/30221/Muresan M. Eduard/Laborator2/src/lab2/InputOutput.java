package lab2;

import java.util.Scanner;
import java.io.*;

public class InputOutput {
	public static int[] fromString(String content)
	{
		String[] values = content.split(" ");
		int[] pol = new int[values.length];
		int count;
		for (count = 0; count < values.length; ++count)
			pol[values.length - count -1] = Integer.parseInt(values[count]);
		return pol;
		
	}
	public static void main(String[] args)
	{
		String inputFile = new String("C:\\Edi\\Laborator2\\src\\lab2\\pol.txt");
		String outputFile = new String("C:\\Edi\\Laborator2\\src\\lab2\\output.txt");
		Scanner in = null;
		PrintStream out = null;
		try 
		{
			in = new Scanner(new File(inputFile));
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Input file not found!");
		}
		try
		{
			out = new PrintStream(new File(outputFile));
		}
		catch (IOException ex)
		{
			System.out.println("Output file not found!");
		}
		String input = in.nextLine();
		int[] aux = fromString(input);
		Polynomial poly1 = new Polynomial(aux);
		input = in.nextLine();
		aux = fromString(input);
		Polynomial poly2 = new Polynomial(aux);
		out.println(poly1.toString());
		out.println(poly2.toString());
		input = in.nextLine();
		Polynomial poly3 = new Polynomial(input);
		System.out.println(poly3.toString());
		Polynomial[] divideResult;
		String[] Command;
		while (in.hasNextLine())
		{
			input = in.nextLine();
			Command = input.split(" ");
			switch(Command[0])
			{
			case "ADD":
				out.println(Polynomial.toString(Functions.add(poly1,poly2)));
				break;
			case "SUBTRACT":
				out.println(Polynomial.toString(Functions.subtract(poly1,poly2)));
				break;
			case "MULTIPLY":
				out.println(Polynomial.toString(Functions.multiply(poly1,poly2)));
				break;
			case "MUL_SCAL":
				out.println(Polynomial.toString(Functions.multiplyWithScalar(poly1,Integer.parseInt(Command[1]))));
				out.println(Polynomial.toString(Functions.multiplyWithScalar(poly2,Integer.parseInt(Command[1]))));
				break;
			case "EVAL":
				out.println(poly1.evaluate(Integer.parseInt(Command[1])));
				out.println(poly2.evaluate(Integer.parseInt(Command[1])));
				break;
			case "DIVIDE":
				divideResult = Functions.divide(poly1, poly2);
				out.println("The division result is " + Polynomial.toString(divideResult[0]));
				out.println("And the remainder is " + Polynomial.toString(divideResult[1]));
			}
		}
		out.close();
		in.close();
	}

}
