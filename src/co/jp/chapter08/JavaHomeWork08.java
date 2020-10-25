/**ーーーーーーーーーーーーーーーーー08 OOP - その２ーーーーーーーーーーーーーーーーー */
package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問1：以下コードの出⼒するを回答してください。
		String x = "a";
		String y = "a";
		System.out.println(x == y);//true　同じの"a"を指定しるいる。
		System.out.println(x.equals(y));//true　原因：文字列の内容が同じ。

		String empty = "";
		String nullString = null;
		System.out.println(nullString.equals(empty));//空指针異常が発生。

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
		System.out.println(v == w); //　false　それぞれのメモリ位置を指定している。
		System.out.println(v.equals(w)); //　true　内容の比較、同じ文字列。
		//		 }

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
		//回答：以下のようにpublic static void print(Child v)の引数の型をParentに修正する
	}

	public static void print(Parent v) {
		v.hello();
	}
}
