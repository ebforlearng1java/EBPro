package co.jp.chapter06;

public class Cat {

	// 食べる①
	void eat() {
		System.out.println("eat eat");
	}

	// 食べる②　基本コーア
	void eat(String food) {
		System.out.println("eat ：" + food);
	}

	// 食べる③　プラス　展開
	void eat(String food, String kaisu) {
		for (int i = 0; i < Integer.valueOf(kaisu); i++) {
			eat(food);// 食べる②
			System.out.println(" 回数：" + (i + 1));
			//System.out.println("eat ：" + food + " 回数：" + (i + 1));
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Cat hellokitty = new Cat();
		hellokitty.eat();
		hellokitty.eat("小魚干");
		hellokitty.eat("小魚干", "10");
	}

}
