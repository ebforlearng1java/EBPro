package co.jp.chapter06;

public class JavaHomeWork06 {


		// TODO 自動生成されたメソッド・スタブ

	//質問２メソッド
	public static int sum(int[] datas) {

		int sum = datas[0];
        for(int i = 1; i < datas.length; i++) {
        	sum += datas[i];
        	}
		return sum;
	}
	public static int max(int[] datas) {

		int max = datas[0];
        for(int i = 0; i < datas.length; i++) {
        	if(datas[i] > max) {
        	max = datas[i];
        	}
        	}
		return max;
	}
		public static int min(int[] datas) {

			int min = datas[0];
			for(int i = 0; i < datas.length; i++) {
	        	if(datas[i] < min) {
	        	min = datas[i];
	        	}
	        	}
			return min;
		}
		//質問3メソッド
		private static void sayHello(String y) {
			y = "Hello world";
			}
		//質問4メソッド
		private static void fillArray(String[] array) {
			array[0] = "value2";
		}
		//質問5メソッド
		private static void fillArray2(String[] array) {
			array = new String[]{"1", "2"};
			}

		//質問6-0メソッド
		public static void printArray(Object[] objs) {
			if(objs == null) {
			System.out.println("null");
			return;
			}
			String prefix = "";
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for(Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
			}
			sb.append("]");
			System.out.println(sb.toString());
			}

		//質問6-1メソッド
		public static int[] mergeArray(int[] left,int[] right) {


			int merge [] = new int [left.length + right.length];
			int c = 0;
			for(int i = 0 ; i < left.length; i ++){
				merge[i] = left[i];
			}
			for(int i = left.length; i < merge.length; i ++){
				merge[i] = right[c];
			c ++;
			}
			for(int i = 0;i < left.length + right.length ;i ++){
				System.out.print(merge[i]);
				}
			return merge;
		}

		//質問6-2メソッド
		public static int[] subArray(int[] array,int startIndex,int length) {
			int[] result = new int[length];
			for(int i=0;i<result.length;i++) {
				result[i]=array[startIndex+i];
				System.out.print(result[i]);
			}
			return result;


		}
		//質問7メソッド
		public static char[] trim(char[]input) {
			int start = 0;
			int end = input.length;

			for (int i = 0; i < input.length; i++) {
				if (input[i] != ' ') {
					start = i;
					break;
				}
		}
			for (int i = input.length-1; i > 0; i--) {
				if (input[i] != ' ') {
					end = i+1;
					break;
				}
		}
			for(int i = start;i < end;i++) {
				System.out.print(input[i]);
			}
			return input;
		}
		//質問8メソッド
		public static int[] bubbleSort(int[] bubble) {

			for(int i = 0; i < bubble.length; i++) {
				int temp = 0;
	        	for(int j = i+1;j < bubble.length; j++) {
					if(bubble[i] > bubble[j]) {
						temp = bubble[i];
						bubble[i] = bubble[j];
						bubble[j] = temp;
					}
				}
	        }
			for(int i = 0; i < bubble.length; i++) {
				System.out.print(bubble[i]);
		}
			return bubble;


		}



		public static void main(String[] args) {


		//質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
		System.out.println("質問１");
		System.out.println("static修飾子,mainメソッド,void返却型,String引数の型,args引数名称");

		//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください
		System.out.println("質問2");
				int[] datas = new int[] {1, 2, 3, 4, 5};
				System.out.println("和" + sum(datas));
				System.out.println("MAXは" + max(datas));
				System.out.println("MINは" + min(datas));

		//質問３．以下メソッドの実施結果を教えてください。
		//回答：nullです。

		System.out.println("質問3");
					String x = null;
					sayHello(x);

					System.out.println(x);

		//質問４︓以下メソッドの実施結果を教えてください。
		//回答：value2
		System.out.println("質問4");
					String[] array = new String[]{"value1"};
					fillArray(array);
					System.out.println(array[0]);

		//質問5︓以下メソッドの実施結果を教えてください。
		//回答：false
		System.out.println("質問5");
					String[] array2 = null;
					fillArray2(array);
					System.out.println(array == null);


		//質問6-0︓以下メソッドの実施結果を教えてください。
		System.out.println("質問6_0");
					Object[] object = new Object[] {1, 2, 3, 4, 5};
					printArray(object);


		//質問6-1︓以下メソッドの実施結果を教えてください。
		System.out.println("質問6_1");
					int[] left = new int[] {1,2,3};
					int[] right = new int[] {4,5,6,7};
					int[] merge =  new int[left.length + right.length];
					mergeArray(left,right);

					System.out.println();



		//質問6-2︓以下メソッドの実施結果を教えてください。
		System.out.println("質問6_2");
					int[]array6 = new int[] {1,2,3,4,5,6,7};
					int startIndex = 1;
					int length6 = 4;
					subArray(array6,startIndex,length6);
					System.out.println();


		//質問７︓以下静的なメソッドを定義してください。
		System.out.println("質問7");
					char[]input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
					trim(input);
					System.out.println();

		//質問８︓バブルソート⽤メソッドを作成してください。

		System.out.println("質問8");
		int[]bubble = new int[] {4,2,8,4,1,6,7};
		bubbleSort(bubble);

		//質問９︓メソッドの呼び出す練習。





				}
}














