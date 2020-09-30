package co.jp.chapter09.if0930;

public class Kicker {


	//内部クラス
	public static class Fish implements IPet{
		@Override
		public void hello() {
		System.out.println("awa awa");
		}
	}





	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//一般的な
		IPet cat = new Cat();
		cat.hello();

		//内部クラス
		IPet fish = new Fish();
		fish.hello();

		//匿名クラス

		IPet bird = new IPet() {
			@Override
			public void hello() {
			System.out.println("gugugugugugu");
			}
		};
		bird.hello();

		//ラムダ式
		IPet frog = () -> {
			System.out.println("gua gua gua gua ");
		};
		frog.hello();


		System.out.println(SEX.getEnum("1"));


	}

	int sum (int a ,int b) {
		return a+b;
	}

	void method_1() {

	}





}
