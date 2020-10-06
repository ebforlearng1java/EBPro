package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//質問1
		//public staticは修飾⼦
		//voidは返却型。
		//関数名はmain
		//引数の型はString[]、名称はargs


		//質問2
		JavaHomeWork06 obj = new JavaHomeWork06();
		int[] arr2 = new int[] {1,3,5,7,100,0,1};
		obj.searchMaxMinSum(arr2);



		//質問3
		//null
		System.out.println("質問3の実施結果：null");

		//質問4
		//Value2
		System.out.println("質問4の実施結果：Value2");

		//質問5
		//true
		System.out.println("質問5の実施結果：true");


		//質問6-0
		//配列を印刷するメソッドを呼び出す。
		JavaHomeWork06 obj6 = new JavaHomeWork06();
		Object[] arr6 = new Object[] {1,3,5,7,100,0,1};
		obj6.printArray(arr6);

		//質問6-1
		//以下静的なメソッドを定義する。
		JavaHomeWork06 obj6_1 = new JavaHomeWork06();
		int[] left = new int[] {1,2,3};
		int[] right = new int[] {4,5,6};
		obj6_1.megerArray(left,right);

		//質問6-2
		//以下静的なメソッドを定義する。
		JavaHomeWork06 obj6_2 = new JavaHomeWork06();
		int[] array = new int[] {1,2,3,4};
		int startIndex = 1;
		int length = 2;
		obj6_2.subArray(array,startIndex,length);


		//質問7
		//以下静的なメソッドを定義する。
		JavaHomeWork06 obj7 = new JavaHomeWork06();
		char[] input = new char[] {' ',' ',' ','A','B',' ',' ','C',' ',' '};
		char[] output = trim(input);
		System.out.println(output);
		obj7.trim(input);



		//質問8
		JavaHomeWork06 obj8 = new JavaHomeWork06();
		int [] arr8 = new int [] {7,6,4,9};
		obj8.bubbleSort(arr8);


	}

	public static int searchMaxMinSum(int[] datas) {
		int max = datas[0];
		int min = datas[0];
		int sum = 0;
		for(int x=0;x<datas.length;x++) {
			if (datas[x] > max) {
				max = datas[x];
			}
			if(datas[x]<min) {
				min = datas[x];
			}

			sum = sum+datas[x];


		}
		System.out.println("最大値："+max);
		System.out.println("最小値："+min);
		System.out.println("和："+sum);
		return 0;
	}

	public static void printArray(Object[] objs) {
		if(objs==null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Object obj:objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

	public static int[] megerArray(int[] left,int[] right) {
		int[] c = new int[left.length+right.length];
		for(int i = 0 ; i < c.length; i++) {
			if(i<left.length) {
				c[i] = left[i];
			}
			else {
				c[i] = right[i-left.length];
			}
			System.out.print(c[i]);
		}

		return c;
	}

	public static int[] subArray(int[] array,int startIndex,int length) {
		System.out.println();
		int[] result = new int[length];
		for(int i=0;i<result.length;i++) {
			result[i]=array[startIndex+i];
			System.out.print(result[i]);
		}
		return result;
	}




	public static char[] trim(char[] Char) {
		int a = 0;
		int b = 0;
		for(int i=0;i<Char.length;i++) {
			if(Char[i] != ' ') {
				a = i;
				break;
			}
		}
		for(int i=Char.length-1;i>=0;i--) {
			if(Char[i] != ' ') {
				b = i;
				break;
			}
		}
		int len = a - b + 1;
		char[] output2 = new char[len];
		for (int i = a; i <= b; i++) {
			output2[i - a] = Char[i];
		}
		System.out.print(output2);
		return output2;

	}


	public static int[] bubbleSort(int[] arraybofore) {
		//int[] arrayafter = new int[arraybofore.length];
		int empt = 0;
		for(int p=0;p<arraybofore.length;p++) {
			for(int q=1;q<arraybofore.length-p;q++) {
				if(arraybofore[q-1]>arraybofore[q]) {
					empt = arraybofore[q-1];
					arraybofore[q-1] = arraybofore[q];
					arraybofore[q] = empt;
				}

			}
			System.out.println(arraybofore[p]);

		}
		return arraybofore;
	}






}
