package co.jp.chapter07;

public class JavaChapter07 {

	public static void main(String[] args) {

		//		int index = 123;
		//		String str = "ABC";//
		//		String str2 = new String("ABC");
		//		System.out.println(str == str2);

		// インスタンス（実例化対象） と コンストラクタ
		// クラスタイプ オブジェクト名称 = new 左記クラスのコンストラクタ

		// ①
//		Dog snoopy = new Dog();
//		snoopy.setName("snoopy");
//		snoopy.setAge(5);
//		snoopy.setSex("BOY");
//
//		System.out.println(snoopy.getName());
//		System.out.println(snoopy.getAge());
//		System.out.println(snoopy.getSex());

		// ②
		Dog xiaobai = new Dog("新之助の白ちゃん", 4, "boy");
		System.out.println(xiaobai.getName());
		System.out.println(xiaobai.getAge());
		System.out.println(xiaobai.getSex());


		// ③ wangwang
//		Dog wangwang = new Dog("wangwang");
//		wangwang.setAge(10);
//		wangwang.setSex("boy");
//
//		System.out.println(wangwang.getName());
//		System.out.println(wangwang.getAge());
//		System.out.println(wangwang.getSex());

		//		Dog snoopy2 = new Dog();
		//		snoopy.dog();


		//		System.out.println(snoopy.getName());
		//		System.out.println(snoopy.getAge());
		//		System.out.println(snoopy.getSex());
		//
		//		Dog jinmao = new Dog();
		//		jinmao.name = "jinmao";
		//		jinmao.age = 2;
		//		jinmao.sex = "gril";
		//		System.out.println(jinmao.name);
		//		System.out.println(jinmao.age);
		//		System.out.println(jinmao.sex);
		//
		//		Dog xiaobai = new Dog();
		//		xiaobai.name = "xiaobai";
		//		xiaobai.age = 4;
		//		xiaobai.sex = "boy";
		//		System.out.println(xiaobai.name);
		//		System.out.println(xiaobai.age);
		//		System.out.println(xiaobai.sex);
	}
}
