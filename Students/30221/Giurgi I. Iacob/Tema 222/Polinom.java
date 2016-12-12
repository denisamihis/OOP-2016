
public class Polinom {
    public int deg;
    public int [] coef;
	public Polinom(int a,int b) // a*x^b
	{
		coef = new int[b+1];
        coef[b] = a;
        deg = degree();
	}
	
	public int degree()
	{
		int d=0;
		for(int i=0;i<coef.length;i++)
			if(coef[i]!=0) d=i;
		return d;
	}

    public Polinom plus(Polinom b) {
        Polinom a = this;
        Polinom c = new Polinom(0, Math.max(a.deg, b.deg));
        for (int i = 0; i <= a.deg; i++) c.coef[i] += a.coef[i];
        for (int i = 0; i <= b.deg; i++) c.coef[i] += b.coef[i];
        c.deg = c.degree();
        return c;
    }

 
    public Polinom minus(Polinom b) {
        Polinom a = this;
        Polinom c = new Polinom(0, Math.max(a.deg, b.deg));
        for (int i = 0; i <= a.deg; i++) c.coef[i] += a.coef[i];
        for (int i = 0; i <= b.deg; i++) c.coef[i] -= b.coef[i];
        c.deg = c.degree();
        return c;
    }

  
    public double evaluate(double x,int []coef)
	
	  {
		double result = coef[0];
	    int exponent = 1;
	      for (int i=1;i<coef.length;i++)
	      {
	          result += coef[i]*Math.pow(x,exponent);
	          exponent++;
	      }
	      return result;
	  
	  }
 
    public Polinom aB(Polinom b) {     //inmultire de polinoame
        Polinom a = this;
        Polinom c = new Polinom(0, a.deg + b.deg);
        for (int i = 0; i <= a.deg; i++)
            for (int j = 0; j <= b.deg; j++)
                c.coef[i+j] += (a.coef[i] * b.coef[j]);
        c.deg = c.degree();
        return c;
    }
    
    public Polinom scalarM(int s)
    {   Polinom p2= new Polinom(0,0);
    	for (int i = 0; i <=deg ; i++)
    	{	coef[i] =coef[i]*s;
    	    Polinom p1 = new Polinom (coef[i],i);
    	    p2=p2.plus(p1);
    	}
    			return p2;
    	
    }
    public  void afisare(int coef[],int deg) {
        if (deg ==  0) System.out.println( "\n"+coef[0]);
        if (deg ==  1) System.out.println (coef[1] + "x + " + coef[0]);
        String pol="Polinomul este: ";
        for (int i = deg-1; i >=0; i--) {
            if      (coef[i] == 0) continue;
            else if (coef[i]  > 0) pol = pol + " + " + ( coef[i]);
            else if (coef[i]  < 0) pol = pol + " - " + (-coef[i]);
            if      (i == 1) pol = pol + "x";
            else if (i >  1) pol = pol + "x^" + i;
        } 
        System.out.println(pol);
    }
  /*  public static void main(String[] args) { 
    Polinom zero = new Polinom(0, 0);

    Polinom p1   = new Polinom(4, 3);
    Polinom p2   = new Polinom(3, 2);
    Polinom p3   = new Polinom(1, 0);
    Polinom p4   = new Polinom(2, 1);
    Polinom p    = p1.plus(p2).plus(p3).plus(p4);   // 4x^3 + 3x^2 + 1

    Polinom q1   = new Polinom(3, 2);
    Polinom q2   = new Polinom(5, 0);
    Polinom q    = q1.plus(q2);                     // 3x^2 + 5



    System.out.println("zero(x) =     " + zero);
    System.out.println("p(x) =        " + p);
    System.out.println("q(x) =        " + q);

} */
}








