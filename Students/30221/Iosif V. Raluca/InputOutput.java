package polynomials;
import java.util.Scanner;
import java.lang.Double;
import java.io.File;
import java.io.FileNotFoundException;


public class InputOutput {
	public static void main(String[] args){
		Polynomial pol1;
		Polynomial pol2;
		Functions fcToExecute= new Functions();
		
		try{
			Scanner input= new Scanner(System.in);
			File file= new File("input.txt");
			input.close();
			input= new Scanner(file);
			String currentLine= input.nextLine();
			String[] item= currentLine.split(" ");
			double[] coeffs1= new double[item.length];
			for (int i=0; i<item.length; i++){
				coeffs1[i]=Double.parseDouble(item[i]);
			}
			pol1= new Polynomial(coeffs1);
			currentLine=input.nextLine();
			item= currentLine.split(" ");
			double[] coeffs2= new double[item.length];
			for (int i=0; i<item.length; i++){
				coeffs2[i]=Double.parseDouble(item[i]);
			}
			Polynomial anotherPol=new Polynomial();
			pol2=new Polynomial(coeffs2);
			if ((pol1.maxPol(pol2)).equals(pol2))
			{
				anotherPol=pol1;
				pol1=pol2;
				pol2=anotherPol;
				
			}
			//the instruction if from above interchanges pol1 and pol2 so that pol1 is the polynomial with the largest degree
		
			while (input.hasNextLine()){
				currentLine= input.nextLine();
				if (currentLine.equals("ADD")){
					fcToExecute.add(pol1, pol2);
				}
				if (currentLine.equals("SUBSTRACT")){
					fcToExecute.substract(pol1, pol2);
				}
				if (currentLine.equals("MULTIPLY")){
					fcToExecute.multiply(pol1, pol2);
				}
				if (currentLine.contains("MUL_SCAL")){
					fcToExecute.mulScal(pol1, Double.parseDouble(currentLine.replaceAll("[\\D]", "")));
					fcToExecute.mulScal(pol2, Double.parseDouble(currentLine.replaceAll("[\\D]", "")));
				}
				if (currentLine.contains("EVAL")) {
					fcToExecute.mulScal(pol1,Double.parseDouble(currentLine.replaceAll("[\\D]", "")));
				}
				
			
			}
			
			input.close();
		}
		catch(FileNotFoundException ex){
			System.out.println("File not found");
		}
	}
}

	
		
	

	
	


