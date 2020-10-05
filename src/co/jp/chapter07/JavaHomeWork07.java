package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ.
		//質問︓以下コードはコンバインエラー発⽣しますか︖理由は︖
//		package earth;
//		public class Human {
//		private String name;
//		protected int age = 10;
//		public String getName() {
//		return name;
//		}
//		}
//		// クラス２ Sample.java (ファイル異なる要注意)
//		package earth;
//		public class Sample {
//		public static void main(String...args) {
//		Human man = new Human();
//		System.out.println(man.name);// NG, nameはprivateの為、アクセス不可
//		System.out.println(man.age);// OK, ageはprotected、同じPackageのクラスアクセス可能
//		System.out.println(man.getName()); // OK, publicの為、いつでもどこでもアクセス可能
//		}
//		}
		System.out.println("エラーは発生します、原因はHumanクラスのNameは私的修飾子");
		
		//質問︓上記UML図通り、Javaクラスを作成してください。「private」、「protected」、
		//「public」等キーワードを覚えておいてください。
		System.out.println("クラスUMLを参照");
		
		//質問︓下記コードのBugを探します。
		// Human.java
//		public class Human {
//		private String name;
//		}
//		// Kicker.java
//		public class Kicker {
//		public static void main(String...args) {
//			Human obj = null;
//			System.out.println(obj.name); // Nullpointer：obj = null;
//			}
//			}
		System.out.println("HumanのNameメソッドはprivateなので、Kickerクラスから呼び出すことができない");
		
		
//		質問１︓ペットクラスを定義してください。ペットクラスは名称と年齢を保有して。以下
//		２インスタンスを作成してください。変数１︓cat , 変数２︓dog。catの名称は ”cat”, 年齢
//		=2, dogの名称は ”dog”, 年齢=5。
		Pet cat = new Pet();
		Pet dog = new Pet();
		
		cat.setAge(2);
		cat.setName("cat");
		System.out.println("猫の名前は"+ cat.getName() + "年齢は" + cat.getAge());
		
		dog.setAge(5);
		dog.setName("dog");
		System.out.println("犬の名前は"+ dog.getName() + "年齢は" + dog.getAge());
		
//		質問２︓アマゾンの各商品(Product)にて、クラスを定義してください。例︓価格、写
//		真、商品名など…
		System.out.println("Productクラスを参照");
		
//		質問︓以下コンパイルエラー理由を教えてください。
//		public class Sample {
//			private final int a = 10;
//			public void setA(int a) {
//			this.a = a; // NG フィールドaの値を再代入しよう
//			}
//			}
		System.out.println("aはすでに値が入っている（final）、setすることができない");
		
//		質問︓以下メソッドの静的メンバアクセス所を説明してください。（１箇所）
//		public static void main(String...args) {
//			System.out.println("some thing"); // ここに１箇所静的メンバアクセスしている
//			}
		System.out.println("1. 静的なフィールドは︖String\r\n" + 
				"2. メソッドを呼び出していますか︖呼び出しています\r\n" + 
				"3. メソッドを呼び出す時、渡すの引数は︖渡す因数はString args");
		
//		以下ソースのコンパイルエラーを説明してください。
//		public class Kicker {
//			private String word = "abc";
//			public void print(String name) {
//				System.out.println(name);
//			}
//			public static void main(String[] args) {
//				// TODO Auto-generated method stub
//				print("dcnet.java.教育");
//				System.out.println(word);
//
//			}
//
//		}
		System.out.println("mainメソッドは静的メンバ変数を呼び出す");
		
//		質問２に以下ソース修正したらコンパイルエラー解消できますが、理由を教えてくださ
//		い。
//		public class Kicker {
//			private String word = "abc";
//			public void print(String name) {
//			System.out.println(name);
//			}
//			public static void main(String...args) {
//			Kicker kicker = new Kicker();
//			kicker.print("dcnet.java.教育");
//			System.out.println(kicker.word);
//			}
//			}
		System.out.println("解消できます、kickerをインスタント化したから");
		
		
//		質問１︓以下コードのコンパイルエラー理由を教えてください。
//		// Pet.java
//		public class Pet {
//		public String name;
//		public void setName(String value) {
//		this.name = value;
//		}
//		}
//		// Kicker.java
//		public class Kicker {
//		public static void main(String...args) {
//		Pet cat = new Pet();
//		cat.setAge(1234);
//		}
//		}
		System.out.println("Petクラスに、Ageメンバ変数がない");
		
//		質問２︓Mathクラスを作成してください。以下メソッドを定義します。
//		1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
//		2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
//		3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
//		4. mainメソッドで上記それぞれメソッドを呼び出してください。
//		以下はメソッドの定義のソースの抜枠です。
//		public class Math {
//			public static int max(int[] input) {
//			//...
//				}
//			}
		System.out.println("Mathクラスを参照");
		
		
//		2.⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
//		public class Matrix {
//			private final int[][] data;
//			/** construct method */
//			public Matrix(int[][] data) {
//			this.data = data;
//			}
//			// 行列 ADD
//			public Matrix add(Matrix b) {
//			//....
//			return ???
//			}
//			}
		System.out.println("Matrixクラスを参照");
		
		

	}

}
