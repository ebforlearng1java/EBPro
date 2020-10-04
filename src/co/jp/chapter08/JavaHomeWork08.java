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
		System.out.println(nullString.equals(empty));


	}

}
