package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問１
		//修飾子：public static
		//返却型：void(戻り値なし)
		//関数名：main
		//引数：String[] args
		//引数の型：String[]
		//引数の名称：args

		// 質問２
		// 呼び出す
		int[] array = new int[] {10,6,5,4,5,2};
		System.out.println("配列の和：" + sum(array));
		System.out.println("配列のMAX値：" + max(array));
		System.out.println("配列のMIN値：" + min(array));

	}

	//配列の和の取得処理
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0;i < array.length;i++) {
			sum += array[i];
		}
		return sum;
	}

	//配列のMAX値の取得処理
	public static int max(int[] array) {
		int max = 0;
		for (int i = 0;i < array.length;i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	//配列のMIN値の取得処理
	public static int min(int[] array) {
		int min = array[1];
		for (int i = 0;i < array.length;i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	// 質問３
	//　以下のメソッドの実施結果は"null"です
	//　原因：まずmainメソッドを呼び出します。
	//public class Kicker {
	//	private static void sayHello(String y) {
	//		y = "Hello world";
	//		}
	//	public static void main(String args[]) {
	//		String x = null;
	//			sayHello(x);
	//			System.out.println(x);
	//		}
	//	}

	// 質問４
	//　以下のメソッドの実施結果は"value2"です
	//　原因：まずmainメソッドを呼び出します。
	//public class Kicker {
	//		private static void fillArray(String[] array) {
	//			 array[0] = "value2";
	//		}
	//		public static void main(String args[]) {
	//		 	String[] array = new String[]{"value1"};
	//		 	fillArray(array);
	//		 	System.out.println(array[0]);
	//		 }
	//	}

	//質問５
	//　以下のメソッドの実施結果はtrueです
	//　原因：まずmainメソッドを呼び出します。
	//public class Kicker {
	//		private static void fillArray(String[] array) {
	//		 	array = new String[]{"1", "2"};
	//		 }
	//		public static void main(String args[]) {
	//		 	String[] array = null;
	//		 	fillArray(array);
	//		 	System.out.println(array == null);
	//		 }
	//		}

}
