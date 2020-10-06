package co.jp.chapter08;

public class Kicker2 {
	public static void print(Child v) {
		v.hello();
		}
	//追加
	public static void print(Parent v) {
		v.hello();
		}
	//追加完了
	
		public static void main(String...args) {
		print(new Parent());
		print(new Child());
		}
}
