package co.jp.chapter15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaChapter15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JFrame window = new JFrame("DCNet java Education ");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800,600);
		JButton btn = new JButton("Hello World");
		window.getContentPane().add(btn);
		btn.addActionListener(new ButtonClickListener());
		window.setVisible(true);
	}

	public static class ButtonClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ボタンクリックしました！");
		}


	}

}
