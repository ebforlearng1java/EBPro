package co.jp.chapter06;

public class JavaHomeWork06 {

		//	質問1 以下関数の修飾子、返却型、関数名、引数（引数の型・名称）を回答してください。
		//  public static void main(String[] args);
		//  修飾子：public(公開） static（静的);
		//  返却型 :voidの為、返却値なし;
		//  関数名 : main;
		//  引数名 : args;  引数型 : String[] (Stringの配列型);

//		// 質問2 配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
//		//配列の和を求めるメソッド
//		int [] array = {1,5,10,8,9};
//		int sum = 0;
//		for(int i = 0; i < array. length; i++ ) {
//			sum += array[i];
//		}
//		System.out.println(sum);//33

//		//配列のMaxの値とMinの値を求めるメソッド
//		 int [] array = {1,5,10,8,9};
//
//	        int intMax = calcMax(array);
//	        int intMin = calcMin(array);
//
//	        System.out.println("最大値は" + intMax);
//	        System.out.println("最小値は" + intMin);
//	 }
//
//	    public static int calcMax(int[] array) {
//
//	        int intMax = array[0];
//
//	        for (int i = 1; i < array.length; i++ ) {
//	            if(intMax < array[i]) {
//	                intMax = array[i];
//	            }
//	        }
//	        return intMax;
//	    }
//
//	    public static int calcMin(int[] array) {
//
//	        int intMin = array[0];
//
//	        for (int i = 1; i < array.length; i++ ) {
//	            if(intMin > array[i]) {
//	                intMin = array[i];
//	            }
//	        }
//	        return intMin;//最大値10;最小値1；
//


		// 質問3 以下メソッドの実施結果を教えてください。
//        public class Kicker {
//        	private static void sayHello(String y) {
//        		y = "Hello world";
//        	}
//        	public static void main(String args[]) {
//        		String x = null;
//        		sayHello(x);
//        		System.out.println(x);//null
//        	}
//        }

//		// 質問4 以下メソッドの実施結果を教えてください。
//        public class Kicker {
//	        private static void fillArray(String[] array) {
//	             array[0] = "value2";
//	        }
//	        public static void main(String args[]) {
//	            String[] array = new String[]{"value1"};
//	            fillArray(array);
//	            System.out.println(array[0]);//value2
//	        }
//        }

		// 質問5 以下メソッドの実施結果を教えてください。
//        public class Kicker {
//        	private static void fillArray(String[] array) {
//        		array = new String[]{"1", "2"};
//        	}
//        		public static void main(String args[]) {
//        			String[] array = null;
//        			fillArray(array);
//        		    System.out.println(array == null);//ture
//        	    }
//        }

//		// 質問6-0　配列は直接に印刷できません。下記メソッドを利用して、配列をprintします。以下メソッドを呼び出してください。
//	    public static void main(String[] args) {
//	        Object[] objs = {"abc", "1", "43", 3};
//	        printArray(objs);
//	    }
//        public static void printArray(Object[] objs) {
//            if(objs == null) {
//            	System.out.println("null");
//            	return;
//            }
//            String prefix = "";
//            StringBuilder sb = new StringBuilder();
//            sb.append("[");
//            for(Object obj : objs) {
//            sb. append(prefix);
//            sb. append(String. valueOf(obj));
//            prefix = ", ";
//            }
//            sb.append("]");
//            System.out.println(sb.toString());//[abc, 1, 43, 3]
//        }


