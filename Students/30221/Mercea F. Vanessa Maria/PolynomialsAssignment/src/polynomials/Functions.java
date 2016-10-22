package polynomials;

public class Functions {

	public void ADD(Polynomials polynomeOne, Polynomials polynomeTwo) {
		int maxDegree;
		InputOutput inputOutput = new InputOutput();

		if (polynomeOne.degree > polynomeTwo.degree)
			maxDegree = polynomeOne.degree;
		else
			maxDegree = polynomeTwo.degree;

		Polynomials polynomeSum = new Polynomials(maxDegree);

		for (int i = maxDegree - 1; i >= 0; i--) {
			polynomeSum.coeficients[i] = polynomeOne.coeficients[i] + polynomeTwo.coeficients[i];
		}
		inputOutput.print(polynomeSum, false, 0);
	}

	public void SUBSTRACT(Polynomials polynomeOne, Polynomials polynomeTwo) {
		int maxDegree;
		InputOutput inputOutput = new InputOutput();

		if (polynomeOne.degree > polynomeTwo.degree)
			maxDegree = polynomeOne.degree;
		else
			maxDegree = polynomeTwo.degree;
		Polynomials polynomeSubstract = new Polynomials(maxDegree);
		for (int i = maxDegree - 1; i >= 0; i--) {
			polynomeSubstract.coeficients[i] = polynomeOne.coeficients[i] - polynomeTwo.coeficients[i];
		}
		inputOutput.print(polynomeSubstract, false, 0);
	}

	public void MULTIPLY(Polynomials polynomeOne, Polynomials polynomeTwo) {

	}

	public void MUL_SCAL(Polynomials polynomeOne, Polynomials polynomeTwo, int valueToMultiply) {
		InputOutput inputOutput = new InputOutput();
		Polynomials polynomeOneMultiplied = new Polynomials(polynomeOne.degree);
		Polynomials polynomeTwoMultiplied = new Polynomials(polynomeTwo.degree);

		for (int i = polynomeOne.degree - 1; i >= 0; i--) {
			polynomeOneMultiplied.coeficients[i] = polynomeOne.coeficients[i] * valueToMultiply;
		}
		for (int i = polynomeTwo.degree - 1; i >= 0; i--) {
			polynomeTwoMultiplied.coeficients[i] = polynomeTwo.coeficients[i] *= valueToMultiply;
		}

		inputOutput.print(polynomeOne, false, 0);
		inputOutput.print(polynomeTwo, false, 0);

	}

	public void EVAL(Polynomials polynome, int valueForEvaluation) {
		int result = 0;
		InputOutput inputOutput = new InputOutput();
		// Horner
		for (int i = polynome.degree - 1; i >= 0; i--) {
			result = polynome.coeficients[i] + (valueForEvaluation * result);
		}
		inputOutput.print(polynome, true, result);

	}

	public String polyToString(Polynomials poly) {
		String polyString;
		polyString = "";
		for (int i = poly.degree; i >= 0; i--) {

		}
		return (polyString);
	}
}
