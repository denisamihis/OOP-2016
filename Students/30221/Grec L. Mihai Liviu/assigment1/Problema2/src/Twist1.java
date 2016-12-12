
public class Twist1 {
	
		
	
	public static void main(String[] args) {
		int a,b,c;
		int suma=2;
		b=2;
		c=1;
		a=b+c;
		while (a<4000000){
			a=b+c;
			if (a%2==0){
				suma+=a;
			}
			c=b;
			b=a;
		}
		System.out.print("Suma este="+suma);
	}

}
