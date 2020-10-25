package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


////質問１：
//		int sum = 0;
//		for(int i = 1;i <= 100;i++) {
//			if(i % 2 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
////答：1から１００までの偶数の和は２５５０です
//
//
////質問２：
//		int jc = 1;
//		for(int i = 1;i <= 5;i++) {
//			jc = jc * i;
//		}
//		System.out.println(jc);
////答：５の階乗は１２０です


//質問３：
//		int[] data = new int[] {1,2,6,7,9,6,2,1};
//		int max = data[0];
//		int min = data[0];
//		int sum = data[0];
//
//		for(int i = 1;i < data.length;i++) {
//			if(data[i] > max) {
//				max = data[i];
//			}
//			if(data[i] < min) {
//				min = data[i];
//			}
//			sum += data[i];
//		}
//
//		System.out.println("最大値は"+max);
//		System.out.println("最小値は"+ min);
//		System.out.println("和は"+ sum);
//		System.out.println("平均値は"+(double)sum/data.length);
//答：最大値は9;最小値は1;和は34;平均値は4.25です


////質問４：
//		int[] data = new int[] {1,2,6,7,9,6,2,1};
//
//		for(int i = 0;i < data.length;i++) {
//			for(int j = i + 1;j <= data.length - 1;j++) {
//				if(data[i] == data[j]) {
//					System.out.println(data[i]);
//					}
//			}
//		}
//答：{1,2,6,7,9,6,2,1}に重複ある要素は１，２，６です


//質問５：
//		int[] data = new int[] {1,2,6,7,9,6,2,1};
//		int index = 0;
//
//		for(index = 1;index < data.length;index++) {
//			if(data[index] == 7) {
//				break;
//
//			}
//		}
//
//		System.out.println(index);
//答：値「７」のインデックスは３です


//質問６：
//		int a[][] = new int[2][3];
//		int b[][] = {{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
//		int c[][] = new int[2][4];
//
//		for (int i=0;i<2;i++) {
//			for(int j=0;j<3;j++) {
//				a[i][j] = (i + 1) * (j + 2);
//			}
//		}
//
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<4;j++) {
//				c[i][j] = 0;
//				for(int k=0;k<3;k++)
//					c[i][j] +=a[i][k]*b[k][j];
//			}
//		}
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<4;j++)
//				System.out.println(c[i][j]+"");
//			System.out.println();
//		}


//質問７：
//		int[] array7 = new int[] { 100,56,3,23,12,56 };
// 		for (int i = 0; i < array7.length - 1; i++) {
// 			for (int j = 0; j < array7.length - 1 - i; j++) {
// 				if (array7[j] > array7[j + 1]) {
// 					int temp = array7[j];
// 					array7[j] = array7[j + 1];
// 					array7[j + 1] = temp;
// 				}
// 			}
// 		}
//
// 		System.out.print("質問７:配列の昇順：");
// 		for (int i = 0; i < array7.length; i++) {
// 			System.out.print(array7[i] + " ");
// 		}
// 		System.out.println();


//質問８：
//		 int row = 10;
//		 int a =0;
//		 int b = 0;
//		 for (int i10 = 0; i10 <=row; i10++) {
//			 b = 1;
//			 a = i10 + 1;
//			 for (int j = row - i10; j > 0; j--) {
//				 System.out.print(" ");
//				 }
//			 for (int c = 0; c <= i10; c++) {
//				 if (c > 0) {
//					 b = b * (a - c) / c;
//					 }
//				 System.out.print(b + " ");
//				 }
//			 System.out.println();
//			 }
//
	}

}



