package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問1
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// 偶数の場合
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		// 2550を出力する。
		System.out.println(sum);

		// 質問2
		int a = 1;
		for (int i = 1; i <= 5; i++) {
			a = a * i;
		}
		// 120を出力する。
		System.out.println(a);

		// 質問3
		int[] array1 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		// 最大値の初期値をarray5[0]に設定する。
		int max = array1[0];
		// 最小値の初期値をarray5[0]に設定する。
		int min = array1[0];
		// 和の初期値を設定する
		double sum1 = 0;
		// 平均値の初期値を設定する
		double average = 0;

		for (int i = 0; i < array1.length; i++) {
			// 最大値の初期値より大きいの場合、max値をarray5[i]に再設定します。
			if (array1[i] > max) {
				max = array1[i];
			}
			// 最小値の初期値より小さいの場合、min値をarray5[i]に再設定します。
			if (array1[i] < min) {
				min = array1[i];
			}
			sum1 = sum1 + array1[i];
			average = sum1 / array1.length;
		}
		System.out.println("配列の最大桁値は" + max);
		System.out.println("配列の最小桁値は" + min);
		System.out.println("配列の和は" + sum1);
		System.out.println("配列の平均値は" + average);

		// 質問4
		// 配列の値はすべて後ろの値に比較する。
		// 比較例、array1[0]と(array1[1]~array1[7])、array1[1]と(array1[2]~array1[7])、array1[2]と(array1[3]~array1[7]).....array1[6]とarray1[7].
		for (int i = 0; i < array1.length - 1; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					System.out.println(array1[i]);
				}
			}
		}

		// 質問5
		// インデックスは３を出力する。
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 7) {
				System.out.println(i);
			}
		}

		// 質問6　減を求める。
		int[][] array2 = new int[][] {
				{ 10, 23 },
				{ 31, 40 },
		};
		int[][] array3 = new int[][] {
				{ 5, 6 },
				{ 7, 8 }
		};
		int[][] arrC = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arrC[i][j] = array2[i][j] - array3[i][j];
				System.out.print(arrC[i][j] + ",");
			}
			System.out.println();
		}

		// 質問7
		int[] array4 = new int[] { 1, 4, 3, 7, 5, 2 };
		int b = 0;
		for (int i = 0; i < array4.length; i++) {
			for (int j = 0; j < array4.length - 1; j++) {
				// 前の要素の値は後ろの要素の値がより大きい場合、前の要素の値と後ろの要素の値の両方位置を交換する。
				if (array4[j] > array4[j + 1]) {
					// 前の要素の値が一時に格納する
					b = array4[j];
					// 後ろの要素（小さいの値）を前の要素に設定する。
					array4[j] = array4[j + 1];
					// 一時に格納したの前の要素の値を後ろの要素に設定する。
					array4[j + 1] = b;
				}
			}
		}
		// array4の要素は昇順で出力する。（1 2 3 4 5 7 ）
		for (int i = 0; i < array4.length; i++) {
			System.out.print(array4[i] + " ");
		}

		System.out.println("-----------------------------------");

		// 質問8
		int[][] array5 = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				// 下の三角のみを出力する。
				if (i >= j) {
					// 各行の第一番と最後の要素は”１”を設定する。
					if (j == 0 || i == j) {
						array5[i][j] = 1;
					} else {
						array5[i][j]=array5[i-1][j-1]+array5[i-1][j];
					}
					System.out.print(array5[i][j]+"\t");
				}
			}
			System.out.println();
		}
	}
}
