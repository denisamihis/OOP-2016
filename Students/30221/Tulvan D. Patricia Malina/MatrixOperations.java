/*
 Am incercat sa fac cu BigDecimal dar nu mi-a iesit
 Am presupus ca mai bine iti las varianta care merge 
 */
import java.util.Arrays;

public class MatrixOperations {
	
	private Integer nrRows, nrCol;
	
	public MatrixOperations(){
		nrRows=3;
		nrCol=3;
	}

	public static void add (Integer matrix1[][],Integer matrix2[][], Integer matrix3[][], Integer nrRows,Integer nrCol){
		Integer row,column;
		for(row=0;row<nrRows;row++)
			for(column=0;column<nrCol;column++)
				matrix3[row][column]=matrix1[row][column]+matrix2[row][column];
		
	}
	public static void substract (Integer matrix1[][],Integer matrix2[][], Integer matrix3[][], Integer nrRows,Integer nrCol){
		Integer row,column;
		for(row=0;row<nrRows;row++)
			for(column=0;column<nrCol;column++)
				matrix3[row][column]=matrix1[row][column]-matrix2[row][column];
	}
	
	public static void multiply(Integer matrix1[][],Integer matrix2[][], Integer matrix3[][], Integer nrRows,Integer nrCol){
		Integer row,column;
		for(row=0;row<nrRows;row++)
			for(column=0;column<nrCol;column++)
				matrix3[row][column]=matrix1[row][0]*matrix2[0][column]+ matrix1[row][1]*matrix2[1][column]+matrix1[row][2]*matrix2[2][column];
	}
	
	public static void multiplyScalar(Integer matrix[][],Integer scalar,Integer nrRows,Integer nrCol){
		Integer row,column;
		for(row=0;row<nrRows;row++)
			for(column=0;column<nrCol;column++)
				matrix[row][column]=scalar*matrix[row][column];
	}
	
	public static Integer determinant(Integer matrix[][]){
		Integer det;
		det=matrix[0][0]*matrix[1][1]*matrix[2][2]+ matrix[1][0]*matrix[2][1]*matrix[0][2]+matrix[2][0]*matrix[0][1]*matrix[1][2]-
			matrix[0][2]*matrix[1][1]*matrix[2][0]- matrix[1][2]*matrix[2][1]*matrix[0][0]-matrix[2][2]*matrix[0][1]*matrix[1][0];
		return det;
	}
	
	public static boolean areEqual(Integer matrix1[][],Integer matrix2[][],Integer nrRows,Integer nrCol){
		Integer row,column;
		for(row=0;row<nrRows;row++)
			for(column=0;column<nrCol;column++)
				if(matrix1[row][column]!=matrix2[row][column])
					return false;
		return true;
	}
	
	public static boolean isZeroMatrix(Integer matrix[][],Integer nrRows,Integer nrCol){
		Integer row,column;
		for(row=0;row<nrRows;row++)
			for(column=0;column<nrCol;column++)
				if(matrix[row][column]!=0)
					return false;
		return true;
	}
	
	public static boolean isIdentifyMatrix(Integer matrix[][],Integer nrRows,Integer nrCol){
		Integer row,column;
		for(row=0;row<nrRows;row++)
			for(column=0;column<nrCol;column++)
				if(row==column){
					if(matrix[row][row]!=1)
						return false;
				}
				else
					if(matrix[row][column]!=0)
						return false;
		return true;
				
	}
	
	public static void fillDegree(Integer matrix[][],Integer nrRows,Integer nrCol){
		Integer row,column,notZero=0,fillD;
		for(row=0;row<nrRows;row++)
			for(column=0;column<nrCol;column++)
				if(matrix[row][column]!=0)
					notZero++;
		fillD=(notZero/9)*100;
		System.out.printf("The fill degree is: %d", fillD);
	}
	
	public static void main(String[] args) {
		MatrixOperations var= new MatrixOperations();
		Integer matrix1[][]= new Integer [][]{
			{1,2,1},
		    {1,1,1},
		    {3,1,0}
		};
		Integer matrix2[][]= new Integer [][]{
			{9,8,7},
		    {6,5,4},
		    {3,2,1}
		};
		Integer matrix3[][]= new Integer [][]{
			{0,0,0},
		    {0,0,0},
		    {0,0,0}
		};
		add(matrix1,matrix2,matrix3,var.nrRows,var.nrCol);
		System.out.println(Arrays.deepToString(matrix3));
		Integer d;
		d=determinant(matrix1);
		System.out.println(+d);
		fillDegree(matrix1,var.nrRows,var.nrCol);
	}

}
