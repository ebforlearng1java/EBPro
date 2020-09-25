package co.jp.chapter07;

public class JavaChapter07_static2 {


	//常量
	public final static String PAI_4 = "3.1415";
	public final static String PAI_2 = "3.14";


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		System.out.println(PAI_2);
		System.out.println(PAI_4);






		//静態 →　非静態

		//①外置
//		int count =0;
//		Cat hellokitty = new Cat("HelloKitty",3,"girl");
//		count += 1;
//		System.out.println(count);


		//手動
//		Cat hellokitty = new Cat("HelloKitty",3,"girl");
//		hellokitty.count += 1;
//		Cat nyankosensei = new Cat("nyankosensei",1000,"?");
//
//		System.out.println(hellokitty.count);



		//機能化
		Cat hellokitty = new Cat("HelloKitty",3,"girl");

		System.out.println(hellokitty.count);

		Cat nyankosensei = new Cat("nyankosensei",1000,"?");

		System.out.println(hellokitty.count);




	}

}
