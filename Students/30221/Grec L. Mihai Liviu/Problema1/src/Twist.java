import java.util.Scanner;
public class Twist {
	public static void main(String[] args){
Scanner intrare=new Scanner(System.in);
System.out.println("Dati numarul:");
int numar=intrare.nextInt();
int suma=0;
int contor=3;
while (contor<numar){
	if (contor%3==0 || contor%5==0){
		suma+=contor;
	}
	contor++;
}
System.out.print("Suma este="+suma);
intrare.close();
}
	
}
//la int,overflow apare pentru numar=95936(numarul devine negativ)

