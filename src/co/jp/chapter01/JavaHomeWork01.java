package co.jp.chapter01;

public class JavaHomeWork01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//1質問１ : 以下変数nの値は？
		int i = 10;
		int n = i % 5;
		System.out.println(n);
		//実行結果 : 0
		//
		//質問２ : 右の式を解釈してください: a = a > 10 ? 11 : 0;
		//	
		//		回答：?記号前の式（a > 10）を評価する、trueの場合、11を返す、falseの場合、0を返す。
		//
		//質問３ : 変数値を比較する演算子は = or == ?
		//
		//		回答：変数値を比較する演算子は == です。
		//	
		//質問４ : ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
		//	
		//		回答：ブリアン（ boolean ）変数に設定可能の値は「true」「false」。
		//		
		//質問５ : 下記コードで、変数 x と y の値を回答してください。
		int x = 10;
		int y = 20;
		x = y;
		y = 30;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		//実行結果 : x = 20
		//			 y = 30

	}

}
