package assignment1_2;

public class Fibonacci {
	public static void main(String args[]){
		long a,b,c,sum=2; //the three numbers from which we will generate the Fibonacci sequence
		a=1; b=2;c=0;
		while(c<4000000){
			c=a+b;
			a=b;
			b=c;
			if(c%2==0)
				sum=sum+c;
		}
		System.out.println("The sum of the even terms: "+sum);
	}

}
