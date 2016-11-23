import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		int First,Second,That;
		int Sum;
		Scanner Number=new Scanner(System.in );
		System.out.println("Introduceti numarul: ");
		That=Number.nextInt();
		Number.close();
		First=1;
		Second=2;
		Sum=1;
		int Count=2;
		while(Count<=That && That>2){
			Sum=Sum+Second;
			Count++;
			int x=Second;
			Second=Second+First;
			First=x;
		}
		System.out.println("Suma primelor "+That +" numere din sirul lui Fibonacci este: "+ Sum);
		if(That==2)
			System.out.println("3");
		
	}

}
