package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		//配列　数　組
//
//		//整形配列
//		int [] array = new int[] {1,2,3,4,5};
//
//		//文字列配列
//		String [] strArray = new String[] {"1","2","3","4","5"};
//
//		//特殊な配列
//		Object[] objArray = new Object[] {1,"333",true};
//
//
//		//定義方式　宣言　かつ　初期化 値
//		int [] intArray1 = new int[] {55,22,33,11,22,555};
//		for(int i=0; i< intArray1.length ; i++) {
//			System.out.println(intArray1[i]);
//		}
//
//
//		//定義方式　宣言　かつ 長さ定義のみ
//		int [] intArray2 = new int[4] ;
//		for(int i=0; i< intArray2.length ; i++) {
//			System.out.println(intArray2[i]);
//		}




//		int[] array1 = new int[5];
//
//		int[] array2 = new int[] {1,3,5,7,9};
//
//		for (int i=0; i < array1.length; i++) {
//			System.out.println(array1[i]);
//		}
//
//		for (int i=0; i < array2.length; i++) {
//			System.out.println(array2[i]);
//		}


//		int[] array3 = new int[] {1,3,5,7,9};
//
//		array3[0]=2;
//		array3[1]=4;
//		array3[2]=6;
//		array3[3]=8;
//		array3[4]=10;
//
//		for (int i=0; i < array3.length; i++) {
//
//			System.out.println(array3[i]);
//		}

//		int[] array4 = new int[10] ; //index 0-99
//
//		for (int i=0; i < array4.length; i++) {
//			array4[i]=i+1;
//			if(i< (array4.length/2)){
//				System.out.println(array4[i]*2);
//			}else {
//				//array[i]=((i-(array4.length /2 ))+1)*2-1
//				System.out.println(array4[i-array4.length/2]*2-1);
//			}
//		}

//		int[] array5 = new int[10] ;
//		for(int item : array5) {
//			System.out.println(item);
//		}


//		int[][] arr1 = new int[5][5];
//
//		int[][] arr2 = new int[][] {
//			{1,2},
//			{3,4}
//		};
//		System.out.println(arr2[0][0]);
//		System.out.println(arr2[0][1]);
//		System.out.println(arr2[1][0]);
//		System.out.println(arr2[1][1]);
//		System.out.println(arr2);

//
//		String[] arrStr = new String[] {"H","E","L","L","O","W","O","R","L","D"};
//
//		for (int i=0; i < arrStr.length; i++) {
////		arrStr[i]=i+1;
//		if(i< (arrStr.length/2)){
//			System.out.println(arrStr[(i)*2]);
//		}else {
//			//array[i]=((i-(array4.length /2 ))+1)*2-1
//			System.out.println(arrStr[(i-arrStr.length/2+1)*2-1]);
//		}
//	}
//


		int[][] arr3 = new int[][] {
			{1},
			{3,4}
		};

		int[][] arr4 = new int[][] {
			{5,6},
			{7,8}
		};
		for (int i=0; i<arr3.length ; i++) {
			for (int j=0; j<arr3[i].length ; j++) {
			//	System.out.println(arr3[i][j]);
				System.out.print(arr3[i][j]+",");
			}
			System.out.println("");
		}

//		int[][] arr5 = new int[][] {
//			{1,2},
//			{3,4}
//		};
//
//		int[][] arr6 = new int[][] {
//			{5,6},
//			{7,8}
//		};
//		int[][] arr7 = new int[2][2];
//
//		for (int i=0; i<arr5.length ; i++) {
//			for (int j=0; j<arr6[i].length ; j++) {
//				arr7[i][j]=arr5[i][j]+arr6[i][j];
//				System.out.print(arr7[i][j]+",");
//			}
//			System.out.println("");
//		}






























	}

}
