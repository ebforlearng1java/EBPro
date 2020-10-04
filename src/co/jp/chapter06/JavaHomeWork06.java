/**ーーーーーーーーーーーーーーーーー06 関数ーーーーーーーーーーーーーーーーー */
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
		//質問６－０.呼び出す
		String[] array6_0 = new String[] { "a", "b", "c", "d", "e" };
		System.out.println("質問６－０：");
		printArray(array6_0);

		//質問６－１.呼び出す
		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		int[] result = megerArray(left, right);
		System.out.println("質問６－１：");
		printArrayInt(result);

		//質問６－２.呼び出す
		int[] array6_2 = new int[] { 1, 2, 3, 4 };
		int start = 1;
		int length = 2;
		result = subArray(array6_2, start, length);
		System.out.println("質問６－２：");
		printArrayInt(result);

		//質問７.呼び出す
		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };
		char[] output = trim(input);
		System.out.println("質問７：");
		printArrayChar(output);

		//質問８.呼び出す
		int[] array8 = new int[] { 3, 9, 6, 22, 8, 66, 1, 10 };
		System.out.println("質問８：");
		printArrayInt(bubbleSort(array8));

		//質問９.呼び出す
		int[] left2 = new int[] { 3, 1, 5, 0 };
		int[] right2 = new int[] { 9, 2, 7, 8 };
		int[] meger = megerArray(left2, right2);
		meger = bubbleSort(meger);
		System.out.println("質問９：");
		printArrayInt(meger);
	}

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

	//質問４. 以下メソッドの実施結果を教えてください。
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

	//質問５. 以下メソッドの実施結果を教えてください。
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

	//質問６-０. 配列は直接に印刷できません。下記メソッドを利用して、配列をprintします。
	//以下メソッドを呼び出してください。
	//呼び出し先
	public static void printArray(Object[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

	public static void printArrayInt(int[] ints) {
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("      [");
		for (int item : ints) {
			sb.append(prefix);
			sb.append(String.valueOf(item));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

	public static void printArrayChar(char[] chars) {
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("      [");
		for (char item : chars) {
			sb.append(prefix);
			sb.append(String.valueOf(item));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

	//質問６-１. 以下静的なメソッドを定義してください。
	//	1. メソッド名: megerArray
	//	2. 引数１：intの配列 left
	//	3. 引数２：intの配列 right
	//	4. 戻り値：intの配列
	//	5. 処理内容：引数left と 引数right をマージして、新しい配列を作成して返却する。
	//	以下メソッドの実施例：
	//	int[] left = new int[] {1, 2, 3, 4};
	//	int[] right = new int[] {5, 6, 7, 8};
	//	メソッドを実施後
	//	int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
	//呼び出し先
	public static int[] megerArray(int[] left, int[] right) {
		int size = left.length + right.length;
		int[] result = new int[size];
		for (int i = 0; i < left.length; i++) {
			result[i] = left[i];
		}
		for (int i = left.length; i < size; i++) {
			result[i] = right[i - left.length];
		}
		return result;
	}

	//質問６-２. 以下静的なメソッドを定義してください。
	//	1. メソッド名: subArray
	//	2. 引数１：intの配列 array
	//	3. 引数２：開始のstartIndex
	//	4. 引数３：長さlength
	//	5. 戻り値：intの配列
	//	6. 処理内容：startIndexからstartIndex + lengthまでサブ配列を取得する
	//以下メソッドの実施例：
	//int[] array = new int[] {1, 2, 3, 4};
	// start = 1, length = 2
	//int[] result = new int[] {2, 3};
	//呼び出し先
	public static int[] subArray(int[] array, int startIndex, int length) {
		int[] result = new int[length];
		for (int i = startIndex; i < (startIndex + length); i++) {
			result[i - startIndex] = array[i];
		}
		return result;
	}

	//質問７. 以下静的なメソッドを定義してください。
	//	1. メソッド名：trim
	//	2. 引数１：charの配列
	//	3. 戻り値：charの配列
	//	4. 処理内容：引数１のcharの配列先頭と末尾の空白文字を削除してください。
	//以下メソッドの実施例：
	//char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
	//メソッドを実施後
	//char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数
	//呼び出し先
	public static char[] trim(char[] array) {
		int startIndex = 0;
		int endIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != ' ') {
				startIndex = i;
				break;
			}
		}

		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != ' ') {
				endIndex = i;
				break;
			}
		}

		int size = endIndex - startIndex + 1;
		char[] output = new char[size];

		for (int i = startIndex; i <= endIndex; i++) {
			output[i - startIndex] = array[i];
		}

		return output;
	}

	//質問８. バブルソート用メソッドを作成してください。
	//	1. メソッド名：bubbleSort
	//	2. 引数１：intの配列
	//	3. 戻り値：ソート済みの配列
	//	4. 処理内容：bubbleSortアルゴリズムを用い、入力した引数の配列をソートしてください。
	//呼び出し先
	public static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		return array;

	}

	//質問９. メソッドの呼び出す練習。
	//	1. 質問６-１を用い、２つ配列をマージします。質問６－１には既に回答しています。
	//	2. 質問８を用い、ステップ１のマージした配列をソートする。
	//	3. 注意：コードを１行にしてください。

}