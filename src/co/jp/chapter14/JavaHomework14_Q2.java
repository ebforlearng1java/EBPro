
		//CSVファイル：C:\\test\\sample.csv

		//3,10.00,20.25,1.00
		//4,10.00,20.00,1.00
		//5,10.00,20.25,1.00
		//6,10.00,20.00,1.00
		//7,10.00,19.50,1.00
		//10,10.00,21.50,1.00
		//11,10.00,21.00,1.00
		//12,10.00,21.50,1.00
		//13,10.00,20.00,1.00
		//17,10.00,20.00,1.00
		//18,10.00,20.00,1.00
		//20,10.00,20.50,1.00
		//21,09.00,20.00,1.00
		//24,10.00,21.50,1.00
		//25,10.00,20.50,1.00
		//26,10.00,21.00,1.00
		//27,10.00,20.50,1.00
		//28,10.00,19.25,1.00

package co.jp.chapter14;


public class JavaHomework14_Q2 {

		//import java.io.BufferedReader;
		//import java.io.File;
		//import java.io.FileReader;
		//import java.io.IOException;
		//
		//public class Homework14_Q2 {
//			public static void main(String args[]) {
//				try {
//					File f = new File("C:\\test\\sample.csv");
//					BufferedReader br = new BufferedReader(new FileReader(f));
		//
//					String line;
//					float sum1 = 0;
//					float overtime = 0;
//					float sum2 = 0;
//					// 1行ずつCSVファイルを読み込む
		//
//					while ((line = br.readLine()) != null) {//EOFまでループ
		//
//						String[] sp = line.split(",");//","で分割して配列に。
		//
//						for (int i = 1; i < sp.length; i++) {//配列の要素の数だけループ
		//
//							if (i < 2) {
//								float minus = (float) (Double.parseDouble(sp[i + 1]) - Double.parseDouble(sp[i])
//										- Double.parseDouble(sp[i + 2]));
//								sum1 = sum1 + minus;
		//
//								System.out.println(sp[0] + "日の出勤時間:" + minus + "時間");
//								if (Double.parseDouble(sp[i + 1]) > 19.00) {
//									overtime = (float) (Double.parseDouble(sp[i + 1]) - 19.00);
//									sum2 = sum2 + overtime;
//									System.out.println(sp[0] + "日の残業時間:" + overtime + "時間");
//									System.out.println(" ");
//								} else {
//									continue;
//								}
//							} else
		//
//								break;
//						}
//					}
//					System.out.println(" ");
		//
//					System.out.println("今月の出勤時間：" + sum1 + "時間");
//					System.out.println("今月の残業時間：" + sum2 + "時間");
//					br.close();
//				} catch (IOException e) {
//					// TODO 自動生成された catch ブロック
//					e.printStackTrace();
//				} finally {
//				}
//			}
		//}
}