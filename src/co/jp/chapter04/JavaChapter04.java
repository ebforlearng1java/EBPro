package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//int [] array1 = new Integer[5];


		//int [] array1 = new int [] {1,3,5,7,9};//②

		//array1[0] = 2;
		//array1[1] = 4;
		//array1[2] = 6;
		//array1[3] = 8;
		//array1[4] = 10;


		// 1, 3, 5,7, 9  2 4 6 8 10
		//2 4 6 8 10 1 3 5 7 9 結果
		//0 1 2 3 4 5 6 7 8 9 10 index

//		int[] array2 =  new int[10];

//    	String[] arrStr = new String[] {"H","E","L","L","O","W","O","R","L","D"};
//	    for (int i = 0; i < arrStr. length; i++) {
//			//
//	    	if (i < arrStr)
//		} else {array2[i] = (i - (array2. length / 2)) + 1;
//	    }
//		}
//		System.out.println(array2[i]);
//				}
//		int[] array1 =  new int[10];
//		for (int item : array1) {
//			System.out.println(item);
//		}
//
//		for (::) {
//			System.out.println()array[10];
//		}

		//
//		int[] arr1 = new int[5];
//		int[][] arr2 = new int[5][5];

		int[][] arrA = new int[][] {
			{1,2},
			{3,4}
		};
		int[][] arrB = new int[][] {
			{5,6},
			{7,8}
		};

		int[][] arrC = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arrC[i][j] = arrA[i][j] + arrB[i][j];
				System.out.println(arrC[i][j] + ",");
			}
			System.out.println();
		}





			//array1[1]
			//array1[2]
			//array1[3]
			//array1[4]
			//array1[5]


  }
}