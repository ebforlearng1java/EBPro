package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		// 配列（数組）
//		int a = 0;
//		int [] array = new int [] {1,2,3,4,5};
//		// 文字列配列
//		String[] strArrahy = new String[] {"1","2","3","4","5"};
//
//		//特殊な配列
//		Object[] objArray = new Object[] {1,"333",1.1,1f};
//
//		//　定義方式①　宣言　かつ　初期化
//		int[] intArray_1 =new int[] {11,22,33,44,55,66};
//		for (int index = 0; index < intArray_1.length; index++) {
//			System.out.println(intArray_1[index]);
//		}
//
//		//　定義方式③　宣言　かつ　長さ定義のみ
//		int[] intArray_2 =new int[4];
//		for (int index = 0; index < intArray_2.length; index++) {
//			System.out.println(intArray_2[index]);
//		}
//
//		Integer[] intArray_3 =new Integer[4];
//		for (int index = 0; index < intArray_3.length; index++) {
//			System.out.println(intArray_3[index]);
//		}

		//Integer[] array = new Integer[5]; // ①
		//int[] array = new int[] {1,3,5,7,9};// ②
//		array[0] = 2;
//		array[1] = 4;
//		array[2] = 6;
//		array[3] = 8;
//		array[4] = 10;
		int[] array = new int[10];
		for (int i = 0;i<array.length; i++) {
			if (i<(array.length/2)) {
				array[i] = i*2+2;
			} else {
				//array[i] = (i-array.length/2+1)*2-1;
				array[i] =array[i-array.length/2] -1;
			}

			System.out.println(array[i]);


			//array[i+i]の場合
			// array[1]
			// array[2]
			// array[3]
			// array[4]
			// array[5] java.lang.ArrayIndexOutOfBoundsException

		}
		int[] array1 = new int[10];  //
		for (int item : array1) {
			System.out.println(item);
	}
		int[][] array2 = new int[5][5];
		int[][] array3 = new int[][] {
			{1,2},
			{3,4}
		};

		for (int i = 0; i < array3.length; i ++) {
			for (int  j= 0; j < array3[i].length; j++) {
				System.out.println(array3[i][j] + ",");
			}
			System.out.println();
		}
		String[] arrStr=new String[] {"H","E","L","L","O","W","O","R","L","D"};
		for(int i=0;i<arrStr.length;i++) {
			if(i<arrStr.length/2) {
				arrStr[i]=arrStr[i*2];
			}else {
				arrStr[i]=arrStr[((i-(arrStr.length/2))+1)*2-1];
			}
			System.out.println(arrStr[i]);
		}


		int[][] array4 = new int[][] {
			{1,2},
			{3,4}
		};
		int[][] array5 = new int[][] {
			{5,6},
			{7,8}
		};
		int [][] arrC = new int[2][2];

		for (int i = 0 ;i <2; i++) {
			for (int j =0; j<2; j++) {
				arrC[i][j] = array4[i][j] + array5[i][j];
				System.out.print(arrC[i][j] + ",");
			}
			System.out.println();
		}
	}
}
