package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;


public class JavaHomeWork11 {

	public static void main(String[] args) {


		//Q1:駅クラス（Station）、路線クラス（Line）を作成して。
		//路線をインスタンス化してオブジェクト「山手線」を作成してください。
		//「山手線」に各駅情報を追加してください。

		//A1:以下のようになります。(クラスStationとLineも同じ内容です。)

//		package co.jp.chapter11;
//
//		public class Station {
//
//			String[]  yamate = {"東京","有楽町","新橋","浜松町","田町",
//					"高輪ゲートウェイ","品川","大崎","五反田","目黒",
//					"恵比寿","渋谷","原宿","代々木","新宿","新大久保",
//					"高田馬場","目白","池袋","大塚","巣鴨","駒込","田端",
//					"西日暮里","日暮里","鶯谷","上野","御徒町","秋葉原","神田"};
//
//			public String[] getYamate() {
//				return yamate;
//			}
//
//			public void setYamate(String[] yamate) {
//				this.yamate = yamate;
//			}
//		}

//		package co.jp.chapter11;
//
//		import java.util.ArrayList;
//		import java.util.List;
//
//		public class Line {
//			public static void main(String[] args) {
//
//				List<String> list = new ArrayList<String>();
//				Station station = new Station();
//
//				for(int i=0;i<station.yamate.length;i++) {
//					list.add(station.yamate[i]);
//					System.out.println(list.get(i));
//				}
//			}
//
//		}


		//Q2:質問１に作成した山手線の駅をforeach 文を繰り返して、新橋駅は路線内であるかを判断する。
		//A2:


		List<String> list = new ArrayList<String>();
		Station station = new Station();

		for(int i=0;i<station.yamate.length;i++) {
			list.add(station.yamate[i]);
			if (list.get(i)== "新橋") {
				System.out.println("線路内にあります");
			}
		}


		//Q3:10両編成している通勤電車、各車の定員は5人です。
		//31人の乗車の状況をプログラミングしてください。(for文で旅客作成しても構わない）

		//A3:for文でやりました。
		//考え方は10組の車両から6組の5人を選び、残りの4組の車両から1組の1人を選びます。
		//まとめると、10組の車両から7組を選択という組み合わせを作成しました。
		//全部120通りです。

		String[] list3 = { "D1","D2","D3","D4","D5","D6","D7","D8","D9","D10"};

		nCombination2(list3);

	}

	private static void nCombination2(String[] list) {
		int count = list.length;
		int num = 0;
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				for(int k=j+1; k<count; k++) {
					for(int l=k+1; l<count; l++) {
						for(int m=l+1;m<count;m++) {
							for(int n=m+1;n<count;n++) {
								for(int o=n+1;o<count;o++) {
									num++;
									String str5="五人の車両";
									String str1="一人の車両";
									System.out.print(num + " {"+str5+"," +list[i] + ", " + list[j] + ", "
									+list[k]+","+list[l]+","+list[m]+","+list[n]+","+str1+","+list[o]+"}\t");
								}
							}
						}
					}
				}
			}
			System.out.println();
		}
	}

}
