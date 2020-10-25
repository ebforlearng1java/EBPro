package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		int[][] array7 = new int[][] { 
			 			{1,2}, 
			 			{3,4}, 
					}; 
			 		int[][] array8 = new int[][] { 
						{5,6}, 
		 			{7,8} 
					}; 
			 		int [][] arrC = new int[2][2]; 
			
			 
					for (int i = 0 ;i <2; i++) { 
			 			for (int j =0; j<2; j++) { 
			 				arrC[i][j] = array7[i][j] + array8[i][j]; 
							System.out.print(arrC[i][j] + ","); 
			 			} 
			 			System.out.println(); 
			 		} 

					int[][] array = {
							{1,2,3,4},
							{10,20,30,40,50,60},
							{1000,10000}
					};
				int sum = 0;
					for (int i=0; i<array.length; i++) {
						for(int s=0; s<array[i].length; s++) {
							sum += array[i][s];
					}
					}

	}

}
