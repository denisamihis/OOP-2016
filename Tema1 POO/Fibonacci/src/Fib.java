
public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int termen1=1;
int termen2=2;
int aux, raspuns;
int sum=0;
System.out.print("termenii sirului sunt: " );
System.out.println("\n" +termen1);
while (termen1<4000000){
	System.out.println("\n" +termen2);
	if(termen2%2==0){	
	sum=sum+termen2;}
	
	aux=termen1;
	termen1=termen2;
	termen2=termen2+aux;
}				//crearea sirului cu ajutorul auxiliarului 'aux'
	System.out.println("suma termenilor pari este:" +sum);
	}

}
