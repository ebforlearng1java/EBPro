package co.jp.chapter06;

public class JavaChapter06 {

	// 名前
		String namae = "JY";

		// 年齢
		int nennrei = 30;

		// 会社アドレス
		String kaishaAdress = "sedr";

		// 方法＜Method＞ メソッド
		//　関数＜Function＞
		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			//呼び出し元
			JavaChapter06 obj = new JavaChapter06();
			obj.say();
			obj.say1();
			String kanryoFlg = obj.say1();
			System.out.println(kanryoFlg);




		}
		void testMethodDummy () {

		}

		// 呼び出し先
		void say() {
			System.out.println("名前は" + namae);
		}

		String say1() {
			System.out.println("名前は" + namae);
			String result = "完了";
			return result;
		}

}
