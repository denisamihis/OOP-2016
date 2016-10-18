package p1;

public class TestPolynomials {
	public static void main(String[] args){
	Polynomials p1 = new Polynomials(-17,3,0,3,-2,0,2,-4,5); 
	Polynomials p2 = new Polynomials(1,0,-2,4);
	Functions add = new Functions();
	Polynomials resultAdd = new Polynomials();
	resultAdd = add.ADD(p1, p2);
	System.out.println(resultAdd.toString());
	Polynomials resultSub = new Polynomials();
	resultSub = add.SUBSTRACT(p1, p2);
	System.out.println(resultSub.toString());
	Polynomials resultMul = new Polynomials();
	resultMul = add.MULTIPLY(p1, p2);
	System.out.println(resultMul.toString());
	Polynomials resultMulScal = new Polynomials();
	resultMulScal = add.MUL_SCAL(p1, 3);
	System.out.println(resultMulScal.toString());
	System.out.println("p2(2)=" + add.EVAL(p2, 2));
	}
}
