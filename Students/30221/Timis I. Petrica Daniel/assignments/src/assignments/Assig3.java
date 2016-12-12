package assignments;

public class Assig3 
	{
	
	public static boolean palindrome (int number)
	{
		int reverse = 0, aux, temp;
		temp = number;
		while (number != 0)
		{
			aux = number % 10;
			reverse = reverse * 10 + aux;
			number /= 10;
		}
		if (temp == reverse)
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int prod, result = 0, nr1 = 0, nr2 = 0;
		for (int i = 100; i < 1000; i++)
			for (int j = 100; j < 1000; j++)
			{
				prod = i * j;
				if (palindrome(prod) == true && prod > result)
				{
					result = prod;
					nr1 = i;
					nr2 = j;
				}
			}
		System.out.println("Cel mai mare numar palindrom este: ");
		System.out.println(result + " = " + nr1 + " x " + nr2);
	}

}
