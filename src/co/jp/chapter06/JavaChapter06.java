package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("main no say hello");
		JavaChapter06 obj = new JavaChapter06();

		// 呼出元
		obj.say();
		System.out.println();
		String kanryoFlg = obj.say_02();
		System.out.println(kanryoFlg);

		Object nulltype = null;

		String word_01 = "同じ世界で、同じ夢を持つ！";
		obj.sayWord(word_01);

	}

		void sayWord(String word) {
			System.out.println(word);
		}
	// 名前
		String nmae = "WL";

		// 年齢
		String nenrei = "26";

		// 会社アドレス
		String kaishaAdress = "虎ノ門";

		// 呼出先
		void say() {

			System.out.println("名前は " + nmae);
			System.out.println("年齢は " + nenrei);
			System.out.println("会社アドレスは " + kaishaAdress);


		}

		String say_02() {

			System.out.println("名前は " + nmae);
			System.out.println("年齢は " + nenrei);
			System.out.println("会社アドレスは " + kaishaAdress);

			String result = "完了";
			return result;

		}
}
