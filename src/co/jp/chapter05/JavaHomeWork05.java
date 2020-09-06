package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/**ーーーーーーーーーーーーーーーーー05 新米８問ーーーーーーーーーーーーーーーーー */

		//設問１：1から100までの偶数の和を求める(for + if)。
		//回答：1から100までの偶数の和：2550。
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			}
		}
		System.out.println("質問１　：1から100までの偶数の和：" + sum1);

		//設問２：5の階乗を求める(for)。
		//回答：5の階乗：120。
		int factorial = 1;
		for (int i = 1; i <= 5; i++) {
			factorial = factorial * i;
		}
		System.out.println("質問２　：5の階乗：" + factorial);

		//質問３：配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		//回答：最大值：9、最小值：1、和：34、平均値：4。
		int[] array3 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int max = array3[0];
		int min = array3[0];
		int sum3 = 0;
		int count = 0;
		for (int target : array3) {
			if (max < target) {
				max = target;
			}
			if (min > target) {
				min = target;
			}
			sum3 += target;
			count++;
		}

		System.out.println("質問３　：配列 {1, 2, 6, 7, 9, 6, 2, 1} の");
		System.out.println("最大值：" + max);
		System.out.println("最小值：" + min);
		System.out.println("和　　：" + sum3);
		System.out.println("平均値：" + sum3 / count);

		//質問４：質問３の配列に重複ある要素を探す（要素の表示次数集計必要なし）。
		//回答：array1に重複ある要素：1、2、6。
		array3 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		System.out.println("質問４　array1に重複ある要素：");
		for (int i = 0; i < array3.length - 1; i++) {
			for (int j = i + 1; j < array3.length; j++) {
				if (array3[i] == array3[j]) {
					System.out.println(array3[i]);
				}
			}
		}

		//質問５：質問３の配列に値「７」のインデックスを求む。
		//回答：配列に値7のインデックス：3。
		array3 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		System.out.println("質問５　配列に値7のインデックス：");
		for (int i = 0; i < array3.length; i++) {
			if (array3[i] == 7) {
				System.out.println(i);
			}
		}

		//質問６：任意行列（２次元配列）の和を求める。
		//回答：行列（２次元配列）の和：66 88 
		//								110 132

		int a[][] = new int[][] {
				{ 11, 22 },
				{ 33, 44 }
		};
		int b[][] = new int[][] {
				{ 55, 66 },
				{ 77, 88 }
		};
		int c[][] = new int[2][2];

		System.out.println("質問６　任意行列（２次元配列）の和：");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] += a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		//質問７：配列を昇順でソートする（java.util等メソッド利用禁止）。
		//回答：配列の昇順：1 3 5 6 6 7 8 9。
		int[] array7 = new int[] { 6, 5, 7, 3, 8, 1, 9, 6 };
		for (int i = 0; i < array7.length - 1; i++) {
			for (int j = 0; j < array7.length - 1 - i; j++) {
				if (array7[j] > array7[j + 1]) {
					int temp = array7[j];
					array7[j] = array7[j + 1];
					array7[j + 1] = temp;
				}
			}
		}

		System.out.print("質問７　配列の昇順：");
		for (int i = 0; i < array7.length; i++) {
			System.out.print(array7[i] + " ");
		}
		System.out.println();

		//質問８：LV10のパスカルの三角形を出力してください。
		//回答：
		System.out.println("質問８　LV10のパスカルの三角形：");
		int row = 10;

		// 2次元配列準備
		int[][] pascal = new int[row][row];

		//インデックス[i][0]と[i][i]の要素の値を1を与えます
		for (int i = 0; i < row; i++) {
			pascal[i][0] = pascal[i][i] = 1;
		}

		// パスカルの2行目から、要素値は上の直近の要素値の和になります。
		for (int i = 2; i < pascal.length; i++) {
			for (int j = 1; j < pascal[i].length - 1; j++) {
				pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
			}
		}
		for (int i = 0; i < pascal.length; i++) {

			// jの要素ごとに二つの半角スペースを入れる
			for (int j = 0; j < pascal.length - 1 - i; j++) {
				System.out.print("  ");
			}

			// 配列の各要素の間に二つの半角スペースを入れ、かつ"%-2d"のフォーマットで出力する
			for (int j = 0; j <= i; j++) {
				System.out.print("  ");
				System.out.printf("%-2d", pascal[i][j]);
			}
			// 行を変える
			System.out.println();
		}

	}

}
