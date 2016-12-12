package myFirstAssignment;

public class SecondProblem {
 
	public static void main(String[] args) {
		int first=1,second=1,third=2,sum=0;
		while (third<4000000) {
			third=first+second;
			if (third%2==0)
					sum=sum+third;
			first=second;
			second=third;
		}
		System.out.println("The sum of even-valued numbers in the Fibbonacci sequence below 4000000 is " +sum);
	}//O(n)
	
	
}
