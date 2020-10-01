package co.jp.chapter06;

public class JavaHomework06_Q7 {
	
	public static void main(String[] args) {
		
		char[] input = new char[] {' ',' ','A','b',' ',' ','C',' '};
		char[] output = trim(input);
		
		System.out.print("質問６－７の答え：");
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + ",");
		}
	}
	
	
	
	public static char[] trim(char[] array) {
		
		int startIndex = 0;
		int endIndex = 0;
		
		for(int i = 0;i < array.length; i++) {
			
			if(array[i] != ' ') {
			startIndex = i;
				break;
		}
			
			
		}
		for(int j = array.length -1; j >= 0; j--) {
			
		 if(array[j] != ' ') {
				endIndex = j;
				break;
			}
		}
		
		char[] a = new char[(endIndex - startIndex) + 1];
		System.arraycopy(array, startIndex, a, 0, (endIndex - startIndex) + 1);
		return a;
	}

	
}