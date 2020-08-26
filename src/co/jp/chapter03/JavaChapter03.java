package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int mark = 101;

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

		// forループ
		for(int num = 0;num <=10; num++) {
			System.out.println(num);
		}

		// forループ
		for(int num = 0;num <10; num++) {
			System.out.println(num);
		}

		// whileループ
		int num = 0;
		while(num <=10) {
			System.out.println(num);
			num++;
		}

		// do...whileループ
		num = 0;
		do {
			System.out.println(num);
			num++;
		}while(num <10);

	}

}
