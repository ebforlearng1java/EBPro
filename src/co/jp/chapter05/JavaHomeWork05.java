package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//設問１：１から１００までの偶数の和を求める（for+if）
		int sum1 = 0;
		 for (int i1 = 1; i1 <101; i1 ++) {
			 if (i1 % 2 == 0) ;
			 sum1 = i1 + sum1;
			 
		 }
		 System.out.println(sum1);


		//設問２：５の階乗を求める（for）        5! = 5*4*3*2*1
		int seki2 = 1;
		 for (int i2 = 1; i2 <6 ; i2 ++) {
			 seki2 = seki2*i2;
			 System.out.println(seki2);
		 }



	    //設問３：配列｛1,2,6,7,9,6,2,1｝の最大値、最小値、和、平均値を求める。

		 int [] array3 = new int[] {1,2,6,7,9,6,2,1};
		 int max3 = array3[0];
		 int min3 = array3[0];
		 int sum3 = array3[0];
		 int avg3 = array3[0];
		 for (int i3 =0; i3 < array3.length; i3++) {
			 if (array3[i3] > max3) {
				 max3 = array3[i3];
			 }
		 }
         System.out.println("最大値：" + max3);


		 for (int i3 =0; i3 < array3.length; i3++) {
			 if (array3[i3] < min3) {
				 min3 = array3[i3];
			 }
		 }
         System.out.println("最小値：" + min3);


         for (int i3 =0; i3 < array3.length; i3++) {
			 sum3 = sum3 + array3[i3];
			 }
         System.out.println("和：" + sum3);


         avg3 = sum3/array3.length;
         System.out.println("平均値：" + avg3);



		//質問４：質問３の配列に重複の要素を探す（要素の表示次数集計必要なし）
         int [] arr4 = new int[] {1,2,6,7,9,6,2,1};
         for (int i4 =0; i4 < arr4.length-1; i4++) {
        	 for (int j4 = i4 + 1; j4 < arr4.length; j4++) {
         if (arr4[i4] == arr4[j4]) {
        	 
        	 System.out.println(arr4[i4]);
         }
        	 }
         }

         


		//質問５：質問３の配列に値「７」のインデックスを求める。
         for (int i3 =0; i3 < array3.length; i3++) {
        	 if (array3[i3] == 7) {
        	 System.out.println(i3);
         }
         }


		//質問６：任意行列（２次元配列）の積を求める。
         int [][] arrA = new int[][] {
         	  {5,12},
         	  {6,13}
           };
           int [][] arrB = new int [][] {
         	  {10,20},
         	  {30,40}
           };
           int [][] arrC = new int [2][2];

           for (int i6 =0; i6 <2; i6++) {
           	  for (int j6=0; j6<2; j6++) {
           		  arrC [i6][j6] = arrA[i6][j6] * arrB[i6][j6];
           		  System.out.println("積 :" + arrC[i6][j6] );
           	  }
           }
           	  System.out.println();


		//質問７：配列を昇順でソートする。

           	int [] arr7 = new int[] {33,4,72,0,55};

            for (int i7 =0; i7 < arr7.length - 1; i7++) {
            	 for (int j7 =i7; j7 < arr7.length ; j7++) {
            		 if (arr7[i7] >= arr7[j7]) {
            			 int a7 = arr7[i7];
            			 arr7[i7] = arr7[j7];
           			     arr7[j7] =  a7;
            		 }
           	     }
            }
            for (int i7 =0; i7 < arr7.length ; i7++) {
                 System.out.println(arr7[i7]);}



		//質問８：LV10のパスカルの三角形を出力してください。

            int LV10 = 10;
            int a10 =0;
            int b10 = 0;
            for (int i10 = 0; i10 <=LV10; i10++) {
                b10 = 1;
                a10 = i10 + 1;
                for (int j = LV10 - i10; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int c10 = 0; c10 <= i10; c10++) {
                    if (c10 > 0) {
                        b10 = b10 * (a10 - c10) / c10;
                    }
                    System.out.print(b10 + " ");
                }
                System.out.println();
            }



	}

}
