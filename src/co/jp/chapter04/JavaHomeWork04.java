package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {

		//04 配列
		//問題①
		int[] array = new int[4];

		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;

		//問題2
		int[] array1 = new int[2];
		array1[0] = 5;
		array1[1] = 6;

		//問題3
		int[][] array2 = new int[2][3];
		int array3[][] = { { 0, 1 }, { 0, 1, 2 } };

		//質問5
		int[] array5 = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int Max = array5[0];
		int Min = array5[0];

		for (int i = 1; i < array5.length; i++) {
			if (Max < array5[i]) {
				Max = array5[i];
			} else if (Min > array5[i]) {
				Min = array5[i];

			}
			System.out.println("最大値→" + Max);
			System.out.println("最小値→" + Min);

		}
		//問題6
		int[] numbers = { 1, 2, 3, 4 };
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		System.out.println("合計→" + sum);

	}

}
