package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		int i = 0;//変数
//
//		if(i > 0) {
//			//ア：上記条件がtrueの場合、下記処理を実行
//			System.out.println("変数.iはプラス");
//
//		}else if(i < 0) {
//			//イ：ア条件がfalseかつ、上記条件がtrueの場合、
//			//下記処理を実行
//			System.out.println("変数.iはマイナス");
//
//		}else {//(i ①< ②=0)
//			//ウ：ア条件がfalseかつ、イ条件がfalseの場合、
//			//下記処理を実行
//			//上記以外
//
//			System.out.println("変数.iはゼロ");
//
//		}

//		int a = 10;
//		int b = 20;
//		if(a>b) {
//			System.out.println("ここに到着できない");
//		}else {
//			System.out.println("該当行は実施しますか？");
//		}

//		int a = 10;
//		int b = 20;
//		if(a>b) {
//			System.out.println("ここに到着できない");
//		}
//			System.out.println("該当行は実施しますか？");

//		//if + else ステートメント
//		//elseのパターンは
//		//1.a<b 2.a==b
//		int a = 10;
//		int b = 20;
//		if(a>b) {
//			System.out.println("ここに到着できない");
//		}else {
//			System.out.println("b>a or a == b");
//		}

//		int a = 30;
//		int b = 20;
//		if(a>b) {
//			System.out.println("aはbより大きい");
//		}else if(a==b){
//			System.out.println("aはｂひとしい");
//		}else {
//			System.out.println("bはaより大きい");
//		}

		//switch

//		int a = 10;
//		switch(a) {
//			case 1:
//				System.out.println("a = 1");
//				break;
//
//			case 10:
//				System.out.println("a = 10");
//				break;
//
//			default:
//				System.out.println();
//				break;
//		}

//		if(a == 1) {
//			System.out.println("a = 1");
//		}else if(a == 10) {
//			System.out.println("a = 10");
//		}else {
//			System.out.println("default");
//		}

//		//★switch利用可能の変数型：
//		//byte,short,int,char

//		switch(i) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//		case 6:
//		case 7:
//		case 8:
//		case 9:
//			System.out.println("変数.iはマイナス");
//			break;
//		case -1:
//		case -2:
//		case -3:
//		case -4:
//		case -5:
//		case -6:
//		case -7:
//		case -8:
//		case -9:
//			System.out.println("変数.iはマイナス");
//			break;
//		case 0:
//			System.out.println("変数.iはゼロ");
//			break;
//		default:
//			System.out.println("input変数の値が計算対象外「-9~9」の間に指定ください");
//		}

//		//for文①
//		for(int a = 0; a<10; a++) {
//			System.out.println(a);
//		}

//		//for文②
//		int b = 0;
//		for(; b< 10;) {
//			System.out.println(b);
//			b++;
//		}
//
//		//for文③
//		int c = 0;
//		for(; ;) {
//			System.out.println(c);
//			c++;
//			if(c>= 10) {
//				break;
//			}
//		}

		//for文①がよく使われているが、for②と③は原則的に使わないって。

//		int a = 0;
//		while(a < 10) {
//			System.out.println(a);
//			a++;
//		}

//		while(true) {
//			if(a>= 10) {
//				break;
//			}
//			System.out.println(a);
//			a++;
//		}

		//Break/Continue

//		for(int i = 0; i < 100;++i) {
//			if(i > 10) {
//				break;
//			}
//			System.out.println(i);
//		}
//
//		for(int j = 0; j < 100;j++) {
//			if(j%2 ==0 ) {
//				System.out.println(j);
//			}
//		}
//
//		//continueを使用する場合
//		for(int q = 0; q < 100; q++) {
//			if(q % 2 != 0) {
//				continue;
//			}
//			System.out.println(q);
//		}

//		//★（無限ループ）dead loop dead code デッドロジック
//		//if (true)のelse にも dead code(logic)

//		int j = 10;
//		while(j == 10) {
//		System.out.println("LABALABA");
//		}
//
//		for(int q =0; q <= 10; q++) {
//			System.out.println("FOR 10回 = あり"+i);
//		}
//
//		//while
//		int j1 = 0;
//		while(j1 <= 10) {
//			System.out.println("LABALABA");
//			j1++;
//		}
//
//		for(int m = 0;m < 5 ;m++) {
//			for(int n = 0;n < 5 ;n++) {
//				System.out.print(1);
//			}
//			System.out.println();
//		}

//		//目出し
//		00 01 02 03 04
//		10 11 12 13 14
//		20 21 22 23 24
//		30 31 32 33 34
//  	40 41 42 43 44
//		for (int i = 0; i < 5; i++) {
//
//			   for (int j = 0; j < 5; j++) {
//
//			   System.out.print(i+""+j+" ");
//
//			   }
//
//			   System.out.println();
//			  }

//		//目出し
//		00
//		   11
//		      22
//		         33
//		            44
//		int count = 0;
//		for (int i = 0; i < 5; i++) {
//
//			   for (int j = 0; j < 5; j++) {
//				   if(i == j) {
//					   System.out.print(i+""+j+" ");
//				   }else {
//					   System.out.print("  ");
//				   }
//			   }
//			   if(count%5 == 0){
//				   System.out.println();
//			   }
//
//			  }

//		//目出し
//		00          04
//		   11    13
//		      22
//		   31    33
//  	40          44
		int count = 0;
		for (int i = 0; i < 5; i++) {

			   for (int j = 0; j < 5; j++) {
				   if(i == j || i + j == 4) {
					   System.out.print(i+""+j+" ");
				   }else {
					   System.out.print("  ");
				   }
			   }
			   if(count%5 == 0){
				   System.out.println();
			   }

			  }

	}
}
