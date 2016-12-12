package palindrome;

public class Palindrome {
	public static void find(){ // Pt 3 cifre
		int sum=0, found;
		for(int i=999;i>100;i--){
			for(int j=999;j>100;j--)
				sum = i*j;
         found=palindromefind(sum);
         if(found==1)
        	 return;
		}
	}
	
	public static void find4num(){ // Pt 4 cifre
		int sum1=0, found;
		for(int i=9999; i>1000; i--){
			for(int j=9999; j>1000; j--)
				sum1= i*j;
		    found=palindromefind(sum1);
		    if(found==1)
		    	return;
		}
	}
	
	public static int palindromefind(int sum){ // Aici e functie care verifica dace produsul este un nr palindrom
		int temp, reverse=0, remainder;
		temp=sum;
		while(sum!=0){
			remainder= sum%10;
			reverse= reverse*10 + remainder;
			sum/=10;
		}
		if(temp == reverse){
			System.out.println(temp);
		return 1;
		}
		return 0;
	}

	public static void main(String[] args){
		System.out.println("Cel mai mare nr palindrome din produsul de numerele de 3 cifre");
		find();
		System.out.println("Cel mai mare nr palindrome din produsul de numerele de 4 cifre");
		find4num();

	}

}
