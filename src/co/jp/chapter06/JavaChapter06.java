package co.jp.chapter06;

public class JavaChapter06 {

	// NG のネーミング形式
	String str1 = "";// クラスメンバー全局変数（成員変数）
	String str2 = "";

	// クラスメンバー
	void method1() {
		// 局部変数
		String strXXX = "method1 の Say hello";
		System.out.println(strXXX);
	}


	void method2() {
		// 局部変数
		String strXXX = "method1 の Say hello";
		System.out.println(strXXX);
	}

	// 直下　ＮＧ
	// System.out.println("main の Say hello");

	// 方法＜Method＞メソッド
	// 函数＜Function＞関数
	public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			// 呼び出す元（関数外部）
			JavaChapter06 obj = new JavaChapter06();

			obj.say();// 何でもよい
//			Object kanryoFlg2 = obj.say();
			Object nulltype = null;

			// 指定文言で出力
			String word = "同一个世界同一个梦想";
//			System.out.println(word);
			obj.sayWord(word);

//			obj.say_2();
//			String str1 = "1234";
//			System.out.println(str1);
//
//			String kanryoFlg = obj.say_2();
//			System.out.println(kanryoFlg);
		}

	void sayWord(String word) {
		System.out.println(word);
	}

	// 名前
	String namae = "LXH";
	// 年齢
	int nennrei = 30;
	// 会社アドレス
	String kaishaAdress = "虎ノ門";

	// 呼び出す先
	// void 修飾子 ① 手を挙げて
	// void 返却値の型 ②　何もしない
	void say() {
		System.out.println("sayメソッド　名前は" + namae);
		System.out.println("sayメソッド　年齢は" + nennrei);
		System.out.println("sayメソッド　会社アドレスは" + kaishaAdress);
	}

	String say_2() {
		System.out.println("say_2メソッド　名前は" + namae);
		System.out.println("say_2メソッド　年齢は" + nennrei);
		System.out.println("say_2メソッド　会社アドレスは" + kaishaAdress);
		String result = "完了";
		return result;
	}

	// 満期移行契約管理.自動車明細記名被保険者ＤＴＯ
	//MthIkKHkKnrJdshMKmhhknsHDto
}
