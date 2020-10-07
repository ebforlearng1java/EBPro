package co.jp.chapter09;

public class JavaHomeWork09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1:以下ソースにラムダ式の使う場所を解釈してください
		//A1:以下の式でラムダ式を使用しました。

//		btn.addActionListener((ActionEvent e) -> {
//			System.out.println("ボタンクリックしました。");
//		});

		//解釈： (仮引数) -> {処理}
		//addActionListenerを呼び出して、引数は(ActionEvent e)
		//ボタンクリックしました。を出力します.




//		import java.awt.event.ActionEvent;
//		import java.awt.event.ActionListener;
//		import javax.swing.JButton;
//		import javax.swing.JFrame;
//
//		public class GUISample {
//
//			public static void main(String[] args) {
//
//				JFrame window = new JFrame("DCNet Java 教育");
//				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				window.setSize(800, 600);
//
//				JButton btn = new JButton("hello world");
//				window.getContentPane().add(btn);
//
//				btn.addActionListener((ActionEvent e) -> {
//					System.out.println("ボタンクリックしました。");
//				});
//				window.setVisible(true);
//			}
//
//		}



		//Q2:以下ソースに匿名クラスの利用する行は？
		//A2: new Thread(){




//		public class Kicker {
//			public static void main(String... args) {
//				new Thread() {
//					@Override
//					public void run() {
//						System.out.println("thread running...");
//					}
//				}.start();
//			}
//		}



	}

}
