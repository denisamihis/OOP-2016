package problems;

public class Function {

	public void ADD(Polynomial first, Polynomial second) {
		Polynomial result = new Polynomial();
		for (int i = 0; i < first.deg; i++)
			result.coef[i] += first.coef[i];
		for (int i = 0; i < second.deg; i++)
			result.coef[i] += second.coef[i];
		InputOutput inputOutput = new InputOutput();
		inputOutput.print(result);
	}

	public void SUBSTRACT(Polynomial first, Polynomial second) {
		Polynomial result = new Polynomial();
		for (int i = 0; i < first.deg; i++)
			result.coef[i] += first.coef[i];
		for (int i = 0; i < second.deg; i++)
			result.coef[i] -= second.coef[i];
		InputOutput inputOutput = new InputOutput();
		inputOutput.print(result);
	}

	public void MULTIPLY(Polynomial first, Polynomial second) {
		Polynomial result = new Polynomial();
		for (int i = 0; i < first.deg; i++)
			for (int j = 0; j < second.deg; j++)
				result.coef[i + j] += (first.coef[i] * second.coef[j]);
		InputOutput inputOutput = new InputOutput();
		inputOutput.print(result);
	}

	public void MUL_SCAL(Polynomial first, Polynomial second, Integer scalar) {
		for (int i = 0; i < first.deg; i++)
			first.coef[i] = first.coef[i] * scalar;
		for (int i = 0; i < second.deg; i++)
			second.coef[i] = second.coef[i] * scalar;
		InputOutput inputOutputFirst = new InputOutput();
		inputOutputFirst.print(first);
		InputOutput inputOutputSecond = new InputOutput();
		inputOutputSecond.print(second);
	}

	public int EVAL(Polynomial anPolynom, Integer evaluationNumber) {
		int result = 0;
		for (int i = anPolynom.deg-1; i >= 0; i--)
			result = anPolynom.coef[i] + (evaluationNumber * result);
		return result;
	}

	public String convertToString(Polynomial polynome) {
			String polynomeString;
			polynomeString = polynome.coef[polynome.deg - 1] + "x^" + (polynome.deg - 1);
			
			for (int i = polynome.deg - 2; i > 0; i--) {
				if (polynome.coef[i] == 0)
					continue;
				else if (polynome.coef[i] > 0)
					polynomeString = polynomeString + " + " + (polynome.coef[i]);
				else if (polynome.coef[i] < 0)
					polynomeString = polynomeString + " - " + (-polynome.coef[i]);
				if (i == 1)
					polynomeString = polynomeString + "x";
				else if (i > 1)
					polynomeString = polynomeString + "x^" + i;
			}
			return (polynomeString);
		}
}