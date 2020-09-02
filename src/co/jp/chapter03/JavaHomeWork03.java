package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問1
		int i = 0;
		switch (i) {
		case 9:
		case 8:
		case 7:
		case 6:
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
			System.out.println("変数. iはプラス");
			break;
		case -9:
		case -8:
		case -7:
		case -6:
		case -5:
		case -4:
		case -3:
		case -2:
		case -1:
			System.out.println("変数. iはマイナス");
			break;
		default:
			System.out.println("変数. iはゼロ");

		}


		//質問2
		int a = 57;
		System.out.println("成績ランキング判断。入力値＝" + a);
		//以下コードを完成してください。

		if( a > 90) {
			System.out.println("A");
			} else if(a >= 80) {
			System.out.println("B");
			} else if(a >= 70) {
			System.out.println("C");
			} else if(a >= 60) {
			System.out.println("D");
			} else {
			System.out.println("E");
		}


		//質問3
		int money = 3340;
		int counts[] = {0, 0, 0, 0, 0};
		int moneyType[] =  {500, 100, 10, 5, 1};
		int count = 0;

		for (int j = 0; j < moneyType. length; j++) {
			counts[j] = money / moneyType[j];
			money %= moneyType[j];
			count += counts[j];
			System.out.println(moneyType[j] + "円：" + counts[j] + "枚");
		}
		System.out.println("合計:" + count + "枚");
	}
}
