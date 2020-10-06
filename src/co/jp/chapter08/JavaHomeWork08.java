package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問1
		//以下コードの出力は何か
		String x = "a";
		String y = "a";
		System.out.println(x == y);//true//原因：==は値を比較するため使うものです。
		System.out.println(x.equals(y));//true//原因：equalsメソッドとは、文字列の比較を行うことができる命令文です。

		String empty = "";
		String nullString = null;
		System.out.println(nullString.equals(empty));//false//原因：nullは空文字と等しくない。


		//質問2
		//以下コードの出力は何か
		//System.out.println(x == y); false 原因：インスタンスが違います。
		//System.out.println(x.equals(y)); true 原因：ただ値の比較。


		//質問3
		//以下コンパイルエラーを修正済みです。
		// Kicker.java
		//public class Kicker {
		//public static void print(Child v) {
			// v.hello();
			// }
		//■コードを追加する。START
		//public static void print2(Parent u) {
			// u.hello();
			// }
		//■コードを追加する。END

		//public static void main(String[] args) {
		//◆printはprint2に変更する。
		    //print2(new Parent());
			//print(new Child());

		//}

	//}




	}

}
