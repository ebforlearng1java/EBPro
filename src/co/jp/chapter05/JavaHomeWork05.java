package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問１
		//aaa出力回数6
		//bbb出力回数2
		
		
		System.out.println("設問1");
		int sum = 0;
		for(int i = 1;i <= 100;i++) {
			if(i %2 == 0 ) {
				sum = sum + i;
			}else {
				continue;
			}
		}
		System.out.println("偶数の和" + sum);
		
		System.out.println();
		System.out.println("設問2");
        int a=1;
        for(int b=1;b<=5;b++)
        {
            a = a*b;
        }
        System.out.println(a);
        
        System.out.println();
        System.out.println("質問3");
        int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
        
        int max = 0;
        for(int i = 0; i < array.length; i++) {
        	if(array[i] > max) { 
        	max = array[i];
        	}
        	}
        System.out.println("最大値=" + max);
		
        int min = max;
        for(int i = 0; i < array.length; i++) {
        	if(array[i] < min) { 
        	min = array[i];
        	}
        	}
        System.out.println("最小値=" + min);

        int add = 0;
        for(int i = 0; i < array.length; i++) {
        	
        	add += array[i];
        	}
        System.out.println("和=" + add);
        
        double avg ;

        avg = add*1.0/(array.length);
        
        System.out.println("平均=" + avg);
        
       
        System.out.println();
        System.out.println("質問4");

        for(int i = 0; i < array.length; i++) {
        	for(int j = i+1;j < array.length; j++) {
        		if(array[i] == array[j]) {
        			System.out.println("重複要素" + array[i]);
        		}else {
        			continue;
        		}
        		
        	}
        }
        System.out.println();
        System.out.println("質問5");
        for(int i = 0; i < array.length; i++) {
        	if(array[i] == 7) {
        		System.out.println("「７」のインデックスは" +i);
        	}else {
        		continue;
        	}
        	}
        System.out.println();
        System.out.println("質問6");
        
        int[][]arrA = new int[][] {
        	{1,2},
        	{1,2}
        };
        int[][]arrB = new int[][] {
        	{3,4},
        	{3,4}
        };
        int[][]arrC = new int[2][2];
        System.out.println("積は");
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2;j++) {
				arrC[i][j] = arrA[i][j] * arrB[i][j];
				System.out.print(arrA[i][j] + ",");
			}
			System.out.println();
		}
        
		System.out.println();
		System.out.println("質問7");
		
		int[] array7 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int x;
		
		
		for(int i = 0; i < array7.length; i++) {
        	for(int j = i+1;j < array7.length; j++) {
				if(array[i] > array[j]) {
					x = array[i];
					array[i] = array[j];
					array[j] = x;
				}
			}
        }
		for(int i = 0; i < array7.length; i++) {
			System.out.print(array[i]);
	}
		System.out.println();
		System.out.println("質問8");
		
		int[][]arr = new int[10][];
		for(int i = 0;i < 10;i++) {
			arr[i] = new int[i + 1];
			for(int j = 1;j <= i;j++) {
				if(j == 0 || j == i)
					arr[i][j] = 1;
				else
					arr[i][j] = arr[i -1][j] + arr[i - 1][j - 1];
				System.out.print(arr[i][j] + "\t");
				}
			System.out.println();
			
		}
		
		
		
		
		
		
		
    }
}

			

	


