package co.jp.chapter08;

public class Kicker {

	public static void main(String...args) {
		Employee x = new Employee("1234");
		Employee y = new Employee("1234");
		System.out.println(x == y); // false
		System.out.println(x.equals(y)); // true 
		}
	
}
