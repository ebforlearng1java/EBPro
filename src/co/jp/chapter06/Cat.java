package co.jp.chapter06;

public class Cat {

	public void eat() {
		System.out.println("魚を食べる");
	}

	public void eat(String way) {
		System.out.println(way);
	}

	public void eat(String way,int kaisu) {
		for(int i=0;i<=kaisu; i++) {
			System.out.println(way);
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Cat hellokitty = new Cat();
		hellokitty.eat();
		hellokitty.eat("ミルクを飲む");
		hellokitty.eat("キャットフード", 5);

	}

}
