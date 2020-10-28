package co.jp.chapter14;

import java.time.LocalDate;

public class JavaHomeWork14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1:以下共通メソッドを作成してください。
		//1. メソッド名︓eachEveryDay
		//2. 引数１︓ yyyy-MM-dd 開始日（文字列）
		//3. 引数２︓ yyyy-MM-dd 終了日（文字列）
		//4. 処理内容︓開始日から終了日まで、ループして結果をyyyy-MM-dd で出力する。

		//A1:以下のようになります。メソッドは32行からです

		LocalDate startDate = LocalDate.parse("2020-10-30");
		LocalDate endDate = LocalDate.parse("2020-11-03");

		eachEveryDay(startDate,endDate);


		//Q2:勤務表の集計。以下CSVファイルは「2019年6月度」の
		//勤務期間です。集計してください。

		//A2:申し訳ございません。やっていません。

	}

	//A1:
	public static void eachEveryDay(LocalDate start ,LocalDate end) {
		start.datesUntil(end.plusDays(1)).forEach(System.out::println);
	}



}
