package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問︓以下コードのコンパイルエラー理由を教えてください。
//		// Parent.java
//		public final class Parent {}
//		// Child.java
//		public class Child extends Parent {}
		System.out.println("Parentクラスはすでにfinalとなっている、継承はされない");


//		質問１︓以下コードの出⼒するを回答してください。
//		String x = "a";
//		String y = "a";
//		System.out.println(x == y); // true ? false? 原因は ?
//		System.out.println(x.equals(y)); // true ? false? 原因は ?
//		String empty = "";
//		String nullString = null;
//		System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
		System.out.println("x == y true\n x.equals(y)\n nullString.equals(empty):エラー　原因はnullStringが初期化されていない" );
		
//		質問２︓以下コードの出⼒を回答してください。
//		// Employee.java
//		public class Employee {
//		private String id;
//		public Employee(String id) {
//		this.id = id;
//		}
//		@Override
//		public boolean equals(Object another) {
//		if (another instanceof Employee) {
//		Employee an = (Employee) another;
//		return an.id.equals(id);
//		}
//		return false;
//		}
//		}
//		// Kicker.java
//		public class Kicker {
//		public static void main(String...args) {
//			Employee x = new Employee("1234");
//			Employee y = new Employee("1234");
//			System.out.println(x == y); // true ? false? 原因は ?
//			System.out.println(x.equals(y)); // true ? false? 原因は ?
//			}
//			}
		System.out.println("x == y ：違うインターフェイスにいる、物理の位置も違う、False\n"+"x.equals(y)：idは同じ");
		
//		質問３︓以下コンパイルを修正してください。
//		// Parent.java
//		public class Parent {
//		public void hello() {
//		System.out.println("parent method");
//		}
//		}
//		// Child.java
//		public class Child extends Parent {
//		@Override // 親クラスの強制的にOverrideする意味（アノテーション）
//		public void hello() {
//		System.out.println("child method");
//		}
//		}
//		// Kicker.java
//		public class Kicker {
//		public static void print(Child v) {
//		v.hello();
//		}
//		public static void main(String...args) {
//		print(new Parent());
//		print(new Child());
//		}
//		}
		System.out.println("Kikcerクラスを参照");
		
		
		
		
		
	}

}
