package co.jp.chapter08;

public class Kicker_Q2 {
	public static void main(String... args) {
		Employee_Q2 x = new Employee_Q2("1234");
		Employee_Q2 y = new Employee_Q2("1234");
		System.out.println(x == y); // true ? false? 原因は ?
		System.out.println(x.equals(y)); // true ? false? 原因は ?
	}

}
