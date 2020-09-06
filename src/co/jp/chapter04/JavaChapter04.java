package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ



		//配列
		//整形
		int [] array = new int [] {1,2,3,4,5};
		//文字列
		String [] strarray = new String [] { "1", "2", "3", "4", "5"};
		//
		Object[] Objarray = new Object[] {1,"333",1,1,1f,true};


		//定義方式①　宣言かつ初期化
		int[] intarray_1 = new int[] {1,2,3,4,5};
		for (int i = 0; i < intarray_1.length; i++) {
			System.out.println(i);
		}
		//
		int[] intarray_2 = new int[] {55, 22,33,11, 22, 555};
		for (int index = 0; index < intarray_2.length; index++) {
			System.out.println(intarray_2[index]);
		}

		//
		int[] intarray_3 = new int[] { 1, 2,3,4, 5, 565 };
		for (int index = 0; index < intarray_3.length; index++) {
			System.out.println(intarray_3[index]);
		}






		int [] array1 = new int[] {1,3,5,7,9};
		for (int i = 0; i < array1. length; i++) {
			System.out.println(array1[i]);
		}

		//ArrayIndexOutofBoundException 数组下标越界



		int [] array2 = new int[100];//index 0~99
		for (int i = 0; i < array2.length; i++) {
			array2[i] = i+1;
			System.out.println(array2[i]);


			//2,4,6,8,10,1,3,5,7,9
			//0,1,2,3,4,5,6,7,8,9
			int [] array3 = new int[100];//index 0~9
			for (int b = 0; b < array3.length; b++) {
				if (i < (array3.length /2)) {
					array3 [b] = (b+1)*2;
				}else {
				    array3 [b] = ((b-(array3.length/2))+1)*2-1;
			}
				System.out.println(array3[b]);
			}


		//	int [] arr1 = new int [5];
		//	int [][] arr2 = new int [5][5];
		//	int[][] arrar2x2_1 = new int [][] {
		//		{1,2},
		//		{3,4}
		//	};



		//	for (int z =0; z< arr2x2_1.length; z++) {
		//		for (int y =0; y <arr2x2_1[z].length; y++) {
		//			System.out.println();
		//		}


          int [][] arr2x2_2 = new int [][] {
        	  {5,6},
        	  {7,8}
        	  };

          for (int p = 0; p< 2; p++ ) {
        	  for (int j = 0; j< 2; j++) {
          }
          }




          int [][] arrA = new int[][] {
        	  {1,2},
        	  {3,4}
          };
          int [][] arrB = new int [][] {
        	  {5,6},
        	  {7,8}
          };
          int [][] arrC = new int [2][2];

          for (int g =0; g <2; g++) {
        	  for (int h=0; h<2; h++) {
        		  arrC [g][h] = arrA[g][h] + arrB[g][h];
        		  System.out.println(arrC[g][h] + ",");
        	  }
        	  System.out.println();

        	  }
          }
}
	}
