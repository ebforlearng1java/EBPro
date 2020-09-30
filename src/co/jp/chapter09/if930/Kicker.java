package co.jp.chapter09.if930;

public class Kicker {
	
	//内部クラス
//	public static class Fish implements IPet{
//
//		@Override
//		public void hello() {
//			// TODO Auto-generated method stub
//			System.out.println("GUlululu");
//		}
//		
//	}
	public static void main(String[] args) {
		
//		//一般クラス
//		IPet cat = new Cat();
//		cat.hello();
//		
//		IPet dog = new Dog();
//		dog.hello();
//		
//		//内部クラス
//		IPet fish = new Fish();
//		fish.hello();
//		
//		//匿名クラス
//		IPet bird = new IPet() {
//			public void hello() {
//				System.out.println("wawaaw");
//			}
//		};
//		bird.hello();
		
		//ラムダ式
//		String str = "12345";
//		IPet frog = (a,b) ->{
//			System.out.println(a + "---------!!"+ b);
//		};
//		frog.hello("12312132","ABCSDSD");
//	}
//	
//	int sum(int a, int b) {
//		return a+b;
//	}
//	
//    void method_1 () {
//		
//	}
		
		
		String code = "1";
		System.out.println(SEX.getEnum(code).description); // 男性
	
}
}