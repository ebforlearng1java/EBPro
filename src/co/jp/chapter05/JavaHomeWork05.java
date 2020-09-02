package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 以下質問を回答してください。1. “aaa“の出力回数？2.”bbb”の出力回数？
		// 答え：1. “aaa“の出力回数は6回；2.”bbb”の出力回数は2回。
		for(int i = 0;i<2;++i) {
			for(int j = 0;j<3;++j) {
				System.out.println("aaa");

			}
			System.out.println("bbb");

		}

		// 設問１︓1から100までの偶数の和を求める(for + if)。
		// 答え：1から100までの偶数の和は2550.
		int sum_Even = 0;
		for (int even = 1;even<=100;even++) {
			if(even%2 == 0) {
				sum_Even += even;
			}
		}
		System.out.println(sum_Even);

		// 設問２︓5の階乗を求める(for)。
		// 答え：5の階乗の結果は120.
		int product = 1;
		for(int i = 1;i <= 5;i++) {
			product*= i;
		}
		System.out.println(product);

		// 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		// 答え：配列 {1, 2, 6, 7, 9, 6, 2, 1}の最大値は9,最小値は1,和は34,平均値は4.25
		int[] array_01 = {1, 2, 6, 7, 9, 6, 2, 1};
		int max = array_01[0];
		int min = array_01[0];
		int sum = 0;
		for(int i =0;i < array_01.length;i++) {
			if(max<array_01[i]) {
				max = array_01[i];
			}
			if(min>array_01[i]) {
				min = array_01[i];
			}
			sum += array_01[i];
		}
		float avg = (float)sum/array_01.length;
		System.out.println("array_01の最大値は"	+max+","+"最小値は"+min+","+"和は"+sum+","+"平均値は"+avg);

		// 質問４︓質問３の配列に重複ある要素を探す（要素の表示次数集計必要なし）。
		// 答え：配列 {1, 2, 6, 7, 9, 6, 2, 1}は1, 2, 6 .
		int array_temp;
		for(int i = 0;i < array_01.length;i++) {
			while(array_01[i] != i) {
				if(array_01[i] == array_01[array_01[i]]) {
					break;
				} else {
					array_temp = array_01[array_01[i]];
					array_01[array_01[i]] = array_01[i];
					array_01[i] = array_temp;
					System.out.println("array_01[" + i + "]" + "=" + array_01[i] +"");
				}
			}
			System.out.println("array_01[" + i + "]" + "=" + array_01[i] +"");
		}

		// 質問５︓質問３の配列に値「７」のインデックスを求む。
		// 答え：配列 {1, 2, 6, 7, 9, 6, 2, 1}に値「７」のインデックスは3.
		for(int i = 0;i<array_01.length;i++) {
			if(array_01[i] == 7) {
				System.out.println(i);
			}
		}

		// 質問６︓任意行列（２次元配列）の和を求める。
		// 答え：PRODUCT.
		int n =0;
		int m =0;
		int PRODUCT = 0;
		int[][] array_02 = new int[n][m];
		for(int i =0;i<array_02.length;i++) {
			for(int j =0;j<array_02[n].length;j++) {
				PRODUCT += array_02[n][m];
			}
		}
		System.out.println("和は"+PRODUCT);

		// 質問７︓配列を昇順でソートする（java.util等メソッド利用禁止）。
		// 答え：配列{100, 10, 62, 32, 50, 88, 72, 5}を昇順でソートすると{1, 5, 10, 32, 50, 62, 72, 88, 100}になる。

		int [] array_03 = {100, 10, 62, 32, 50, 88, 72, 5};
		int temp = 0;
		for(int i = array_03.length-1;i>0;i--) {
			for(int j= 0;j<i;j++) {
				if(array_03[j] >array_03[j+1]) {
					temp = array_03[j];
					array_03[j] = array_03[j+1];
					array_03[j+1] =temp;
				}
			}
		}
		for(int i= 0;i<array_03.length;i++) {
			System.out.print(array_03[i]+" ");
		}

		System.out.println();

		// 質問８：LV10のパスカルの三角形を出力してください。

		int row = 10;
		int[][] pascal = new int[row][row];

		for (int i = 0; i < row; i++) {
			pascal[i][0] = pascal[i][i] = 1;
		}
		for (int i = 2; i < pascal.length; i++) {
			for (int j = 1; j < i; j++) {
				pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
			}
		}
		for (int i = 0; i < pascal.length; i++) {
			for(int j = 0;j<pascal.length-1-i;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++) {
				System.out.print(" ");
				System.out.printf("%-2d",pascal[i][j]);
			}
			System.out.println();
		}
	}
}
