package co.jp.chapter07;

public class JavaHomeWork07 {
	//質問１︓以下コードのコンパイルエラー理由を教えてください。
	//在Kicker类里无法new别的类的对象
	
	//質問２︓Mathクラスを作成してください。以下メソッドを定義します
	/*
	2-1
	public class Math {
		public static void max(int[] input) {}
		public static void min(int[] input) {}
		public static void sum(int[] input) {}
	public static void main(String[] args){
	max(int[] input)
	min(int[] input)
	sum(int[] input)
	}
	*/

	/*
	2-2
	return Matrix;
	*/

	
	//質問︓以下コードはコンバインエラー発⽣しますか︖理由は︖
	//Human中的name方法是private的，所以同包中的sample类无法访问这个方法

	
	//質問︓下記コードのBugを探します。
	/*
	 Human obj = null;
	 private String name;
	 第一个问题是空指针异常，第二个问题是访问不了别的类的private方法
	 */
	
	
	/*
	 質問１︓ペットクラスを定義してください。ペットクラスは
	名称と年齢を保有して。以下 ２インスタンスを作成してください。
	変数１︓cat , 変数２︓dog。catの名称は ”cat”, 年齢 =2,
	dogの名称は ”dog”, 年齢=5。
	*/
	
	/*
	public class Pet{
		public string name;
		public int age;
			Pet cat = new Pet();
			Pet dog = new Pet();
			cat.name = "cat";
			cat.age = 2;
			dog.name = "dog";
			dog.age = 5;
	*/
	
	/*
	質問２︓アマゾンの各商品(Product)にて、
	クラスを定義してください。例︓価格、写 真、商品名など…
	*/
	
	/*
	public class Product{
	public int price;
	public string name;
	}
	 */
	
	/*
	質問︓以下メソッドの
	静的メンバアクセス所を説明してください。（１箇所）
	*/
	
	//1. 静的なフィールドは︖原因は︖
	//String...args
	
	//2. メソッドを呼び出していますか︖
	//呼び出していま
	
	
	//3. メソッドを呼び出す時、渡すの引数は︖
	//String...args
	
	
	//2. 以下ソースのコンパイルエラーを説明してください。
	//想要通过类名来调用的话需要在Word属性和print方法前面
	//都加上static才能成立，或者创建实例对象来调用
	 
	
	//3.質問２に以下ソース修正したらコンパイルエラー
	//解消できますが、理由を教えてくださ い。
	
	//因为创建了实例对象来调用函数所以不用加static也可以调用
	
	
}
