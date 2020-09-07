package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問1
		//各要素の値は０です
		int[] array1 = new int[4];
		for (int i=0; i<4;i++) {
			System.out.println(array1[i]);
		}

		// 質問2
		//各要素の値は５，６です
		int[] array2 = new int[] {5,6};
		for (int i=0; i<2;i++) {
			System.out.println(array2[i]);
		}

		// 質問3
		//各要素の値は0です。000、000を２行で出力する。
		int[][] array3 = new int[2][3];
		for (int i=0; i<2;i++) {
			for (int j=0; j<3;j++) {
			System.out.print(array3[i][j]);
			}
		System.out.println();
		}

		// 質問4
		int[][] array2d =new int[4][2];
		for (int[] out :array2d) {    // 同様 for(int i = 0; i < array2d.length; i++)
			for (int inner : out) {    // 同様 for(int j = 0; j < array2d[4].length; j++)
				System.out.print(inner);    //  inner = array2d[4][2];
			}
			System.out.println();
		}

		// 質問5
		int[] array5 = new int[] {1, 3, 5, 7, 100, 0, 1};
		// 最大値の初期値をarray5[0]に設定する。
		int max = array5[0];
		// 最小値の初期値をarray5[0]に設定する。
		int min = array5[0];
		for (int i=0;i<array5.length;i++) {
			// 最大値の初期値より大きいの場合、max値をarray5[i]に再設定します。
			if (array5[i] > max) {
				max = array5[i];
			}
			// 最小値の初期値より小さいの場合、min値をarray5[i]に再設定します。
			if (array5[i] < min) {
				min = array5[i];
			}
		}
		System.out.println("左の配列の最大桁値は"+max);
		System.out.println("左の配列の最小桁値は"+min);

		// 質問6
		int[] array6 = new int[4];
		//各要素の値は０ですので、SUM値は０です。
		System.out.println(array6[0]+array6[1]+array6[2]+array6[3]);

		// 質問7
		int[][] array7 = new int[][] {
			{1,2},
			{3,4},
		};
		int[][] array8 = new int[][] {
			{5,6},
			{7,8}
		};
		int [][] arrC = new int[2][2];

		for (int i = 0 ;i <2; i++) {
			for (int j =0; j<2; j++) {
				arrC[i][j] = array7[i][j] + array8[i][j];
				System.out.print(arrC[i][j] + ",");
			}
			System.out.println();
		}
	}

}
