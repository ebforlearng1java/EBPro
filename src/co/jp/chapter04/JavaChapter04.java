package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		//配列（数組）
//		int a = 0;
//		//整形配列
//		int[] array = new int[] {1,2,3,4,5};
//		//文字列配列
//		String[] strArrahy = new String[] {"1","2","3","4","5"};
//
//		Object[] objArray = new Object[] {1,2,3.3,0,true};
//





//		//定義方式①　かつ　　初期化時値の設定
//		int[] intArray_1 = new int[] { 1, 2, 3, 4, 5, 6};
//		for (int i = 0; i < intArray_1.length; i++) {
//			System.out.println(intArray_1[i]);
//		}
//
//
//
		//Integer[] array1 = new Integer[5];
//		int[] array1 = new int[] {1,3,5,7,9};//②
//
//		array1[0] = 2;
//		array1[1] = 4;
//		array1[2] = 6;
//		array1[3] = 8;
//		array1[4] = 10;

		//2 4 6 8 10

//		int[] array1 = new int[100];
//
//		for (int i = 0; i<array1.length;i++) {
//
//			array1[i] = i+1;
//			System.out.println(array1[i] + ",");
//
			//array1[1]
			//array1[2]
			//array1[3]
			//array1[4]
			//array1[5] →ArrayIndexOutOfBoundsException
//		}




//		int[] array1 = new int[10];
//
//		for (int i = 0; i<array1.length;i++) {
//
//			if (i < (array1.length / 2)) {
//				array1[i] = (i + 1) * 2;
//			} else {
//				array1[i] = ((i - (array1.length / 2)) + 1) * 2 - 1;
//			}
//
//			System.out.println(array1[i]);
//		}
//
//
//



		String[] arrStr = new String[] {"H","E","L","L","O","W","O","R","L","D"};

		for (int i = 0; i<arrStr.length;i++) {

//			if (i < (arrStr.length / 2)) {
//				arrStr[i] = arrStr(i + 1) * 2;
//			} else {
//				arrStr[i] = arrStr((i - (arrStr.length / 2)) + 1) * 2 - 1;
//			}

			System.out.println(arrStr[i]);
		}


		//
		int[] arr1 = new int[5];
		int[][] arr2 = new int[5][5];

		int[][] arr2x2_1 = new int[][] {
				{1,2},
				{3,4}
		};




		int[][] arrA = new int[][] {
				{1,2},
				{3,4}
		};
		int[][] arrB = new int[][] {
				{5,6},
				{7,8}
		};
		int[][] arrC = new int[2][2] ;

		for (int i = 0; i < 2; i++) {


		}





	}

}
