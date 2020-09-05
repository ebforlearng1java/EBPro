package co.jp.chapter04;

import java.lang.reflect.Array;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 配列（数组）
//		int a = 0;
//		//数字
//		int[] array = new int[] {1,2,3,4,5};
//		//文字列
//		String[] strArray = new String[] {"1","2","3","4","5"};
//		//オブジェクト
//		Object[] objArray = new Object[] {"1",2,3,true};
//
//
//
//
//		//定義方式1、宣言かつ初期化
//		int[] array1 = new int[] {1,2,3,4,5};
//		for (int i = 0; i < array1.length; i++ ) {
//			System.out.println(array1[i]);
//		}
//
//		//定義方式２、宣言かつ長さ定義のみ
//		int[] array2 = new int[5] ;

//		int[] array = new int[] {1,3,5,7,9};
//		for(int i =0; i< array.length; i++) {
//			
//			System.out.println(array[i]);
//		int[] array1 = new int[100];
//		for(int i = 0; i < array1.length; i++) {
//			
//			array1[i] = i+1;
//			System.out.println(array1[i]);
//			
//		
//		}
//		
//		int[] array1 = new int[10];
//		for(int i = 0; i < array1.length; i++) {
//			if(i<5) {
//				array1[i] = (i+1)*2;	
//			}
//			else {
////				array1[i] = ((i - (array1.length/2))+1)*2-1;
//				array1[i] = array1[i-array1.length/2]-1;
//			}
//			System.out.println(array1[i]);
//			
//		}
//		array1[5] = array1[5-10/2]-1;
//		System.out.println(array1[5]);

//		int[] array1 = new int[] { 1, 2 };// index 0~10
//		for (int item : array1) {
//			System.out.println(item);
//		}

//		int [][] arr = new int[5][5]

//		String[] arrStr = new String[] { "H", "E", "L", "L", "O", "W", "O", "R", "L", "D" };
//		for (int i = 0; i < arrStr.length; i++) {
//			if (i < (arrStr.length / 2)) {
//				arrStr[i] = arrStr[i * 2];
//			} else {
//				arrStr[i] = arrStr[((i - (arrStr.length / 2)) + 1) * 2 - 1];
////						arrStr[i] = arrStr[i-array1.length/2]-1;
//			}
//			System.out.println(array1[i]);
//		}
		int[] arr1= new int[5];
		int[][] arr2 = new int [5][5];
		int[][] arr2x2_1 = new int[][] {
			{1,2},
			{3,4}
		};
		for(int i = 0; i<arr2x2_1.length;i++) {
			for(int j = 0; j <arr2x2_1[i].length;j++) {
				System.out.print(arr2x2_1[i][j] + ",");
			}
			System.out.println();
		}
		
//		int[][] arrA = new int[][] {
//			{1,2},
//			{3,4}
//		};
//		int[][] arrB = new int[][] {
//			{5,6},
//			{7,8}
//		};
//		
//		int[][] arrC = new int[2][2];
//		
//		for(int i =0; i<2 ; i++) {
//			for(int j = 0; j <2 ;j++) {
//				arrC[i][j] = arrA[i][j] + arrB[i][j];
//				System.out.println(arrC[i][j]);
//			}
//		}
		int sum =1;
		for(int i=1;i<=5;i++) {
			sum *=i;
			System.out.println(sum);
		}
	}

}
