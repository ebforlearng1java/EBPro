package co.jp.chapter08;

public class Kikcer{
	public static void print(Parent v) {
		v.hello();
		}
		public static void main(String...args) {
		print(new Parent());
		print(new Child());
		}
		

}
