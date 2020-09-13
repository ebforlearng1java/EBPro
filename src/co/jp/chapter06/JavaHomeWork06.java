package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JavaHomeWork06 OBJ_06 = new JavaHomeWork06();
		int[] datas = new int[10];
		OBJ_06.SUM(datas);
		OBJ_06.MAX(datas);
		OBJ_06.MIN(datas);
		String x= null;
		sayHello(x);
		String[] array = new String[] {"value"};
		fillArray(array);
		System.out.println(array[0]);
		String[] array_01 = null;
		fillArray_01(array_01);
		System.out.println(array_01 == null);

	}

	// 質問:以下関数（メソッド）の返却型は?
	// 答え：メソッドgetName()の返却型はStringです。
	public String getName() {
		return "name";
	}

	// 質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
	// public static void main(String[] args);
	// 答え：修飾子はpublic static,返却型はvoid,関数名main,引数は引数の型:String[],名称:args.

	// 質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。

	// 配列の和を求めるメソッドを定義する
	public static int SUM(int[] datas) {
		return 0;
	}

	// 配列のMAX値を求めるメソッドを定義する
	public static int MAX(int[] datas) {
		return 0;
	}

	// 配列のMIN値を求めるメソッドを定義する
	public static int MIN(int[] datas) {
		return 0;
	}

	// 質問３．以下メソッドの実施結果を教えてください。
	// 答え:メソッドsayHello(String y)の実行結果はNULL。
		private static void sayHello(String y) {
			y = "Hello world";
		}
	// 質問４︓以下メソッドの実施結果を教えてください。
	// 答え:メソッドfillArray(String[] array)の実行結果はvalue2。
		public static void fillArray(String[] array) {
			array[0] = "value2";
		}

	// 質問５︓以下メソッドの実施結果を教えてください。
	// 答え:メソッドfillArray_01(String[] array)の実行結果はtrue。
	public static void fillArray_01(String[] array) {
		array = new String[] {"1", "2"};
	}
}
