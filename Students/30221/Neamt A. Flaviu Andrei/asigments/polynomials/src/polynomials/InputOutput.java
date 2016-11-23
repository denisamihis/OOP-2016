package polynomials;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args){
		Scanner input=null;
		PrintStream output=null;
		try 
		{
			input=new Scanner(new File("D:\\Faculta AN 2\\POO\\polynomials\\src\\polynomials\\pol.txt"));
			output=new PrintStream(new File("D:\\Faculta AN 2\\POO\\polynomials\\src\\polynomials\\polout.txt"));
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Polynomials pa=new Polynomials(fromString(input.nextLine()));
		Polynomials pb=new Polynomials(fromString(input.nextLine()));
		String[] comanda;
		while(input.hasNextLine())
		{
			comanda=input.nextLine().split(" ");
			switch(comanda[0])
			{
			case "EVAL":
				output.println(pa.evaluate(Integer.parseInt(comanda[1])));
				output.println(pb.evaluate(Integer.parseInt(comanda[1])));
				break;
			case "ADD":
				output.println(Functions.add(pa, pb).strCon());
				break;
			case "SUBSTRACT":
				output.println(Functions.substract(pa, pb).strCon());
				break;
			case "MUL_SCAL":
				output.println(Functions.multiplyScalar(pa,Integer.parseInt(comanda[1])).strCon());
				output.println(Functions.multiplyScalar(pb,Integer.parseInt(comanda[1])).strCon());
				break;
			case "MULTIPLY":
				output.println(Functions.multiply(pa, pb).strCon());
			}
		}
		input.close();
		output.close();
		
	}
	public static int[] fromString(String con)
	{
		String[] coefs=con.split(" ");
	    int x[]=new int[coefs.length];
	    for(int c=0;c<coefs.length;c++)
	    	x[coefs.length-c-1]=Integer.parseInt(coefs[c]);
	    return x;
	}
	
}
