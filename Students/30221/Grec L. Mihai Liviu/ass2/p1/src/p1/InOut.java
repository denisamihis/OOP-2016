package p1;
import java.util.*;
import java.io.*;
public class InOut {
	public static void main(String[] args) throws Exception {
		Polynomials p1;
		Polynomials p2;
		createFileWrite fileW = new createFileWrite();
		fileW.openFile();
		Functions functions = new Functions();
		try{
			Scanner input = new Scanner(System.in);
			File file = new File("pol.txt");
			input.close();
			input = new Scanner(file);
			String currentLine = input.nextLine();
			String[] item = currentLine.split(" ");
			int [] coeffs1 = new int[item.length];
			for (int counter = 0; counter < item.length ; counter++)
				coeffs1[counter]=Integer.parseInt(item[counter]);
			p1 = new Polynomials(coeffs1);
			currentLine = input.nextLine();
			item = currentLine.split(" ");
			int [] coeffs2 = new int[item.length];
			for (int counter = 0; counter < item.length ; counter++)
				coeffs2[counter]=Integer.parseInt(item[counter]);
			p2 = new Polynomials(coeffs2);
			while (input.hasNextLine()){
				currentLine = input.nextLine();
				Polynomials result;
				int resultEval;
				if (currentLine.equals("ADD")){
					result = functions.ADD(p1, p2);
					fileW.addText("ADD");
					fileW.addRecords(result);
				}
				if (currentLine.equals("SUBSTRACT")){
					result = functions.SUBSTRACT(p1, p2);
					fileW.addText("SUBSTRACT");
					fileW.addRecords(result);
				}
				if (currentLine.equals("MULTIPLY")){
					result = functions.MULTIPLY(p1, p2);
					fileW.addText("MULTIPLY");
					fileW.addRecords(result);
				}
				if (currentLine.contains("MUL_SCAL")){
					result = functions.MUL_SCAL(p1, Integer.parseInt(currentLine.replaceAll("[\\D]", "")));
					fileW.addText("MUL_SCAL p1");
					fileW.addRecords(result);
				}
				if (currentLine.contains("EVAL")){
					resultEval = functions.EVAL(p2, Integer.parseInt(currentLine.replaceAll("[\\D]", "")));
					fileW.addText("EVAL p2");
					fileW.addRecordsEval(resultEval);
				}
				
			}
			input.close();
			
		}
		catch(FileNotFoundException ex){
			System.out.println("File not found");
		}
	fileW.closeFile();
	}
		
}
