package co.jp.chapter07;

public class Math {

	//配列のMax値を求めるメソッド
	public static int max(int[] datas) {
		if (datas == null || datas.length == 0) {
			return 0;
		}
		int max = datas[0];
		for (int item : datas) {
			if (max < item) {
				max = item;
			}
		}
		return max;
	}

	//配列のMin値を求めるメソッド
	public static int min(int[] datas) {
		if (datas == null || datas.length == 0) {
			return 0;
		}
		int min = datas[0];
		for (int item : datas) {
			if (min > item) {
				min = item;
			}
		}
		return min;
	}

	//配列の平均値を求めるメソッド
	public static int ave(int[] datas) {
		if (datas == null || datas.length == 0) {
			return 0;
		}

		int sum = 0;
		for (int item : datas) {
			sum = sum + item;
		}
		int ave = sum / datas.length;

		return ave;
	}

}
