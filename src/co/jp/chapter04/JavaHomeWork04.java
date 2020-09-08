package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


//		//質問1 int[] array = new int[4];各要素の値を記載してください。
//		int[] array = new int[4];
//		array[0] = 1;
//		array[1] = 2;
//		array[2] = 3;
//		array[3] = 4;
//		for(int i = 0; i < array. length; i++) {
//			System.out.println(array[i]);//{1,2,3,4}
//		}
//
//		//質問2 int[] array = new int[] {5,6};各要素の値を記載してください。
//		//方法①
//		int[] array = new int[] {5,6};
//		for(int i = 0; i < 2; i++) {
//			System.out.println(array[i]);//{5,6}
//		}
//		//方法②
//		int[] array = new int[] {5,6}; {
//			System.out.println(array. length);//2
//		}

//
//	    //質問3 int[][] array = new int[2][3];各要素の値を記載してください。
//		//int[][] array = new int[2][3];
//		int[][] array =  new int[][] {{0,1}, {0,1,2}};
//		for(int i = 0; i < array.length; i++ ) {
//			for(int j = 0; j < array[i].length; i++) {
//				System.out.println(array[i][j]);//0,0
//			}
//		}

//		//質問4 以下2重Foreachを理解したください。
//        int[][] array2d = new int[4][2];
//        for (int[] out : array2d) {//一次元目の配列から二次元目の配列への参照を取り出して、
//    	    for (int inner : out) {//さらに二次元目の配列でforeachすると、
//    		    System.out.println(inner);////0,0,0,0と順番に出力される
//    	    }
//        }

//        //質問5 int[]array = new int[]{1,3,5,7,100,0,1};左の配列の最大値と最小桁値をSystem.out.println()。
//        int[]array = new int[]{1,3,5,7,100,0,1};
//
//        int intMax = array[0];
//
//        for(int i = 1; i < array. length; i++) {
//        	if(intMax < array[i]) {
//        		intMax = array[i];
//        	}
//        }
//        System.out.println(intMax);//100
//
//        int minLen = String.valueOf(array[0]).length();
//
//        for(int j = 1; j < array. length; j++) {
//        	int len = String.valueOf(array[j]).length();
//        	if(minLen > len) {
//        		minLen = len;
//        	}
//        }
//        System.out.print(minLen);//1
//
//		//質問6 問題１の配列のSUMを求める
//		int[] array = new int[]{1,2,3,4};
//		int sum = 0;
//		for(int i  = 0; i < array.length; i++) {
//			sum += array[i];
//		}
//		System.out.println(sum);//10


		//質問7 行列（２次元配列）の和、積を計算してください。

//        //積；
//        int a[][] = new int[2][3];
//        int b[][] = {{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
//        int c[][] = new int[2][4];
//        for (int i = 0;i < 2;  i++)
//        {
//            for (int j = 0;j < 3; j++) {
//                a[i][j] = (i + 1) * (j + 2);
//            }
//        }
//            for (int i = 0;i < 2; i++) {
//                for (int j = 0;j < 4; j++) {
//                    c[i][j] = 0;
//                    for (int k = 0; k < 3; k++)
//                        c[i][j] += a[i][k]*b[k][j];
//                }
//            }
//          for (int i = 0; i < 2; i++) {
//              for (int j = 0; j < 4; j++) {
//                  System.out.printf(c[i][j] + " ");
//              }
//              System.out.println();
//          }
//
//        // 和;
//  		int[][] arr = {{22,66,44},{77,33,88}};
//          int sum = 0;
//          for (int i = 0;i < arr.length ;i++ ) {
//              for (int j = 0;j < arr[i].length ;j++ ) {
//                  sum = sum + arr[i][j];
//              }
//          }
//          System.out.println(sum);//330








	}

}
