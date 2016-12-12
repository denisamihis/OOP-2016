package lab1;

public class FibonacciEvenSum {

	public static void main(String[] args)  {
		int first = 0, second = 1, next, sum;
		sum = 0;
		for (next = first + second; next < 4000000; next = first + second){
			if (next%2 == 0)
				sum += next;
			first = second;
			second = next;
		}
		System.out.println("And the sum is: "+sum);

	}

}