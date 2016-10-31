
public class Problema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int suma=0;
int n=0;
while(n<1000){
	if((n%3==0) || (n%5==0))
		suma+=n;
	n++;
}
System.out.println("Suma este:" +suma);
	}

}
