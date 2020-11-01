package co.jp.chapter15;

import java.util.Scanner;

public class ATM {
	public static void ATM() {
		Bean bean = new Bean();
		Scanner scanner = new Scanner(System.in);
		System.out.println("いらっしゃいませ！操作を選択してください！");
		System.out.println("1.残高照会");
		System.out.println("2.お引き出す");
		System.out.println("3.お預入れ");
		System.out.println("0.ホームページに戻す");
		int input = scanner.nextInt();
		switch (input) {
		case 0:
		ATM();
		break;
		case 1:
		System.out.println("カレントの金額："+bean.balance);
		System.out.println("ボタンを押して戻り");
		int input0=scanner.nextInt();
		ATM();
		break;
		case 2:
		System.out.println("引き出す金額を入力してください：");
		int takemoney1=scanner.nextInt();
		bean.takeMoney(takemoney1);
		System.out.println("カレントの金額は："+bean.balance);
		System.out.println("**************");
		ATM();
		break;
		case 3:
		System.out.println("お預入れ金額を入力してください：");
		int savemoney1=scanner.nextInt();
		bean.saveMoney(savemoney1);
		System.out.println("カレントの金額は："+bean.balance);
		System.out.println("*************");
		ATM();
		break;
		default:
		System.out.println("入力無効です。改めて選択してください！");
		int input1=scanner.nextInt();
		ATM();
		break;
		}
	}

	public static void start(){
		Bean bean=new Bean();
		Scanner scanner=new Scanner(System.in);
		System.out.println("いらっしゃいませ！");
		System.out.println("*************");
		System.out.println("記号番号を入力:");
		Integer CardNumer = scanner.nextInt();
		System.out.println("パスワードを入力：");
		Integer Password = scanner.nextInt();
		for (int i = 0; i < bean.arr.length; i++) {
				if (CardNumer == bean.arr[i][0]){
					if (Password == bean.arr[i][1]) {
					ATM();
				}
			} else {
				System.out.println("パスワードが正しくないです，0を選択してホームページに戻す。");
				int input=scanner.nextInt();
				if(input==0){
					start();
				}else {
					System.out.println("入力エラー!");
				}
			}
		}
	}
}
