package co.jp.chapter10;

public class JavaHomework10_Q5 {

	public static void main(String[] args) {

		double i = 1234.e-1;

		String str2 = String.valueOf(i);

		System.out.println("浮動小数点数iの値は：" + i);
		System.out.println("iの桁数は：" + str2.length());
		System.out.println("精度は小数点後2位になると、結果は：" + String.format("%.2f", i));

		int i1 = 16;
		System.out.println("整数16の16進数は：" + Integer.toHexString(i1));
	}
}
