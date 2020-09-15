package co.jp.chapter07;

//package co.jp.chapter07;

public class dummy {
	//06関数の質問3の答えはnull

	private static void sayHello(String y) {
		y = "Hello world";
	}

	public static void main(String args[]) {
		String x = null;
		sayHello(x);
		System.out.println(x);

	}

}
