package matrixOp;

import java.math.BigDecimal;

public class Main {
	
	public static void main(String[] args) {
		
	    InputOutput inputOutput = new InputOutput();
	    MatrixOperations matrixOp=new MatrixOperations();
	    
	    BigDecimal[][] matrixA,matrixB,matrixC;
	    BigDecimal determinant;
	    
	    matrixA=inputOutput.readMatrix();
	    matrixB=inputOutput.readMatrix();
	    
	    matrixC=matrixOp.add(matrixA, matrixB);
	    inputOutput.printMatrix(matrixC);
	    
	    matrixC=matrixOp.substract(matrixA, matrixB);
	    inputOutput.printMatrix(matrixC);
	    
	    matrixC=matrixOp.multiply(matrixA, matrixB);
	    inputOutput.printMatrix(matrixC);
	    
	    matrixC=matrixOp.multiplyScalar(matrixA, BigDecimal.valueOf(10));
	    inputOutput.printMatrix(matrixC);
	    
	    determinant=matrixOp.determinant(matrixA);
	    
	    if (matrixOp.areEqual(matrixA, matrixB)) 
	    	System.out.println("Equal");
	    else
	    	System.out.println("Not Equal");
	    
	    if (matrixOp.isZeroMatrix(matrixA))
	    	System.out.println("is zero");
	    else
	    	System.out.println("not zero");
	    
	    if (matrixOp.isIdentityMatrix(matrixA))
	    	System.out.println("is identity");
	    else
	    	System.out.println("not identity");
	    
	   System.out.println("Fill degree of matrix A is " + matrixOp.fillDegree(matrixA));
	}
	
}
