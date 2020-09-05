package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] array1 = new int[] {1,2,3,4};
		System.out.println(array1[0]);
		System.out.println(array1.length);

//		int[] array2 = new int[10];
//		System.out.println(array2[10]);

		int[][] array3 = new int[][] {
			{1,2,3,4},
			{21,22,23,24,25}
		};
		System.out.println(array3.length);

		// 問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		// 答え：array[0] = 0;array[1] = 0;array[2] = 0;array[3] = 0;
		int[] Array = new int[4];
		for(int i = 0;i< Array.length;i++) {

			// 配列arrayの各要素を出力する
			System.out.println("Array["+i+"]"+"="+Array[i]);
		}
		// 問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		// 答え：array[0]=5;array[1]=6;
			int[] Array_01 = new int[] {5,6};
			for(int i = 0;i< Array_01.length;i++) {

				// 配列arrayの各要素を出力する
				System.out.println("Array_01["+i+"]"+"="+Array_01[i]);
		}
		//	問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		// 答え：array[0][0] = 0;array[0][1] = 0;array[0][2] = 0;array[1][0] = 0;array[1][1] = 0;array[1][2] = 0;
			int[][] Array_02 = new int[2][3];
			for(int[] i:Array_02) {
				for(int j:i) {
				System.out.println(j);
				}
		}

		// 問題４︓以下２重Foreachを理解してください。

		//
		int[][] array2d = new int[4][2];

		// 循環の数を配列outの値に設定する
		for (int[]out : array2d) {

			// 循環の数をinnerに設定する
			for(int inner : out) {
				System.out.print(inner+",");
			}
		}

		System.out.println();
		// 問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小値をSystem.out.println()。
		// 答え：arrayの最大値はarray[4] = 100;arrayの最小値はarray[5] =0.
		int[] array_03 = new int[] {1, 3, 5, 7, 100, 0, 1};
		int max = 0;
		for(int i = 0;i<array_03.length;i++) {

			// 配列の値がmaxより大きい場合、当該値をmaxにセットする
			if (max<array_03[i]) {
				max = array_03[i];
			}
		}
		// 配列の最大値を出力する
		System.out.println("array_03の最大値は"+max);
		int min = 0;
		for(int i = 0;i<array_03.length;i++) {

			// 配列の値がminより小さい場合、当該値をminにセットする
			if (min>array_03[i]) {
				min = array_03[i];
			}
		}
		// 配列の最小値を出力する
		System.out.println("array_03の最小値は"+min);

		// 問題６︓問題１の配列のSUMを求める。
		// 答え：SUM = 0.
		int SUM = 0;
		for(int i = 0;i<Array.length;i++) {

			// 配列のSUMを求める
			SUM += Array[i];
		}
		// 配列のSUMを出力する
		System.out.println(SUM);

		// 問題７:行列（２次元配列）の和と積を計算してください。
		// 答え：下記行列（２次元配列）の和は57；積は160000.
		int sum = 0;
		int product = 1;
		// ２次元配列を定義する
		int[][] array_04 = new int[][]{{1,2,4,5},{2,8,10,25}};
		for(int i = 0;i < array_04.length;i++) {
			for(int j = 0;j<4;j++) {
				// 配列の和を求める
				sum += array_04[i][j];
				// 配列の積を求める
				product *= array_04[i][j];
			}
		}
		// 配列の和を出力する
		System.out.println(sum);
		// 配列の積を出力する
		System.out.println(product);
	}
}
