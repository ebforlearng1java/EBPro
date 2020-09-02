package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//配列
		String[] strArray=new String[] {"1","2","3","4","5"};
		Object[] objArray=new Object[] {1,"2",true};

		//定義方式１；宣言かつ初期化
		int[] array1=new int[] {55,22,33,11,44,5555};
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}

		int[] array2=new int[4];
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);//0
		}

		Integer[] array3=new Integer[4];
		for(int i=0;i<array3.length;i++) {
			System.out.println(array3[i]);//null
		}

		int[] array4=new int[] {1,3,5,7,9};
		for(int i=0;i<array4.length;i++) {
			System.out.println(array4[i]+1);
		}

		int[] array5=new int[100];
		for(int i=0;i<array5.length;i++) {
			array5[i]=i+1;
			System.out.println(array5[i]);
		}

		int[] array6=new int[10];
		for(int i=0;i<array6.length;i++) {
			if(i<array6.length/2) {
				array6[i]=(i+1)*2;
			}else {
			array6[i]=array6[i-array6.length/2]-1;
			}
			System.out.println(array6[i]);
		}

		String[] arrStr=new String[] {"H","E","L","L","O","W","O","R","L","D"};
		for(int i=0;i<arrStr.length;i++) {
			if(i<arrStr.length/2) {
				arrStr[i]=arrStr[i*2];
			}else {
				arrStr[i]=arrStr[((i-(arrStr.length/2))+1)*2-1];
			}
			System.out.println(arrStr[i]);
		}

		//拡張Forループ
		int[] array7=new int[10];
		for(int item:array7) {
			System.out.println(item);
		}

		//２次元配列
		int[][] array8 = new int[4][2];

		int[][] array9 = new int[][] {
			{1,2,3},
			{4,5,6}
		};
		for(int i=0;i<array9.length;i++) {
			for(int j=0;j<array9[i].length;j++) {
				System.out.println(array9[i][j]);
			};
		}

	}
}
