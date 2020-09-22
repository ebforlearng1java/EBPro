package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 設問１︓1から100までの偶数の和を求める(for + if)。
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
//				System.out.println("偶数" + i);
			}
		}
		System.out.println("1から100までの偶数の和は" + sum);

		// 設問２︓5の階乗を求める(for)。
		int kaiJyou = 1;
		for (int i = 1; i <= 5; i++) {
			kaiJyou *= i;
			System.out.println("5の階乗は" + kaiJyou);
		}

		// 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("最大値は" + max);
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("最小値は" + min);
		int sum_03 = 0;
		for (int i = 0; i < array.length; i++) {
			sum_03 += array[i];
		}
		System.out.println("配列の和は" + sum_03);
		double avg = (double) sum_03 / array.length;
		System.out.println("配列の平均は" + avg);

		// 質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		// 重複しているのは1,2,6
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
//				System.out.println("ＯＵＴ配列"+array[i]+"index"+i);
				if (array[i] == array[j]) {
					System.out.println(array[i]);
				}
			}
		}

		// 質問５︓質問３の配列に値「７」のインデックスを求む。
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				System.out.println("配列に値「７」のインデックスは" + i);
			}
		}

		// 質問６︓任意⾏列（２次元配列）の積を求める。
		int[][] arrA = new int[][] { { 55, 11 }, { 22, 33 } };
		int[][] arrB = new int[][] { { 2, 3 }, { 5, 8 } };
		int[][] arrC = new int[2][2];
		// 積
		for (int i = 0; i < arrC.length; i++) {
			for (int j = 0; j < arrC.length; j++) {
				arrC[i][j] = arrA[i][j] * arrB[i][j];
				System.out.print(arrC[i][j] + ",");
			}
			System.out.println();
		}

		// 質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		int temp = 0;
		System.out.println("昇順でソートする前：");
		for (int is : array) {
			System.out.print(is + ",");
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("昇順でソートした後：");
		for (int is : array) {
			System.out.print(is + ",");
		}
		System.out.println();

		// 質問８︓LV10のパスカルの三⾓形を出⼒してください。
		// これはネットの情報を参照して作成されたものです、理解はできているはずです。
	    int rows = 10;
	    for(int i =0;i<rows;i++) {
	        int number = 1;
	        System.out.format("%"+(rows-i)*2+"s","");
	        for(int j=0;j<=i;j++) {
	             System.out.format("%4d",number);
	             number = number * (i - j) / (j + 1);

	        }
	        System.out.println();
	  
	    }
	}

}
