package co.jp.chapter07;

public class JavaChapter07_static2 {

	//常量
	public final static String PAI = "3.14";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//静的　⇆ 非静的
		//①外部から設定
		//		int count = 0;
		//		Cat helloKitty = new Cat("HelloKitty", 3, "girl");
		//		count += 1;
		//		System.out.print(count);
		//②手動
		//		Cat helloKitty = new Cat("HelloKitty", 3, "girl");
		//		System.out.println(helloKitty.count);

		//③自動化
		Cat neko = new Cat("neko1", 3, "girl");
		Cat neko1 = new Cat("neko2", 3, "girl");
		Cat neko2 = new Cat("neko3", 3, "girl");
		Cat neko3 = new Cat("neko4", 3, "girl");
		System.out.println(neko.getName());

	}

}
