
public class Polinom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Polynomial zero = new Polynomial(0, 0);
		 int s=4;		//scalarul
		 
	        Polynomial p1   = new Polynomial(4, 3);
	        Polynomial p2   = new Polynomial(3, 2);
	        Polynomial p3   = new Polynomial(2, 1);
	        Polynomial p4   = new Polynomial(1, 0);
	        Polynomial p    = p1.add(p2).add(p3).add(p4);   // 4x^3 + 3x^2 +2x+ 1
	        Polynomial q1   = new Polynomial(3, 2);
	        Polynomial q2   = new Polynomial(5, 0);
	        Polynomial q    = q1.add(q2);                     // 3x^2 + 5
	        Polynomial ad = p.add(q);
	        System.out.println("Suma polinoamelor este :" +ad);
	        Polynomial sb=p.substract(q);
	        System.out.println("Diferenta polinoamelor este:" +sb);
	        Polynomial ml=p.multiply(q);
	        System.out.println("Produsul polinoamelor este:" +ml);
	        Polynomial mls=p.multiplyScalar(s);
	        System.out.println("produsul polinomului cu scalarul este:"+mls);
	        int  e1=p.evaluate(5);
	        System.out.println("P(5):"+e1);
	        int e2=p.evaluate(2);
	        System.out.println("P(2):"+e2);
	        int e3=p.evaluate(9);
	        System.out.println("P(9):"+e3);
	       
	}

}
