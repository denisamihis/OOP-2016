package polinoame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class IO {

public static void main (String args[]) throws IOException
{	BufferedReader br = null;
	FileReader fr = null;
	File file = new File("C:\\Users\\dana\\Documents\\Java\\polinom\\polinoame\\src\\pol.txt");
	System.out.println(file.canRead());
	String str = null;
	
    try {
      br = new BufferedReader(new FileReader(file));
    } catch (FileNotFoundException e) {
        System.out.println("crapa la File Reader");
        e.printStackTrace();
    }
    
    try {
		str = br.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    String[] a1 = str.split(" ");
    Polynomials p1=new Polynomials(a1.length-1);
    int j=0;
    for(int i=a1.length-1;i>=0;i--){
    	
    	p1.setCoef(j ,Integer.parseInt(a1[i]));
    	j++;}
    try {
		str = br.readLine();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
    
     a1 = str.split(" ");
    Polynomials p2=new Polynomials(a1.length-1);
     j=0;
    for(int i=a1.length-1;i>=0;i--){
    	
    	p2.setCoef(j ,Integer.parseInt(a1[i]));
    	j++;}
    
	 while((str = br.readLine())!=null)
		 switch(str)
		 { case "add":System.out.println("suma este:");
			 System.out.println(Functions.sum(p1, p2).toString()); 
		 	break;
		 case "substract":System.out.println("diferenta este:");
			 System.out.println(Functions.sub(p1, p2).toString());
			 break;
		 case "multiply":System.out.println("produsul este:");
		 System.out.println(Functions.multiply(p1, p2).toString());
		 break;
		 case"mul_scale4":System.out.println("produsul cu scalarul 4 este:");
		 System.out.println(Functions.multiplyScale(p1).toString());
		 break;
		 case "eval 5":System.out.println("P(5)=:");
		 System.out.println(Functions.evalNr(p1,5));
		 break;
		 case "eval 2":System.out.println("P(2)=:");
		 System.out.println(Functions.evalNr(p1,2));
		 break;
		 case "eval 9":System.out.println("P(9)=:");
		 System.out.println(Functions.evalNr(p1,9));
		 break;
		 default:;
		 }

}
}
