package co.jp.chapter07;

public class Kicker {
	private String word = "abc";
	public void print(String name) {
	System.out.println(name);
	}
	public static void main(String...args) {
	Kicker kicker = new Kicker();
	kicker.print("dcnet.java.教育");
	System.out.println(kicker.word);
	}
	

}
