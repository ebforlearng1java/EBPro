package co.jp.chapter06;

public class JavaChapter06 {

    //変数はクラスの直下においても大丈夫。
	String str = "123";

	public static void main(String[] args) {

		// TODO 自動生成されたメソッド・スタブ
		//呼び出し
		JavaChapter06 obj = new JavaChapter06();
		obj.say();
		obj.say2();
		String finlFlag = obj.say2();
		System.out.println(finlFlag);
		String word = "aaa";
		obj.sayWord(word);
		String word1 = "bbb";
		String word2 = "ccc";
		obj.sayWord2(word1,word2);



	}


	//新規メソッド
	String name = "HAD";
	void say() {
		System.out.println("名前"+name);

	}
	String say2() {
		System.out.println("名前"+name);
		return"完了";
	}
    //引数一つ
	void sayWord(String word) {
		System.out.println(word);

	}

	//複数の引数
	void sayWord2(String word1,String word2) {
		System.out.println(word1+word2);
	}


}
