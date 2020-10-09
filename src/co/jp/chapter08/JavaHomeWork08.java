package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void print(Child v) {
		v.hello();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問１︓以下コードの出力結果について回答してください。
//		String x = "a";
//		String y = "a";
//		System.out.println(x==y);  // false,メモリアドレスを比較しているため。
//		System.out.println(x.equals(y)); // true,具体的な値を比較しているため。
//		String empty = "";
//		String nullString = null;
//		System.out.println(nullString.contentEquals(empty)); // false,nullPointException.

		// 質問２︓以下コードの出力を回答してください。
		Employee x_01 = new Employee("1234");
		Employee y_01 = new Employee("1234");
		System.out.println(x_01==y_01);  // false,メモリアドレスを比較しているため。
		System.out.println(x_01.equals(y_01)); // true,具体的な値を比較しているため。

		// 質問３︓以下コンパイルを修正してください。
		print((Child)new Parent());
		print(new Child());

	}

}
