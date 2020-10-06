package co.jp.chapter07;

public class Matrix {

	private int[][] data;

	/** construct method */

	public Matrix() {
	}

	public Matrix(int[][] data) {
		this.data = data;
	}

	//行列計算
	public Matrix add(Matrix b) {
		Matrix c = new Matrix();

		c.data = new int[b.data.length][b.data[0].length];
		for (int i = 0; i < b.data.length; i++) {
			for (int j = 0; j < b.data[i].length; j++) {
				c.data[i][j] += this.data[i][j] + b.data[i][j];
			}
		}
		return c;
	}

	public int[][] getData() {
		return data;
	}

}
