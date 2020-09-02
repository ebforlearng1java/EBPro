package co.jp.chapter01;

public class JavaHomeWork01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問１︓以下変数nの値は?
		int i = 10;
		int n = i%5;
		System.out.print(n);//答えは0


		//質問２
		int a = 0;
		a = a > 10 ? 11 : 0;
		if (a > 10) {
			a = 11;
		} else {
			a = 0;
		}
		System.out.print(a);  //答えは0


		//質問３:変数値を比較する演算子は = or == ?
		//答え：=


		//質問４:ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
		//答え：trueとfalse

	}

}
