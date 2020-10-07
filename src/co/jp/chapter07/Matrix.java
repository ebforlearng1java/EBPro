package co.jp.chapter07;

public class Matrix {

	private int[][] data;

	public Matrix(int[][] data) {
		this.data = data;
	}

	public Matrix() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public int[][] data() {
		return data;
	}

	//	// 行列 ADD
	public Matrix add(Matrix b) {
		Matrix c = new Matrix();
		c.data[0][0] = this.data[0][0] + b.data[0][0];
		c.data[0][1] = this.data[0][1] + b.data[0][1];
		c.data[1][0] = this.data[1][0] + b.data[1][0];
		c.data[1][1] = this.data[1][1] + b.data[1][1];
		return c;
	}

}
