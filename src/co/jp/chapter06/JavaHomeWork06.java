package co.jp.chapter06;

public class JavaHomeWork06 {


		
		//質問︓以下関数（メソッド）の返却型は︖
		//string
		//１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
		
		/*
		修飾⼦、      public
		返却型、      ない
		関数名、        main
		引数（引数の型・    string 配列
		名称           args
		*/

		//２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
		
		/*
		//HE
		public int sum(int[] a){}
		//max
		public int max(int[] a){} 
		//min
		public int mix(int[] a){} 
		//main
		public static void main(string[] args){}
		 */
		
		//３．以下メソッドの実施結果を教えてください。
		//null
		
		//４︓以下メソッドの実施結果を教えてください
		//value2
		
		//５︓以下メソッドの実施結果を教えてください。
		//true
		
		/*
		6︓配列は直接に印刷できません。下記メソッドを
		利⽤して、配列をprintしま す。以下メソッドを呼
		び出してください。
		*/
	
		/*
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
		 System.out.println(sb.toString()); }
		*/
	
		//質問６-１︓以下静的なメソッドを定義してください。
		/*
		int[] left = new int[] {1, 2, 3, 4}; 
		int[] right = new int[] {5, 6, 7, 8};
		public static int megerArray(int[] left,int[] right){
		for(int i = 0;i<left.length;i++){
		int[i] result = left[i] ;
		}
		for(int j = 0;j<left.length;j++){
		int[j + left.length] result = right[j];
		}
		return result;
		*/
	
		//質問６-２︓以下静的なメソッドを定義してください
		/*
		int[] array = new int[] {1, 2, 3, 4};
		public static int[] subArray(int[] array,startIndex,length){
		int[] result = new int[length]; 
		for(int i = 0;i<result.length;i++){
		int[i] result = array[length+1];
		}
		return result;
		}
		*/
	
	
		//質問７︓以下静的なメソッドを定義してください。
	
		/*
		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
		public static char[] trim(char[] input){
		char[] output = new char[input.length];
		for(int i= 0,i  < input.length,i++){
			if(input[i] !=' ' ){
			int index = i;
			}
		}
		for(int j = 0;j<output.length-i;j++){
		output[j] = input[j+i];
		}
		return  output;
		*/
	
	
		//質問８︓バブルソート⽤メソッドを作成してください。
	
		/*
		int a[] = {1,2,6,7,9,6,2,1};
		public static int[] bubbleSort(int[] a){
		int i,j;
		for(i= 0;i < a.length-1;i++) {
			for(j =	0; j<a.length-1-i; j++) {
			if(a[j]>=a[j+1]) {
				int x = a[j];
				a[j] = a[j+1];
				a[j+1] = x;
		       		 }		
				}	
			}
			return int[] a;
		}
		 */
	
	
		//質問９︓メソッドの呼び出す練習。
		/*
		9-1
		int[] left = new int[] {1, 2, 3, 4}; 
		int[] right = new int[] {5, 6, 7, 8};
		public static int megerArray(int[] left,int[] right){
		for(int i = 0;i<left.length;i++){
		int[i] result = left[i] ;
		}
		for(int j = 0;j<left.length;j++){
		int[j + left.length] result = right[j];
		}
		return result;
		 */
	
		/*
		9-2
		bubbleSort(int[] result);
		public static int[] bubbleSort(int[] a){
		int i,j;
		for(i= 0;i < a.length-1;i++) {
			for(j =	0; j<a.length-1-i; j++) {
			if(a[j]>=a[j+1]) {
				int x = a[j];
				a[j] = a[j+1];
				a[j+1] = x;
		       		 }		
				}	
			}
			return int[] a;
		}
		 */
	
	
	
	
}
