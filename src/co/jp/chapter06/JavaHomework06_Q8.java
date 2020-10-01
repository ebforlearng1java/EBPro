package co.jp.chapter06;

public class JavaHomework06_Q8 {

	
	 static void bubble_sort(int[] a) {
	        
	        for (int i = a.length-1; i > 0; i-- ) {
	            
	            for (int j = 0; j < i; j++) {
	            	
	                if(a[j] > a[j+1]) {
	                  
	                  int box = a[j];
	                  a[j] = a[j+1];
	                  a[j+1] = box;
	                 
	                } else {
	                  
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 10, 3, 7, 8, 1, 9};
	        bubble_sort(array);
	        System.out.print("質問６-８の答え：");
	        for(int i = 0; i < array.length; i++) 
	        	System.out.print(array[i] + " ");
	    }
}
