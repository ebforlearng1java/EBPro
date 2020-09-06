package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//05の質問3の答え

		int[] array5 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
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
		//
		int[] numbers = { 1, 2, 6, 7, 9, 6, 2, 1 };
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		System.out.println("合計→" + sum);
		System.out.println("平均値→" + sum / array5.length);
		System.out.println("平均値→" + (float) sum / (float) array5.length);

		//05の質問5の答えはindexは0から数えるので、"7"は第３列
		//05の質問6答え
		int[][] x = { { 5, 6 }, { 3, 4 } };
		int[][] y = { { 1, 7 }, { 8, 2 } };
		int[][] z = sum(x, y);
		for (int i = 0; i < x.length; i++) {

			for (int n = 0; n < x[i].length; n++) {
				System.out.println(z[i][n]);
			}

		}
	}

	private static int[][] sum(int[][] x, int[][] y) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	private static int[][] addMatrix(int[][] x2, int[][] y2) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
