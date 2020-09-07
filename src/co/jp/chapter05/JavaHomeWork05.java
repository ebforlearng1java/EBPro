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





		//質問４:質問３の配列に重複ある要素を探す（要素の表示次数集計必要なし）。






		//質問５:質問３の配列に値「７」のインデックスを求む。






		//質問６:任意行列（２次元配列）の積を求める。

		//質問７:配列を昇順でソートする（java.util等メソッド利用禁止）。


		//質問８:LV10のパスカルの三角形を出力してください。





	}

}
