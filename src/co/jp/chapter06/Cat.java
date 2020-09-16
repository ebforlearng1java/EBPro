package co.jp.chapter06;

public class Cat {

	void eat() {
		System.out.println("catfood");
	}

	void eat(String food) {
		System.out.println(food);
	}

	void eat(String food,int catnum) {
		for(int i=0;i<catnum;i++) {
			System.out.println(food);
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String food="catfood";
		int catnum=5;
		Cat cat=new Cat();

		cat.eat();
		cat.eat(food);
		cat.eat(food, catnum);
	}

}
