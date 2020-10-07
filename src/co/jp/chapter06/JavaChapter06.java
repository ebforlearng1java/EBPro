package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JavaChapter06 obj = new JavaChapter06();
		obj.say();
		obj.say_2();
		String str1 = "1234";
		System.out.println("main の say hello");

	}
	//名前
	String namae = "LXH";
	//年齢
	int nennrei = 30;
	//会社アドレス
	String kaishaAdress = "虎ノ門";

	//呼び出し先
	void say() {
		System.out.println("名前" + namae);
		System.out.println("年齢" + nennrei);
		System.out.println("会社アドレス" + kaishaAdress);
	}
	String say_2() {
		System.out.println("say_2名前" + namae);
		System.out.println("say_2年齢" + nennrei);
		System.out.println("say_2会社アドレス" + kaishaAdress);

		String result = "完了";
		return result;

	}
}
