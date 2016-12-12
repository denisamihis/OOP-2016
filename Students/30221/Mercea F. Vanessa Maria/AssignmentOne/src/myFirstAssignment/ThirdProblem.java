package myFirstAssignment;

public class ThirdProblem {

	public static int palindrome(int number) {
		int reversed=0,auxiliar=number;
		while (auxiliar>0) {
			reversed=reversed*10+auxiliar%10;
			auxiliar=auxiliar/10;
		}
		if (reversed==number) 
			return 1;
		else
			return 0;
	}
	 
	public static void main(String[] args) {
		int foundLargest=0,i=999,j=999,product=1,largest=0,lowerLimit=900,termOne=0,termTwo=0;
		while (foundLargest==0 && i>=lowerLimit) {
			j=999;
			while (foundLargest==0 && j>=lowerLimit) {
				product=i*j;
				if (product>largest && palindrome(product)==1) {
					largest=product;
					termOne=i;
					termTwo=j;
					foundLargest=1;	
				}
				j--;
			}
			i--;
			if (i==lowerLimit && j==lowerLimit && foundLargest==0)
				lowerLimit=lowerLimit-100;
		}
		System.out.println("Largest palindrome is "+largest+", obtained by multiplying "+termOne+" by "+termTwo);
	}
	
}
