package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//変数の宣言
		//クラス（タイプ）変数名　＝"変数値"
		String name = "SM";
		System.out.println(name);//変数の値を出力
		System.out.println("name");//固定文言を出力

		//変数宣言の方式１
		//二つ文字列の変数を定義する
		//値が一致する
		String str1 = "abc";
		String str2 = "abc";

		System.out.println("変数宣言の方式１:" + (str1 == str2));

		//文字列の比較　文字列1.equals(文字列2)
		System.out.println("変数宣言の方式１:" + str1.equals(str2));

		//変数宣言の方式２
		//クラス（タイプ）変数名 = new クラス（"変数値"）
		String str3 = new String("adc");
		String str4 = new String("abc");

		System.out.println("変数宣言の方式2:" + (str3 == str4));//NG


		//文字列の桁数
		System.out.println(str3.length());

		//文字列の演算
		//文字列＋文字列　＝　文字列
		System.out.println("abc" + "def");//実行結果：abcdef

		//文字列＋数値型　＝　文字列
		System.out.println(1 + "1");//実行結果：11
		
		//特別の文字
		System.out.println("m\'n");//実行結果：m'n
		System.out.println("m\"n");//実行結果：m"n
		System.out.println("m\\n");//実行結果：m\n
		System.out.println("m\tn");//実行結果：m	n
		System.out.println("m\nn");
		//実行結果：
		//m
		//n
		



	}

}
