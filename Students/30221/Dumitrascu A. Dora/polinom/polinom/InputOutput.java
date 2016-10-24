package vegsopolinomlofasz;
import java.util.Arrays;
import java.util.Scanner;

import java.io.*;

public class InputOutput {
	private static BufferedReader br;
	static{
		try{
		br = new BufferedReader(new FileReader("C:/Users/Dorci/workspace/vegsopolinomlofasz/src/pol.txt"));
		}//I put BufferedReader here so I can continue reading the file from where I left
		catch(IOException e){e.printStackTrace();}
	}
	
	public static void readFunctions(Polynomial pol1, Polynomial pol2){
		String line;
		Polynomial result;
		try{
			while((line=br.readLine())!=null){
				switch(line){
				case "ADD":
					result=TestPolinom.addPoli(pol1,pol2);
					InputOutput.printP(result);
					break;
				case "SUBTRACT":
					result=TestPolinom.subtractPoli(pol1,pol2);
					InputOutput.printP(result);
					break;
				case "EVAL 5": //dunno how to make it for any number ?? very ugly code sorry
					int num=0;
					String[] arr=line.split(" ");
					for(String s:arr)
						num=Integer.parseInt(s);
					TestPolinom.EVAL(num, pol1);
					TestPolinom.EVAL(num, pol2);
					break;
				default:
					System.out.println("Invalid function!");
					break;
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public static int[] readFile(){ //reading the coefficients for the two polynomials
		int[] pol=null;
		String coef;
		String[] parts;
		try{
			coef = br.readLine();
			parts=coef.split(" ");
			pol=new int [parts.length];
			for(int i=0;i<parts.length;i++){
				pol[i]=Integer.parseInt(parts[i]);
			}
		}
		catch(IOException e){
			e.printStackTrace();
			}
		
		return pol;
		
	}	
	
	public static void printP(Polynomial p){ //printing out polynomials in mathematical form
		int c,i;
		for(i=0;i<p.getDegree()-2;i++){
			c=p.getCoef()[i];
			if(c!=0 && c!=1){
				System.out.print(c+"x^"+(p.getDegree()-i-1)+"+");
			}
			else{
				if(c==1)
					System.out.print("x^"+(p.getDegree()-i-1)+"+");
			}
		}
		
		if(p.getCoef()[i]!=1 && p.getCoef()[i]!=0)
			System.out.print(p.getCoef()[i]+"x"+"+");
		else{
			if(p.getCoef()[i]==1)
				System.out.print("x+");
		}
		if(p.getCoef()[i+1]!=0)
			System.out.print(p.getCoef()[i+1]);
		System.out.print("\n");
	}
	
}
