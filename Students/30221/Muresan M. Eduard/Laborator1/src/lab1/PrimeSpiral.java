package lab1;

public class PrimeSpiral {
	public static void main(String[] args) {
		int i, j, wrapper, counter, primeCounter = 0;
		counter = 2;
		wrapper = 3;
		//System.out.println(1+" "+0+" "+0+" | "+1);
		for (i = j = 1;true;wrapper+=2)
		{
			for (j = j+1; i > 0; i--, counter++)
			{
				if ( (i == j || i+j == wrapper-1) && isPrime(counter) )
					primeCounter++;
				//System.out.print(counter+" "+i+" "+j+" | ");
			}
			for (i = 0; j > 0; j--, counter++)
			{
				if ( (i == j || i+j == wrapper-1) && isPrime(counter) )
					primeCounter++;
				//System.out.print(counter+" "+i+" "+j+" | ");
			}
			for (j = 0; i < wrapper - 1; i++, counter++)
			{
				if ( (i == j || i+j == wrapper-1) && isPrime(counter) )
					primeCounter++;
				//System.out.print(counter+" "+i+" "+j+" | ");
			}
			for (i = wrapper - 1; j < wrapper; j++, counter++)
			{
				if ( (i == j || i+j == wrapper-1) && isPrime(counter) )
					primeCounter++;
				//System.out.print(counter+" "+i+" "+j+" | ");
			}
			//System.out.println(primeCounter+" "+(double)primeCounter / (2 * wrapper - 1));
			i = j = wrapper;
			if ((double)primeCounter / (2 * wrapper - 1) < 0.1f)
				break;
		}
		System.out.println("The ratio falls below 10% when the side length of the square is "+wrapper);
	}
	public static boolean isPrime(int number)
	{
		int count;
		for (count = 2; count <= Math.sqrt(number); count++)
			if (number % count == 0)
				return false;
		return true;
	}
}
