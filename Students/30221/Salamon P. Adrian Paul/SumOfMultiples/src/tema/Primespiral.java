package tema;

public class Primespiral {
	public static boolean prim(int numar) {
		int potentialDivizor;
		boolean estePrim = true;
		for (potentialDivizor = 2; potentialDivizor < numar / 2 + 1; potentialDivizor++)
			if (numar % potentialDivizor == 0) {
				estePrim = false;
				break;
			}

		return estePrim;
	}

	public static int cateElementeSuntPrimeDePeDiagonale(int strat) {
		int coltDreaptaJos, coltDreaptaSus, coltStangaJos, coltStangaSus, rezultatFunctie = 0;

		coltDreaptaJos = (2 * strat + 1) * (2 * strat + 1);
		coltStangaJos = coltDreaptaJos - strat * 2;
		coltStangaSus = coltStangaJos - strat * 2;
		coltDreaptaSus = coltStangaSus - strat * 2;
		if (prim(coltDreaptaJos))
			rezultatFunctie++;
		if (prim(coltStangaJos))
			rezultatFunctie++;
		if (prim(coltStangaSus))
			rezultatFunctie++;
		if (prim(coltDreaptaSus))
			rezultatFunctie++;
		return rezultatFunctie;
		

	}

	public static void main(String[] args) {
		int numereTotaleDePeDiagonale = 5, numerePrimeDePeDiagonale = 3, strat = 1;
		while ((float) numerePrimeDePeDiagonale / (float) numereTotaleDePeDiagonale > 0.1) {
			strat++;
			numereTotaleDePeDiagonale += 4;
			numerePrimeDePeDiagonale += cateElementeSuntPrimeDePeDiagonale(strat);

		}
		System.out.println(strat * 2 + 1);

	}

}
