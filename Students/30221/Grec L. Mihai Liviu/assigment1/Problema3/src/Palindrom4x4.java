
public class Palindrom4x4 {
	public static boolean verificarePalindrom(int numar){
		int vectorCifre[]=new int[8];
		int copie=numar;
		int contor=7;
		while (copie!=0){
			vectorCifre[contor]=copie%10;
			copie/=10;
			contor--;
		}
		for (contor=0;contor<=3;contor++)
			if (vectorCifre[contor]!=vectorCifre[7-contor])
				return false;
			return true;
		
	}

	public static void main(String[] args) {
		
		int palindromMaxim=9999999;
		int div1=999;
		int div2=999;
		for (int divizor1=9999;divizor1>999;divizor1--){
			for (int divizor2=9999;divizor2>999;divizor2--){
				if (verificarePalindrom(divizor1*divizor2)){
					if (divizor1*divizor2>palindromMaxim){
						palindromMaxim=divizor1*divizor2;
						div1=divizor1;
						div2=divizor2;
				}
			}
		}
	}
		System.out.println("Divizor1"+"\t"+"Divizor2"+"\t"+"Palindrom");
		System.out.println(div1+"\t"+div2+"\t"+palindromMaxim);
	}
}
