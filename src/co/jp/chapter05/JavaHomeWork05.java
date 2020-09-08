package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		        //質問1
				//1から100までの偶数の和を求める(for+if)
		        System.out.println();
		        System.out.println("質問1");
				int sum = 0;
				for (int i = 1;i<=100;i++){
					if(i%2 == 0){
						sum = sum + i;
					}

				}
				System.out.println(sum);


				//質問2
				//5の階乗を求める(for)
				System.out.println();
				System.out.println("質問2");
				int a = 1;
				for (int j=1;j<=5;j++){
					a = a*j;
				}
				System.out.println(a);

				//質問3
				System.out.println();
				System.out.println("質問3");
				int arr[] = new int[] {1,2,6,7,9,6,2,1};
				//ここに注意すべきのは、maxの初期値に0を設定してはいけない
				//最大値、最小値
				int max = arr[0];
				int min = arr[0];
				for (int i = 0;i < arr.length;i++){
				if (arr[i]>max){
					max = arr[i];
				}
				if (arr[i]<min){
					min = arr[i];
				}

				}
				System.out.println("max="+max);
				System.out.println("min="+min);

				//和と平均値
				int sum3 = 0;
				double avg = 0;
				for (int i = 0;i < arr.length;i++){
					sum3 = sum3+arr[i];
				}
				avg = sum3/arr.length;
				System.out.println("sum="+sum3);
				System.out.println("avg="+avg);


				//質問4
				//質問3重複な要素を探す
				System.out.println();
				System.out.println("質問4");
				int count=0;
				for(int x=0;x<arr.length;x++) {
					for(int y=x+1;y<arr.length;y++) {
						if(arr[x]==arr[y]) {

							count++;
						}

					}
					if(count==1) {
						System.out.println("重複な要素："+arr[x]);
						count = 0;
					}

				}


				//質問5
				//質問3の配列に値「7」のインデックスを求め
				System.out.println();
				System.out.println("質問5");
				for(int k=0;k<arr.length;k++) {
					if(arr[k]==7) {
						System.out.println("値「7」のインデックスは"+k+"です。");
					}
				}


				//質問6
				//二次元配列の積
				System.out.println();
				System.out.println("質問6");
				System.out.println("この二つ二次元配列の積は以下となります。");
				int[][] arr1 = new int[][] {
					{1,2,3},{4,5,6}
				};
				int[][] arr2 = new int[][] {
					{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
				};
				int[][] arr3 = new int[2][4];
				int sum6 = 0;
				for(int i=0;i<arr3.length;i++) {
					for(int j=0;j<arr3[i].length;j++) {
						sum6 = 0;
						for(int k=0;k<arr1[i].length;k++) {
							sum6+=arr1[i][k]*arr2[k][j];
						}
						arr3[i][j] = sum6;

						System.out.println(arr3[i][j]+" ");
					}
					System.out.println(" ");
				}



				//質問7
				//配列を昇順でソートする。
				System.out.println();
				System.out.println("質問7");
				int arr7[] = new int[] {1,2,7,6,9};
				int empt = 0;
				for(int p=0;p<arr7.length;p++) {
					for(int q=1;q<arr7.length-p;q++) {
						if(arr7[q-1]>arr7[q]) {
							empt = arr7[q-1];
							arr7[q-1] = arr7[q];
							arr7[q] = empt;
						}
					}
					System.out.println(arr7[p]);
				}


				//質問8
				//LV10のパスカル三角形を出力
				System.out.println();
				System.out.println("質問8");
				int n = 10;
				int[][] arr8 = new int[n][n];
				for (int i = 0; i < n; i++) {
		            //格式化输出
		            System.out.format("%" + (n - i) * 2 + "s", "");
		            for (int j = 0; j <= i; j++) {
		                if (j == 0 || j == i) {
		                    arr8[i][j] = 1;
		                } else {
		                    arr8[i][j] = arr8[i - 1][j - 1] + arr8[i - 1][j];
		                }

		                System.out.format("%4d", arr8[i][j]);
		            }

		            System.out.println();
		        }






	}

}
