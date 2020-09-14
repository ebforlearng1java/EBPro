package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。

		//  public static void main(String[] args);
		//修飾子：pubilc、static
		//返却型：viod
		//関数名：main
		//引数：①引数の型：Sting[]; ②引数の名称：args


		//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。

        	int [] arr = new int [] {20,40,10,40};
        	int maxTest = max(arr);
        	int minTest = min(arr);
        	int sumTest = sum(arr);

        	System.out.println(maxTest);
        	System.out.println(minTest);
        	System.out.println(sumTest);
        }


        public static int max(int [] datas)
        {
        	int max = datas[0];
        	for (int i = 1; i < datas.length; i++) {
        		int v =datas[i];
        		if (v> max) {
        			max = v;

        		}
        	}
        	return max;
        }


        public static int min(int [] datas)
           {
            int min = datas[1];
            for (int i = 1; i < datas.length; i++) {
            	int v =datas[i];
            	if (v< min) {
            		min = v;

            	}
            }
           	return min;
        }

        public static int sum(int [] datas)
        {
         int sum = datas[0];
         for (int i = 1; i < datas.length; i++) {
         	sum = sum + datas[0];

         	}
        	return sum;




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
		//  public class Kicker {
		//      private static void fillArray(String[] array) {
		//	      array = new String[]{"1", "2"};
		//	    }
		//	  public static void main(String args[]) {
		//	      String[] array = null;
		//	      fillArray(array);
		//	      System.out.println(array == null);
		//	    }
		//	}

		//実施結果：true

	}

}
