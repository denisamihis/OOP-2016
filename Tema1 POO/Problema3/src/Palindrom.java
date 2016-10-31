import java.util.Scanner;


public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("Introduceti numarul:");
//Scanner pal= new Scanner(System.in);
int palindrom;
//palindrom=pal.nextInt();
/*if(verificare(palindrom)){
	System.out.println("Numarul introdus este palindrom");
}
else
	{System.out.println("Numarul introdus nu este palindrom");
	}*/
int nr=0;
for(int i=100;i<=999;i++)
{ for(int j=i;j<=999;j++){
	int  nr1=i*j;
if(verificare(nr1)&&nr<nr1){
nr=nr1;}
}}
	System.out.println("cel mai mare palindrom format din nr de 3 cifre este:" +nr);

	
}
	
	public static boolean verificare(int numar){
		int palindro = numar;
		int oglindit=0;
		while(palindro !=0){
			oglindit=oglindit*10+palindro%10;
			palindro=palindro/10;}
		if(numar==oglindit)
			return true;
		else 
			return false;
	}

}
