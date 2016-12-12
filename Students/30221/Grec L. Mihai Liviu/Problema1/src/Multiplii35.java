
public class Multiplii35 {

	public static void main(String[] args) {
		int suma=0;
		int numar=1000;
		int contor=3;
		while (contor<numar){
			if (contor%3==0 || contor%5==0){
				suma+=contor;
			}
			contor++;
		}
		System.out.print("Suma este:"+suma);
	}
	

}
