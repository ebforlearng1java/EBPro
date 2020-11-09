package co.jp.chapter14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class JavaHomeWork14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String dateString = simpleDateFormat.format(new Date());
		System.out.println(dateString);
		
//		質問１︓以下共通メソッドを作成してください。
//		1. メソッド名︓eachEveryDay
//		2. 引数１︓ yyyy-MM-dd 開始⽇（⽂字列）
//		3. 引数２︓ yyyy-MM-dd 終了⽇（⽂字列）
//		4. 処理内容︓開始⽇から終了⽇まで、ループして結果をyyyy-MM-dd で出⼒する。
		LocalDate stDate = LocalDate.parse("2020-11-09");
		LocalDate edDate = LocalDate.parse("2020-12-01");
		eachEverDay(stDate,edDate);
		
//		質問２︓勤務表の集計。以下CSVファイルは「2019年06⽉度」の勤務期間です。集計してくださ
//		い。
//		1. 毎⽇の作業時間（X時間Y分）。（15分切り）
//		2. 今⽉の総作業時間（X時間Y分）
//		3. 19:00以後は残業時間となり、毎⽇＆今⽉の総残業時間（X時間Y分）を集計してください。
//		勤務表のCSVファイルは以下通りです。
//		⽇付, 開始時刻, 終了時刻, 休憩時間
		//作り方わからない。
		
		
//		1, , ,
//		2, , ,
//		3, 10:00, 20:15, 1:00
//		4, 10:00, 20:00, 1:00
//		5, 10:00, 20:15, 1:00
//		6, 10:00, 20:00, 1:00
//		7, 10:00, 19:30, 1:00
//		8, , ,
//		9, , ,
//		10, 10:00, 21:30, 1:00
//		11, 10:00, 21:00, 1:00
//		12, 10:00, 21:30, 1:00
//		13, 10:00, 20:00, 1:00
//		14, , ,
//		15, , ,
//		16, , ,
//		17, 10:00, 20:00, 1:00
//		18, 10:00, 20:00, 1:00
//		19, , ,
//		20, 10:00, 20:30, 1:00
//		21, 9:00, 20:00, 1:00
//		22, , ,
//		23, , ,
//		24, 10:00, 21:30, 1:00
//		25, 10:00, 20:30, 1:00
//		26, 10:00, 21:00, 1:00
//		27, 10:00, 20:30, 1:00
//		28, 10:00, 19:15, 1:00
//		29, , ,
//		30, , ,
		
		
		
		
	}
	
	public static void eachEverDay(LocalDate stDate,LocalDate edDate) {
		for(LocalDate date = stDate; date.isBefore(edDate); date = date.plusDays(1)) {
			System.out.println(date);
		}
		System.out.println(edDate);
	}

}
