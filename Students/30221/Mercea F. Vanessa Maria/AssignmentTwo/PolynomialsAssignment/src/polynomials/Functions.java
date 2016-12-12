package polynomials;

public class Functions {

	public void ADD(Polynomials polynomeOne, Polynomials polynomeTwo) {
		int minDegree, maxDegree;
		InputOutput inputOutput = new InputOutput();

		if (polynomeOne.degree > polynomeTwo.degree) {
			minDegree = polynomeTwo.degree;
			maxDegree = polynomeOne.degree;

		} else {
			minDegree = polynomeOne.degree;
			maxDegree = polynomeTwo.degree;
		}

		Polynomials polynomeSum = new Polynomials(maxDegree);

		for (int i = minDegree - 1; i >= 0; i--) {
			polynomeSum.coeficients[i] = polynomeOne.coeficients[i] + polynomeTwo.coeficients[i];
		}
		for (int i = maxDegree - 1; i >= minDegree; i--) {
			if (polynomeOne.degree == minDegree) {
				polynomeSum.coeficients[i] = polynomeTwo.coeficients[i];
			} else {
				polynomeSum.coeficients[i] = polynomeOne.coeficients[i];
			}
		}
		inputOutput.print(polynomeSum, 1, 0);
	}

	public void SUBSTRACT(Polynomials polynomeOne, Polynomials polynomeTwo) {
		int minDegree, maxDegree;
		InputOutput inputOutput = new InputOutput();

		if (polynomeOne.degree > polynomeTwo.degree) {
			minDegree = polynomeTwo.degree;
			maxDegree = polynomeOne.degree;

		} else {
			minDegree = polynomeOne.degree;
			maxDegree = polynomeTwo.degree;
		}

		Polynomials polynomeSubstract = new Polynomials(maxDegree);

		for (int i = minDegree - 1; i >= 0; i--) {
			polynomeSubstract.coeficients[i] = polynomeOne.coeficients[i] - polynomeTwo.coeficients[i];
		}
		for (int i = maxDegree - 1; i >= minDegree; i--) {
			if (polynomeOne.degree == minDegree) {
				polynomeSubstract.coeficients[i] = polynomeTwo.coeficients[i];
			} else {
				polynomeSubstract.coeficients[i] = polynomeOne.coeficients[i];
			}
		}
		inputOutput.print(polynomeSubstract, 2, 0);
	}

	public void MULTIPLY(Polynomials polynomeOne, Polynomials polynomeTwo) {
		Polynomials multiplyResult = new Polynomials(polynomeOne.degree + polynomeTwo.degree);
		InputOutput inputOutput = new InputOutput();
		
		for (int i = 0; i < polynomeOne.degree; i++)
			for (int j = 0; j < polynomeTwo.degree; j++)
				multiplyResult.coeficients[i + j] += (polynomeOne.coeficients[i] * polynomeTwo.coeficients[j]);
		multiplyResult.degree = multiplyResult.degree();
		inputOutput.print(multiplyResult, 3, 0);
	}

	public void MUL_SCAL(Polynomials polynomeOne, Polynomials polynomeTwo, int valueToMultiply) {
		InputOutput inputOutput = new InputOutput();
		Polynomials polynomeOneMultiplied = new Polynomials(polynomeOne.degree);
		Polynomials polynomeTwoMultiplied = new Polynomials(polynomeTwo.degree);

		for (int i = polynomeOne.degree - 1; i >= 0; i--) {
			polynomeOneMultiplied.coeficients[i] = polynomeOne.coeficients[i] * valueToMultiply;
		}
		for (int i = polynomeTwo.degree - 1; i >= 0; i--) {
			polynomeTwoMultiplied.coeficients[i] = polynomeTwo.coeficients[i] * valueToMultiply;
		}

		inputOutput.print(polynomeOneMultiplied, 4, 0);
		inputOutput.print(polynomeTwoMultiplied, 4, 1);

	}

	public void EVAL(Polynomials polynome, int valueForEvaluation) {
		int result = 0;
		InputOutput inputOutput = new InputOutput();
		// Horner
		
		for (int i = polynome.degree - 1; i >= 0; i--) {
			result = polynome.coeficients[i] + (valueForEvaluation * result);
		}
		inputOutput.print(polynome, 5, result);

	}

	public String polyToString(Polynomials poly) {
		String polyString;
		polyString = poly.coeficients[poly.degree - 1] + "x^" + (poly.degree - 1);
		
		for (int i = poly.degree - 2; i >= 0; i--) {
			if (poly.coeficients[i] == 0)
				continue;
			else if (poly.coeficients[i] > 0)
				polyString = polyString + " + " + (poly.coeficients[i]);
			else if (poly.coeficients[i] < 0)
				polyString = polyString + " - " + (-poly.coeficients[i]);
			if (i == 1)
				polyString = polyString + "x";
			else if (i > 1)
				polyString = polyString + "x^" + i;
		}
		return (polyString);
	}
}
