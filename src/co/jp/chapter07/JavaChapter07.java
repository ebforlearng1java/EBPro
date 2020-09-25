package co.jp.chapter07;

public class JavaChapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//クラス　Dog;type  snoop:オブジェクト名称　
		//newしたものは違う領域にいる
		//インスタンス(事例化対象)　と　コンストラクタ
		//クラスタイプ　オブジェクト名称＝new クラスのコンストラクタ


		//①
//		Dog snoopy = new Dog();
//		System.out.println(snoopy.getName());
//		System.out.println(snoopy.getAge());

//		snoopy.setName("snoopy");
//		snoopy.setAge(5);
//		snoopy.setSex("boy");
//
//
//		System.out.println(snoopy.getName());
//		System.out.println(snoopy.getAge());
//		System.out.println(snoopy.getSex());

//		Dog jinmao  = new Dog();

		//②
		Dog xiaobai = new Dog("新之助のシロ",6,"boy");
		System.out.println(xiaobai.getName());
		System.out.println(xiaobai.getAge());
		System.out.println(xiaobai.getSex());


		//③
//		Dog wangwang = new Dog(3,"boy");
//		wangwang.setName("wangwang");
//
//		System.out.println(wangwang.getName());
//		System.out.println(wangwang.getAge());
//		System.out.println(wangwang.getSex());



	}

}
