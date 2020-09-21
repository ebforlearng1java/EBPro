package co.jp.chapter06;

public class JavaHomeWork06 {



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1:以下関数の修飾子、返却型、関数名、引数(引数の型、名称)を回答してください
		//　public static void main (String[] args)
		//A 修飾子public static、返却型void、関数名main、引型String[]、引数名args、



		System.out.println("--------Q2--------");
		//Q2:配列の和、MAX値、MIN値を求める処理を関数化してください。
		//main関数に呼び出してください
		//A2 138行目から171のメソッドです

		int[] dt2= new int[] {5,1,3,5,7,9};
		int sum=sum(dt2);
		int max=max(dt2);
		int min=min(dt2);

		System.out.println("合計="+sum);
		System.out.println("MAX="+max);
		System.out.println("MIN="+min);


		System.out.println("--------Q3--------");
		//Q3以下メソッドの実施結果を教えてください。
		//A3:  null

		String x = null;
		sayHello(x);
		System.out.println(x);


		System.out.println("--------Q4--------");
		//Q4以下メソッドの実施結果を教えてください。
		//A4 value2

		String[] array4 = new String[] {"value1"};
		fillArray4(array4);
		System.out.println(array4[0]);

		System.out.println("--------Q5--------");
		//Q5以下メソッドの実施結果を教えてください。
		//A5: true
		String[] array5 = null;
		fillArray5(array5);
		System.out.println(array5==null);


		System.out.println("--------Q6-0-------");
		//Q6-0 配列は直接に印刷できません。以下メソッドを利用して、
		//配列をprintします。以下メソッドを呼び出してください。
		//A6-0 メソッド190行目から210
		String[] array60 = new String[] {"good","cool"};
		printArray(array60);
		//printArray(null);


		System.out.println("--------Q6-1-------");
		//Q6-1以下静的なメソッドを定義してください。
		//A6-1 メソッド212行目から229

		int[] left = new int[] {1,2,3,4};
		int[] right= new int[] {5,6,7,8};

		megerArray(left,right);


		System.out.println("--------Q6-2-------");
		//Q6-2以下静的なメソッドを定義してください。
		//A6-2 メソッド231行目から242
		int[] array62 = new int[] {1,2,3,4};
		int start=1;
		int length=2;
		subArray(array62,start,length);



		System.out.println("--------Q7--------");
		//Q7以下静的なメソッドを定義してください。
		//A7 メソッド243行目から254
		char[] input = new char[] {' ',' ','A','b',' ',' ','C',' '};
		int[] tmp = new int[input.length];
		int sta;
		int end;
		int num=0;

		for(int i=0;i<input.length;i++) {
			if(input[i]!= ' ') {
				tmp[num]=i;
				num=num+1;
			}
		}
//		System.out.println(num);
//
//		for(int i=0;i<num;i++) {
//			System.out.println(tmp[i]);
//		}
		sta=tmp[0];
		end=tmp[num-1];

//		System.out.println(sta);
//		System.out.println(end);

		trim(input,sta,end);



		System.out.println("--------Q8--------");
		//Q8:バブルソート用メソッドを作成してください。
		//A8: メソッド257行目から279

		int[] bub = new int[] {1,5,9,3,7};

		bubbleSort(bub);



		System.out.println("--------Q9--------");
		//Q9:メソッドの呼び出す練習
		//A9:

		bubbleSort(megerArray(left,right));





	}


	//A2
	public static int sum(int[] data2) {
		int sum2=0;
		for(int i=0;i<data2.length;i++) {
			sum2 += data2[i];
		}
		return sum2;

	}

	public static int max(int[] data2) {
		int max2=data2[0];
		for(int i=0;i<data2.length;i++) {
			if(max2 <data2[i]) {
				max2=data2[i];
			}
		}
		return max2;

	}


	public static int min(int[] data2) {
		int min2=data2[0];
		for(int i=0;i<data2.length;i++) {

			if(min2 >data2[i]) {
				min2=data2[i];
			}
		}
		return min2;

	}



	//Q3
	private static void sayHello(String y) {
		y="Hello world";
	}


	//Q4
	private static void fillArray4(String[] array4) {
		array4[0] = "value2";
	}

	//Q5
	private static void fillArray5(String[] array) {
		array = new String[] {"1","2"};
	}

	//Q6-0
	public static void printArray(Object[] objs) {
		if(objs==null) {
			System.out.println("null");
			return;
		}

		String prefix="";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix=", ";
		}

		sb.append("]");
		System.out.println(sb.toString());

	}


	//A6-1
	public static int[] megerArray(int[] left,int[] right) {
		int N= left.length+ right.length;
		int[] result = new int[N];
		for(int i=0;i<left.length ;i++) {
			result[i]=left[i];
		}
		for(int i=0;i<right.length ;i++) {
			result[i+left.length]=right[i];
		}

		for(int i=0;i<N;i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println("");
		return result;
	}


	//A6-2
	public static int[] subArray(int[] array,int startIndex,int length) {
		int[] result = new int[length];
		for(int i=0;i<length;i++) {
			result[i]=array[startIndex+i];
			System.out.print(result[i]+" ");
		}
		System.out.println("");
		return result;

	}

	//A7
	public static char[] trim(char[] input,int sta,int end) {
		char[] output = new char[end];
		for(int i=0; i<end; i++) {
			output[i] = input[sta+i];
			System.out.print(output[i]+" ");
		}
		System.out.println("");
		return output;

	}


	//A8
	public static int[] bubbleSort(int[] bub) {

		int tmp;

		for (int i = 0; i < bub.length-1; i++) {
			for (int j = bub.length-1; j >i ; j--) {
				if (bub[j - 1] > bub[j]) {
					tmp = bub[j];
					bub[j] = bub[j - 1];
					bub[j - 1] = tmp;
				}
			}
		}
		System.out.println("バブルソート:");

		for (int i = 0; i < bub.length; i++) {
			System.out.print(bub[i]+" ");
		}
		System.out.println(" ");

		return bub;
	}





}
