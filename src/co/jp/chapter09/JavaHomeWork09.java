package co.jp.chapter09;

public class JavaHomeWork09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		質問１︓以下ソースにラムダ式の使う場所を解釈してください。
//		import java.awt.event.ActionEvent;
//		import java.awt.event.ActionListener;
//		import javax.swing.JButton;
//		import javax.swing.JFrame;
//		public class GUISample {
//		public static void main(String[] args) {
//		JFrame window = new JFrame("DCNet Java 教育");
//		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		window.setSize(800, 600);
//		JButton btn = new JButton("hello world");
//		window.getContentPane().add(btn);
//		btn.addActionListener((ActionEvent e) -> {
//		System.out.println("ボタンクリックしました。");
//		});
//		window.setVisible(true);
//		}
//		}
		System.out.println("btn.addActionListener(ActionEvent e) = new ActionListener()");
		
//		質問２︓以下ソースに匿名クラスの利⽤する⾏は︖
//		public class Kicker {
//			public static void main(String... args) {
//			new Thread() {
//			@Override
//			public void run() {
//			System.out.println("thread running...");
//			}
//			}.start();
//			}
//			}
		System.out.println("4行目");
		
		//質問１︓クラス（Class）とは︖クラス定義⽤のキーワードは「class 」である。
		System.out.println("クラス定義⽤のキーワードは「class 」である");
		
//		質問２︓クラスメンバ（Class member）の何種類ありますか。
		System.out.println("filed function method operator");
		
//		質問３︓クラスメンバの関数は特殊の関数「コンストラクタ」が持っています。
		System.out.println("コンストラクタは public JavaHomeWork09(){}");
		
		
//		質問４︓コンストラクタの特徴
		System.out.println("1. 戻り値不要\r\n" + 
				"2. 関数名＝クラス名称");
		
//		質問５︓コンストラクタの作⽤︓クラス属性の初期化する。
		System.out.println("クラス属性の初期化する。");
		
//		質問６︓１つクラスに複数のコンストラクタ持つ可能。
		System.out.println("例：public JavaHomeWork09(){}\r\n"+"public JavaHomeWork09(String name){}");
		
//		質問７︓キーワードthis の使⽤⽅法︓ this.name ︖ name ?
		System.out.println("this.name = name;");
		
//		質問８︓クラスを利⽤する為、インスタンス化する必要です。インスタンスの演算⼦は
//		new です。
		System.out.println("例 ：JavaHomeWork09 newInstance = new JavaHomeWork09();");
		
//		質問９︓演算⼦new の直後呼び出しているメソッドは「コンストラクタ」︔
		System.out.println("People obj = new People();");
		
//		質問１０︓アクセス制御の３種類あります。
		System.out.println("1. + public\r\n" + 
				"2. # protected\r\n" + 
				"3. - private");
		
//		質問１１︓静的のメンバの定義するキーワード（修飾⼦）はstatic 。
		System.out.println("static");
		
//		質問１２︓静的のメンバアクセス時、インスタンス化不要。アクセス⽅法は「クラス名.
//		静的のメンバ」。
		System.out.println(
				"System.out.println(\"1234\"); // 静的のField\r\n" + 
				"String value = String.format(\"%05d\", 0); // 静的のメソッド");
		
//		質問１３︓クラス「Animal」を定義して、インスタンス化しオブジェクト cat を作成しま
//		す。変数catのsayHello()メソッドを呼び出してください。
		Animal cat = new Animal();
		cat.setName("Hellokitty");
		cat.setAge(10);
		cat.setType("cat");
		cat.sayHello();
		
//		質問１４︓以下１⾏を解釈してください。
//		System.out.println(new Animal("cat").getName());
		System.out.println("インスタンスAnimalからcatのnameを取得する");
		
//		質問１５︓クラス継承する⽤キーワードは「extends 」︖
		System.out.println("extends");
		
//		質問１６︓継承しているクラス。上位クラスは「親クラス」・「スーパークラス」。下位
//		クラスは「サブクラス」と呼びます。
		
//		質問１７︓サブクラス＆アクセス制御（ public, protected ）。
		
//		質問１８︓サブクラスと親クラス同じメソッド名かつメソッドの引数は⼀致する場合、
//		「オーバーライド」となります。
		
//		質問１９︓以下Animalクラスを継承して以下２クラスを作成してください。
//		1. クラス Cat。sayHelloメソッドをオーバーライドして、System.out.println(“ニャー“);
//		2. クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println(“ワン“);
//		※親クラスに明⽰的なコンストラクタが存在しない場合、サブクラスは必ず親クラスのコ
//		ンストラクタをオーバーライドします。
		System.out.println("Cat Dogクラスを参照");
		
		
//		2. クラス Dog。sayHelloメソッドをオーバーライドして、System.out.println(“ワン“);
//		※親クラスに明⽰的なコンストラクタが存在しない場合、サブクラスは必ず親クラスのコ
//		ンストラクタをオーバーライドします。
//		質問２０︓以下コードをIS-A関係で説明してください。
//
//		System.out.println("1234"); // 静的のField
//		String value = String.format("%05d", 0); // 静的のメソッド
//      System.out.println(new Animal("cat").getName());
//
//		Animal v0 = new Animal(); // v0 は Animal 型
//		Animal v1 = new Cat("a cat"); // v1 は Cat 型, v1 は Animal 型
//		Animal v2 = new Dog("a dog"); // v2 は Dog 型, v2 は Animal 型
//		Cat v3 = new Cat(""); // OK
//		Dog v4 = new Dog(""); // OK
//		Cat v5 = new Animal(""); // NG
		

		
		
		
		

	}

}
