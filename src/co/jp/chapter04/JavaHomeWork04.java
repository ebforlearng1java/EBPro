package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//問題１:int[] array = new int[4]; 各要素の値を記載してください。
		//答え：
//		array[0] = 0;
//		array[1] = 0;
//		array[2] = 0;
//		array[3] = 0;


		//問題２:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//答え：
//		array[0] = 5;
//		array[1] = 6;


		//問題３:int[][] array = new int[2][3]; 各要素の値を記載してください。
		//答え：
//		array[0][0] = 0;
//		array[0][1] = 0;
//		array[0][2] = 0;
//		array[1][0] = 0;
//		array[1][1] = 0;
//		array[1][2] = 0;


		//問題４:以下２重Foreachを理解してください。
//		 int[][] array2d = new int[4][2];
//
//		 for (int[] out : array2d) {
//		  for (int inner : out) {
//		  System.out.println(inner);
//		  }
//		 }

		//答え：
		//上記の2重Foreach文は配列array2dの各要素がアクセスできます。（方式１）
		//下記のFor文も配列の各要素がアクセスできます。（方式２）

//		for(int i = 0;i <array2d.length;i++) {
//			for(int j = 0;j <array2d[i].length;j++) {
//				System.out.println(array2d[i][j]);
//			}
//		}

		//問題５:int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		//左の配列の最大値と最小値をSystem.out.println()。

		//答え：
		//最大値をプリントする。
//		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
//		int max = array[0];
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] > max) {
//				max = array[i];
//			}
//		}
//		System.out.println(max);
//
//		//最小値をプリントする。
//		int[] array1 = new int[] {1, 3, 5, 7, 100, 0, 1};
//		int min = array1[0];
//		for(int i = 0; i < array1.length; i++) {
//			if(array1[i] < min ) {
//				min = array1[i];
//			}
//		}
//		System.out.println(min);

		//問題６:問題１の配列のSUMを求める。
//		int[] array = new int[4];
//
//		int sum = 0;
//		for(int i = 0; i < array.length;i++) {
//			sum = sum + array[i];
//		}
//		System.out.println(sum);


		//問題７:行列（２次元配列）の和と積を計算してください。
		int[][] a = new int[][] {
									{2,4,3},
									{4,4,1},
									{4,7,3}
								};

		int[][] b = new int[][] {
									{1,2,3},
									{1,2,3},
									{2,1,2}
								};

		int[][] c = new int[3][3];

		//和を計算する
		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.print((c[i][j] = a[i][j] + b[i][j])+"\t");
			}
			System.out.println();
		}

		//積を計算する
		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.print((c[i][j] = a[i][j] * b[i][j])+"\t");
			}
			System.out.println();
		}

	}

}
