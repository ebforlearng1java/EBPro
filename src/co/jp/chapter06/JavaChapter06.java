package co.jp.chapter06;

public class JavaChapter06 {


	//方法＜Method＞メソッド
	//関数<Function>
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//呼び出し元
		JavaChapter06 obj = new JavaChapter06();
		obj.say();
		obj.say_2();
		
		//指定文言で出力
		String word = "テスト引数";
				obj.sayWord(word);
		
		String str1 = "1234";
		System.out.println(str1);
		
		String kanryouFlg = obj.say_2();
		System.out.println(kanryouFlg);

	}
	
	void sayWord(String word) {
		System.out.println(word);
	}
	
	
	
	//名前
	String name = "YQY";
	//年齢
	int age = 12;
	//会社アドレス
	String kaisyaAddress = "123@abc.com";
	
	//呼び出し先
	//void 返却値の型
	void say() {
		System.out.println("名前は" + name);
		System.out.println("年齢は" + age);
		System.out.println("会社アドレスは" + kaisyaAddress);
	}
	
	String say_2() {
		System.out.println("名前は" + name);
		System.out.println("年齢は" + age);
		System.out.println("会社アドレスは" + kaisyaAddress);
		
		String result = "完了";
		
		return result;
	}
	
	
	void testMethodDummy() {
		
	}
}
