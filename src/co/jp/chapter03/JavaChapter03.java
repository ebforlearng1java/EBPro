package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//()の中にNULLはダメ
		int a = 3;
		if (a>0) {
			System.out.println("aはプラス");

		}
		else if (a < 0) {
			System.out.println("aはマイナス");
		}

		else {
			System.out.println("aは0");

		}


        //switch
		int i = 99;
		switch (i) {

		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		    System.out.println("iはプラス");
		    break;
		case -1:
		case -2:
		case -3:
		case -4:
		case -5:
			System.out.println("iマイナス");
			break;
		case 0:

			System.out.println("iは0");
			break;
			default:
			System.out.println("iは指定対象外");
		}

		//質問1
		int x = 98;
		if(x <= 100 && x >= 90) {
			System.out.println("A");
		}
		else if (x<90 && x>=80) {
			System.out.println("B");
		}
		else if (x<80 && x>=70) {
			System.out.println("C");
		}
		else if (x<70 && x>=60) {
			System.out.println("D");
		}
		else if (x<60 && x>=0) {
			System.out.println("E");
		}
		else {
			System.out.println("点数入力ミス");
		}


		//for
		//indexは0から
		//0はjavaの一番目の位置
		for(int y =0;y < 10;y++) {
			System.out.println(y);
		}

		//while(宿題)
        int b = 0;
        while (b<10) {
        	System.out.println(b);
        	b++;
        }

        //do while
        int c = 0;
        do {
        	System.out.println(c);
        	c++;
        } while (c<10);







	}
}