        //  質問6-1 以下静的なメソッドを定義してください。
        //  1. メソッド名: megerArray
        //  2. 引数１︓intの配列 left
        //  3. 引数２︓intの配列 right
        //  4. 戻り値︓intの配列
        //  5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
//	public static void main(String[] args) {
//		 // TODO 自動生成されたメソッド・スタブ
//		int[] left = new int[] {1, 2, 3, 4};
//		int[] right = new int[] {5, 6, 7, 8};
//		int[] val;
//		val  = megerArray(left,right);
//
//		for (int i=0 ;i< val.length; i++) {
//			System.out.print(val[i]);
//		}
//	}
//
//	public static int[] megerArray (int [] left, int [] right) {
//
//		   int[] result = new int [left.length + right.length];
//
//		   for (int i = 0 ;i <  left.length ; i++) {
//			   result[i] = left[i];
//		   }
//
//		   for (int i = 0 ;i <  right.length ; i++) {
//			   result[left.length + i] = right[i];
//		   }
//
//		   return result;//12345678
//	}
//
//	   //質問6-2 以下静的なメソッドを定義してください。
//	   // 1. メソッド名: subArray
//	   // 2. 引数１:intの配列 array
//	   // 3. 引数２:開始のstartIndex
//	   // 4. 引数３:長さlength
//	   // 5. 戻り値:intの配列
//	   // 6. 処理内容:startIndexからstartIndex + lengthまでサブ配列を取得する
//	   public static int[] subArray (int[] startIndex, int[] length) {
//		   int[] array  = new int[]{1,2,3,4};
//		   for(int i = 0; i < array. length; i++){
//			System.out.print(startIndex);
//		   }
//		   return array ;
//
//	   }

//	   //質問7 以下静的なメソッドを定義してください。
//       //  1. メソッド名︓trim
//       //  2. 引数１︓charの配列
//       //  3. 戻り値︓charの配列
//       //  4. 処理内容︓引数１のcharの配列先頭と末尾の空白文を削除してください。
//       public void main(String args[]){
//    	   char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
//   	       System.out.println("元の文字列「" + char + "」");
//   	       System.out.println("文字数は" + char.length() + "です");
//           String new_char =char.trim();
//           System.out.println("空白を取り除いた文字列「" + new_char + "」");
//           System.out.println("文字数は" + new_char.length() + "です");//NG
//       }


        // 質問8  バブルソート用いてメソッドを作成してください。
        // 1. メソッド名︓bubbleSort
        // 2. 引数１︓intの配列
        // 3. 戻り値︓ソート済みの配列
        // 4. 処理内容︓bubbleSortアルゴリズムを用い、入力した引数の配列をソートしてください。
	      public static void main(String[] args) {
	          int[] nums = {3, 4, 6, 1, 22, 11, 15};
	          bubleSort(nums);
	      }
        public static void bubleSort(int nums[]) {
        	for(int i = 0; i < nums. length; i++) {
        		for(int j = nums. length - 1; j > i; j--) {
        			if(nums[j - 1] > nums[j]) {
        				int temp = nums[j];
        				nums[j] = nums[j - 1];
        				nums[j-1] = temp;

        			}
        		}
        	}
        	for(int k = 0; k < nums. length; k++) {
        		System.out.print(nums[k] + " ");//1 3 4 6 11 15 22 ;
        	}
        }

        //質問9 メソッドの呼び出す練習。
	    //1. 質問６-１を用い、２つ配列をマージします。
        //2. 質問８を用い、ステップ1のマージした配列をソートする。
        //3. 注意︓コードを１行にしてください。
//	    public static void main(String[] args) {
//		   String[] str1 = {"left"};
//		   String[] str2 = {"right"};
//		   String[] c = new String[str1.length+str2.length];
//		   for(int x = 0;x < str1. length; x++){
//			   c[x] = str1[x];
//			  }
//			  for(int y = 0; y < str2.length; y++){
//				  c[str1.length + y] = str2[y];
//			  }
//			  for(int y = 0; y < c.length; y++){
//			    System.out.println(c[y] + " ");//left;right
//		   }
//	    }


//
//	    public class bubleSort {
//	    	int[] nums = {3, 4, 6, 1, 22, 11, 15};
//	    	int[] b =new int[7];
//	    	public static void main(String[] args) {
//	    		bubleSort(1,6);
//	    		for(int i = 1; i < b.length; i++)
//	    			System.out.print(nums[i]+" ");//NG
//	    	}
//
//	    }

	}
