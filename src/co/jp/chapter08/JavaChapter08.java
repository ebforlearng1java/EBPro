package co.jp.chapter08;

public class JavaChapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Animal an = new Animal();
//		System.out.println(an.name);
//
//		Fish nimo = new Fish();
//		nimo.name = "fish";
//		System.out.println(nimo.name);
//
//		Dog dog = new Dog();
//		dog.name = "dog";
//		System.out.println(dog.name);
//		System.out.println(nimo.name);
//		dog.say("wangwang");
//
//
//		Car taxi = new Car();
//		System.out.println(taxi.luntai.lungu);

		Animal an = new Animal();
		Bird bird = new Bird();
		System.out.println(bird.getType(bird));
		Karasu karasu = new Karasu();
		System.out.println(karasu.getType(karasu));

//		static void handan(Animal an) {
//			System.out.println(an.getType(an));
//		}


	}

}
