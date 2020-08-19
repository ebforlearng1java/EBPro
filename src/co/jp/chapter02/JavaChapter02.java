package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 変数の宣言 (方式１)
		// クラス(タイプ)　変数名　= "変数値"
		String name = "ＸＸＸＸＸＸＸＸ";
		int suji = 123;

//		System.out.println(name);// 変数(name)の値を出力
//		System.out.println("name");// 固定文言を出力



		// 二つ文字列の変数を定義する 　
		// 値が一致する　abc
		// 変数の宣言 (方式１)
		String str1 = "abc";
		String str2 = "abc";
		int suji2 = 1234;
		System.out.println("変数の宣言 (方式１＆方式１):"+ (str1 == str2));

		// 変数宣言の方式２
		// クラス(タイプ)　変数名　= new クラス("変数値")
		String str3 = new String("abc");
		String str4 = new String("abc");

		System.out.println("変数の宣言 (方式２＆方式２):"+ (str3 == str4));  // NG
//		System.out.println("変数の宣言 (方式２＆方式２):"+ (str3.equals(str4))); //OK

		System.out.println("変数の宣言 (方式1＆方式２):"+ (str1 == str3));

		// 文字列比較
		// == ＮＧ
		// 1.メモリーの物理アドレス
		// 2.値
		// equals

	}

}
