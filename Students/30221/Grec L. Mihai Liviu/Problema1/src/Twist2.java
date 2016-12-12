import java.util.Scanner;
public class Twist2
{
	public static void main(String[] args){
Scanner intrare=new Scanner(System.in);
System.out.println("Dati numarul:");
long numar=intrare.nextInt();
long suma=0;
long contor=3;
while (contor<numar){
	if (contor%3==0 || contor%5==0){
		suma+=contor;
	}
	contor++;
}
System.out.print("Suma este="+suma);
intrare.close();
}
	//la long, overflow apare pentru numar=2147483648
}