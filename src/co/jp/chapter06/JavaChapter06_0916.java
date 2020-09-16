package co.jp.chapter06;

public class JavaChapter06_0916 {
	
	//オーバーロード overload
	//話し方①
	public void say () {
		System.out.println("Hello");
	}
	
	
	//話し方②
	private void say (String word) {
		System.out.println(word);
	}
	
	
	//話し方③
	public void say (String word, int kaisu) {
		for (int i = 0; i < kaisu; i++) {
		System.out.println(word);
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		JavaChapter06_0916 obj = new JavaChapter06_0916();
		obj.say("123456");
		
	}

}
