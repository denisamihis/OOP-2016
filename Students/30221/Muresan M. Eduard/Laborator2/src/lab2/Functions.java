package lab2;

public class Functions {
	public static Polynomial add(Polynomial a, Polynomial b)
	{
		int[] sum = new int[ a.coefs.length > b.coefs.length ? a.coefs.length : b.coefs.length];
		int count;
		for (count = 0; count < a.coefs.length && count < b.coefs.length; count++)
			sum[count] = a.coefs[count] + b.coefs[count];
		while (count < a.coefs.length)
			sum[count] = a.coefs[count++];
		while (count < b.coefs.length)
			sum[count] = b.coefs[count++];
		return new Polynomial(sum);
	}
	public static Polynomial subtract(Polynomial a, Polynomial b)
	{
		int[] sub = new int[ a.coefs.length > b.coefs.length ? a.coefs.length : b.coefs.length];
		int count;
		for (count = 0; count < a.coefs.length && count < b.coefs.length; count++)
			sub[count] = a.coefs[count] - b.coefs[count];
		while (count < a.coefs.length)
			sub[count] = a.coefs[count++];
		while (count < b.coefs.length)
			sub[count] = b.coefs[count++];
		return new Polynomial(sub);
	}
	public static Polynomial multiplyWithScalar(Polynomial a, int scalar)
	{
		int[] product = new int[a.coefs.length];
		int count;
		for (count = 0; count < product.length; count++)
			product[count] = a.coefs[count] * scalar;
		return new Polynomial(product);
	}
	public static Polynomial multiply(Polynomial a, Polynomial b)
	{
		int[] product = new int[a.coefs.length + b.coefs.length];
		int count1, count2;
		for (count1 = 0; count1 < a.coefs.length; count1++)
			for (count2 = 0; count2 < b.coefs.length; count2++)
				product[count1 + count2] += a.coefs[count1] * b.coefs[count2];
		return new Polynomial(product);
	}
	public static Polynomial[] divide(Polynomial a, Polynomial b)
	{
		Polynomial result = new Polynomial(a.coefs.length - b.coefs.length);
		Polynomial auxPoly = new Polynomial(a.coefs.length - b.coefs.length);
		Polynomial remainder = new Polynomial(a.coefs);
		if (b.isNull())
			return null;
		while (!remainder.isNull() && remainder.degree >= b.degree)
		{
			auxPoly.nullify();
			auxPoly.degree = remainder.degree - b.degree;
			auxPoly.coefs[auxPoly.degree] = remainder.coefs[remainder.degree]/b.coefs[b.degree];
			result = add(result, auxPoly);
			remainder = subtract(remainder, multiply(auxPoly,b));
		}
		Polynomial[] ret = {result, remainder};
		return ret;
	}
}
