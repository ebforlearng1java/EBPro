package co.jp.chapter01;

public class JavaHomeWork01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 10;
		int y = 20;
		x = y;
		y = 30;
		System.out.println(x);
		System.out.println(y);
		
		
		int s = 10;
		int g = 20;
		if(s != g) {
			System.out.println("yes");
			
		};
		
		
		//課題　質問集
		//1
		int i = 10 ;
		int n = i % 5;
		System.out.println(n);//0
		
		//2
		int a = 12;
		a = a > 10 ? 11 : 0; //aが10より大きい時、a=10。10より小さい時、a=0
		System.out.println(a);
		
		//3
		int value1 = 10;
		int value2 = 11;
		if(value1 == value2) { //"=="は比較演算子、"="は値を付与する演算子
			System.out.println("say yes");
		}else {
			System.out.println("say no");
		}
		
		//質問４︓ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
		boolean flag = false;
		if(!flag) {
			flag = true;
			if(flag) {
				System.out.println("trueにしたよ");
			}
		}
	}

}
