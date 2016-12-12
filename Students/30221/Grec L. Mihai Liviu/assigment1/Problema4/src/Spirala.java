public class Spirala {
	public static int[][] construireMatriceSpirala(int dimensiune){
		int rezultat[][]=new int[dimensiune][dimensiune];
		int numar=dimensiune*dimensiune;
		int sus=0;
		int jos=dimensiune-1;
		int stanga=0;
		int dreapta=dimensiune-1;
		while (numar>0){
			for (int indice=dreapta;indice>=stanga;indice--){
				rezultat[jos][indice]=numar;
				numar--;
			}
			jos--;
			for (int indice=jos;indice>=sus;indice--){
				rezultat[indice][stanga]=numar;
				numar--;
			}
			stanga++;
			for (int indice=stanga;indice<=dreapta;indice++){
				rezultat[sus][indice]=numar;
				numar--;
			}
			sus++;
			for (int indice=sus;indice<=jos;indice++){
				rezultat[indice][dreapta]=numar;
				numar--;
			}
			dreapta--;
		}
		return rezultat;
	}public static boolean prim(int numarVerificat)
	{
		int indice;
		if (numarVerificat==1) return false;
		if (numarVerificat%2==0) return false;
		for (indice=3;indice*indice<=numarVerificat;indice+=2)
			if (numarVerificat%indice==0) return false;
		return true;
	}
	public static void main(String[] args) {
		int matrice[][]=new int[10000][10000];
		int dimensiune=3;
		int test=0;
		int prime=0;
		int total=0;
		while (test==0){
			matrice=construireMatriceSpirala(dimensiune);
			for (int rand=0;rand<dimensiune;rand++)
				for (int coloana=0;coloana<dimensiune;coloana++){
					if (rand==coloana){
						if (prim(matrice[rand][coloana])){
							prime++;
							total++;
						}
						else
							total++;
					}
					if (rand+coloana==dimensiune-1){
						if (prim(matrice[rand][coloana])){
							prime++;
							total++;
						}
						else
							total++;
					}
					
				}
			total--;
			if (10*prime<total){
				test=1;
				System.out.print("Dimensiunea este="+dimensiune);
			}
			else
				dimensiune+=2;
		}

	
	
	}
}
