package Assignmentunu;

public class Problemadoib {
	public static long SumaFib(long Limit) {
		if (Limit <= 1)
			return Limit;
		else
			return ;

	}

	public static void main(String[] args) {
		long Limit = 40, sumaNumerePare = 0, contor;
		for (contor = 0; contor <= Limit; contor++)
			if (Fibonacci(contor) % 2 == 0)
				sumaNumerePare = sumaNumerePare + Fibonacci(contor);
		System.out.println("Suma numerelor pare in Fibonacci este " + sumaNumerePare);
	}
}// O(logn)-am incercat sa fac recursiv da nicicum,am inteles ca e cv cu divide et impera,nu mai fac

