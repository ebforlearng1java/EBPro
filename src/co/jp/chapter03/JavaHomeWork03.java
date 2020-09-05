package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 質問１︓成績ランキング判断を作成する「90以上:A, 80-90:B, 70-80:C, 60-70 :D, 60以下:E」
		int mark = 99;

		// 成績は[90,100]の間の場合、成績ランキングはAです。
		if (mark >=90 && mark <=100) {
			System.out.println("成績ランキング判断： A");
		}

		// 成績は[80,90)の間の場合、成績ランキングはBです。
		else if (mark<90 && mark >= 80) {
			System.out.println("成績ランキング判断： B");
		}

		// 成績は[70,80)の間の場合、成績ランキングはCです。
		else if (mark<80 && mark >= 70) {
			System.out.println("成績ランキング判断： C");
		}

		// 成績は[60,70)の間の場合、成績ランキングはDです。
		else if (mark<70 && mark >= 60) {
			System.out.println("成績ランキング判断： D");
		}

		// 成績は[0,60)の間の場合、成績ランキングはEです。
		else if (mark<60 && mark >= 0){
			System.out.println("成績ランキング判断： E");
		}

		// 入力数字が[0,100]以外の場合、メッセージ「入力ミス」を出力する。
		else {
			System.out.println("入力ミス");
		}

		// 質問２︓日本のコインを１円、５円、１０円、50円、１００円、５００円があります。３３４０円のコイン数をもとめください。
		int total_money = 3340;
		int sum =0;
		int[] combinations = new int[]{1, 5, 10, 50, 100, 500};

		// 500円の可能数（枚数はゼロ以上の場合）
		for(int coin_500 =0;coin_500<= total_money/combinations[5];coin_500++) {

			// 100円の可能数（枚数はゼロ以上の場合）
			for (int coin_100 =0;coin_100<= total_money/combinations[4];coin_100++) {

				// 50円の可能数（枚数はゼロ以上の場合）
				for (int coin_50 =0;coin_50<= total_money/combinations[3];coin_50++) {

					// 10円の可能数（枚数はゼロ以上の場合）
					for (int coin_10 =0;coin_10<= total_money/combinations[2];coin_10++) {

						// 5円の可能数（枚数はゼロ以上の場合）
						for (int coin_5 =0;coin_5<= total_money/combinations[1];coin_5++) {

								// 1円の可能数（枚数はゼロ以上の場合）
								int coin_1 = total_money- (coin_500*combinations[5]+coin_100*combinations[4]
									 +coin_50*combinations[3]+coin_10*combinations[2]+coin_5*combinations[1]);
								// コインの総額を集計する
								sum = coin_500*combinations[5]+coin_100*combinations[4]+coin_50*combinations[3]
									 +coin_10*combinations[2]+coin_5*combinations[1]+coin_1*combinations[0];
								// コインの数は3340の場合、かつ1円の枚数はゼロ以上の場合
								if(sum == total_money && coin_1>=0) {
								// 各種類のコインの枚数を出力する
								System.out.println(coin_500+","+coin_100+","+coin_50+","+coin_10+","+coin_5+","+coin_1);

							}
						}
					}
				}
			}
		}
	}
}

















