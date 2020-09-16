package co.jp.chapter06;

public class Kicker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("質問３の答え：");
		String x = null;
		sayHello(x);
		System.out.println(x);

		System.out.print("質問４の答え：");
		String[] array1 = new String[] { "value1" };
		fillArray1(array1);
		System.out.println(array1[0]);

		System.out.print("質問５の答え：");
		String[] array2 = null;
		fillArray2(array2);
		System.out.println(array2 == null);

	}

	private static void sayHello(String y) {
		y = "Hello world";
	}

	private static void fillArray1(String[] array) {
		array[0] = "value2";
	}

	private static void fillArray2(String[] array) {
		array = new String[] { "1", "2" };
	}

}
