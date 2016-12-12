package assignment1_3;

public class Palindrome {
	public static void main(String args[]){
		int i,j;
		for(i=999;i>=100;i--){
			for(j=999;j>=100;j--){
				if(isPalindrome(i*j)){
					System.out.println("The largest palindrome made from the product of 3-digit numbers is: "+i*j+"="+i+"x"+j);
					break;
				}
			}
			if(isPalindrome(i*j))
				break;		
		}
		
	}
	
	public static boolean isPalindrome(int num){//method that returns if a given number is a palindrome
		int h=0,num1; //we will create the reversed number in this variable
		num1=num;
		while(num1>0){
			h=h*10+num1%10;
			num1=num1/10;
		}
		if(h==num)
			return true;
		else return false;
	}

}
