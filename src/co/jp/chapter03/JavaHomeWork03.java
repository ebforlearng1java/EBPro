package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
	System.out.println("質問１");
		int a = 60;
		System.out.println("成績ランキング判断。入力値=" + a);
		// 以下コードを完成してください。
		if(a > 90 && a <= 100) {
		System.out.println("A");
		} else if(a >= 80 && a <= 90) {
		System.out.println("B");
		} else if(a >= 70 && a <= 80) {
		System.out.println("C");
		} else if(a >= 60 && a <= 70) {
		System.out.println("D");
		} else if(a >= 0 && a <= 60){
		System.out.println("E");
		}else {
			System.out.println("成績無効です");
		}
		
		
		
		System.out.println("質問2");
		int money = 3340;
		int count500 = 0;
		int count100 = 0;
		int count10 = 0;
		int count5 = 0;
		int count1 = 0;
		
		for(int i = 0;money >= 500;i++ ) {
			money = money - 500;
			count500++;
		}
		for(int j = 0;money >= 100;j++ ) {
			money = money - 100;
			count100++;
		}
		for(int k = 0;money >= 10;k++ ) {
			money = money - 10;
			count10++;
		}
		for(int l = 0;money >= 1;l++ ) {
			money = money - 1;
			count1++;
		}
		System.out.println("500円は" + count500 + "枚");
		System.out.println("100円は" + count100 + "枚");
		System.out.println("10円は" + count10 + "枚");
		System.out.println("1円は" + count1 + "枚");
	}

}
