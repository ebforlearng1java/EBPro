package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] arr2d = new int[][] {
			{1,2,3,4},{21,22,23,24}
		};
		System.out.println(arr2d.length);

		//int[] arr = new int[3];
		//System.out.println(arr);

		//配列の要素を出力
		//方法1
		int[] arr3 = new int[] {1,2,3,4,5};
		for(int x:arr3) {
			System.out.println(x);
		}
        //方法2
		for(int i = 0;i<arr3.length;i++) {
			int y = arr3[i];
			System.out.println(y);
		}

		//要素のアクセス
		int[] arr4 = new int[100];
		//値を与える
		//arr4[0] = 2;
		//arr4[1] = 4;
		//arr4[2] = 6;
		//arr4[3] = 8;
		//arr4[4] = 10;
		for (int a =0;a<arr4.length;a++) {
			//値を与える
			arr4[a] = a+1;
			System.out.println(arr4[a]);
		}



		int[] arr5 = new int[10];
		for (int b =0;b<arr5.length;b++) {
			if(b<5) {
				arr5[b] = (b+1)*2;
			}
			else {
				arr5[b] = arr5[b-arr5.length/2]-1;
			}
			System.out.println(arr5[b]);
		}

		//拡張for
		int[] arr6 = new int[10];
		for(int item:arr6) {
			System.out.println(item);
		}


		//二元配列
		int[][] arr22 = new int[][] {
			{5,6},{7,8}
		};

		//String[] arrStr = new String[] {"H","E","L","L","O","W","O","R","L","D"};
		//for(int i = 0;i<arrStr.length;i++) {
		//	if(i<(arrStr.length/2)){
			//	arrStr[i] =arrStr[(i)*2];
			//}
		//}

		//int[][] arr22 = new int[][];
		for (int i=0;i<arr22.length;i++) {
			for (int j=0;i<arr22.length;j++) {
				System.out.println(arr22[i][j]+"");
			}
		}

		//配列加算




	}

}
