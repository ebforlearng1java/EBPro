package co.jp.chapter06;

public class JavaHomeWork06 {

		//■質問１
//		public static void main(String[] args);
//		修飾子：public、static
//		返却型：void（返却値なし）
//		関数名：main
//		引数：
//		・引数の型：String[]
//		・名称：args

		//■質問２

//★不明点：1.どの呼び出しの方式を選択したほうがいいですか？
//★不明点：2.staicメソッドとstaicではないメソッドとどちらのメソッドを作ったほうがいいですか？
//★不明点：3.System.out.pritln()はどこに書いたほうがいいですか？呼び出す元？呼び出す先？

		//質問２－１：配列の和

		//①－１ 呼び出し元：staticメソッド
	    //呼び出しの方式：オブジェクト.メソッド（）
//		public static void main(String[] args) {
//			int[] datas =new int[] {1,2,3,4};
//			JavaHomeWork06 obj = new JavaHomeWork06();
//			System.out.println(obj.sum(datas));//▲呼び出し元（不明点：3）
//		}
//
//		 int sum(int[] datas) {
//			int sum = 0;
//			for(int i = 0; i < datas.length;i++) {
//				sum = sum + datas[i];
//			}
//			return sum;
//		}

		//①－２
//		public static void main(String[] args) {
//			int[] datas =new int[] {1,2,3,4};
//			JavaHomeWork06 obj = new JavaHomeWork06();
//			obj.sum(datas);
//		}
//
//		int sum(int[] datas) {
//			int sum = 0;
//			for(int i = 0; i < datas.length;i++) {
//				sum = sum + datas[i];
//			}
//			System.out.println(sum);//▲呼び出し先（不明点：3）
//			return sum;
//		}


		//② 呼び出し元：staticではないメソッド
		//呼び出しの方式：クラス.メソッド（）
//		public static void main(String[] args) {
//			int[] datas =new int[] {1,2,3,4};
//			System.out.println(JavaHomeWork06.sum(datas));
//		}
//
//		static int sum(int[] datas) {
//			int sum = 0;
//			for(int i = 0; i < datas.length;i++) {
//				sum = sum + datas[i];
//			}
//			return sum;
//		}


		//③メソッドとメソッドの間の呼び出し
		//同じクラスになったら、staticメソッドは他のstaticメソッドを直接に呼び出せる
//		public static void main(String[] args) {
//			int[] datas =new int[] {1,2,3,4};
//			System.out.println(sum(datas));
//		}
//
//		public static int sum(int[] datas) {
//			int sum = 0;
//			for(int i = 0; i < datas.length;i++) {
//				sum = sum + datas[i];
//			}
//			return sum;
//		}


//		//質問２－２：配列のMAX値
//		public static void main(String[] args) {
//			int[] datas = new int[] {1, 3, 5, 27, 100, 10, 8};
//			System.out.println(max(datas));
//		}
//
//		public static int max(int[] datas) {
//			int max = datas[0];
//			for(int i = 0; i < datas.length; i++) {
//				if(datas[i] > max) {
//					max = datas[i];
//				}
//			}
//			return max;
//		}


		//質問２－３：配列のMIN値
//		public static void main(String[] args) {
//			int[] datas = new int[] {1, 3, 5, 27, 100, 10, 8};
//			JavaHomeWork06.min(datas);
//		}
//
//		public static int min(int[] datas) {
//			int min = datas[0];
//			for(int i = 0; i < datas.length; i++) {
//				if(datas[i] < min) {
//					min = datas[i];
//				}
//			}
//			System.out.println(min);
//			return min;
//		}


//★不明点４：質問３～５は値渡しと参照の値渡しと関連すると思いますが、
//			  値渡しと参照の値渡しがはっきり理解できなかったです。


		//■質問３
//		 private static void sayHello(String y) {
//			 y = "Hello world";
//		 }
//		 public static void main(String args[]) {
//			 String x = null;
//			 sayHello(x);
//			 System.out.println(x);
//		 }
//
		 //答え：実施結果は null
		 //理由：
//		   ・呼び出し元でメソッドの引数はString（参照型）ですが、
//	         メソッドではその値のコピーを受け取ります。
//		   ・単純に値のコピーを渡しているだけなので、
//			 メソッド内でその値に変更を加えても、
//			 呼び出し元には影響しません。


		 //■質問４
//		private static void fillArray(String[] array) {
//			array[0] = "value2";
//		}
//		public static void main(String args[]) {
//			String[] array = new String[]{"value1"};
//			fillArray(array);
//			System.out.println(array[0]);
//		}

		//答え：実施結果は value2
	 	//理由：
//	   	  ・呼び出し元でメソッドの引数は配列（参照型）ですので、
//	        メソッドではその値への参照を受け取ります参照のコピーを受け取ります 。
//		  ・参照している先をたどると、
//			同じ場所を参照しているため、
//			メソッド内で値へ変更を加えると呼び出し元にも影響を与えます。



		 //■質問５
//		private static void fillArray(String[] array) {
//			 array = new String[]{"1", "2"};
//		}
//		public static void main(String args[]) {
//			 String[] array = null;
//			 fillArray(array);
//			 System.out.println(array == null);
//		}

		//答え：実施結果は true
	 	//理由：
//	   	  ・呼び出し元でメソッドの引数は配列（参照型）ですので、
//	        メソッドではその値への参照を受け取ります参照のコピーを受け取ります。、
//		  ・呼び出し先は新しいオブジェクトを作って、その値を変更しますが、
//		    呼び出し元には影響しません。


}
