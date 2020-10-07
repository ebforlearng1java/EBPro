package co.jp.chapter08;

public class Kicker_Q3 {
	public static void print(Parent_Q3 v) {
		v.hello();
	}

	public static void main(String... args) {



		print(new Parent_Q3());


		print(new Child_Q3());
	}

}
