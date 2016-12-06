package Polinom;

public class TestPolinom {
	
		// functia de conversie am luat-o de pe google
		public static int[] stringConvert (String string) {
	 		String[] parts = string.split(" ");
	 		int[] array = new int[parts.length];
	 		int i = 0; int j = parts.length-1;
	 		
	 		for (i = 0; i < parts.length; i++) {
	 			array[j] = Integer.parseInt(parts[i]);
	 			j--;
	 		}
	 		return array;
	 	}
		 
public static void main(String[] args) {
	String polinomString ="+5 -4 2 0 -2 3 0 3 -17";
	Polinom p1 = new Polinom (stringConvert (polinomString));
	p1.creare();
	String polinomString2 ="4 -2 0 1";
	Polinom p2 = new Polinom (stringConvert (polinomString2));
	p2.creare();
	System.out.println( p1.creare());
	System.out.println( p2.creare());
	String command = "add";
	int val;
	if (command.contains(" ")) 
	{
		String[] parts = command.split(" ");
		command = parts[0];
		val = Integer.parseInt(parts[1]);
	 }			
	 switch (command) {
			case "Add": 
				Polinom add =add.Add(p1,p2);
				System.out.println( add.creare());
				break;
	 		case "Substract":
	 			Polinom substract =substract.Substract(p1,p2);
				System.out.println( substract.creare());
				break;
	 		case "Multiply":
	 			Polinom multiply =multiply.Multiply(p1,p2);
				System.out.println( multiply.creare());
				break;
	 		case "Mul_scal":
	 			Polinom mul_scal1 =mul_scal1.Mul_scal(val,p1);
				System.out.println( mul_scal1.creare());
				Polinom mul_scal2 =mul_scal1.Mul_scal(val,p2);
				System.out.println( mul_scal2.creare());
				break;
	 		case "Eval":
	 			Polinom eval1=eval1.Eval(value,p1);
				System.out.println( eval1.creare());
				Polinom eval2=eval2.Eval(value,p1);
				System.out.println( eval2.creare());
				break;
	 			}
}
}
