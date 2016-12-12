import java.util.Scanner;

public class SumOfMultiples {

	private static Scanner sc;

	public static void main(String[] args) {
		int sum=0;
		System.out.println("insert number ");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			if (i%3==0 || i%5==0)
				sum=sum+i;
		}
System.out.println(sum);
	}

}
