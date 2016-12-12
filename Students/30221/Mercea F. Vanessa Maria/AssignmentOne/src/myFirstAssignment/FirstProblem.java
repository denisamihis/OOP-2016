package myFirstAssignment;
import java.util.*;

public class FirstProblem { 
	
	public static void main(String[] args) {
		int sum=0;
		System.out.println("Give a number to find the sum of all 3 and 5 multiples below it.");
		Scanner input= new Scanner (System.in);
		int number=input.nextInt();
		input.close();
		for (int i=3; i<number; i++)
			if (i%3==0 || i%5==0) 
				sum=sum+i;
		System.out.println("The sum is equal to " + sum);
	}
	

}
