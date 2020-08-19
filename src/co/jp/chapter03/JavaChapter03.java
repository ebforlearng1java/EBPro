package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//https://github.com/ebforlearng1java/EBPro
		//ebforlearng1java
		//learng1java

		String str1 = "hello";
		String str3 = new String("hello");

		if (str1 == str3) {
			//true処理ロジック
			System.out.println("str1とstr3が一致");
		} else {
			//false処理ロジック
			System.out.println("str1とstr3が不一致");
		}

		int i=50;
		if (i>10) {
			//true処理ロジック
			System.out.println("i>10");
		} else {
			//false処理ロジック
			System.out.println("i<=10");
		}

	}

}
