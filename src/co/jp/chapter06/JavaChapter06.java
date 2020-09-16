package co.jp.chapter06;

public class JavaChapter06 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JavaChapter06 obj=new JavaChapter06();
		obj.say();
		String kannryoFlg=obj.say_2();
		System.out.println(kannryoFlg);

		String word="Word";
		obj.sayWord(word);

		String food="catfood";
		int catnum=5;
		Cat cat=new Cat();

		cat.eat();
		cat.eat(food);
		cat.eat(food, catnum);
	}

	void testMethodDummy() {

	}

	//名前
	String name="DW";
	//年齢
	int nennrei=30;
	//会社アドレス
	String kaishaAddress="虎ノ門";

	void say() {
		System.out.println("名前は"+name);
		System.out.println("年齢は"+nennrei);
		System.out.println("会社アドレスは"+kaishaAddress);
	}

	String say_2() {
		System.out.println("名前は"+name);
		System.out.println("年齢は"+nennrei);
		System.out.println("会社アドレスは"+kaishaAddress);
		String result= "完了";
		return result;
	}

	void sayWord(String word) {
		System.out.println(word);
	}

	void method1() {
		// 局部変数
		String strXXX = "method1 の Say hello";
		System.out.println(strXXX);
	}
}
