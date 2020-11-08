package co.jp.chapter06;

public class JavaHomeWork06 {

	/**06 関数 */

	public static void main(String[] args) {
		//質問２
		int[] array1 = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		System.out.println("質問２の答え：");
		System.out.println("      配列のSUM値：" + sum(array1));
		System.out.println("      配列のMAX値：" + max(array1));
		System.out.println("      配列のMIN値：" + min(array1));

		//質問６－０
		String[] strArray = new String[] {"1","A","5","ww","17"};
		System.out.println("質問６－０の答え：");
		printArray(strArray);

		//質問６－１
		int[] left1 = new int[] {1, 2, 3, 4};
		int[] right1 = new int[] {5, 6, 7, 8};
		int[] result = megerArray(left1,right1);
		System.out.println("質問６－１の答え：");
		printArrayInt(result);

		//質問６－２
		int[] array2 = new int[] {1, 2, 3, 4};
		int start = 1;
		int length = 2;
		result = subArray(array2,start,length);
		System.out.println("質問６－２の答え：");
		printArrayInt(result);

		//質問７
		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
		char[] output = trim(input);
		System.out.println("質問７の答え：");
		printArrayChar(output);

		//質問８
		System.out.println("質問８の答え：");
		printArrayInt(bubbleSort(array1));

		//質問９
		int[] left2 = new int[] {9, 2, 12, 4};
		int[] right2 = new int[] {4, 23, 1, 31};

		int[] meger=bubbleSort(megerArray(left2,right2));
		System.out.println("質問９の答え：");
		printArrayInt(meger);
	}

	//質問１．以下関数の修飾子、返却型、関数名、引数（引数の型・名称）を回答してください。
	//public static void main(String[] args);
	//答え：修飾子public static、返却型void、関数名main、引数（String[] args）

	//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
	//答え：main関数に、8行目から処理を呼び出す
	//配列のSum値を求めるメソッド
	public static int sum(int[] datas) {
		int sum = 0;
		for (int item : datas) {
			sum = sum + item;
		}
		return sum;
	}

	//配列のMax値を求めるメソッド
	public static int max(int[] datas) {
		if (datas == null || datas.length == 0) {
			return 0;
		}
		int max = datas[0];
		for (int item : datas) {
			if (max < item) {
				max = item;
			}
		}
		return max;
	}

	//配列のMin値を求めるメソッド
	public static int min(int[] datas) {
		if (datas == null || datas.length == 0) {
			return 0;
		}
		int min = datas[0];
		for (int item : datas) {
			if (min > item) {
				min = item;
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
	//答え：null
	//同じパッケージに作成したクラスKickerに実現している。

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
	//答え：value2
	//同じパッケージに作成したクラスKickerに実現している。

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
	//答え：true
	//同じパッケージに作成したクラスKickerに実現している。

	//質問６-０︓配列は直接に印刷できません。下記メソッドを利用して、配列をprintしま
	//す。以下メソッドを呼び出してください。
	//答え：main関数に、15行目から処理を呼び出す。
	public static void printArray(Object[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("      [");
		for (Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

	//int配列がObject配列へ自動的に変換できないため、専用メソッドを作成して印刷する。
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

	//char配列がObject配列へ自動的に変換できないため、専用メソッドを作成して印刷する。
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

	//質問６-１︓以下静的なメソッドを定義してください。
	//	1. メソッド名: megerArray
	//	2. 引数１︓intの配列 left
	//	3. 引数２︓intの配列 right
	//	4. 戻り値︓intの配列
	//	5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
	//	以下メソッドの実施例︓
	//	int[] left = new int[] {1, 2, 3, 4};
	//	int[] right = new int[] {5, 6, 7, 8};
	//	メソッドを実施後
	//	int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
	//答え：main関数に、20行目から処理を呼び出す。
	public static int[] megerArray(int[] left, int[] right) {
		//leftがnullか空の配列の場合、rightを返す。
		if(left==null || left.length==0) {
			return right;
		}
		//rightがnullか空の配列の場合、leftを返す。
		if(right==null || right.length==0) {
			return left;
		}
		//上記以外の場合、leftとrightをマージする。
		int size=left.length+right.length;
		int[] result=new int[size];
		for(int i=0;i<left.length;i++) {
			result[i]=left[i];
		}
		for(int i=left.length;i<size;i++) {
			result[i]=right[i-left.length];
		}
		return result;
	}

	//		質問６-２︓以下静的なメソッドを定義してください。
	//		1. メソッド名: subArray
	//		2. 引数１︓intの配列 array
	//		3. 引数２︓開始のstartIndex
	//		4. 引数３︓長さlength
	//		5. 戻り値︓intの配列
	//		6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
	//		以下メソッドの実施例︓
	//		int[] array = new int[] {1, 2, 3, 4};
	//		// start = 1, length = 2
	//		int[] result = new int[] {2, 3};
	//答え：main関数に、27行目から処理を呼び出す。
	public static int[] subArray(int[] array, int startIndex, int length) {
		//エンドインデックスを設定する。
		int endIndex=startIndex+length;

		if(endIndex>array.length) {
			//enndIndexが配列の長さより大きい場合
			endIndex=array.length;
		}

		int[] result=new int[length];
		for(int i=startIndex;i<endIndex;i++) {
			result[i-startIndex]=array[i];
		}
		return result;
	}

	//		質問７︓以下静的なメソッドを定義してください。
	//		1. メソッド名︓trim
	//		2. 引数１︓charの配列
	//		3. 戻り値︓charの配列
	//		4. 処理内容︓引数１のcharの配列先頭と末尾の空白文字を削除してください。
	//		以下メソッドの実施例︓
	//		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
	//		メソッドを実施後
	//		char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数
	//答え：main関数に、35行目から処理を呼び出す。
	public static char[] trim(char[] array) {
		//空白文字列ではない文字の開始と終了インデックスを初期化する
		int start=-1;
		int end=-1;

		for(int i=0;i<array.length;i++) {
        	if(array[i]!=' ') {
        		start=i;
        		break;
        	}
        }

		for(int i=array.length-1;i>=0;i--) {
        	if(array[i]!=' ') {
        		end=i;
        		break;
        	}
        }

		//全て空白文字の場合、nullを返す。
		if(start<0) {
		   return null;
		}

		int size=end-start+1;
		char[] output=new char[size];

		//開始から終了までループしてoutputに値を設定する
		for(int i=start;i<=end;i++) {
			output[i-start]=array[i];
		}

		return output;
	}

	//		質問８︓バブルソート用メソッドを作成してください。
	//		1. メソッド名︓bubbleSort
	//		2. 引数１︓intの配列
	//		3. 戻り値︓ソート済みの配列
	//		4. 処理内容︓bubbleSortアルゴリズムを用い、入力した引数の配列をソートしてください。
	//答え：main関数に、41行目から処理を呼び出す。
	public static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}

		return array;

	}

	//		質問９︓メソッドの呼び出す練習。
	//		1. 質問６-１を用い、２つ配列をマージします。
	//		2. 質問８を用い、ステップ１のマージした配列をソートする。
	//		3. 注意︓コードを１行にしてください。
	//答え：main関数に、45行目から処理を呼び出す。

}
