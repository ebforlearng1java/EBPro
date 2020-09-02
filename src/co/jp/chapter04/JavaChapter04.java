package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 配列 (数組)
		int a = 0;

		// 整形配列
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		// 文字列配列
		String[] strArray = new String[] { "1", "2", "3", "4", "5" };

		//
		Object[] objArray = new Object[] { 1, "333", 1.1, 1f, true };

		// 定義方式① 宣言   かつ   初期化時値を設定
		int[] intArray_1 = new int[] { 55, 22,33,11, 22, 555 };
		for (int index = 0; index < intArray_1.length; index++) {
			System.out.println(intArray_1[index]);
		}


		int[] intArray_2 = new int[] { 1, 2,3,4, 5, 565 };

		for (int index = 0; index < intArray_2.length; index++) {
			System.out.println(intArray_2[index]);
		}

		//  定義方式② 宣言 かつ 長さ定義のみ
		int[] intArray_3 = new int[4];
		for (int index = 0; index < intArray_3.length; index++) {
			System.out.println(intArray_3[index]);
		}

		Integer[] intArray_4 = new Integer[4];
		for (int index = 0; index < intArray_4.length; index++) {
			System.out.println(intArray_4[index]);
		}

	}

}
