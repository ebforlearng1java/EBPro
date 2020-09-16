package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1:1から100までの偶数の和を求める(for+if)
		//A:
		int sum1=0;
		for(int i=1;i<101;i++) {
			if(i%2==0) {
				sum1+=i;
			}
		}
		System.out.println(sum1);

		System.out.println("-Q2--------");
		//Q2:5の階乗を求める(for)
		//A:
		int N2=5;
		int M2=1;
		for(int i=1;i<=N2;i++) {
			M2*=i;
		}
		System.out.println(M2);



		System.out.println("-Q3--------");
		//Q3:配列{1,2,6,7,9,2,1}の最大値、最小値、和、平均値を求める。
		//A:
		int[] array3 = new int[] {1,2,6,7,9,2,1};
		int max3=0;
		int min3=99999999;
		int sum3=0;
		int ave3=0;
		for(int i=0;i<array3.length;i++) {
			if(array3[i]>max3) {
				max3=array3[i];
			}
			if(array3[i]<min3) {
				min3=array3[i];
			}
			sum3+=array3[i];
		}

		System.out.println("配列に最大値=" + max3);
		System.out.println("配列に最小値=" + min3);
		System.out.println("配列に和の値=" + sum3);
		System.out.println("配列に平均値=" + sum3/array3.length);


		System.out.println("--------Q4--------");
		//Q4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。
		//A:
		int[] array4 = new int[] {1,2,6,7,9,2,1};

		for(int i=0;i<array4.length;i++) {
			for(int j=i+1;j<array4.length;j++) {
				if(array4[i]==array4[j]) {
					System.out.println(array4[i]);
				}
			}
		}



		System.out.println("--------Q5--------");
		//Q5:質問3の配列の値[7]のインデックスを求める。
		//A:
		int[] array5 = new int[] {1,2,6,7,9,2,1};
		int N5=7;

		for(int i=0;i<array5.length;i++) {
			if(N5==array5[i]) {
				System.out.println(i);
			}
		}



		System.out.println("--------Q6--------");

		//Q6:任意行列(2次元配列)の積を求める。
		//A:
		int[][] array6 = new int[][] {
			{1,2},
			{3,4}
		};

		int[][] array7 = new int[][] {
			{5,6},
			{7,8}
		};
		int[][] array8 = new int[2][2];

		for (int i=0; i<array6.length ; i++) {
			for (int j=0; j<array7[i].length ; j++) {
				array8[i][j]=array6[i][j]*array7[i][j];
				System.out.print(array8[i][j]+",");
			}
			System.out.println("");
		}





		System.out.println("--------Q7--------");

		//Q7:配列を昇順でソートする(java.util等メソッド利用禁止)。
		//A:
		int[] arr7 = new int[] {1,2,6,7,9,2,1};

		for(int i=0;i<arr7.length;i++) {
			for(int j=i+1;j<arr7.length;j++) {
				if(arr7[i]>arr7[j]) {
					int temp7=arr7[i];
					arr7[i]=arr7[j];
					arr7[j]=temp7;
				}
			}
		}
		for(int i=0;i<arr7.length;i++) {
			System.out.println(arr7[i]);
		}





		System.out.println("--------Q8--------");
		//Q8:LV10のパスカルの三角形を出力してください。
		//A:
		int lv=10;
		int num=1;

		for(int i=0;i<lv;i++) {

			int p=i+1;

			//このfor文は追加した部分です。
			for(int z=0;z<lv-i;z++){
                System.out.print("  ");
            }

			for(int j=0;j<=i;j++) {
				if(j>0) {
					num=num*(p-j)/j;
				}
				System.out.print(num+"  ");
			}


			System.out.println();
		}











	}

}
