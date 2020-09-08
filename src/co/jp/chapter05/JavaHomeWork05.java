package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


//		//設問１：1から100までの偶数の和を求める(for + if)。
//			int sum = 0;
//			for(int i = 1; i <= 100; i++) {
//				if( i % 2 == 0) {
//					sum += i;
//				}
//			}
//			System.out.println(sum);//2550

//
//		//設問2︓5の階乗を求める(for)。
//		int i, fact = 1;
//		for(i = 1; i <= 5; i++) {
//			fact *= i;
//		}
//		System.out.println(fact);//120

		// 質問3:︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		//最大値
//		int [] array = new int[] {1,2,6,7,9,6,2,1};
//		int intMax = array[0];
//		       for(int i = 1; i < array. length; i++) {
//		        	if(intMax < array[i]) {
//		        		intMax = array[i];
//		        	}
//		        }
//		        System.out.println("最大値:" + intMax);//9
//
//		  //最小値
//		  int [] array1 = new int[] {1,2,6,7,9,6,2,1};
//	      int intMin = array1[0];
//	             for(int i = 1; i < array1. length; i++) {
//	        	      if(intMin > array1[i]) {
//	        		      intMin = array1[i];
//	        	}
//	        }
//	            System.out.println("最小値:" + intMin);//1
//
//	        //和
//	  		int [] array2 = new int[] {1,2,6,7,9,6,2,1};
//		    int sum = array2[0];
//		         for(int i  = 0; i < array2.length; i++) {
//				 sum += array2[i];
//			}
//				System.out.println("和：" + sum);//35
//
//			//平均値
//			int sum1 = 0;
//			int[] array3 = new int[] {1,2,6,7,9,6,2,1};
//			for(int i = 0; i < array3. length; i++) {
//				sum1 += array3[i];
//			}
//			int ave = sum1 / array. length;
//			System.out.println("平均値：" + ave);//4

//		//質問４︓質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)
//		 int [] array = new int[] {1,2,6,7,9,6,2,1};
//		 int count = 0;
//		 for(int i = 0; i < array. length; i++) {
//			 for(int k = i + 1; k < array. length; k++) {
//				 if(array[i] == array[k]) {
//					 count++;
//				 }
//			 }
//			 if(count == 1)
//				 System.out.println("重複要素：" + array[i]);//1,2,6
//			 count = 0;
//		 }


//		//質問5 質問3の配列に値「7」のインデックスを求む。
//		int [] array1 = new int[] {1,2,6,7,9,6,2,1};
//		for(int i = 0; i < array1. length; i++) {
//			if(array1[i]  == 7) {
//				System.out.println(i + 1);//4
//
//			}
//		}

//		//質問6 任意行列(2次元配列)の和を求める。
//		int[][] array2d = {
//				{1,2,3,4},
//				{10,20,30,40}
//		};
//		int sum = 0;
//		for(int i = 0; i < array2d. length; i++) {
//			for(int j = 0; j < array2d. length; j++) {
//				sum += array2d[i][j];
//			}
//		}
//		System.out.println(sum);//33

//		//質問7 配列を昇順でソートする（java.util等メソッド利用禁止
//		int[] list = {5, 3, 8, 11, 2, 1};
//		Arrays.sort(list);
//		for(int i : list){
//			System.out.print(i + " ");//1 2 3 5 8 11
//		}

		//質問8 ︓LV10のパスカルの三角形を出力してください。
		int n = 10;
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("");
            }
            System.out.print("*");
            if(i != n) {
                  for(int k = 1; k <= (i - 2) * 2 + 1; k++) {
            	           System.out.print(" ");
                      }
                      if(i != 1) {
                    	  System.out.print("*");
                      }
            	   System.out.println();
            } else {
            	for (int m = 1; m <= 2 * (i - 1); m++) {
            		System.out.print("*");
            	}
            }

		}






	}

}
