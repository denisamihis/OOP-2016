
public class Run {

	
	public static void main(String [] args)
	{
		int []x=new int[10];
		x[0]=1;x[2]=2;x[1]=3;
		int []c=new int [10];c[0]=11;c[1]=2;c[3]=5;c[4]=1;
		Polynomial P1=new Polynomial(x,3);
		Polynomial P2=new Polynomial(c,5);
		P2.construct();
		System.out.println("\n");
		P1.construct();
		Function f=new Function(P1,P2);
		System.out.println("Adunare");
		f.add();
		System.out.println("Scadere");
		f.substract();
		System.out.println("Inmultire");
		f.multiply();
		System.out.println("Inmultire cu scalar");
		f.mul_scal(2);
		System.out.println("Ceva chestie la care nu stiu cum sa-i zic");
		f.eval(1);
		//---------------------------------------------
		InputOutput file=new InputOutput();
		//file.openOutFile();
		file.openInFile();
		file.readFile();
	}
}
