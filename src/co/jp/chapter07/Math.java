package co.jp.chapter07;

public class Math {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[]array = new int[]{1,2,3,4,5,6,7};

	        int intMax = array[0];
	        for(int i = 1; i < array. length; i++) {
		        if(intMax < array[i]) {
		        	intMax = array[i];
		         }
		     }
		        System.out.println(intMax);
		        //答え：7

		 int min = String.valueOf(array[0]).length();


		        for(int j = 1; j < array. length; j++) {
		        	int len = String.valueOf(array[j]).length();
		        	if(min > len) {
		        		min = len;
		        	}
		        }
		        System.out.print(min);
		        //答え：1

		  int sum = array[0];
		  int n = 1;
		      	for(int i = 1; i <  array.length; i++) {
		      	    sum +=  array[i];
		            n++;
		        }
		   		    int avg = sum/n;
		   		System.out.print(avg);
		   		//答え：4



	}

}
