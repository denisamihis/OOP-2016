
public class Fibbo {
	public static int Fibo(int numar){
		if (numar==1 || numar==2) return numar;
		else return (Fibo(numar-1)+Fibo(numar-2));
	}
	public static void main(String[] args){
		int suma=2;//introducem din start al doilea numar,deoarece primul este impar
		for (int contor=3;Fibo(contor)<4000000;contor++){
			if (Fibo(contor)%2==0){
			suma+=Fibo(contor);}
		}
		System.out.print("Suma este="+suma);
	}
}
