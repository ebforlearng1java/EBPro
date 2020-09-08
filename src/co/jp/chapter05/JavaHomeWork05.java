package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//設問１:1から100までの偶数の和を求める(for + if)。
		int SUM = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				SUM = SUM + 1;
			}
			System.out.println(SUM);
		}

		//設問２:5の階乗を求める(for)。
		for (int X = 1; X <= 5; X++) {
			int ROKENKA = 1;
			for (int Y = 1; Y <= X; Y++) {
				ROKENKA *= Y;
			}
			System.out.println(ROKENKA);
		}

		//質問３:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		int[] array3 = new int[] { 1, 2, 6, 7, 9, 2, 1 };
		int max = array3[0];
		int min = array3[0];
		int he = 0;
		int pingjun = 0;
		for (int Z = 0; Z < array3.length; Z++) {
			int z = array3[Z];
			if (z > max) {
				max = z;
				System.out.println(max);
			}
			if (z < min) {
				min = z;
				System.out.println(min);
			}
			he += z;
			System.out.println(he);

			pingjun = he / array3.length;
			System.out.println(pingjun);
		}


		//質問４:質問３の配列に重複ある要素を探す（要素の表示次数集計必要なし）。
		int[] array4 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1, 1, 2 };
		for (int M = 0; M < array4.length; M++) {
			for (int N = M + 1; N < array4.length; N++) {
				if (array4[M] == array4[N] && M != N) {
					System.out.println(array4[M]);
				}
			}
		}



		//質問５:質問３の配列に値「７」のインデックスを求む。
		int[] array5 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int i = 0; i < array5.length; i++) {
			if (array5[i] == 7) {
				System.out.println(i);
			}
		}


		//質問６:任意行列（２次元配列）の積を求める。
		int[][] array6 = new int[][] {
				{ 1, 3, 5, 7 },{ 2, 4, 6, 8 }
		};
		int HE = 0;
		int JI = 1;
		for (int i = 0; i < array6.length; i++) {
			 for(int j = 0; j < array6[i].length; j++){
				 HE = HE + array6[i][j];
				 JI = JI * array6[i][j];
			 }
		}
		System.out.println(HE);
		System.out.println(JI);

		//質問７:配列を昇順でソートする（java.util等メソッド利用禁止）。
		int[] array7 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int i = 0; i < array7.length; i++) {
			for (int j = 0; j < array7.length; j++) {
				if (array7[i] <array7[j]) {
					int W = array7[j];
					array7[j] = array7[i];
					array7[i] = W;
				}
			}
		}
		for (int W : array7) {
			System.out.println(W);
		}


		//質問８:LV10のパスカルの三角形を出力してください。
		int[][] sankaku = new int[10][10];
		for (int i = 0; i < sankaku.length; i++) {
			sankaku[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == j) {
					sankaku[i][j] = 1;
				} else {
					sankaku[i][j] = sankaku[i - 1][j] + sankaku[i - 1][j - 1];
				}
				System.out.print(sankaku[i][j]);
			}
			System.out.println();
		}

	}

}
