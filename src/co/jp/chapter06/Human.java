package co.jp.chapter06;

public class Human {

	//オーバーロード overload
	void say() {
		System.out.println("HELLO");
	}

	void say(String word) {
		System.out.println(word);
	}

	void say(String word,int kaisu) {
		for(int i=0;i<kaisu;i++) {
			System.out.println(word);
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
