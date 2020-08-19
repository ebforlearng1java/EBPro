package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//変数宣言の方式１：クラス（タイプ）変数名　＝　"変数値"
		//
		String name = "XZW";
		System.out.println(name);
		
		
		//二つ文字列の変数を定義する
		//値が一致する
		//
		String str1 = "abc";
		String str2 ="abc";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("変数宣言の方式1:"+ (str1==str2));
		
		
		
		//変数宣言の方式２：クラス（タイプ）変数名　＝　new クラス（"変数値"）
		//
		String str3 = new String ("abc");
		String str4 = new String ("abc");
		
		System.out.println("変数宣言の方式２:"+ (str3==str4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
