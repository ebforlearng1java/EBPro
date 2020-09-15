package co.jp.chapter07;

public class JavaHomeWork12 {

	public static void main(String[] args) {

		//06関数　
		//質問1　以下関数の修飾子、返却型、関数名、引数（引数の型・名称）を回答して下さい。
		//答え：修飾子："public" 全てのクラスで参照可能になる
		//              "static"クラス（静的）
		//返却型：void 戻り値
		//関数名：main
		//引数型：args
		//引数名：String[]

		//質問2　配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出して下さい。

		int[] numbers = { 6, 2, 3, 4 };
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		System.out.println("合計→" + sum);

		//配列MAX値
		int[] array = { 6, 2, 3, 4 };
		int max = array[0];
		int min = array[1];
		for (int p = 1; p < array.length; p++) {
			int v = array[p];

			if (v > max) {
				max = v;
			}

			if (v < min) {
				min = v;
			}
		}

		System.out.println(max);
		System.out.println(min);

	}
}
