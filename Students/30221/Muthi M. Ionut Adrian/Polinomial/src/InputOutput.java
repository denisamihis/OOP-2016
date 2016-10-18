import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InputOutput {
	
	
	public void read(){
		
		try{
			Scanner input = new Scanner(System.in);
			File file=new File("polynomials.txt");
			
			input = new Scanner(file);
			  
			String line=input.nextLine();
			String curentLine;
			String[] items=curentLine.split(" ");
			int[] pol1=new int[items.length];
			for(int i=0;i<items.length;i++){
				pol1[i]=Integer.parseInt(items[i]); 
			}
			curentLine=input.nextLine();
			items=curentLine.split(" ");
			
			int[] pol2=new int[items.length];
			for(int i=0;i<items.length;i++){
				pol2[i]=Integer.parseInt(items[i]);
				
			}
			Functions function=new Functions();
			while(input.hasNextLine()){
			 curentLine = input.nextLine();
				if(curentLine.equals("ADD")){
					function.add(pol1, pol2);
				}
				if(curentLine.equals("SUBSTRACT")){
					function.substract(pol1, pol2);
				}
				if(curentLine.equals("MULTIPLY")){
					function.Multiply(pol1,pol2);
				}
				if(curentLine.contains("MUL_SCAL")){
					function.Mul_Scal(pol1,Integer.parseInt(curentLine.replaceAll("[\\D]","")));
					
				}
				if(curentLine.contains("EVAL")){
					function.Eval(pol1,Integer.parseInt(curentLine.replaceAll("[\\D]","")));
				}
			}
			
		}
		}
	
   Polynomials pol=new Polynomials();
public void print_pol(int[] pol) throws FileNotFoundException, UnsupportedEncodingException{
	PrintWriter write=new PrintWriter("outputPolynomials.txt", "UTF-8");

	write.println(pol.toString());
	write.close();
}
}

