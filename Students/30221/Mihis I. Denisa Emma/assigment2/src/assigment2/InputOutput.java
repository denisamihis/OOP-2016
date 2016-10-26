package assigment2;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//am renuntat
//nu inteleg de ce desi metodele readPoly si convert nu sunt statice, dupa ce ies din ele,in main degree revine la 0,si etc
public class InputOutput
{ 
	public InputOutput( ) {
        
    }
	public void readPoly(int degree,int[] coefficients) throws Exception
	{
	
		File file = new File("pol.txt");
		Scanner scanner = new Scanner(file);
	    //coefficients=new int [20];
		degree= scanner.nextInt();
		int i = 0;
		while(scanner.hasNextInt())
		{
			coefficients[i++] = scanner.nextInt();
		}
		for(int j=0;j<coefficients.length;j++)
			System.out.println(coefficients[j]);
	}
	  public  String convert(int degree,int[] coef) {
	        if (degree ==  0) return "" + coef[0];
	        if (degree ==  1) return coef[1] + "x + " + coef[0];
	        String s = coef[degree] + "x^" + degree;
	        for (int i = degree-1; i >= 0; i--) {
	            if      (coef[i] == 0) continue;
	            else if (coef[i]  > 0) s = s + " + " + ( coef[i]);
	            else if (coef[i]  < 0) s = s + " - " + (-coef[i]);
	            if      (i == 1) s = s + "x";
	            else if (i >  1) s = s + "x^" + i;
	        }
	        return s;
	    }
	public static void main(String[] args) throws Exception
	{
		
		
		int [] coefficients1=new int [20];
		int [] coefficients2=new int [20];
		int degree1=0,degree2=0;
		InputOutput reader1=new InputOutput();
		InputOutput reader2=new InputOutput();
		reader1.readPoly(degree1,coefficients1);
		reader2.readPoly(degree2,coefficients2);
		Polynomial poly1 = new Polynomial(coefficients1);
		String s1 = poly1.convert(degree1,coefficients1);
		System.out.println(s1);
	
		
		
	}
}

