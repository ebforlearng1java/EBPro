package co.jp.chapter15;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaHomeWork15 {
	static List<Card> csvList = new ArrayList<Card>();

	public static void main(String[] args) {

		//		以下ユースケース通り、ATMアプリを作成してください。
		//		1. 顧客はキャッシュカードを持っている、キャッシュカードの番号は⼀意である。
		//		2. バンキングシステムはCSVファイル顧客データを保存している。
		//		3. 顧客が指定した⾦額でお⾦を引き出し、バンキングシステムから⾦額が引く。
		//		4. 顧客が指定した⾦額でお⾦を預かり、バンキングシステムから⾦額が引く。
		//		5. 顧客が指定した⾦額でお⾦を残⾼確認、バンキングシステム指定された顧客の残⾼を読み取り。

		//CSVファイルで顧客データを保存する
		csvList.add(new Card("100-123456781", "password01", 100000));
		csvList.add(new Card("100-123456782", "password02", 150000));
		csvList.add(new Card("100-123456783", "password03", 150000));

		JFrame window = new JFrame("ATMアプリ"); // ウィンドウをインスタンス化する
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(350, 600); // ウィンドウのサイズは 350 X 600 を設定する

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JLabel cardLabel = new JLabel("カード番号：");
		panel.add(cardLabel);
		JTextField cardNum = new JTextField(20);
		panel.add(cardNum);
		JLabel pwLabel = new JLabel("パスワード");
		panel.add(pwLabel);
		JTextField pw = new JTextField(20);
		panel.add(pw);
		JLabel err = new JLabel("");//エラーメーセージの表示
		panel.add(err);

		JButton btn = new JButton("ログイン");
		ActionListener lsn = (ActionEvent e) -> {
			//カードとパスワードのチェック
			Card tempCard = loginCheck(cardNum.getText(), pw.getText());
			if (tempCard != null) {
				window.dispose();//ログイン画面を閉じる
				atmAction(tempCard);//機能操作画面に切り替える
			} else {
				err.setText("キャッシュカードの番号やパスワードが正しくないです。");
			}
		};

		btn.addActionListener(lsn);
		panel.add(btn);
		window.setContentPane(panel);

		window.setVisible(true); // 画⾯が表⽰させる
	}

	private static Card loginCheck(String cardnum, String pw) {
		for (Card card : csvList) {
			if (cardnum.equals(card.getNum())) {
				if (pw.equals(card.getPasswod())) {
					//カードとパスワードが一致している場合
					return card;
				}
			}
		}
		return null;
	}

	private static void atmAction(Card card) {
		JFrame window = new JFrame("機能選択"); // ウィンドウをインスタンス化する
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(350, 600);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JLabel cashLabel = new JLabel("金額入力：");
		panel.add(cashLabel);
		JTextField cash = new JTextField(20);
		panel.add(cash);

		JButton btn1 = new JButton("お引き出す");
		JButton btn2 = new JButton("お預入れ");
		JButton btn3 = new JButton("残高照会");
		JLabel showLabel = new JLabel("");//残高金額表示

		ActionListener lsn1 = (ActionEvent e) -> {
			card.setBalance(card.getBalance() - Long.parseLong(cash.getText()));
			showLabel.setText("残高金額：" + card.getBalance());
		};
		ActionListener lsn2 = (ActionEvent e) -> {
			card.setBalance(card.getBalance() + Long.parseLong(cash.getText()));
			showLabel.setText("残高金額：" + card.getBalance());
		};
		ActionListener lsn3 = (ActionEvent e) -> {
			showLabel.setText("残高金額：" + card.getBalance());
		};

		btn1.addActionListener(lsn1);
		btn2.addActionListener(lsn2);
		btn3.addActionListener(lsn3);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);

		panel.add(showLabel);

		window.setContentPane(panel);
		window.setVisible(true);
	}
}
