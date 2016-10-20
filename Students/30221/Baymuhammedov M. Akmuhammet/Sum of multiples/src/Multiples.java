
import java.util.Scanner;

public class Multiples {
	public static int multiples(){
		int c=3, j=5, sum=0;
		for(int x=0;x<1000;x++){
			if(x%c==0 || x%j==0) // daca nr e multiple la 3 sau 5, aduneaza
				sum+=x;
		}
		return sum;
	}
	
public static void insertkey(){ 
	Scanner in = new Scanner(System.in);
	int nr, c=3, j=5, sum=0;
	System.out.println("Dati nr");
	nr = in.nextInt();
	for(int x=0; x<nr; x++){
		if(x%c==0 || x%j==0)
			sum+=x;
	}
	System.out.println(sum);
	
}

	public static void main(String[] args) {
		int ans;
		ans=multiples();
		System.out.println(ans);
		insertkey();

	}

}
