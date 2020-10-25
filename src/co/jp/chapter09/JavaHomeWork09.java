/**ーーーーーーーーーーーーーーーーー09 OOP - その３ーーーーーーーーーーーーーーーーー */
package co.jp.chapter09;

public class JavaHomeWork09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問1:以下ソースにラムダ式の使う場所を解釈してください
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

		//回答：以下の式でラムダ式を使用しました。

		//		btn.addActionListener((ActionEvent e) -> {
		//			System.out.println("ボタンクリックしました。");
		//		});
		//addActionListenerメソッドを呼び出し、引数は(ActionEvent e)
		//「ボタンクリックしました」を出力。

		//質問2:以下ソースに匿名クラスの利用する行は？

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

		//回答： 匿名クラスの利用する行は：new Thread(){

	}

}
