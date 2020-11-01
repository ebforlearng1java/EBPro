package co.jp.chapter14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaHomeWork14 {

	public static void main(String[] args) {

		// 質問１:以下共通メソッドを作成してください。
		// 1. メソッド名：eachEveryDay
		// 2. 引数１：yyyy-MM-dd 開始日（文字列）
		// 3. 引数２： yyyy-MM-dd 終了日（文字列）
		// 4. 処理内容：開始日から終了日まで、ループして結果を yyyy-MM-dd で出力する。
		eachEveryDay("2019-10-13","2020-11-01");

		// 質問２：勤務表の集計。以下CSVファイルは「2019年06月度」の勤務期間です。集計してください。
		// 1. 毎日の作業時間（X時間Y分）。（15分切り）
		// 2. 今月の総作業時間（X時間Y分）。
		// 3. 19:00以後は残業時間となり、毎日＆今月の総残業時間（X時間Y分）を集計してください。
	}




	public static String eachEveryDay(String date01,String date02) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date start = simpleDateFormat.parse(date01);
			Date end = simpleDateFormat.parse(date02);
			Calendar start01 = Calendar.getInstance();
			Calendar end01 = Calendar.getInstance();
			start01.setTime(start);
			end01.setTime(end);
			while(start01.compareTo(end01) <= 0) {
				System.out.println(simpleDateFormat.format(start01.getTime()));
				start01.set(Calendar.DATE, start01.get(Calendar.DATE) + 1);
			}

			} catch (ParseException ex) {
				System.out.println("例外発生！");
			}
			return "";
	}
}
