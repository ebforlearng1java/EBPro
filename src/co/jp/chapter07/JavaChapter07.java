package co.jp.chapter07;

public class JavaChapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Dog snoopy=new Dog();
		snoopy.setName("snoopy");
		snoopy.setAge(5);
		snoopy.setSex("BOY");

		System.out.println(snoopy.getName());
		System.out.println(snoopy.getAge());
		System.out.println(snoopy.getSex());

		//②
		Dog xiaobai=new Dog("白ちゃん",4,"boy");
		System.out.println(xiaobai.getName());
		System.out.println(xiaobai.getAge());
		System.out.println(xiaobai.getSex());

		//③
		Dog wangwang=new Dog("Wangwangちゃん");
		wangwang.setAge(2);
		wangwang.setSex("girl");
		System.out.println(wangwang.getName());
		System.out.println(wangwang.getAge());
		System.out.println(wangwang.getSex());
	}

}
