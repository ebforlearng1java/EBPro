package co.jp.chapter09.if0930;

public class Kicker {

	//static Cat cat2;

	// 内部クラス
	public static class Fish implements IPet {
		@Override
		public void hello() {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("GULUGULU");
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println(SEX.getValue("1"));




//		// 一般①
//		IPet cat = new Cat();
//		cat.hello();
//
//		IPet dog = new Dog();
//		dog.hello();
//
//		// 内部クラス②
//		IPet fish = new Fish();
//		fish.hello();
//
//		// 匿名クラス③
//		IPet bird = new IPet() {
//			@Override
//			public void hello() {
//				System.out.println("WAWAWAWAWAWWA");
//			}
//		};
//		bird.hello();

		// ラムダ式④
//		IPet frog = (a,b) -> {
//			System.out.println(a + "----!!!!" + b);
//		};
//		frog.hello("123123123", "ABCSDSD");

	}



	int sum (int a, int b) {
		return a + b;
	}

	void method_1 () {

	}

}
