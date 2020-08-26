package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name_01 = "WL";
		String name_02 = "WL";

		System.out.println(name_01);
		System.out.println(name_02);
		int num = 10;
		if (num>0 && num<9) {
			System.out.println("変数numはプラスです！");
		}
		else if(num > -9 && num < 0) {
			System.out.println("変数numはマイナスです！");
		}
		else if (num == 0) {
			System.out.println("変数numはゼロです！");
		}
		else {
			System.out.println("変数numは[-9,9]の範囲外です！");
		}

	    num = 96;
		switch(num) {
			case 9 :
			case 8 :
			case 7 :
			case 6 :
			case 5 :
			case 4 :
			case 3 :
			case 2 :
			case 1 :
				System.out.println("変数numはプラスです！");
				break;
			case -9 :
			case -8 :
			case -7 :
			case -6 :
			case -5 :
			case -4 :
			case -3 :
			case -2 :
			case -1 :
				System.out.println("変数numはマイナスです！");
				break;
			case 0 :
				System.out.println("変数numはゼロです！");
				break;
			default:
				System.out.println("変数numは[-9,9]の範囲外です！");
		}

	}

}
