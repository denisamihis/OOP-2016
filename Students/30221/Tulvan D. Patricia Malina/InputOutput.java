import java.io.*;
import java.util.*;

public class InputOutput {
	
	private Scanner x;
	
	public void openFile(){
		try{
			x= new Scanner(new File("E:\\JAVA\\Polynomials\\src\\pol.txt"));
			System.out.println("Found file!");
		}
		catch(Exception e){
			System.out.println("Could not find file!");
		}
	}
	
	public void readFile(){
		while(x.hasNextLine()){
			 String line=x.nextLine();
			 System.out.printf("%s\n",line);
			 String items[]=line.replaceAll(" ", "").split(",");
			 int[] results = new int[items.length];
			 for (int i = 0; i < items.length; i++) 
				 try{
					 results[i] = Integer.parseInt(items[i]); 
				 }
			 	 catch(NumberFormatException e) {
			         System.out.println("This is not a number");
			 		 
			 	 }
			 for(int i =0;i<items.length;i++)
				 System.out.printf("%d ",results[i]);
		}
	}
	
	public void closeFile(){
		x.close();
	}
	
	private Formatter y;
	
	public void openFileOut(){
		try{
			y= new Formatter("E:\\JAVA\\Polynomials\\src\\output.txt");
			System.out.println("Done!");
		}
		catch(Exception e){
			System.out.println("Could not find file!");
		}
	}
	
	public void writeOnFile(){
		y.format("%s","Something!");
	}
	
	public void closeFileOut(){
		y.close();
	}

}
