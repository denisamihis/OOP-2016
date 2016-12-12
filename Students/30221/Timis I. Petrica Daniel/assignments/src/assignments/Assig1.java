package assignments;

public class Assig1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int dim = 1000, i, sum = 0;
		
		for (i = 0; i < dim; i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		
		System.out.println("Suma numerelor este " + sum + ".");
	}

}
