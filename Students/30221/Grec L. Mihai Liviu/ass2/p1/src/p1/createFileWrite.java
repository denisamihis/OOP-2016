package p1;
import java.lang.*;
import java.util.*;
import java.io.*;
public class createFileWrite {
	private Formatter x;
	public void openFile(){
		try {
			x = new Formatter("output.txt");
		}
		catch (Exception e){
			System.out.println("You have an error");
		}
	}
	public void addRecords(Polynomials pol){
		x.format("%s \n", pol.toString());
	}
	public void addRecordsEval(int result){
		x.format("%d \n", result);
	}
	public void addText(String text){
		x.format("%s : ", text);
	}
	public void closeFile(){
		x.close();
	}
}
