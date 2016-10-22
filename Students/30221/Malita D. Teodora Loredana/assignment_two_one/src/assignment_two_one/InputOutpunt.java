package assignment_two_one;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutpunt {
	
	public static void printPolynomial(Polynomials pol, PrintStream out)
	{
		int counter;
		for(counter=pol.degree;counter>=0;counter--)
			if(pol.coef[counter]!=0)
				switch(counter)
				{
				case 0 : 
					if(pol.coef[counter]>0)
						out.print("+" + pol.coef[counter]);
					else 
						out.print( pol.coef[counter]);
					break;
				case 1 :
					if(pol.coef[counter]>0)
						out.print("+" + pol.coef[counter] +"x");
					else 
						out.print( pol.coef[counter]+ "x");
					break;
				default :
					if(counter==pol.degree)
						out.print(pol.coef[counter] + "x^"+ counter + " ");
					else if(pol.coef[counter]>0)
						out.print("+" + pol.coef[counter] + "x^"+ counter + " ");
					else
						out.print( pol.coef[counter] + "x^"+ counter + " ");
				}
		out.print("\n");
	}

	public static int[] fromStringToInteger(String pol)
	{
		String []s= pol.split(" ") ;
		int[] poly = new int[s.length];
		int counter;
		for(counter=0;counter<s.length; counter++)
			poly[counter] = Integer.parseInt(s[counter]);
		return poly;
	}
	
	public static void main(String[] args) {
		String inputFile = new String ("C:\\Users\\t_lor\\workspace\\assignment_two_one\\src\\pol.txt");
		Scanner rosu= null;
		String outputFile = new String ("output.txt");
		try
		{
			rosu = new Scanner(new File(inputFile));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("ERROR! File Not Found!");
		}
		String line;
		PrintStream red = null;
		try 
		{
			red = new PrintStream ( new File (outputFile));
		}
		catch (IOException e)
		{
			System.out.println("ERROR! Create file!");
		}
		line = rosu.nextLine();
		Polynomials pol1 = new Polynomials(fromStringToInteger(line));
		printPolynomial(pol1,red);
		line = rosu.nextLine();
		String[] C;
		Polynomials pol2 = new Polynomials(fromStringToInteger(line));
		printPolynomial(pol2,red);	
		while( rosu.hasNextLine())
		{
			line=rosu.nextLine();
			C=line.split(" ");
			switch (C[0])
			{
			case "ADD" :
				printPolynomial(Functions.add(pol1, pol2),red);
				break;
			case "SUBTRACT" :
				printPolynomial(Functions.substract(pol1, pol2),red);
				break;
			case "MULTIPLY" :
				printPolynomial(Functions.multiply(pol1,pol2),red);
				break;
			case "MUL_SCAL" :
				printPolynomial(Functions.multiplyScalar(pol1,Integer.parseInt(C[1])),red);
				printPolynomial(Functions.multiplyScalar(pol2,Integer.parseInt(C[1])),red);
				break;
			case "EVAL" :
				red.println(pol1.evaluate(Integer.parseInt(C[1])));
				red.println(pol2.evaluate(Integer.parseInt(C[1])));
			}
		}
	}
}
