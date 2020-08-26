package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//質問1
		int x = 89;
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












		//質問2
		int i = 3340;
		//500円の枚数
		int a = i/500;
		int a1 = i%500;
		//100円の枚数
		int b = a1/100;
		int b1 = a1%100;
		//10円の枚数
		int c = b1/10;
		int c1 = b1%10;
		//5円の枚数
		int d = c1/5;
		int d1 = c1%5;
		//1円の枚数
		int e = d1;
		System.out.println("500円の枚数は"+a);
		System.out.println("100円の枚数は"+b);
		System.out.println("10円の枚数は"+c);
		System.out.println("5円の枚数は"+d);
		System.out.println("1円の枚数は"+e);


	}

}
