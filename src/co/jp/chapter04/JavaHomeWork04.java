package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/**04 配列 */
		//問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		//答え：
		int[] array1 = new int[4];
		System.out.println("array1の各要素の値は 0 です。");
		array1[0] = 3;
		array1[1] = 23;
		array1[2] = 17;
		array1[3] = 6;
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//答え：
		int[] array2 = new int[] { 5, 6 };
		System.out.println("array2[0]の値は 5 です。");
		System.out.println("array2[1]の値は 6 です。");

		//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		//答え：
		int[][] array3 = new int[2][3];
		System.out.println("array3の各要素の値は 0 です。");
		array3[0] = new int[] { 8, 23, 12 };
		array3[1] = new int[] { 35, 2, 45 };
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				System.out.println(array3[i][j]);
			}
		}

		//問題４︓以下２重Foreachを理解してください。
		int[][] array2d = new int[4][2];
		for (int[] out : array2d) {
			for (int inner : out) {
				System.out.println(inner);
			}
		}
		//答え：外部のForは array2dの4つ一次元配列によって、ループを実施する
		//内部のForは outに設定した一次元配列の2つ項目によって、ループを実施する
		//結果はarray2dの８つ要素の値を出力する

		//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小桁値をSystem.out.println()。
		//答え：
		int[] array4 = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int max = array4[0];
		int min = array4[0];
		for (int item : array4) {
			if (max < item) {
				max = item;
			}
			if (min > item) {
				min = item;
			}
		}
		System.out.println("最大值：" + max);
		System.out.println("最小值：" + min);

		//問題６︓問題１の配列のSUMを求める。
		//答え：
		int sum = 0;
		for (int item : array1) {
			sum = sum + item;
		}
		System.out.println("array1のSUM値：" + sum);

		//問題７︓行列（２次元配列）の和と積を計算してください。
		//答え：
		int a[][] = new int[][] {
				{ 5, 12 },
				{ 56, 3 }
		};
		int b[][] = new int[][] {
				{ 45, 2 },
				{ 52, 33 }
		};
		int c[][] = new int[2][2];

		System.out.println("行列（２次元配列）の和：");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] += a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("行列（２次元配列）の積：");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
