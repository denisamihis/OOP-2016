package tema_matrix;

public class Calcul {
	private final int m;
	private final int n;
	private final int[][] data;

	public Calcul(int m, int n) {
		this.m = m;
		this.n = n;
		data = new int[m][n];

	}

	public Calcul(int[][] data) {
		m = data.length;
		n = data[0].length;
		this.data = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				this.data[i][j] = data[i][j];
	}
	public void show() {
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" "+data[i][j]);
			}
			System.out.println();
		}

	}
	public Calcul add(Calcul B) {
		Calcul A = this;
		if (B.m != A.m || B.n != A.n)
			System.out.println("Cannot add");
		Calcul C = new Calcul(m, n);
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				C.data[i][j] = A.data[i][j] + B.data[i][j];
		System.out.println("Add: ");
		return C;
	}

	public Calcul sub(Calcul mat1) {
		Calcul mat = this;
		if (mat1.m != mat.m || mat1.n != mat.n)
			System.out.println("Cannot subtract");
		Calcul ans = new Calcul(m, n);
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				ans.data[i][j] = mat.data[i][j] - mat1.data[i][j];
		System.out.println("Subtract: ");
		return ans;
	}
	public Calcul multiplication(Calcul mat1) {
		Calcul mat = this;
		if (mat.n != mat1.m)
			System.out.println("cannot multiplications");
		Calcul ans = new Calcul(mat.m, mat1.n);
		for (int i = 0; i < ans.m; i++)
			for (int j = 0; j < ans.n; j++)
				for (int k = 0; k < mat.n; k++)
					ans.data[i][j] += (mat.data[i][k] * mat1.data[k][j]);
		System.out.println("Multiplication: ");
		return ans;
	}

}
