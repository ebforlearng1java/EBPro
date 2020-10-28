package co.jp.chapter06;

public class Human {

	// オーバーロード overload
	// 話す方①
	public void say() {
		System.out.println("HELLO");
	}

	// 話す方②
	public void say(String word) {
		System.out.println(word);
	}

	// 話す方③
	public void say(String word, int kaisu) {
		for (int i = 0; i < kaisu; i++) {
			System.out.println(word);
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Human obj = new Human();
		obj.say("123456");

	}

}
