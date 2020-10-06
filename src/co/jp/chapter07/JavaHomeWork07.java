package co.jp.chapter07;

public class JavaHomeWork07 {
	/**07 OOP - その１ */

	//	質問１︓以下コードのコンパイルエラー理由を教えてください。
	//	// Pet.java
	//	public class Pet {
	//	 public String name;
	//
	//	 public void setName(String value) {
	//	 this.name = value;
	//	 }
	//	}
	//	// Kicker.java
	//	public class Kicker {
	//	 public static void main(String...args) {
	//	 Pet cat = new Pet();
	//	 cat.setAge(1234);
	//	 }
	//	}
	//　答え：setAgeメソッドがPet.javaで未定義。

	//	質問２︓Mathクラスを作成してください。以下メソッドを定義します。
	//	1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
	//	2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
	//	3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
	//	4. mainメソッドで上記それぞれメソッドを呼び出してください。
	//	以下はメソッドの定義のソースの抜枠です。
	//	public class Math {
	//		 public static int max(int[] input) {
	//		 //...
	//		 }
	//	}
	//  答え：Match.javaに1－3のメソッドを作成して、このクラスのmainメソッドで呼び出している。

	//	2.行列計算。2D行列クラスのコンストラクタには１配列引数設定してください。
	//	public class Matrix {
	//		 private final int[][] data;
	//		 /** construct method */
	//		 public Matrix(int[][] data) {
	//		 this.data = data;
	//		 }
	//		 // 行列 ADD
	//		 public Matrix add(Matrix b) {
	//		 //....
	//		 return ???
	//		 }
	//		}
	//  答え：Matrix.javaにaddメソッドを作成して、このクラスのmainメソッドで呼び出している。

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };

		System.out.println("配列のMAX値：" + Math.max(array1));
		System.out.println("配列のMIN値：" + Math.min(array1));
		System.out.println("配列の平均値：" + Math.ave(array1));

		int[][] array21 = new int[][] {
				{ 5, 12 },
				{ 56, 3 }
		};
		int[][] array22 = new int[][] {
				{ 45, 2 },
				{ 52, 33 }
		};

		Matrix a = new Matrix(array21);
		Matrix b = new Matrix(array22);

		Matrix c = a.add(b);
		System.out.println("行列計算:");
		for (int[] array : c.getData()) {
			for (int item : array) {
				System.out.print(item+",");
			}
			System.out.println();
		}
	}

}
