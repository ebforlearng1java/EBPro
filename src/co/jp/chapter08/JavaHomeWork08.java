package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/** 08 OOP - その２ */

		//質問１︓以下コードの出⼒するを回答してください。
		String x = "a";
		String y = "a";
		System.out.println(x == y);
		//答え： true  原因は同じ位置の"a"を指定しるいる。

		System.out.println(x.equals(y));
		//答え： true  原因は文字列内容が同じ。

		String empty = "";
		String nullString = null;
//		System.out.println(nullString.equals(empty));
		//答え： NullPointerエラーとなる 原因はnullの場合は、equalsメソッドが使えない。

		//質問２︓以下コードの出力を回答してください。
		// Employee.java
//		public class Employee {
//		 private String id;
//		 public Employee(String id) {
//		 this.id = id;
//		 }
//		 @Override
//		 public boolean equals(Object another) {
//		 if (another instanceof Employee) {
//		 Employee an = (Employee) another;
//		 return an.id.equals(id);
//		 }
//		 return false;
//		 }
//		}
//		 public static void main(String[]args) {
		 Employee v = new Employee("1234");
		 Employee w = new Employee("1234");
		 System.out.println(v == w); // true ? false? 原因は ?
		 System.out.println(v.equals(w)); // true ? false? 原因は ?
//		 }
		//答え：v == w: false、違うメモリ位置を指定している。
		 //v.equals(w): true、OverrideのメソッドにString型のidをequalsで比較している。

		 //質問３︓以下コンパイルを修正してください。
		// Parent.java
//		 public class Parent {
//		  public void hello() {
//		  System.out.println("parent method");
//		  }
//		 }
//		 // Child.java
//		 public class Child extends Parent {
//		  @Override // 親クラスの強制的にOverrideする意味（アノテーション）
//		  public void hello() {
//		  System.out.println("child method");
//		  }
//		 }
//		 // Kicker.java
//		 public class Kicker {
//		  public static void print(Child v) {
//		  v.hello();
//		  }
//		  public static void main(String...args) {
		  print(new Parent());
		  print(new Child());
//		  }
//		 }
		 //答え：以下のようにpublic static void print(Child v)の引数の型をParentに修正する
	}
	  public static void print(Parent v) {
	  v.hello();
	  }
}
