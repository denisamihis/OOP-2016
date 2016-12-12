
public class Palindrom3 {
	
	public static boolean verificarePalindrom(int numar){
		int vectorCifre[]=new int[6];
		int copie=numar;
		int contor=5;
		while (copie!=0){
			vectorCifre[contor]=copie%10;
			copie/=10;
			contor--;
		}
		for (contor=0;contor<=2;contor++)
			if (vectorCifre[contor]!=vectorCifre[5-contor])
				return false;
			return true;
		
	}

	public static void main(String[] args) {
		int k=0;
		int numar=999999;
		while (k==0) {
			if (verificarePalindrom(numar)){
				for (int divizor=999;divizor>99;divizor--)
					if (numar%divizor==0 && numar/divizor>99 && numar/divizor<1000){
						k=1;
						System.out.println(divizor);
						}
				
			}
			if (k==1)
				System.out.print(numar);
			numar--;
		}
		
	}

}
