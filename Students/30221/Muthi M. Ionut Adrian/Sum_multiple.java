import java.util.Scanner;

public class Sum_multiple {
	

	
	private static int multiplii(int n){
		
		int i,sum=0;
		
		for(i=0;i<n;i++)
		{
			if(i%5==0 || i%3==0)
				sum+=i;
		}
		return sum;
	}
    



	public static void main(String[] args) {
		
		int n,rez;

		System.out.print("Numarul este n=");
		System.out.println(" ");
		Scanner input= new Scanner(System.in);
		n=input.nextInt();
		rez=multiplii(n);
		
		
		System.out.println("Suma multiplilor de 3 si 5 mai mici decat  " + n + " este " + rez);
	}

}
