package co.jp.chapter06;

public class CAT {
	void eat() {
		System.out.println("eat eat");
	}
	
	void eat(String food) {
		System.out.println("eat :" + food);
	}
	
	void eat(String food, int kaisu) {
		for (int i = 0; i < kaisu; i++) {
		System.out.println("eat :" + food + "回数" + (i + 1));
	    }
	}
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		CAT hellokitty = new CAT();
		hellokitty.eat();
		hellokitty.eat("fish");
		hellokitty.eat("fish", 10);
	}

}
