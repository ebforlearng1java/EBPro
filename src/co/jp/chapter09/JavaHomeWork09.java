package co.jp.chapter09;

public class JavaHomeWork09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/** 09 OOP - その３ */

		//質問１︓以下ソースにラムダ式の使う場所を解釈してください。
//		import java.awt.event.ActionEvent;
//		import java.awt.event.ActionListener;
//		import javax.swing.JButton;
//		import javax.swing.JFrame;
//		public class GUISample {
//		 	public static void main(String[] args) {
//		 		JFrame window = new JFrame("DCNet Java 教育");
//		 		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		 		window.setSize(800, 600);
//		 		JButton btn = new JButton("hello world");
//		 		window.getContentPane().add(btn);
//		 		btn.addActionListener((ActionEvent e) -> {
//		 			System.out.println("ボタンクリックしました。");
//			 	});
//		 		window.setVisible(true);
//	 		}
//		}
		//答え：btn.addActionListener((ActionEvent e) -> {
        //			System.out.println("ボタンクリックしました。");
        // 		});
		//     でラムダ式を使っている。
		//解釈： 実装するメソッドaddActionListener(ActionEvent e)を呼び出して、
		//実装内容「ボタンクリックしました。」を出力します。

		//質問２︓以下ソースに匿名クラスの利用する行は︖
//		public class Kicker {
//			 public static void main(String... args) {
//			 	new Thread() {
//			    	@Override
//			    	public void run() {
//			        	System.out.println("thread running...");
//			    	}
//			 	}.start();
//			 }
//		}
		//答え：new Thread() {行で匿名クラスの利用となる。


	}
}
