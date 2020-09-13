package co.jp.chapter06;

public class JavaHomeWork06 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問２．呼び出す
		int[] array2 = new int[] { 8, 3, 7, 1, 4, 2, 9, 6, 5 };
		System.out.println("質問２：");
		System.out.println("配列の和：" + sum(array2));
		System.out.println("配列のMAX値：" + max(array2));
		System.out.println("配列のMIN値：" + min(array2));
		//質問３．呼び出す
	}

	/**ーーーーーーーーーーーーーーーーー05 新米８問ーーーーーーーーーーーーーーーーー */
	//質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
	// public static void main(String[] args)
	//回答：public staticは修飾子、voidは返却型(戻り値なし)、mainは関数名、
	//(String[] args)は引数、String[]は引数の型、argsは引数の名称。

	//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
	//回答：
	//呼び出す先
	//配列の和
	public static int sum(int[] datas) {
		int sum = 0;
		for (int target : datas) {
			sum += target;
		}
		return sum;

	}

	//配列のMAX値
	public static int max(int[] datas) {
		int max = datas[0];
		for (int target : datas) {
			if (max < target) {
				max = target;
			}
		}
		return max;

	}

	//配列のMIN値
	public static int min(int[] datas) {

		int min = datas[0];
		for (int target : datas) {
			if (min > target) {
				min = target;
			}
		}
		return min;

	}

	//質問３．以下メソッドの実施結果を教えてください。
	//	public class Kicker {
	//		private static void sayHello(String y) {
	//			y = "Hello world";
	//		}
	//		public static void main(String args[]) {
	//			String x = null;
	//			sayHello(x);
	//			System.out.println(x);
	//		}
	//	}
	//回答：null。
	//関数private static void sayHello(String y) のメソッドは呼び出されませんでした。

	//質問４︓以下メソッドの実施結果を教えてください。
	//		public class Kicker {
	//			 private static void fillArray(String[] array) {
	//			 	array[0] = "value2";
	//			 }
	//		 public static void main(String args[]) {
	//		 	String[] array = new String[]{"value1"};
	//		 	fillArray(array);
	//		 	System.out.println(array[0]);
	//		 }
	//		}
	//回答：value2。
	//関数private static void fillArray(String[] array)のメソッドは呼び出されました。

	//質問５︓以下メソッドの実施結果を教えてください。
	//	public class Kicker {
	//		 private static void fillArray(String[] array) {
	//		 	array = new String[]{"1", "2"};
	//		 }
	//		 public static void main(String args[]) {
	//		 	String[] array = null;
	//		 	fillArray(array);
	//		 	System.out.println(array == null);
	//		 }
	//		}
	//回答：true。
	//関数 private static void fillArray(String[] array)のメソッドは呼び出されませんでした。

}