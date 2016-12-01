import java.util.Scanner;
public class suma {
	public static void main(String[] args) {
	int sum=0,That,counter=1;
	Scanner Number=new Scanner(System.in );
	System.out.println("Numarul pana la care calculam suma este:");
	That=Number.nextInt();
	Number.close();
	while(counter<=That){
		if(counter %3==0 || counter%5==0)
		sum=sum+counter;
		counter++;}
	System.out.print("suma multiplilor de 3 si 5 este: ");
	System.out.println(sum);
}
}
