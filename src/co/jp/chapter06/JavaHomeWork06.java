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
		Object[] array_02 = {1, 2, 3};
		OBJ_06.printArray(array_02);
		int[] left = new int[] {1, 2, 3, 4};
		int[] right = new int[] {5, 6, 7, 8};
		OBJ_06.megerArray(left, right);
		System.out.println();
		OBJ_06.subArray(left, 1, 2);

		System.out.println();
		char[] array03 = new char[] {' ', ' ', 'A','b',' ',' ','C',' ',' '};
		OBJ_06.trim(array03);

		System.out.println();
		int[] array04 = new int[] {1,3,6,10,5,20,15,33,55,50};
		OBJ_06.bubbleSort(array04);
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

	// 質問６-０︓配列は直接に印刷できません。下記メソッドを利用して、配列をprintします。以下メソッドを呼び出してください。
	public static void printArray(Object[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj:objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ". ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

	// 質問６-１︓以下静的なメソッドを定義してください。
	// 1. メソッド名: megerArray
	// 2. 引数１︓intの配列 left
	// 3. 引数２︓intの配列 right
	// 4. 戻り値︓intの配列
	// 5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
	public static int[] megerArray(int[] left, int[] right) {
		int length = left.length + right.length;
		int[] arr03 = new int[length];
		int length_temp = 0;
		for (int i = 0;i < left.length; i++) {
			arr03[length_temp] = left[i];
			length_temp++;
		}
		for (int i = 0; i<right.length; i++) {
			arr03[length_temp] = right[i];
			length_temp++;
		}
		for (int i = 0; i <arr03.length;i++)  {
			System.out.print(arr03[i] + " ");
		}
		return arr03;
	}



	// 質問６-２︓以下静的なメソッドを定義してください。
	// 1. メソッド名: subArray
	// 2. 引数１︓intの配列 array
	// 3. 引数２︓開始のstartIndex
	// 4. 引数３︓長さlength
	// 5. 戻り値︓intの配列
	// 6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
	public static int[] subArray(int[] array, int startIndex, int length) {
		for (int i = 0; i<array.length;i++) {
			if(array[i] == startIndex ) {
				for (int j = 0;j <length; j++) {
					System.out.print(array[i+1] +" ") ;
					i++;
				}
			}
		}
		return array;
	}

	// 質問７︓以下静的なメソッドを定義してください。
	// 1. メソッド名︓trim
	// 2. 引数１︓charの配列
	// 3. 戻り値︓charの配列
	// 4. 処理内容︓引数１のcharの配列先頭と末尾の空白文字列を削除してください。
	public static char[] trim(char[] char01) {
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < char01.length;i++) {
			if(char01[i] != ' ') {
				startIndex = i;
				break;
			}

		}
		for (int j = char01.length-1; j > 0;j--) {
			if(char01[j] != ' ') {
				endIndex = j;
				break;
			}

		}
		int length = endIndex-startIndex +1;
		char[] char02 = new char[length];
 		for (int k = 0;k< char02.length;k++) {
 			char02[k] = char01[startIndex];
 			startIndex++;
 			System.out.print(char02[k] + ",");
		}
		return char01;
	}

	// 質問８︓バブルソート用メソッドを作成してください。
	// 1. メソッド名︓bubbleSort
	// 2. 引数１︓intの配列
	// 3. 戻り値︓ソート済みの配列
	// 4. 処理内容︓bubbleSortアルゴリズムを用い、入力した引数の配列をソートしてください。
	public static int[] bubbleSort(int[] arr) {
		for(int i = 0;i < arr.length-1; i++) {
			for(int j = 0; j< arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int k = 0;k< arr.length;k++) {
 			System.out.print(arr[k] + ",");
		}
		return arr;
	}

}






