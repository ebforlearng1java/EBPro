package co.jp.chapter07;

public class Sample {
 	public static void main(String...args) {
 		Human man = new Human();
 //		System.out.println(man.name);// NG, nameはprivateの為、アクセス不可
 		System.out.println(man.age);// OK, ageはprotected、同じPackageのクラスアクセス可能
 		System.out.println(man.getName()); // OK, publicの為、いつでもどこでもアクセス可能
 		}
 }
