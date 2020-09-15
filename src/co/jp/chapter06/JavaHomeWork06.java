package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 質問︓以下関数（メソッド）の返却型は︖
		// public String getName() {
		// return "name";
		// }
		// 上記メソッドの返却型はString

		// 質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
		// public static void main(String[] args);
		String syusyokusi = "public static";
		String kansuu = "main";
		String henkyaku = "void";
		String insuu = "String[] args";
		System.out.println("修飾⼦は" + syusyokusi);
		System.out.println("返却型は" + henkyaku);
		System.out.println("関数名は" + kansuu);
		System.out.println("引数（引数の型・名称）⼦は" + insuu);

		// 質問2
		int[] arr = new int[] { 5, 7, 8, 9, 5, 4 };
		System.out.println("arrの和は" + sum(arr));
		System.out.println("arrの最大値は" + max(arr));
		System.out.println("arrの最小値は" + min(arr));
		
		//質問6-0
		String[] objs = new String[] {"1","2","3","4","5"};
		printArray(objs);
		
		
		//質問6-1
		int[] left = new int[] {1, 2, 3, 4};
		int[] right = new int[] {5, 6, 7, 8};
		int[] result = megerArray(left,right);
		System.out.println("マージしたResultの値は：");
		printArrayInt(result);
		
		
		//質問6-2
		int[] array = new int[] {1, 2, 3, 4};
		int startIndex = 1;
		int length = 2;
		int[] result1 = subArray(array,startIndex,length);
		System.out.println("Resultは：");
		printArrayInt(result1);
	}






	// 質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
	// 例：配列のMax値を求めるメソッド
	public static int sum(int[] datas) {
		int sum = 0;
		for (int i = 0; i < datas.length; i++) {
			sum += datas[i];
		}
		return sum;
	}

	public static int max(int[] datas) {
		int max = datas[0];
		for (int i = 0; i < datas.length; i++) {
			if (max < datas[i]) {
				max = datas[i];
			}
		}
		return max;
	}

	public static int min(int[] datas) {
		int min = datas[0];
		for (int i = 0; i < datas.length; i++) {
			if (min > datas[i]) {
				min = datas[i];
			}
		}
		return min;
	}

	// 質問３．以下メソッドの実施結果を教えてください。
//	public class Kicker {
//		private static void sayHello(String y) {
//			y = "Hello world";
//		}
//
//		public static void main(String args[]) {
//			String x = null;
//			sayHello(x);
//			System.out.println(x);
//		}
//	}
	// 答え： null

	// 質問４︓以下メソッドの実施結果を教えてください。
//	public class Kicker {
//		private static void fillArray(String[] array) {
//			array[0] = "value2";
//		}
//
//		public static void main(String args[]) {
//			String[] array = new String[] { "value1" };
//			fillArray(array);
//			System.out.println(array[0]);
//		}
//	}
	// 答え：value2

	// 質問５︓以下メソッドの実施結果を教えてください。
//	public class Kicker {
//		private static void fillArray(String[] array) {
//			array = new String[] { "1", "2" };
//		}
//
//		public static void main(String args[]) {
//			String[] array = null;
//			fillArray(array);
//			System.out.println(array == null);
//		}
//	}
	// 答えは true

	// 質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
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
	
	//質問6-1、6-2をプリントアウトするために使うメソッド
	public static void printArrayInt(int[] ints) {
		if (ints == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int index : ints) {
			sb.append(prefix);
			sb.append(String.valueOf(index));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
	//質問６-１︓以下静的なメソッドを定義してください。
//	1. メソッド名: megerArray
//	2. 引数１︓intの配列 left
//	3. 引数２︓intの配列 right
//	4. 戻り値︓intの配列
//	5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
//	以下メソッドの実施例︓
//	int[] left = new int[] {1, 2, 3, 4};
//	int[] right = new int[] {5, 6, 7, 8};
//	 メソッドを実施後
//	int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
	public static int[] megerArray(int[] left,int[] right) {
		int maxlength = left.length+right.length;
		int[] result = new int[maxlength];
		for (int i = 0; i < left.length; i++) {
				result[i] = left[i];
		}
		for(int i = left.length; i< maxlength;i++) {
			result[i] = right[i-left.length];
		}
		return result;
	}
	
	//質問６-２︓以下静的なメソッドを定義してください。
//	1. メソッド名: subArray
//	2. 引数１︓intの配列 array
//	3. 引数２︓開始のstartIndex
//	4. 引数３︓⻑さlength
//	5. 戻り値︓intの配列
//	6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
	public static int[] subArray (int[] array,int startIndex, int length) {
		int endIndex = startIndex + length;
		int[] result = new int[length];
		for (int i = startIndex; i < endIndex; i++) {
			result[i-startIndex] = array[i];
		}
		return result;
		
	}
	
}
