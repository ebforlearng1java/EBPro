package co.jp.chapter04;

public class JavaHomework04_Q5 {


	//質問５：int[] array = new int[] {1,3,5,7,100,0,1};左の配列の最大値と最小桁値をSystem.out.println()。

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 5, 7, 100, 10, 1 };
		int max = 0;
		int min = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}

		}
		System.out.println(max);
		System.out.println(min);
	}
}
