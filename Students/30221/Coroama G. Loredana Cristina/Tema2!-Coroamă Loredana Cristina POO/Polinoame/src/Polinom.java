
public class Polinom {
	private int[] coef;
	private int grad;

	public Polinom(int a, int b) {
		coef = new int[b + 1];
		coef[b] = a;
		grad = degree();

	}

	public int degree() {
		int g = 0;
		for (int i = 0; i < coef.length; i++)
			if (coef[i] != 0)
				g = i;
		return g;

	}

	public Polinom Add(Polinom b) {
		Polinom a = this;
		Polinom c = new Polinom(0, Math.max(a.grad, b.grad));
		for (int i = 0; i <= a.grad; i++)
			c.coef[i] += a.coef[i];
		for (int i = 0; i <= b.grad; i++)
			c.coef[i] += b.coef[i];
		c.grad = c.degree();
		return c;
	}

	public Polinom Minus(Polinom b) {
		Polinom a = this;
		Polinom c = new Polinom(0, Math.max(a.grad, b.grad));
		for (int i = 0; i <= a.grad; i++)
			c.coef[i] += a.coef[i];
		for (int i = 0; i <= b.grad; i++)
			c.coef[i] -= b.coef[i];
		c.grad = c.degree();
		return c;
	}

	public Polinom Multiple(Polinom b) {
		Polinom a = this;
		Polinom c = new Polinom(0, a.grad + b.grad);
		for (int i = 0; i <= a.grad; i++)
			for (int j = 0; j <= b.grad; j++) {
				c.coef[i + j] += (a.coef[i] * b.coef[j]);
				c.grad = c.degree();

			}
		return c;
	}

	public String toString() {
		if (grad == 0)
			return "" + coef[0];
		if (grad == 1)
			return coef[1] + "x + " + coef[0];
		String s = coef[grad] + "x^" + grad;
		for (int i = grad - 1; i >= 0; i--) {
			if (coef[i] == 0)
				continue;
			else if (coef[i] > 0)
				s = s + " + " + (coef[i]);
			else if (coef[i] < 0)
				s = s + " - " + (-coef[i]);
			if (i == 1)
				s = s + "x";
			else if (i > 1)
				s = s + "x^" + i;
		}
		return s;
	}

	public int evaluate(int x) {
		int k = 0;
		for (int i = grad; i >= 0; i--)
			k = coef[i] + (x * k);
		return k;
	}

	public Polinom MUL_SCAL(int j) {
		Polinom b = this;
		Polinom c = new Polinom(0, b.grad);
		for (int i = 0; i <= b.grad; i++)
			c.coef[i] += j * b.coef[i];
		c.grad = c.degree();
		return c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polinom p1 = new Polinom(4, 3);
		Polinom p2 = new Polinom(3, 2);
		Polinom p3 = new Polinom(1, 0);
		Polinom p4 = new Polinom(2, 1);
		Polinom p = p1.Add(p2).Add(p3).Add(p4);
		System.out.println("p(x)=   " + p);

		Polinom q1 = new Polinom(3, 2);
		Polinom q2 = new Polinom(5, 0);
		Polinom q = q1.Add(q2);
		System.out.println("q(x) =        " + q);

		System.out.println("p(x)+q(x)= " + p.Add(q));

		System.out.println("p(x)-q(x)= " + p.Minus(q));

		System.out.println("p(x)*q(x)= " + p.Multiple(q));
		System.out.println("q(2) =        " + q.evaluate(2));

		System.out.println("2*q(x) =        " + q.MUL_SCAL(2));
	}

}
