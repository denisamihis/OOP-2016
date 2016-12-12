
//suma multiplilor
import java.util.Scanner;
import java.util.Random;
public class Sum {

	public static void main(String[] args) {
		int n,contor,sum=0;
		System.out.println("Citeste n:");
		Scanner in = new Scanner ( System . in );
		n = in . nextInt ();
		for(contor=1;contor<n;contor++)
		{
			if(contor%3==0)
				sum=sum+contor;
			if(contor%5==0)
				sum=sum+contor;
		}
		System.out.println(sum);
	}
}


