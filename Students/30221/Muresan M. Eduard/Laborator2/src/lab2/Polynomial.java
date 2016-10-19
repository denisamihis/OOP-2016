package lab2;


public class Polynomial {
	public int degree;
	public int[] coefs;
	public Polynomial(int[] coefs)
	{
		int count, zeroes = 0;
		for (count = coefs.length - 1; count >=0 && coefs[count] == 0; count--, zeroes++);
		this.coefs = new int[coefs.length - zeroes];
		degree = coefs.length - 1 - zeroes;
		for (count = 0; count <= degree; count++)
			this.coefs[count] = coefs[count];
	}
	public Polynomial(int degree)
	{
		coefs = new int[degree + 1];
		this.degree = degree;
	}
	//this constructor creates a polynomial read in mathematical form :)
	public Polynomial(String polynomial)
	{
		String[] aux = polynomial.split(" ");
		String[] numbers;
		int sign = 1;
		int count = 0;
		if (aux[0] == "-")
			sign *= -1;
		numbers = aux[0].split("x");
		numbers[1] = numbers[1].substring(1);
		coefs = new int[Integer.parseInt(numbers[1])+1];
		degree = coefs.length - 1;
		coefs[Integer.parseInt(numbers[1])] = sign * Integer.parseInt(numbers[0]);
		for (count = 1; count < aux.length; count++)
		{
			if (aux[count].equals("-"))
				sign *= -1;
			else if (!aux[count].equals("+"))
			{
					numbers = aux[count].split("x");
					try
					{
						numbers[1] = numbers[1].substring(1);
						coefs[Integer.parseInt(numbers[1])] = sign * Integer.parseInt(numbers[0]);
					}
					catch(ArrayIndexOutOfBoundsException ex)
					{
						if (numbers[0].equals(aux[count]))
							coefs[0] = sign * Integer.parseInt(numbers[0]);
						else
							coefs[1] = sign * Integer.parseInt(numbers[0]);
					}
					sign = 1;
			}
		}
	}
	public String toString()
	{
		String content = "";
		int count;
		for (count = degree; count >= 0; count--)
			if (coefs[count] != 0)
				switch(count)
				{
				case 0:
					if (coefs[0] > 0)
						content += "+" + coefs[0] + " ";
					else
						content += coefs[0] + " ";
					break;
				case 1:
					if (coefs[1] > 0)
						content += "+" + coefs[1] + "x" + " ";
					else
						content += coefs[1] + "x" + " ";
					break;
				default:
					if (count != degree)
						if (coefs[count] > 0)
							content += "+" + coefs[count] + "x^" + count + " ";
						else
							content += coefs[count] + "x^" + count + " ";
					else
						content += coefs[count] + "x^" + count + " ";	
				}
		return content;
	}
	public static String toString(Polynomial a)
	{
		String content = "";
		int count;
		for (count = a.degree; count >= 0; count--)
			if (a.coefs[count] != 0)
				switch(count)
				{
				case 0:
					if (a.coefs[0] > 0)
						content += "+" + a.coefs[0] + " ";
					else
						content += a.coefs[0] + " ";
					break;
				case 1:
					if (a.coefs[1] > 0)
						content += "+" + a.coefs[1] + "x" + " ";
					else
						content += a.coefs[1] + "x" + " ";
					break;
				default:
					if (count != a.degree)
						if (a.coefs[count] > 0)
							content += "+" + a.coefs[count] + "x^" + count + " ";
						else
							content += a.coefs[count] + "x^" + count + " ";
					else
						content += a.coefs[count] + "x^" + count + " ";	
				}
		return content;
	}
	public int evaluate(int x)
	{
		int counter, sum = 0;
		for (counter = 0; counter <= degree; ++counter)
			sum += coefs[counter]*(int)Math.pow(x, counter);
		return sum;
	}
	public boolean isNull()
	{
		return degree == 0 && coefs[degree] ==0;
	}
	public void nullify()
	{
		int count;
		for (count=0; count<= degree; count++)
			coefs[count] = 0;
	}
}
