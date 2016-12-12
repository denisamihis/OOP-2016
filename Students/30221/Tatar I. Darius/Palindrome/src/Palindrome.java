
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 0;
		for (int i =999;i>10;i--){
			for (int j=999;j>10;j--){
				int product=i*j;
				StringBuilder sb1 = new StringBuilder(""+product);
                String sb2 = ""+product;
                sb1.reverse();
                if(sb2.equals(sb1.toString()) && val<product) {
                    val = product;
			}
		}
	}
		System.out.println(val);
	}

}
