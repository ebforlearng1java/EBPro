package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("問題1");
		System.out.println("0,0,0,0");
		
		System.out.println("問題2");
		System.out.println("5,6");
		
		System.out.println("問題3"); 
		int[][] array = new int[2][3];
		array[0] = new int[]{0,0,0};
		array[1] = new int[]{0,0,0};
		System.out.println("0,0,0"); 
		System.out.println("0,0,0");
		
		System.out.println("問題4");
		
		System.out.println("問題5");
		int[] array5 = new int[] {1, 3, 5, 7, 100, 0, 1};
        int max = 0;
        for(int i = 0; i < array5.length; i++) {
        	if(array5[i] > max) { 
        	max = array5[i];
        	}
        	}
        System.out.println("最大値=" + max);
        int min = max;
        for(int i = 0; i < array5.length; i++) {
        	if(array5[i] < min) { 
        	min = array5[i];
        	}
        	}
        System.out.println("最小値=" + min);
        
        System.out.println("問題6");
        int[] array1 = new int[4];
        int sum = 0;
        for(int i = 0; i < array1.length; i++) {
        	sum = sum + array1[i];
        	
        }
        System.out.println("和は" + sum);
        
        
        
        System.out.println("問題7");
        System.out.println("和は");
        int[][]arrA = new int[][] {
        	{1,2},
        	{1,2}
        };
        int[][]arrB = new int[][] {
        	{3,4},
        	{3,4}
        };
        int[][]arrC = new int[2][2];
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2;j++) {
				arrC[i][j] = arrA[i][j] + arrB[i][j];
				System.out.print(arrA[i][j] + ",");
			}
			System.out.println();
		}
		
		System.out.println("積は");
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2;j++) {
				arrC[i][j] = arrA[i][j] * arrB[i][j];
				System.out.print(arrA[i][j] + ",");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
