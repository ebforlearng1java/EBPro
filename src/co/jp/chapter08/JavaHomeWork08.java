package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1:以下のコードの出力するを回答してください
		//A1:

		//x == y 出力はtrue　　
		//プリミティブ型、演算子で比較している、同一のインスタンスを参照するように書き換えられる

		//x.equals(y)　出力はtrue　参照型、インスタンスの価値は同じだから

		//nullString.equals(empty) はエラーが発生、原因はメソッドを呼び出しです。
		//エラーメッセージ：null ポインター・アクセス: 変数 nullString はこのロケーションでは必ず null です
		//nullからメソッドを呼び出した場合にはNullPointerExceptionの例外が発生している


		String x = "a";
		String y = "a";
		System.out.println(x == y); // true ? false? 原因は ?
		System.out.println(x.equals(y)); // true ? false? 原因は ?

//		String empty = "";
//		String nullString = null;
//		System.out.println(nullString.equals(empty)); // true ? false? 原因は ?




		//Q2:以下のコードの出力するを回答してください
		//x == y  出力はfalse　　
		//原因は格納場所が違うので、そのまま位置を比較したらfalseになります

		//x.equals(y)　出力はtrue　
		//原因はメソッド内で値を比較しているので、trueになります。



//		package co.jp.chapter08;
//
//		public class Employee_Q2{
//			private String id;
//
//			public Employee_Q2(String id) {
//				this.id = id;
//			}
//
//			@Override
//			public boolean equals(Object another) {
//				if (another instanceof Employee_Q2) {
//					Employee_Q2 an = (Employee_Q2) another;
//					return an.id.equals(id);
//				}
//				return false;
//			}
//
//		}

//		package co.jp.chapter08;
//
//		public class Kicker_Q2 {
//			public static void main(String... args) {
//				Employee_Q2 x = new Employee_Q2("1234");
//				Employee_Q2 y = new Employee_Q2("1234");
//				System.out.println(x == y); // true ? false? 原因は ?
//				System.out.println(x.equals(y)); // true ? false? 原因は ?
//			}
//
//		}



		//Q3:以下コンパイルを修正してください。
		//A3:Kicker_Q3クラスの　print(Child v)　を　(Parent_Q3 v)に　変更
		//つまり、こども　から　親に変更しました。



//		package co.jp.chapter08;
//
//		public class Child_Q3 extends Parent_Q3 {
//			@Override // 親クラスの強制的にOverrideする意味（アノテーション）
//			public void hello() {
////				super.hello();
//				System.out.println("child_Q3 method");
//			}
//
//		}

//		package co.jp.chapter08;
//
//		public class Kicker_Q3 {
//			public static void print(Parent_Q3 v) {
//				v.hello();
//			}
//
//			public static void main(String... args) {
//
//
//
//				print(new Parent_Q3());
//
//
//				print(new Child_Q3());
//			}
//
//		}



	}

}
