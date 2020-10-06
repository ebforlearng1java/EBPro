package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問１
		String x= "a";
		String y = "a";
		//"a"の位置は一つですので、trueを出力する。
		System.out.println(x == y);
		// equals はxとyの値を比較するので、trueを出力する。
		System.out.println(x.equals(y));

		String empty = "";
		String nullString = null;
		// 空指针異常が発生する
		System.out.println(nullString.equals(empty));

		//質問２
//		public class Employee {
//			private String id;
//			 public Employee(String id) {
//			 this.id = id;
//			 }
//			 @Override
//			 public boolean equals(Object another) {
//			 if (another instanceof Employee) {
//			 Employee an = (Employee) another;
//			 return an.id.equals(id);
//			 }
//			 return false;
//			 }
//		}
//
//		public class Kicker {
//			public static void main(String...args) {
//				 Employee x = new Employee("1234");
//				 Employee y = new Employee("1234");

//				 System.out.println(x == y); // 出力結果はfalseです。 ==  はｘとｙの位置を比較します。
//				 System.out.println(x.equals(y));    // 出力結果はtrueです。equalsはｘとｙの値を比較します。
//				 }
//		}
	}
	//質問3
	// print(new Parent());行で、コンパイルエラーが発生します。
	// Kickerクラスでpublic static void print(Parent v)  {	v.hello();}メソッドを追加します。原因：Parent は child の親クラスです。
//	public class Parent {
//		public void hello() {
//			 System.out.println("parent method");
//			 }
//	}
//
//	public class child extends Parent{
//		@Override // 親クラスの強制的にOverrideする意味（アノテーション）
//		 public void hello() {
//		 System.out.println("child method");
//		 }
//	}
//	public class Kicker {
//		public static void print(child v) {
//			v.hello();
//		}
//		追加メソッド
//		public static void print(Parent v) {
//			v.hello();
//		}
//
//		public static void main(String... args) {
//			print(new Parent());
//			print(new child());
//
//		}
//	}


}
