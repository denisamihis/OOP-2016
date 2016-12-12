
public class Twist2 {
	
	public static void inmultireMatrici(int F[][],int M[][]){
		int a=F[0][0]*M[0][0] + F[0][1]*M[1][0];
		int b=F[0][0]*M[0][1] + F[0][1]*M[1][1];
		int c=F[1][0]*M[0][0] + F[1][1]*M[1][0];
		int d=F[1][0]*M[0][1] + F[1][1]*M[1][1];
		F[0][0]=a;
		F[0][1]=b;
		F[1][0]=c;
		F[1][1]=d;
	}
	public static void powerMatrici(int F[][], int n){
		if (n==0 || n==1)
			return;
		int M[][]={{1,1},{1,0}};
		powerMatrici(F,n/2);
		inmultireMatrici(F,F);
		if (n%2==1) 
			inmultireMatrici(F,M);
	}
	public static int Fibo(int indice){
		int F[][]={{1,1},{1,0}};
		if (indice==0) return 0;
		powerMatrici(F,indice);
		return F[0][0];
	}
	public static void main(String[] args) {
		int suma=2;//introducem din start al doilea numar,deoarece primul este impar
		for (int contor=3;Fibo(contor)<4000000;contor++){
			if (Fibo(contor)%2==0){
			suma+=Fibo(contor);}
		}
		System.out.print("Suma este="+suma);
		

	}

}
