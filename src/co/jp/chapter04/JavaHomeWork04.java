package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問題１:int[] array = new int[4]; 各要素の値を記載してください。
		int[] array = new int[4];
		System.out.println(array[0]);//0

		//問題２:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		int[] array2 = new int[] {5, 6};
		for(int ro : array2) {
			System.out.println(ro);
		}

		//問題３:int[][] array = new int[2][3]; 各要素の値を記載してください。
		int[][] array3 = new int[2][3];
		for (int[] ken : array3) {
			for (int ka : ken) {
				System.out.println(ka);
			}
		}

		//問題４:以下２重Foreachを理解してください。
		int[][] array2d = new int[4][2];
		for (int[] out : array2d) {
			for (int inner : out) {
				System.out.println(inner);
			}
		}

		//問題５:int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列のMAXとMINをSystem.out.println()。
		int[] array5 = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int MAX = array5[0];
		int MIN = array5[0];
		for (int i = 0; i < array5.length; i++) {
			if (array5[i] > MAX) {
				MAX = array5[i];
				System.out.println(MAX);
			} else if (array5[i] < MIN) {
				MIN = array5[i];
				System.out.println(MIN);
			}
		}

		//問題６:問題１の配列のSUMを求める。
		int[] array6 = new int[4];
		int SUM = 0;
		for (int rokenka : array6) {
			SUM = SUM + rokenka;
		}
		System.out.println(SUM);

		//問題７:行列（２次元配列）の和と積を計算してください。
		int[][] array99 = new int[][] {
				{ 1, 3, 5, 7 },{ 2, 4, 6, 8 }
		};
		int HE = 0;
		int JI = 1;
		for (int i = 0; i < array99.length; i++) {
			 for(int j = 0; j < array99[i].length; j++){
				 HE = HE + array99[i][j];
				 JI = JI * array99[i][j];
			 }
		}
		System.out.println(HE);
		System.out.println(JI);



	}

}
