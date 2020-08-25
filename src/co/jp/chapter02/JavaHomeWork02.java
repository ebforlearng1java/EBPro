package co.jp.chapter02;

public class JavaHomeWork02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問１： System.out.println("this is line1\tthis line2"); は何行出力しますか？
		System.out.println("this is line1\tthis line2");
		//実行結果：this is line1	this line2
		//回答：１行です。

		//質問２：Stringを比較方法は？
		//回答：equalsです。

		//質問３：Float値⇒String文字列変更する場合、どうなメソッドを利用しますか？
		String str1 = 1.0F + "";
		System.out.println(str1);
		//実行結果：1.0
		String str2 = String.valueOf("1.0F");
		System.out.println(str2);
		//実行結果：1.0F
		//回答：String.valueOf("1.0F")　と　1.0F + ""　両方利用できる。

		//質問４：以下式の値を記載してください。
		//1. 1.0 + 2.0
		//2. 1.0 + "2.0"
		System.out.println(1.0 + 2.0);
		//実行結果：3.0
		System.out.println(1.0 + "2.0");
		//実行結果：1.02.0
		//回答：1.Float値：3.0
		//		2.String文字列：1.02.0

		//質問５：以下ステートメントの出力を記載してください。
		int a = 10;
		System.out.println("a");
		//実行結果：a
		//回答：a

	}

}
