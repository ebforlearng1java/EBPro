package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/**ーーーーーーーーーーーーーーーーー04 配列ーーーーーーーーーーーーーーーーー */

		// 問題１：int[] array = new int[4]; 各要素の値を記載してください。
		// 回答：array1[0] = 0、array1[1] = 0、array1[2] = 0、array1[3] = 0。
		int[] array1 = new int[4];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array[" + i + "] = " + array1[i]);
		}

		// 問題２：int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		// 回答：array2[0] = 5、array2[1] = 6。
		int[] array2 = new int[] { 5, 6 };
		for (int i = 0; i < array2.length; i++) {
			System.out.println("array2[" + i + "] = " + array2[i]);
		}

		// 問題３：int[][] array = new int[2][3]; 各要素の値を記載してください。
		// 回答：array3[0][0] = 0;array3[0][1] = 0;array3[0][2] = 0;array3[1][0] = 0;array3[1][1] = 0;array3[1][2] = 0;
		int[][] array3 = new int[2][3];
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				System.out.println("array3[" + i + "][" + j + "] = " + array3[i][j]);
			}
		}

		// 問題４：以下２重Foreachを理解してください。
		int[][] array2d = new int[4][2];
		for (int[] out : array2d) {//for (int out = 0; out < array2d.length; out++) {
			for (int inner : out) {//for (int inner = 0; inner < array2d[out].length; inner++) {
				System.out.println(inner);
			}
		}
		//回答：外部のForは 4回のループを実施
		//		内部のForは 外部のForのループごとに、2回のループを実施
		//		結果：array2dは８つ要素の値を出力

		// 問題５：int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小値をSystem.out.println()。
		// 回答：最大値：100、最小値：0。
		int[] array5 = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int max = array5[0];
		int min = array5[0];
		for (int target : array5) {
			if (max < target) {
				max = target;
			}
			if (min > target) {
				min = target;
			}
		}
		System.out.println("最大值：" + max);
		System.out.println("最小值：" + min);

		// 問題６：問題１の配列のSUMを求める。
		// 回答：問題１の配列のSUM値は0。
		int SUM = 0;
		for (int i = 0; i < array1.length; i++) {
			SUM += array1[i];
		}
		System.out.println("問題１の配列のSUM値:" + SUM);

		// 問題７：行列（２次元配列）の和と積を計算してください。
		// 回答：和は10、積は24。
		int sum = 0;
		int product = 1;
		int[][] array7 = new int[][] { { 1, 2 }, { 3, 4 } };
		for (int[] i : array7) {//for (int i = 0; i < array7.length; i++) {
			for (int j : i) {//for (int j = 0; j < array7[i].length; j++) {
				sum += j;//sum += array7[i][j];
				product *= j;//product *= array7[i][j];
			}
		}
		System.out.println("和：" + sum);
		System.out.println("積：" + product);

	}

}
