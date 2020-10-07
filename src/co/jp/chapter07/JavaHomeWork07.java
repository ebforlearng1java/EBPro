package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1:以下コードのコンパイルエラー理由を教えてください。
		//A1:メソッドsetAge(int)は型Petで未定義です.(キャストをcatに追加する必要がある)
		//setAge(int)を作成するか、setName(string型)に変更するか
		//cat.setAge(1234); が　cat.setName("1234");　に変更すればエラー解決できます。


//		// Pet.java
//		public class Pet {
//			public String name;
//
//			public void setName(String value) {
//				this.name = value;
//			}
//		}
//		// Kicker.java
//		public class Kicker {
//			public static void main(String... args) {
//				Pet cat = new Pet();
//				cat.setAge(1234);
//			}
//		}

		//Q2:Math クラスを作成してください。以下メソッドを定義します・
		//Q2-1:配列のMAXを求める静的メソッドを定義(引数はint配列)
		//Q2-2:配列のMINを求める静的メソッドを定義(引数はint配列)
		//Q2-3:配列の平均値を求める静的メソッドを定義(引数はint配列)
		//Q2-4:mainメソッドで上記それぞれメソッドを呼び出してください。

		//A2-1,2,3のコードは以下のようになる(Mathクラスも同じものになります)
//		package co.jp.chapter07;
//		public class Math {
//			//A2:
//			public static int max(int[] input) {
//				int max2=input[0];
//				for(int i=0;i<input.length;i++) {
//					if(max2 <input[i]) {
//						max2=input[i];
//					}
//				}
//				return max2;
//			}
//			public static int min(int[] input) {
//				int min2=input[0];
//				for(int i=0;i<input.length;i++) {
//
//					if(min2 >input[i]) {
//						min2=input[i];
//					}
//				}
//				return min2;
//			}
//			public static int ave(int[] input) {
//				int sum2=0;
//				for(int i=0;i<input.length;i++) {
//					sum2 += input[i];
//				}
//				return sum2/input.length;
//			}
//		}


		int[] data1 = new int[] {1,5,9,3,7};

		Math math = new Math();

		System.out.println(Math.max(data1));
		System.out.println(Math.min(data1));
		System.out.println(Math.ave(data1));


		//Q2-5:行列計算、2D行列クラスのコンストラクタには1配列引数設定してください。
		//A2-5:以下のようになります

		int[][] data2 = new int[][] {{1,2},{3,4}};
		int[][] data3 = new int[][] {{5,6},{7,8}};

		Matrix matrix2 = new Matrix(data2);
		Matrix matrix3 = new Matrix(data3);

		matrix2.add(matrix3);

//		package co.jp.chapter07;
//
//		public class Matrix {
//
//			private int[][] data;
//
//			public Matrix(int[][] data) {
//				this.data = data;
//			}
//
//			public Matrix() {
//				// TODO 自動生成されたコンストラクター・スタブ
//			}
//
//			public int[][] data() {
//				return data;
//			}
//
//			//	// 行列 ADD
//			public Matrix add(Matrix b) {
//				Matrix c = new Matrix();
//				c.data[0][0] = this.data[0][0] + b.data[0][0];
//				c.data[0][1] = this.data[0][1] + b.data[0][1];
//				c.data[1][0] = this.data[1][0] + b.data[1][0];
//				c.data[1][1] = this.data[1][1] + b.data[1][1];
//				return c;
//			}
//
//		}


	}


}
