package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//質問１：以下コードの出力するを回答してください。
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true ? false? 原因は ?
		//答え：false； 原因：メモリアドレスは一致しません。
		System.out.println(x.equals(y)); // true ? false? 原因は ?
		//答え：true； 原因：文字列内容は一致します。
		String empty = "";
		String nullString = null;
		// System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
		//答え：false; 原因：emptyはobject対象がある。nullStringはobject対象はない。
		
		//質問２:以下コードのしゅつを回答してください。
		//同じパッケージのEmployeeクラスとKickerクラスを参照してください。

	}

}
