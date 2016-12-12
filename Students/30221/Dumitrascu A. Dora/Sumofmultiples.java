package assignment1_1;
import java.util.Scanner;

public class Sumofmultiples {
	public static void main(String args[]){
		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num=in.nextInt();
		int i;
		for(i=1;i<num;i++){
			if(i%3==0 || i%5==0){
				sum=sum+i;
			}
		}
		System.out.println("The sum of natural numbers below "+num+" that are multiples of 3 or 5 is: "+sum);
	}
	
	

}
