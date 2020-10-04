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
		
		
		
		

	}

}
