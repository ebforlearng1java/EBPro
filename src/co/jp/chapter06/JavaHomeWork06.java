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
		int[] array = new int[] { 10, 6, 5, 4, 5, 2 };
		System.out.println("配列の和：" + sum(array));
		System.out.println("配列のMAX値：" + max(array));
		System.out.println("配列のMIN値：" + min(array));

		System.out.println("----------------------------------------------------");

		// 質問６－０のメソッドを呼び出し
		Object[] objs = new Object[] { 11, "a", 3.8, 9, 20 };
		printArray(objs);

		System.out.println("----------------------------------------------------");

		// 質問６－１のメソッド(megerArray)を呼び出し
		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		int[] result = megerArray(left, right);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			if (i < result.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println();
		System.out.println("----------------------------------------------------");

		// 質問６－2のメソッド(subArray)を呼び出し
		int[] array1 = new int[] { 1, 2, 3, 4 };
		int startIndex = 1;
		int lenght = 2;
		int[] result1 = subArray(array1, startIndex, lenght);
		for (int i = 0; i < result1.length; i++) {
			System.out.print(result1[i]);
			if (i < result1.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println();
		System.out.println("----------------------------------------------------");

		// 質問7のメソッド(trim)を呼び出し
		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };
		char[] result2 = trim(input);
		for (int i = 0; i < result2.length; i++) {
			System.out.print(result2[i]);
			if (i < result2.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println();
		System.out.println("----------------------------------------------------");

		// 質問8のメソッドを呼び出し
		int[] array2 = new int[] { 4, 3, 7, 10, 5, 67, 12 };
		int[] result3 = bubbleSort(array2);
		for (int i = 0; i < result3.length; i++) {
			System.out.print(result3[i]);
			if (i < result3.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println();
		System.out.println("----------------------------------------------------");

		// 質問9
		int[] left1 = new int[] { 13,8,70,3 };
		int[] right1 = new int[] { 2,6,1,19 };
		// 質問6-1 と質問8を呼び出し
		int[] result4 = bubbleSort(megerArray(left1, right1));
		for (int i = 0; i < result4.length; i++) {
			System.out.print(result4[i]);
			if (i < result4.length - 1) {
				System.out.print(",");
			}
	}
	}
	//配列の和の取得処理
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	//配列のMAX値の取得処理
	public static int max(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	//配列のMIN値の取得処理
	public static int min(int[] array) {
		int min = array[1];
		for (int i = 0; i < array.length; i++) {
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

	//質問6-0
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

	//質問6-1
	public static int[] megerArray(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		System.arraycopy(left, 0, result, 0, left.length);
		System.arraycopy(right, 0, result, left.length, right.length);
		return result;
	}

	//質問6-2
	public static int[] subArray(int[] array, int startIndex, int length) {
		int[] result = new int[length];
		System.arraycopy(array, startIndex, result, 0, length);
		return result;
	}

	//質問7
	public static char[] trim(char[] input) {
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != ' ') {
				startIndex = i;
				break;
			}
		}
		for (int j = input.length - 1; j >= 0; j--) {
			if (input[j] != ' ') {
				endIndex = j;
				break;
			}
		}
		int length = endIndex - startIndex + 1;
		char[] result = new char[length];
		// input はchar型ので、質問６-２で作成したサブ配列メソッドの引数の型が違っています。subArrayを呼び出さない。
		//　以下を実行する。
		System.arraycopy(input, startIndex, result, 0, length);
		return result;
	}

	//質問8
	public static int[] bubbleSort(int[] array2) {
		int temp;
		for (int i = 0; i < array2.length; i++) {
			for (int j = i + 1; j < array2.length; j++) {
				if (array2[i] > array2[j]) {
					temp = array2[j];
					array2[j] = array2[i];
					array2[i] = temp;
				}
			}
		}
		return array2;
	}
}
