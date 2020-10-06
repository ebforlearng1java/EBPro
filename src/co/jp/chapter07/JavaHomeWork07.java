package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 	質問１
		// PetクラスでsetAgeメソッドがないので、コンパイルエラーが発生します。

		//　質問２
//		public class Math {
//
//			public static void main(String[] args) {
//				// TODO 自動生成されたメソッド・スタブ
//				int[] input = new int[] {5,10,4,6,1,14};
//				System.out.println(max(input));
//				System.out.println(min(input));
//				System.out.println(average(input));
//			}
//
//
//			//配列のMAX値の取得処理
//				public static int max(int[] input) {
//					int max = 0;
//					for (int i = 0; i < input.length; i++) {
//						if (input[i] > max) {
//							max = input[i];
//						}
//					}
//					return max;
//				}
//
//				//配列のMIN値の取得処理
//				public static int min(int[] input) {
//					int min = input[0];
//					for (int i = 0; i < input.length; i++) {
//						if (input[i] < min) {
//							min = input[i];
//						}
//					}
//					return min;
//		}
//				//配列の平均値の取得処理
//						public static int average(int[] input) {
//							int sum =0;
//							for (int i = 0; i < input.length; i++) {
//								sum += input[i];
//								}
//							int average = sum/input.length;
//							return average;
//							}
//
//				}

		//　質問3
		// Matrixクラスを呼び出し
		int[][] data = {{1,2},{4,5}};
		Matrix matrix = new Matrix(data);
		matrix.add(matrix);
		}




	}


