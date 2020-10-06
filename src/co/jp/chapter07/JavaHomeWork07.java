package co.jp.chapter07;

public class JavaHomeWork07 {

	//質問１︓以下コードのコンパイルエラー理由を教えてください。
	//public class Pet {
		//public String name;
		//public void setName(String value) {
		//this.name = value;
		//}
		//}
		// Kicker.java
		//public class Kicker {
		//public static void main(String...args) {
		//Pet cat = new Pet();
		//cat.setAge(1234);✖⇒cat.setName(1234);
		//}
		//}


	//質問２︓Mathクラスを作成してください。以下メソッドを定義します。

	public static int max(int[] datas) {

		int max = datas[0];
        for(int i = 0; i < datas.length; i++) {
        	if(datas[i] > max) {
        	max = datas[i];
        	}
        	}
		return max;
	}
		public static int min(int[] datas) {

			int min = datas[0];
			for(int i = 0; i < datas.length; i++) {
	        	if(datas[i] < min) {
	        	min = datas[i];
	        	}
	        	}
			return min;
		}
		
		public static double avg(int[] datas) {
	
			int sum = datas[0];
			int m = 1;
	        for(int i = 1; i < datas.length; i++) {
	        	sum += datas[i];
	        	m++;
	        	}
			double avg = sum/m;
			return avg;

}
		
		
		
		
		

		public static void main(String[] args) {
		System.out.println("質問2");
		int[] datas = new int[] {1, 2, 3, 4, 5,6,7,8,9};
		
		System.out.println("平均" + avg(datas));
		System.out.println("MAXは" + max(datas));
		System.out.println("MINは" + min(datas));
		
		
		
		}
		
		
		
		
		//2.行列計算。2D行列クラスのコンストラクタには１配列引数設定してください。
		
				
		public class Matrix {
			private final int[][] data;
			public Matrix(int[][] data) {
				this.data = data;
		}
		public Matrix add(Matrix b) {
			Matrix c = new Matrix(data);
			c.data[0][0] = this.data[0][0] + b.data[0][0];
			c.data[0][1] = this.data[0][1] + b.data[0][1];
			c.data[1][0] = this.data[1][0] + b.data[1][0];
			c.data[1][1] = this.data[1][1] + b.data[1][1];
			return c;
			}
		
		
		
}
}

