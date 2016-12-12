package fibbb;

public class fibbi {

	public static void main(String[] args) {
		
		int fn1 = 1, fn2 = 2, fn3 = 0;
		int fn=0;
		int sum=2;
		
		fn3=fn1+fn2;

		while (fn<4000000)
		{	fn = fn2 + fn3;
			fn2 = fn3;
			fn3 = fn;
			
			if (fn % 2 == 0)
				{sum = sum + fn;
				System.out.println(fn);
				}
		}
			System.out.println("Suma numerelor pare din sirul lui Fibbonaci este: " + sum);

		}

	}




