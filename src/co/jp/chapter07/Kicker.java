package co.jp.chapter07;

//package co.jp.chapter07;
//06関数の質問4の答えは　value2

public class Kicker {

	private static void fillArray(String[] array) {
		array[0] = "value2";
	}

	public static void main(String args[]) {
		String[] array = new String[] { "value1" };
		fillArray(array);
		System.out.println(array[0]);
	}

}
