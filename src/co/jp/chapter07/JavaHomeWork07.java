package co.jp.chapter07;

public class JavaHomeWork07 {


 	public static void main(String[] args) {
 		// TODO 自動生成されたメソッド・スタブ.


        //Ｐ５の質問︓以下コードはコンバインエラー発生しますか？理由は？
// 		package earth;
// 		public class Human {
// 		private String name;
// 		protected int age = 10;
// 		public String getName() {
// 		return name;
// 		}
// 		}
// 		// クラス２ Sample.java (ファイル異なる要注意)
// 		package earth;
// 		public class Sample {
// 		public static void main(String...args) {
// 		Human man = new Human();
// 		System.out.println(man.name);// NG, nameはprivateの為、アクセス不可
// 		System.out.println(man.age);// OK, ageはprotected、同じPackageのクラスアクセス可能
// 		System.out.println(man.getName()); // OK, publicの為、いつでもどこでもアクセス可能
// 		}
// 		}
//答：エラーは発生します。理由はローカル・クラスHumanの修飾子は私的修飾子ですから、正しくありません。


 		//Ｐ６の質問：
 //答：クラスＵＭＬを参考してください。


 		//Ｐ７の質問：下記コードのＢｕｇを探します
 	    //Human02.java
// 		 		public class Human02 {
// 		 		private String name;
// 		 		}

 		//Kicker.java
// 		 		public class Kicker {
// 		 		public static void main(String...args) {
// 		 			Human02 obj = null;
// 		 			System.out.println(obj.name); // Nullpointer：obj = null;
// 		 			}
// 		 			}
//答：Humanのアクセス修飾子はprivateですから、クラスKickerから呼び出すことはできません。


 		//Ｐ１５の質問２：
//		メソッドsetAge()はまだ定義されない


 		//Ｐ１６の質問１：
 	    // Pet.java
//    	public class Pet {
//	    public String name;
//
//	    public void setName(String value) {
//	    this.name = value;
//	 }
//		}
 		// Kicker.java
// 		public class Kicker {
//	    public static void main(String...args) {
//        Pet cat = new Pet();
//        cat.setAge(1234);
//        }
//	}
//答え：メソッドsetAgeはＰｅｔで変数がありません。


 		//Ｐ１６の質問２：
// 		クラスMathを参考してください
//      クラスMatrixを参考してください



 	}
 }