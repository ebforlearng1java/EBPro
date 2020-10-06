package co.jp.chapter07;

public class JavaChapter07_static2 {

	public final static String PAI="3.14";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//①外置
		int count=0;
		Cat kitty1=new Cat("白ちゃん",4,"boy");
		count+=1;
		System.out.println(count);

		//②手動
		Cat kitty2=new Cat("白ちゃん",4,"boy");
		Cat.count+=1;
		System.out.println(Cat.count);

		Cat kitty3=new Cat("白ちゃん",4,"boy");
		System.out.println(Cat.count);

	}

}
