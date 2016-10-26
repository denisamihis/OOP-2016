package assigment2;

	
public class Polynomial {
    private int[] coef;  
    private int degree;     

    // a * x^b
    public Polynomial( int[] coef) {
        this.coef=coef;
       this.degree=coef.length;
    }


   

    // return c = a + b
   /* public Polynomial plus(Polynomial b) {
        Polynomial a = this;
        Polynomial c = new Polynomial(0, Math.max(a.degree, b.degree));
        for (int i = 0; i <= a.degree; i++) c.coef[i] += a.coef[i];
        for (int i = 0; i <= b.deg; i++) c.coef[i] += b.coef[i];
        c.deg = c.degree();
        return c;
    }

    // return (a - b)
    public Polynomial minus(Polynomial b) {
        Polynomial a = this;
        Polynomial c = new Polynomial(0, Math.max(a.deg, b.deg));
        for (int i = 0; i <= a.deg; i++) c.coef[i] += a.coef[i];
        for (int i = 0; i <= b.deg; i++) c.coef[i] -= b.coef[i];
        c.deg = c.degree();
        return c;
    }

    // return (a * b)
    public Polynomial times(Polynomial b) {
        Polynomial a = this;
        Polynomial c = new Polynomial(0, a.deg + b.deg);
        for (int i = 0; i <= a.deg; i++)
            for (int j = 0; j <= b.deg; j++)
                c.coef[i+j] += (a.coef[i] * b.coef[j]);
        c.deg = c.degree();
        return c;
    }
*/
   




   

    
    // convert to string representation
    public  String convert(int degree,int[] coef) {
        if (degree ==  0) return "" + coef[0];
        if (degree ==  1) return coef[1] + "x + " + coef[0];
        String s = coef[degree] + "x^" + degree;
        for (int i = degree-1; i >= 0; i--) {
            if      (coef[i] == 0) continue;
            else if (coef[i]  > 0) s = s + " + " + ( coef[i]);
            else if (coef[i]  < 0) s = s + " - " + (-coef[i]);
            if      (i == 1) s = s + "x";
            else if (i >  1) s = s + "x^" + i;
        }
        return s;
    }

    // test client
   /* public static void main(String[] args) { 
        Polynomial zero = new Polynomial(0, 0);

        Polynomial p1   = new Polynomial(4, 3);
        Polynomial p2   = new Polynomial(3, 2);
        Polynomial p3   = new Polynomial(1, 0);
        Polynomial p4   = new Polynomial(2, 1);
        Polynomial p    = p1.plus(p2).plus(p3).plus(p4);   // 4x^3 + 3x^2 + 1

        Polynomial q1   = new Polynomial(3, 2);
        Polynomial q2   = new Polynomial(5, 0);
        Polynomial q    = q1.plus(q2);                     // 3x^2 + 5


        Polynomial r    = p.plus(q);
        Polynomial s    = p.times(q);
        Polynomial t    = p.compose(q);

        StdOut.println("zero(x) =     " + zero);
        StdOut.println("p(x) =        " + p);
        StdOut.println("q(x) =        " + q);
        StdOut.println("p(x) + q(x) = " + r);
        StdOut.println("p(x) * q(x) = " + s);
        StdOut.println("p(q(x))     = " + t);
        StdOut.println("0 - p(x)    = " + zero.minus(p));
        StdOut.println("p(3)        = " + p.evaluate(3));
        StdOut.println("p'(x)       = " + p.differentiate());
        StdOut.println("p''(x)      = " + p.differentiate().differentiate());
   }

}*/
}