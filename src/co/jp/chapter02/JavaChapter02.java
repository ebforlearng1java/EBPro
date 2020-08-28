package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		String name = "JY";
		System.out.println(name);



		// 二つ文字列の変数を定義する
		//　値が一致する
		String a = "JY";
		String b = "JY";
		System.out.println("変数の宣言（方式１）:"+ (a == b));

		// 変数宣言の方式２
		// クラス（タイプ）　変数名　＝　new　クラス（”変数値”）
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println("変数の宣言（方式２）:"+ (str3 == str4)); //NG
		System.out.println("変数の宣言（方式２）:"+ (str3.equals(str4)));//ok

		// 文字列比較
		// == NG
		// 1.メモリーの物理アドレス
		// 2.値
	}

}
