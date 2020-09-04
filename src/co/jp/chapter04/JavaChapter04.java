package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		//配列の初期化
//		int[] array1 = new int[4];//{0,0,0,0} int 型の配列を初期化する（個数=4）
//		int[] array2 = new int[] {1,2,3,4};
//
//		System.out.println(array1[1]);
//		System.out.println(array2[3]);
//
//		//要素のアクセス、配列の変数名[インデックス]
//		//★配列の先頭要素のindexは0です。
//		int[] array3 = new int[] {1,2,3,4};
//		System.out.println(array3[0]);
//
//		int[] array4 = new int[5];
//		System.out.println(array4[0]);

		//ArrayIndexOutOfBoundsException
		//指定された配列おサイズを超える要素をアクセスする時、例外を発生します。

//		int[] array5 = new int[3];
//		System.out.println(array5[3]);

		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		//Index 3 out of bounds for length 3 at EBPro/co.jp.chapter04.JavaChapter04.main(JavaChapter04.java:26)

//		int[] array6 = new int[] {1,2,3,4};
//		System.out.println(array6.length);//array6.length = 4
//
		//配列の各要素をアクセスする
		//方法１：配列の各要素をアクセスする for

//		int[] array7 = new int[] {5,6,7,8};
//		for(int i = 0;i<array7.length; i++) {
//			System.out.println(array7[i]);
//		}

		//理解する手順
//		int[] array = new int[] {3,6,2,8,9};
//		System.out.println("配列の第一位要素は" + array[0]);
//		System.out.println("配列の長さは" + array.length);
//		System.out.println("配列の最後の要素は" + array[array.length - 1]);
		//配列の各要素のインデックスは、0,1,2,3...array.length-1

		//方法２：配列の各要素をアクセスする。拡張For文
		//for(配列の型名 変数名 : 配列名){}

//		int[] array = new int[] {8,2,6,4};
//		for(int x : array) {
//			System.out.println(x);
//		}

		//#######################20200902 授業メモ#######################
		//int[] array = new int[] {1,3,5,7,9};

//		int[] array = new int[5];
//		array[0] = 1;
//		array[1] = 3;
//		array[2] = 5;
//		array[3] = 7;
//		array[4] = 9;

//		int[] array1 = new int[10];
//
//		//0,1,2,3,4, 5,6,7,8,9 インデックス
//		//2,4,6,8,10,1,3,5,7,9 値
//
//		for(int i = 0;i <array1.length;i++) {
//			if(i< array1.length/2) {
//				array1[i] = (i + 1) *2;
//
//			}else {
//				//array1[i] = (i - (array1.length/2) +1)*2 -1;
//				array1[i] = array1[(i-array1.length/2)]-1;
//			}
//			System.out.print(array1[i] + " ");
//
//	}
//
//		int[] array2 = new int[10];
//		for(int item : array2) {
//			System.out.println(item);
//		}
//
//		int[][] array3 = new int[][] {
//			{1,2},
//			{3,4}
//		};
//
//		for(int i = 0;i < array3.length;i++) {
//			for(int j = 0;j < array3[i].length; j++ ){
//				System.out.print(array3[i][j] + ",");
//			}
//			System.out.println();
//		}

//		int[][] arrA = new int[][] {
//			{1,2},
//			{3,4}
//		};
//
//		int[][] arrB = new int[][] {
//			{5,6},
//			{7,8}
//		};
//
//		int[][] arrC = new int[2][2];
//
//		for(int i = 0;i < 2;i++) {
//			for(int j = 0;j < 2; j++) {
//				arrC[i][j] = arrA[i][j] + arrB[i][j];
//				System.out.print(arrC[i][j] + ",");
//			}
//			System.out.println();
//		}


		int[][] arr2 = new int[][] {
			{1,2,3,4},
			{21,22,23,24}
		};
		System.out.println(arr2.length);

		int[][] arr3 = new int[4][];
		arr3[0] = new int[] {1,2,3,4,5};
		arr3[1] = new int[] {1,2,3,4,5};
		arr3[2] = new int[] {1,2,3,4,5};
		arr3[3] = new int[] {1,2,3,4,5};

	}

}
