package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/** 05 新米８問 */

		//設問１︓1から100までの偶数の和を求める(for + if)。
		//答え：
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			}
		}
		System.out.println("質問１、1から100までの偶数の和：" + sum1);

		//設問２︓5の階乗を求める(for)。
		//答え：
		int a = 1;
		for (int i = 1; i <= 5; i++) {
			a = a * i;
		}
		System.out.println("質問２、5の階乗：" + a);

		//質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		//答え：
		int[] array1 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int max = array1[0];
		int min = array1[0];
		int sum2 = 0;
		for (int item : array1) {
			if (max < item) {
				max = item;
			}
			if (min > item) {
				min = item;
			}
			sum2 = sum2 + item;
		}
		int ave = sum2 / array1.length;
		System.out.println("質問３、配列 {1, 2, 6, 7, 9, 6, 2, 1} の");
		System.out.println("最大值：" + max);
		System.out.println("最小值：" + min);
		System.out.println("和：" + sum2);
		System.out.println("平均値：" + ave);

		//質問４︓質問３の配列に重複ある要素を探す（要素の表示次数集計必要なし）。
		//答え：
		array1 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		System.out.println("質問４、array1に重複ある要素：");
		for (int i = 0; i < array1.length - 1; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					System.out.println(array1[i]);
				}
			}
		}

		//質問５︓質問３の配列に値「７」のインデックスを求む。
		//答え：
		array1 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		System.out.println("質問５、配列に値7のインデックス：");
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 7) {
				System.out.println(i);
			} //重複の値「７」があるかもしれないので、breakしない
		}

		//質問６︓任意行列（２次元配列）の和を求める。
		int[][] array21 = new int[][] {
				{ 5, 12 },
				{ 56, 3 }
		};
		int[][] array22 = new int[][] {
				{ 45, 2 },
				{ 52, 33 }
		};
		int total[][] = new int[2][2];

		System.out.println("質問６、行列（２次元配列）の和：");
		for (int i = 0; i < array21.length; i++) {
			for (int j = 0; j < array21[i].length; j++) {
				total[i][j] += array21[i][j] + array22[i][j];
				System.out.print(total[i][j]+" ");
			}
			System.out.println();
		}

		//質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		//答え：
		array1 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int i = 0; i < array1.length - 1; i++) {
			for (int j = 0; j < array1.length - 1 - i; j++) {
				if (array1[j] > array1[j + 1]) {
					int temp=array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=temp;
				}
			}
		}
		System.out.print("質問７、昇順：");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();

		//質問８︓LV10のパスカルの三角形を出力してください。
		//答え：
		//LV10の2次元配列を宣言して、長さを設定する
		int[][] array23=new int[10][];

		System.out.println("質問８、LV10のパスカルの三角形：");
	    for (int i = 0; i < array23.length; i++) {
	      //第二階層の１次元配列を宣言して、長さを設定する
	      array23[i]=new int[i+1];
	      for(int m=1;m<array23.length-i;m++) {
		        System.out.print("   ");
	      }
	      for(int j=0;j<=i;j++){
	        //各行で最初と最後の要素の値を1に設定する
	        if(j==0||j==i){
	          array23[i][j]=1;
	        }else{
	          array23[i][j]=array23[i-1][j-1]+array23[i-1][j];
	        }
	        System.out.printf("%-3d",array23[i][j]);
	        System.out.print("   ");
	      }
	      System.out.println();
	    }
	  }
}
