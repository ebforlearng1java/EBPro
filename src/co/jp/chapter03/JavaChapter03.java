package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//if-else if 条件判断
		int i = 0;
		if (i > 0 && i <= 9) {
			//ア：上記条件がtrueの場合、下記処理を実行
			System.out.println("変素.iはプラス");
		} else if (i < 0 && i >= -9) {
			//イ：ア条件がfalse　かつ、上記条件がtrueの場合、
			//下記処理を実行
			System.out.println("変素.iはマイナス");
		} else if (i == 0) {
			//ウ：ア条件がfalse　かつ、イ条件がfalseの場合、
			//上記条件がtrueの場合、下記処理を実行
			System.out.println("変素.iはゼロ");
		} else {
			//エ：ア条件がfalse　かつ、イ条件がfalseの場合、
			//ウ条件がfalseの場合、下記処理を実行
			//上記以外
			System.out.println("input変数の値が計算対象外「-9～9」の間に指定してください");
		}

		//switch-case 条件判断
		switch (i) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("変素.iはプラス");
			break;
		case -1:
		case -2:
		case -3:
		case -4:
		case -5:
		case -6:
		case -7:
		case -8:
		case -9:
			System.out.println("変素.iはマイナス");
			break;
		case 0:
			System.out.println("変素.iはゼロ");
			break;
		default:
			System.out.println("input変数の値が計算対象外「-9～9」の間に指定してください");
		}

		//forループ
		for (int a = 0; a < 10; a++) {
			System.out.println(a);
		}

		for (int a = 0; a <= 10; a++) {
			System.out.println(a);
		}

		//whileループ
		int b=0;
		while(b<10) {
			System.out.println(b);
			b++;
		}

		b=0;
		while(b<=10) {
			System.out.println(b);
			b++;
		}

		//do-whileループ
		int c=0;
		do {
			System.out.println(c);
			c++;
		}while(c<10);

		c=0;
		do {
			System.out.println(c);
			c++;
		}while(c<=10);
	}
}
