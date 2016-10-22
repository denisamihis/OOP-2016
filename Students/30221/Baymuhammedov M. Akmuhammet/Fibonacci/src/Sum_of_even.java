
public class Sum_of_even {

	public static int sum(){
		int fibo=0, term1=0, term2=1, sum=0, i=2;
		
		do{
			i++;
			fibo=term1 + term2;
			term1=term2;
			term2=fibo;
			System.out.println(fibo); //printare numarele fibonacci
			if(fibo%2==0)
			sum+=fibo;
		}while(i>2 && fibo<4000000);
		return sum;
	}
	public static void main(String[] args) {
		int sumeven=0;
		sumeven=sum();
		System.out.println("Sum of even nr:");
		System.out.println(sumeven); // summa numerele even(divisible la 2)

	}

}
