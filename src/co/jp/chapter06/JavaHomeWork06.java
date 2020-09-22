package co.jp.chapter06;

public class JavaHomeWork06 {

//		■質問１
//		public static void main(String[] args);
//		修飾子：public、static
//		返却型：void（返却値なし）
//		関数名：main
//		引数：
//		・引数の型：String[]
//		・名称：args

//		■質問２

//		★不明点：1.どの呼び出しの方式を選択したほうがいいですか？
//		★不明点：2.staicメソッドとstaicではないメソッドとどちらのメソッドを作ったほうがいいですか？
//		★不明点：3.System.out.pritln()はどこに書いたほうがいいですか？呼び出す元？呼び出す先？

//		質問２－１：配列の和

//		①－１ 呼び出し元：staticメソッド
//		呼び出しの方式：オブジェクト.メソッド（）
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

//		①－２
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

//		② 呼び出し元：staticではないメソッド
//		呼び出しの方式：クラス.メソッド（）
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

//		③メソッドとメソッドの間の呼び出し
//		同じクラスになったら、staticメソッドは他のstaticメソッドを直接に呼び出せる
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

//		質問２－３：配列のMIN値
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

//		★不明点４：質問３～５は値渡しと参照の値渡しと関連すると思いますが、
//					  値渡しと参照の値渡しがはっきり理解できなかったです。

//		■質問３
//		 private static void sayHello(String y) {
//			 y = "Hello world";
//		 }
//		 public static void main(String args[]) {
//			 String x = null;
//			 sayHello(x);
//			 System.out.println(x);
//		 }
//
//		答え：実施結果は null
//		理由：
//		   ・呼び出し元でメソッドの引数はString（参照型）ですが、
//	         メソッドではその値のコピーを受け取ります。
//		   ・単純に値のコピーを渡しているだけなので、
//			 メソッド内でその値に変更を加えても、
//			 呼び出し元には影響しません。

//		■質問４
//		private static void fillArray(String[] array) {
//			array[0] = "value2";
//		}
//		public static void main(String args[]) {
//			String[] array = new String[]{"value1"};
//			fillArray(array);
//			System.out.println(array[0]);
//		}

//		答え：実施結果は value2
//		理由：
//	   	  ・呼び出し元でメソッドの引数は配列（参照型）ですので、
//	        メソッドではその値への参照を受け取ります参照のコピーを受け取ります 。
//		  ・参照している先をたどると、
//			同じ場所を参照しているため、
//			メソッド内で値へ変更を加えると呼び出し元にも影響を与えます。

//		■質問５
//		private static void fillArray(String[] array) {
//			 array = new String[]{"1", "2"};
//		}
//		public static void main(String args[]) {
//			 String[] array = null;
//			 fillArray(array);
//			 System.out.println(array == null);
//		}

//		答え：実施結果は true
//		理由：
//	   	  ・呼び出し元でメソッドの引数は配列（参照型）ですので、
//	        メソッドではその値への参照を受け取ります参照のコピーを受け取ります。、
//		  ・呼び出し先は新しいオブジェクトを作って、その値を変更しますが、
//		    呼び出し元には影響しません。

//	 	■質問６-０
//		配列は直接に印刷できません。下記メソッドを利用して、配列をprintします。以下メソッドを呼び出してください。

//		public static void main(String args[]) {
//			Object[] objs = new Object[] {1,10,"abc",3.5,4};
//			JavaHomeWork06.printArray(objs);
//		}
//
//		public static void printArray(Object[] objs) {
//			 if(objs == null) {
//				 System.out.println("null");
//				 return;
//			 }
//			 String prefix = "";
//			 StringBuilder sb = new StringBuilder();
//			 sb.append("[");
//			 for(Object obj : objs) {
//				 sb.append(prefix);
//				 sb.append(String.valueOf(obj));
//				 prefix = ", ";
//			 }
//			 sb.append("]");
//			 System.out.println(sb.toString());
//		}

//		■質問６-１
//		以下静的なメソッドを定義してください。
//		1. メソッド名: megerArray
//		2. 引数１：intの配列 left
//		3. 引数２：intの配列 right
//		4. 戻り値：intの配列
//		5. 処理内容：引数leftと引数rightをマージして、新しい配列を作成して返却する。

//		public static int[] megerArray(int[] a,int[] b) {
//			int[] c = null;
//			c = new int[a.length+b.length];
//			System.arraycopy(a, 0, c, 0, a.length);
//			System.arraycopy(b, 0, c, a.length, b.length);
//			return c;
//		}
//
//		public static void main(String[] args) {
//			int[] left = new int[] {1,2,3,4};
//			int[] right = new int[] {5,6,7,8};
//			int[] result = megerArray(left,right);
//			for(int i = 0;i<result.length;i++) {
//				System.out.print(result[i] + " ");
//			}
//		}


//		■質問６-２
//		以下静的なメソッドを定義してください。
//		1. メソッド名: subArray
//		2. 引数１：intの配列 array
//		3. 引数２：開始のstartIndex
//		4. 引数３：長さlength
//		5. 戻り値：intの配列
//		6. 処理内容：startIndexからstartIndex + lengthまでサブ配列を取得する

//		public static int[] subArray(int[] a,int startIndex,int length) {
//			int[] c = null;
//			c = new int[length];
//			System.arraycopy(a, startIndex, c, 0, length);
//			return c;
//		}
//
//		public static void main(String[] args) {
//			int[] array = new int[] {1,2,3,4};
//			int[] result = subArray(array,1,2);
//			for(int i = 0;i<result.length;i++) {
//				System.out.print(result[i] + " ");
//			}
//		}


//		■質問７
//		以下静的なメソッドを定義してください。
//		1. メソッド名：trim
//		2. 引数１：charの配列
//		3. 戻り値：charの配列
//		4. 処理内容：引数１のcharの配列先頭と末尾の空文字列を削除してください。

//		public static char[] trim(char[] a) {
//			int startIndex = 0;
//			int stopIndex = 0;
//			for(int i = 0;i < a.length;i++) {
//				if(a[i] != ' ') {
//					startIndex = i;
//					break;
//				}
//			}
//			for(int j = a.length -1;j >= 0;j--) {
//				if(a[j] != ' ') {
//					stopIndex = j;
//					break;
//				}
//			}
//			char[] c = new char[(stopIndex - startIndex) + 1];
//			System.arraycopy(a, startIndex, c, 0, (stopIndex - startIndex) + 1);
//			return c;
//		}
//
//		public static void main(String[] args) {
//			char[] input = new char[] {' ',' ','A','b',' ',' ','C',' '};
//			char[] output = trim(input);
//			for(int i = 0;i<output.length;i++) {
//				System.out.print(output[i] + ",");
//			}
//		}


//		質問８：バブルソート用メソッドを作成してください。
//		1. メソッド名：bubbleSort
//		2. 引数１：intの配列
//		3. 戻り値：ソート済みの配列
//		4. 処理内容：bubbleSortアルゴリズムを用い、入力した引数の配列をソートしてください。

//		public static int[] bubbleSort(int[] a) {
//			int temp;
//			for(int i = 0; i < a.length; i++) {
//				for(int j = i+1;j<a.length;j++ ) {
//					if(a[i] > a[j]) {
//						temp = a[j];
//						a[j] = a[i];
//						a[i] = temp;
//						}
//				}
//			}
//			return a;
//		}
//
//		public static void main(String[] args) {
//			int[] arr = new int[] {10, 2, 6, 47, 19, 56, 22, 10};
//			int[] sortarr = bubbleSort(arr);
//			for(int i = 0;i<sortarr.length;i++) {
//				System.out.print(sortarr[i] + " ");
//			}
//		}


//		質問９：メソッドの呼び出す練習。
//		1. 質問６-１を用い、２つ配列をマージします。
//		2. 質問８を用い、ステップ１のマージした配列をソートする。
//		3. 注意：コードを１行にしてください。

//		答え：
//		1. 上記の質問６-１の解答を参照してください。(214行-221行)
//		2. 解答は以下通りです。
		//二つの配列をマージするメソッドを作成。
		public static int[] megerArray(int[] a,int[] b) {
			int[] c = null;
			c = new int[a.length+b.length];
			System.arraycopy(a, 0, c, 0, a.length);
			System.arraycopy(b, 0, c, a.length, b.length);
			return c;
		}

		//配列をソートするメソッドを作成。
		public static int[] bubbleSort(int[] a) {
		int temp;
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1;j<a.length;j++ ) {
				if(a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					}
				}
			}
			return a;
		}

		//上記の二つのメソッドを呼び出す。
		public static void main(String[] args) {
			int[] left = new int[] {10,2,32,41};
			int[] right = new int[] {50,6,17,28};
			int[] result = megerArray(left,right);
			int[] sortarr = bubbleSort(result);
			for(int i = 0;i<sortarr.length;i++) {
				System.out.print(sortarr[i] + " ");
			}
		}

}
