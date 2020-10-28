package co.jp.chapter07;

public class JavaChapter07_static2 {

	// 常量
	public final static String PAI_2KETA = "3.141";

	public final static String PAI_7KETA = "3.1415926";


//	public final static String SRCA = "EB_PAGE_001";
	public final static String SRCA = "EB_NEWPAGE_001";
	public final static String SRCB = "EB_PAGE_002";


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 静態 ⇔ 非静態

		System.out.println(PAI_2KETA);
		System.out.println(PAI_7KETA);



		//      // ① 外置
		//		int count = 0;
		//		Cat helloKitty = new Cat("HelloKitty",3,"girl");
		//		count += 1;
		//		System.out.println(count);

		//		// ② 手動
		//		Cat helloKitty = new Cat("HelloKitty",3,"girl");
		//		helloKitty.count += 1;
		//
		//		Cat nyankosensei = new Cat("nyanko",1000,"?");
		//		// XXX
		//
		//		System.out.println(helloKitty.count);

		//		// ③ 機能化
		Cat helloKitty1 = new Cat("HelloKitty", 3, "girl");
		System.out.println(Cat.count);

		Cat helloKitty2 = new Cat("HelloKitty", 3, "girl");
		System.out.println(helloKitty1.count);

		Cat helloKitty3 = new Cat("HelloKitty", 3, "girl");
		Cat helloKitty4 = new Cat("HelloKitty", 3, "girl");
		Cat helloKitty5 = new Cat("HelloKitty", 3, "girl");
		Cat helloKitty6 = new Cat("HelloKitty", 3, "girl");
		Cat helloKitty7 = new Cat("HelloKitty", 3, "girl");
		Cat helloKitty8 = new Cat("HelloKitty", 3, "girl");

		System.out.println(helloKitty2.count);

		System.out.println(String.valueOf(null));
		System.out.println(Integer.valueOf(null));
	}

}
