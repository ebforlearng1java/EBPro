package co.jp.chapter06;

public class JavaHomework06_Q1345 {


	// TODO 自動生成されたメソッド・スタブ

			//質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。

			//  public static void main(String[] args);

			//答え：
			// ①修飾子：pubilc、static
			// ②返却型：viod
			// ③関数名：main
			// ④引数：（１）引数の型：Sting[]; （２）引数の名称：args


			//質問３．以下メソッドの実施結果を教えてください。

			//  public class Kicker {
			//       private static void sayHello(String y) {
			//           y = "Hello world";
			//       }
			//      public static void main(String args[]) {
			//           String x = null;
			//           sayHello(x);
			//           System.out.println(x);
			//       }
			//  }

			//実施結果：null


			//質問４︓以下メソッドの実施結果を教えてください。

			//    public class Kicker {
			//	   private static void fillArray(String[] array) {
			//	     array[0] = "value2";
			//	   }
			//	   public static void main(String args[]) {
			//	     String[] array = new String[]{"value1"};
			//	     fillArray(array);
			//	      System.out.println(array[0]);
			//	   }
			//	}

			//実施結果：value2


			//質問５︓以下メソッドの実施結果を教えてください。
			//  public static class Kicker {                            （★staticはなかった。）
			//      private static void fillArray(String[] array) {
			//	      array = new String[]{"1", "2"};
			//	    }
			//	  public static void main(String args[]) {
			//	      String[] array = null;
			//	      fillArray(array);
			//	      System.out.println(arrays == null);
			//	    }
			//	}

			//実施結果：true


}
