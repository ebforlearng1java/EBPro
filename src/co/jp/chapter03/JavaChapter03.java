package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		//TODO 自動生成されたメソッド・スタブ

		/******************8/26授業内容*********************/
		String str1 = "test";
		String str2 = new String("test");
		if (str1 == str2) {
			//true処理ロジック
			System.out.println("str1とstr2が一致");
		} else {
			//false処理ロジック
			System.out.println("str1とstr2が不一致");
		}

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

		/*************************8/28授業内容*************************/
		//forループ
		for (int a = 0; a < 10; a++) {
			System.out.println("FOR 10回　＝なし" + a);
		}
		System.out.println("-------------------------");

		for (int a = 0; a <= 10; a++) {
			System.out.println("FOR 10回　＝あり" + a);
			if (a == 5) {
				break;
			}
		}
		System.out.println("-------------------------");

		//deal loop 下方のソースは→dead code(logic) デットロジック
		//{}の中に break 方の下も→dead code(logic) デットロジック
		//if (true) のelse にも→dead code(logic) デットロジック

		//whileループ
		int b = 0;
		//		while (b == 0) {// dead loop
		//			System.out.println(b);
		//		}

		while (b < 10) {
			System.out.println("while の LABALABA" + b);
			b++;
		}
		System.out.println("-------------------------");

		b = 0;
		while (b <= 10) {
			System.out.println("while の LABALABA" + b);
			b++;
		}
		System.out.println("-------------------------");

		int d = 0;
		d = 0;
		while (true) {
			System.out.println(d);
			if (d >= 10) {
				break;
			}
			d++;
		}
		System.out.println("-------------------------");

		//do-whileループ
		int c = 0;
		do {
			System.out.println("while の LABALABA" + c);
			c++;
		} while (c < 10);
		System.out.println("-------------------------");

		c = 0;
		do {
			System.out.println("while の LABALABA" + c);
			c++;
		} while (c <= 10);
		System.out.println("-------------------------");

		//do while は必ず1回実行する
		int x = 100;
		do {
			System.out.println(x);
			x++;
		} while (x < 10);
		System.out.println("-------------------------");

		//continue
		for (int a = 0; a < 10; a++) {
			if (a % 2 != 0) {
				continue;
			}
			System.out.println(a);
		}
		System.out.println("-------------------------");

		//9行の"111111111"を出力する
		int m = 9;
		for (int a = 0; a < m; a++) {
			for (int j = 0; j < m; j++) {
				System.out.print(1);
			}
			System.out.println("");
		}

		System.out.println("-------------------------");

		for (int a = 0; a < (m*m); a++) {
			System.out.print(1);
			if ((a + 1) % m == 0) {
				System.out.println("");
			}
		}

		for (int a = 0; a < m; a++) {
			for (int j = 0; j < m; j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println("");
		}

		for (int a = 0; a < m; a++) {
			for (int j = 0; j < m; j++) {
				if(a==j || (a+j+1)==m||a==m/2 || j==m/2) {
				System.out.print(a+""+j);
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}
