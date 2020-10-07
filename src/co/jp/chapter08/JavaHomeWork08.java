package co.jp.chapter08;

public class JavaHomeWork08 {
	//質問︓以下コードのコンパイルエラー理由を教えてください。
	//被final修饰的类不能被继承
	
	//質問１︓以下コードの出⼒するを回答してください
	//System.out.println(x == y); 
	//false  因为地址不一样
	
	//System.out.println(x.equals(y));
	//true  因为equal比较了具体的值而不是地址
	
	//System.out.println(nullString.equals(empty));
	//false   null与空字符串“”的值不相等
	
	//質問２︓以下コードの出⼒を回答してください。
	//false  x和y的地址不一样
	//true   x和y的值一样
	
	
	//質問３︓以下コンパイルを修正してください
	/*
	public class Child extends Parent {
		 @Override // 親クラスの強制的にOverrideする意味（アノテーション）
		 public void hello() {
		 super.hello();	 
		 System.out.println("child method");
		 } }
	*/
	//需要在子类中加super.hello
}