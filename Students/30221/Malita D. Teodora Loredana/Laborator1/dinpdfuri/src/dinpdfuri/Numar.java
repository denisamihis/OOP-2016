package dinpdfuri;

public class Numar {
	public int x;

	public double factorial() {
		int i;
		double p;
		p = 1;
		for (i = 2; i <= this.x; i++)
			p = p * i;
		return p;

	}

	public boolean prim() {
		int i;
		for (i = 2; i <= Math.sqrt(this.x); i++)
			if (x % i == 0)
				return false;
		return true;

	}

}
