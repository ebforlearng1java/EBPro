package co.jp.chapter06;

public class JavaChapter06 {

	void method1 () {
		System.out.println("method1 の Say Hello");

	}

    //方法＜Method＞メソッド
	//関数＜Function＞
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//呼び出し
		JavaChapter06 obj = new JavaChapter06();
//		obj.say();
//		obj.say_2();
		String str1 = "1234";
		System.out.println(str1);
		
		String kanryoFlg = obj.say_2();
		System.out.println(kanryoFlg);

	}

	//名前
	String name = "XZW";
	//年齢
	int nenrei = 26;
	//会社アドレス
	String kaishaAddress = "虎ノ門";
	//
	void say() {
		System.out.println("sayメソッド　名前は"+name);
		System.out.println("sayメソッド　年齢は"+nenrei);
		System.out.println("sayメソッド　会社アドレスは"+kaishaAddress);
	}

		String say_2() {
			System.out.println("say_2メソッド　名前は"+name);
			System.out.println("say_2メソッド　年齢は"+nenrei);
			System.out.println("say_2メソッド　会社アドレスは"+kaishaAddress);

			String result = "完了";

			return result;
	}

}
