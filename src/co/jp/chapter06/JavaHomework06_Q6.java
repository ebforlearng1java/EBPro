package co.jp.chapter06;

public class JavaHomework06_Q6 {


	public static void main(String[] args) {

		//質問６－０
  	   Object[] arr6_0  = new Object[] {1,2,3,4,5,6};
  	   System.out.print("質問６－０の答え：" );
	   printArray(arr6_0);



	   //質問６－１
	    int i = 0;
	    System.out.print("質問６－１の答え：");
	    mergeArray(i);



	   //質問６－２
	    int[] array2 = new int[] {9,10,11,12};
		System.out.print("質問６－２の答え：");
		subArray(array2);

	}


	  //メソッド//

	  //質問６－０
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


		//質問６－１
		private static int[] mergeArray(int array) {
			int [] left = new int [] {1,2,3,4};
			int [] right = new int [] {5,6,7,8};
			int [] result = new int [left.length + right.length];

			for(int i = 0; i < left.length ; i ++) {
				result[i]=left[i];
			}
			for(int i = 0; i < right.length ; i++) {
				result[i+left.length]=right[i];
			}

			for(int i = 0; i < left.length + right.length;i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println("");
			return result;
		}



		//質問６－２
		public static int[] subArray(int[] array) {
			int[] result = new int[2];
			for(int i = 0; i < 2; i++) {
				result[i]=array[1+i];

				System.out.print(result[i]+" ");
			}
			System.out.println("");
			return result;


		}

    }
