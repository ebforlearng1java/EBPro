package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		// 配列 (数組)
		//		int a = 0;
		//
		//		// 整形配列
		//		int[] array = new int[] { 1, 2, 3, 4, 5 };
		//		// 文字列配列
		//		String[] strArray = new String[] { "1", "2", "3", "4", "5" };
		//
		//		//特殊な配列
		//		Object[] objArray = new Object[] { 1, "333", 1.1, 1f, true };
		//
		//		// 定義方式② 宣言   かつ   初期化時値を設定
		//		int[] intArray_1 = new int[] { 55, 22,33,11, 22, 555 };
		//		for (int index = 0; index < intArray_1.length; index++) {
		//			System.out.println(intArray_1[index]);
		//		}
		//
		//
		//		int[] intArray_2 = new int[] { 1, 2,3,4, 5, 565 };
		//
		//		for (int index = 0; index < intArray_2.length; index++) {
		//			System.out.println(intArray_2[index]);
		//		}
		//
		//		//  定義方式① 宣言 かつ 長さ定義のみ
		//		int[] intArray_3 = new int[4];
		//		for (int index = 0; index < intArray_3.length; index++) {
		//			System.out.println(intArray_3[index]);
		//		}
		//
		//		Integer[] intArray_4 = new Integer[4];
		//		for (int index = 0; index < intArray_4.length; index++) {
		//			System.out.println(intArray_4[index]);
		//		}

		//		Integer[] array1 = new Integer[5];
		//		int[] array1 = new int[] { 1, 3, 5, 7, 9 };// ②

		//		array1[0] = 2;
		//		array1[1] = 4;
		//		array1[2] = 6;
		//		array1[3] = 8;
		//		array1[4] = 10;

		// array1[1]
		// array1[2]
		// array1[3]
		// array1[4]
		// array1[5] → ArrayIndexOutOfBoundsException

		// 1, 3, 5, 7, 9  → 2 4 6 8 10

		// 2 4 6 8 10 1 3 5 7 9 結果
		// 0 1 2 3 4  5 6 7 8 9 index

		//		String[] arrStr = new String[] {"H","E","L","L","O","W","O","R","L","D"};
		//		for (int i = 0; i < arrStr.length; i++) {
		//			//
		//			if (i < (arrStr.length / 2)) {
		//				arrStr[i] = arrStr[(i) * 2];
		//			} else {
		//				arrStr[i] = arrStr[((i - (arrStr.length / 2))+1)*2 -1] ;
		////				array1[i] = array1[i - array1.length / 2] -1;
		//			}
		//			System.out.print(arrStr[i]);
		//		}

		//		int[] array1 = new int[10];// index 0~99
		//		for (int item : array1) {
		//			System.out.println(item);
		//		}

		//		for (;;) {
		//			System.out.println(array1[0]);
		//		}

		//
		int[] arr1 = new int[5];
		int[][] arr2 = new int[5][5];

		//		for (int i = 0;i<arr2x2_1.length;i++) {
		//			for (int j = 0;j<arr2x2_1[i].length;j++) {
		//				System.out.print(arr2x2_1[i][j]+",");
		//			}
		//			System.out.println();
		//		}
		int[][] arrA = new int[][] {
				{ 1, 2 },
				{ 3, 4 }
		};
		int[][] arrB = new int[][] {
				{ 5, 6 },
				{ 7, 8 }
		};

		int[][] arrC = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arrC[i][j] = arrA[i][j] * arrB[i][j];
				System.out.print(arrC[i][j] + ",");
			}
			System.out.println();
		}

	}

}
