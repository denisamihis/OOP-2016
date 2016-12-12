import java.util.Scanner;

public class Sum {
	private static Scanner in;
	public static int suma(int nr)
	{
		int s=0;
		for (int i=2;i<nr;i++)
			if(i%3==0||i%5==0)
				s=s+i;
		return s;
	}
	public static void main ( String [] args )
	{	
		System.out.println("Introduceti un numar");
		in = new Scanner ( System . in );
		int numar = in . nextInt ();
		int rezultat=suma(numar);
		System.out.println(rezultat);	
	}
}
