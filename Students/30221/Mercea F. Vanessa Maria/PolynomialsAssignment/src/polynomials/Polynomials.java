package polynomials;

public class Polynomials {
	public int[] coeficients;
	public int degree;

	public Polynomials(int degree) {
		this.coeficients = new int[this.degree];
		this.degree = degree;
	}

	public int degree() {
		int deg = 0;
		for (int i = 0; i < coeficients.length; i++)
			if (coeficients[i] != 0)
				deg = i;
		return deg;
	}

	public static void main(String[] args) {
		InputOutput inputOutput = new InputOutput();
		inputOutput.read();
	}
}
