
final public class Matrix {
    private int rows;             
    private int cols;             
    private  int[][] data;
    public Matrix(int [][]dat)
    {
    	data=dat;
    	rows=dat.length;
    	cols=dat[0].length;
    }
    public Matrix(int nrow,int ncol)
    {
    	rows=nrow;
    	cols=ncol;
    	data=new int[rows][cols];
    }
    public int getRows()
    {
    	return rows;
    }
    public int getCols()
    {
    	return cols;
    }
    public int getData(int row,int col)
    {
    	return data[row][col];
    }
    public void setData(int row,int col,int value)
    {
    	data[row][col]=value;
    }
    public void type() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) 
                System.out.printf("%d ", data[i][j]);
            System.out.println();
        }
    }
    

}