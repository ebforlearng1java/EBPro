package co.jp.chapter06;

public class JavaChapter06 {


//	String str ="123";
//
//	int index = 30;
//
//	String kaishaAdress = "虎ノ門";


	//方法→method→メソッド
	//函数→Function→関数
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//呼び出し
		JavaChapter06 obj = new JavaChapter06();
		obj.say();
		obj.say_2();
		obj.testMethodDummy();

		String str1="123";
		String kanryoFlg = obj.say_2();
		System.out.println(kanryoFlg);

		// 指定言語を出力
		String word1 = "同じ世界、同じ夢";
		obj.sayWord(word1);


		System.out.println("main's say hello");



	}


	//a e i o u 除去する場合がある
	//満期移行契約管理・自動車明細記名被保険者DTO
	//MthikoKeiyakuKanriJidoushaMeisaiKimeihihoukensya


	void testMethodDummy() {
		System.out.println("testの say hello ");

	}

	String namae ="LLL";

	int nenrei = 30;

	String kaishaAdress = "虎ノ門";


	void say() {
		System.out.println("say名前は"+namae);
		System.out.println("say年齢は"+nenrei);
		System.out.println("say会社アドレスは"+kaishaAdress);
	}

	String say_2() {
		System.out.println("say_2名前は"+namae);
		System.out.println("say_2年齢は"+nenrei);
		System.out.println("say_2会社アドレスは"+kaishaAdress);

		//String result ="完了";
		return "完了";

	}

	//public
	//static


	void sayWord(String word3) {
		System.out.println(word3);

	}













}
