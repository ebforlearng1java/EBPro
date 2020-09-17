package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//設問１:1から100までの偶数の和を求める(for + if)。
//		int sum = 0;
//		for(int i = 1;i <= 100;i++) {
//			if(i%2 == 0) {
//				sum = sum + i;
//			}
//		}
//		System.out.println(sum);


		//設問２:5の階乗を求める(for)。
		//5！= 5*4*3*2*1
//		int fac = 1;
//		for(int i = 5;i<=5&&i>0;i--) {
//			fac = fac*i;
//		}
//		System.out.println(fac);


		//質問３:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
//		int[] arr = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
//
//		//①配列の最大値を求める
//		int max = arr[1];
//		for(int i = 0; i<arr.length;i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println("配列の最大値は" + max);
//
//		//②配列の最小値を求める
//		int min = arr[1];
//		for(int i = 0; i<arr.length;i++) {
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println("配列の最小値は" + min);
//
//		//③配列の和を求める
//		int sum = 0;
//		for(int i = 0;i < arr.length;i++ ) {
//			sum = sum + arr[i];
//		}
//		System.out.println("配列の和は" + sum);
//
//		//④平均値を求める
//		int sum1 = 0;
//		double aver;
//		for(int i = 0;i < arr.length;i++ ) {
//			sum1 = sum1 + arr[i];
//		}
//		aver = ((double)sum1)/arr.length;
//		System.out.println("配列の平均値は" + aver);


		//質問４:質問３の配列に重複ある要素を探す（要素の表示次数集計必要なし）。
//		int[] arr1 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
//		for(int i = 0; i < arr1.length;i++) {
//			for(int j = i+1;j < arr1.length;j++) {
//				if(arr1[i] == arr1[j]) {
//					int repet = arr1[j];
//					System.out.println("重複ある要素は" + repet);
//				}
//
//			}
//		}


		//質問５:質問３の配列に値「７」のインデックスを求む。
//		int[] arr2 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
//		for(int i = 0;i < arr2.length;i++) {
//			if(arr2[i] == 7) {
//				System.out.println(i);
//			}
//		}


		//質問６:任意行列（２次元配列）の和を求める。
//		int[][] a = new int[][] {
//			{1,2,2},
//			{4,5,4}
//			};
//
//		int[][] b = new int[][] {
//			{2,5,3},
//			{2,4,1}
//			};
//
//		int[][] c = new int[2][3];
//
//		for(int i = 0; i<a.length; i++) {
//			for(int j = 0; j<a[i].length; j++) {
//				System.out.print((c[i][j] = a[i][j] +b[i][j] )+ "\t");
//			}
//			System.out.println();
//		}


		//質問７:配列を昇順でソートする（java.util等メソッド利用禁止）。
//		int[] arr3 = new int[] {10, 2, 6, 47, 19, 56, 22, 10};
//		int temp;
//		for(int i = 0; i < arr3.length; i++) {
//			for(int j = i+1;j<arr3.length;j++ ) {
//				if(arr3[i] > arr3[j]) {
//					temp = arr3[j];
//					arr3[j] = arr3[i];
//					arr3[i] = temp;
//				}
//			}
//			System.out.print(arr3[i] + " ");
//		}


		//質問８:LV10のパスカルの三角形を出力してください。
//		int row = 10;
//		int[][] a = new int[row][row];
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j <= i; j++) {
//				if(i == 0 || j == 0 || i == j) {
//					a[i][j] = 1;
//				}else {
//					a[i][j] = a[i-1][j] + a[i-1][j-1];
//				}
//				System.out.print(a[i][j] + "\t");
//			}
//			System.out.println();
//		}

		//質問８の修正：
		int row = 10;
		int[][] a = new int[row][row];

		for(int i = 0;i < row; i++) {
			for(int j = 0;j < row-i-1;j++) {
				System.out.print("  ");
				}

			for(int j = 0; j <= i; j++) {
				if(i == 0 || j == 0 || i == j) {
					a[i][j] = 1;
				}else {
					a[i][j] = a[i-1][j] + a[i-1][j-1];
				}
				System.out.printf("%4s",a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
