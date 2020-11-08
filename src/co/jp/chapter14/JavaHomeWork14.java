package co.jp.chapter14;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JavaHomeWork14 {

	public static void main(String[] args) {

		//質問１︓以下共通メソッドを作成してください。
		//1. メソッド名︓eachEveryDay
		//2. 引数１︓ yyyy-MM-dd 開始日（文字列）
		//3. 引数２︓ yyyy-MM-dd 終了日（文字列）
		//4. 処理内容︓開始日から終了日まで、ループして結果をyyyy-MM-dd で出力する。
		//答え:

		LocalDate startDate = LocalDate.parse("2020-10-30");
		LocalDate endDate = LocalDate.parse("2020-11-03");

		eachEveryDay(startDate, endDate);

		//質問２︓勤務表の集計。以下CSVファイルは「2019年06⽉度」の勤務期間です。集計してください。
		//		1. 毎⽇の作業時間（X時間Y分）。（15分切り）
		//		2. 今⽉の総作業時間（X時間Y分）
		//		3. 19:00以後は残業時間となり、毎⽇＆今⽉の総残業時間（X時間Y分）を集計してください。
		//答え:csvファイルの内容と直接にリストに設定する
		String month = "2019/06";
		List<String> csvList = new ArrayList<String>();
		csvList.add("1, , ,");
		csvList.add("2, , ,");
		csvList.add("3, 10:00, 20:15, 1:00");
		csvList.add("4, 10:00, 20:00, 1:00");
		csvList.add("5, 10:00, 20:15, 1:00");
		csvList.add("6, 10:00, 20:00, 1:00");
		csvList.add("7, 10:00, 19:30, 1:00");
		csvList.add("8, , ,");
		csvList.add("9, , ,");
		csvList.add("10, 10:00, 21:30, 1:00");
		csvList.add("11, 10:00, 21:00, 1:00");
		csvList.add("12, 10:00, 21:30, 1:00");
		csvList.add("13, 10:00, 20:00, 1:00");
		csvList.add("14, , ,");
		csvList.add("15, , ,");
		csvList.add("16, , ,");
		csvList.add("17, 10:00, 20:00, 1:00");
		csvList.add("18, 10:00, 20:00, 1:00");
		csvList.add("19, , ,");
		csvList.add("20, 10:00, 20:30, 1:00");
		csvList.add("21, 9:00, 20:00, 1:00");
		csvList.add("22, , ,");
		csvList.add("23, , ,");
		csvList.add("24, 10:00, 21:30, 1:00");
		csvList.add("25, 10:00, 20:30, 1:00");
		csvList.add("26, 10:00, 21:00, 1:00");
		csvList.add("27, 10:00, 20:30, 1:00");
		csvList.add("28, 10:00, 19:15, 1:00");
		csvList.add("29, , ,");
		csvList.add("30, , ,");

		List<String> result = countWorkTime(csvList, month);
		for (String str : result) {
			System.out.println(str);
		}
	}

	public static void eachEveryDay(LocalDate start, LocalDate end) {
		for (LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
			System.out.println(date);
		}
		System.out.println(end);
	}

	public static List<String> countWorkTime(List<String> csvList, String month) {
		List<String> result = new ArrayList<String>();//計算結果を入れる

		try {
			DateFormat sdf = new SimpleDateFormat("HH:mm");
			Date normal = sdf.parse("19:00");
			long totalTime = 0;
			long totalExTime = 0;
			int count = 0;//休憩時間計算

			for (String line : csvList) {
				String[] temp = line.split(", ");
				if (!temp[1].isEmpty()) {
					//開始時間が空ではない場合は、勤務時間を計算する
					Date start = sdf.parse(temp[1]);
					Date end = sdf.parse(temp[2]);

					//毎日の作業時間
					long time = (end.getTime() - start.getTime()) / 1000;
					int hours = (int) (time / 3600);
					if (!temp[3].isEmpty()) {
						//休憩時間がある場合
						hours--;
						count++;
					}
					int minutes = (int) (time % 3600)/60;
					totalTime = totalTime + time;

					//毎日の残業時間
					int exHours = 0;
					int exMinutes = 0;
					if (end.getTime() >= normal.getTime()) {
						long exTime = (end.getTime() - normal.getTime()) / 1000;
						exHours = (int) (exTime / 3600);
						exMinutes = (int) (exTime % 3600)/60;
						totalExTime = totalExTime + exTime;
					}

					result.add(month + "/" + temp[0] + ",作業時間：" + hours + "時間" + minutes + "分,残業時間：" + exHours + "時間"
							+ exMinutes + "分");
				} else {
					result.add(month + "/" + temp[0] + ",休み");
				}
			}

			int totalHours = (int) (totalTime / 3600) - count;
			int totalMinutes = (int) (totalTime % 3600)/60;

			int totalExHours = (int) (totalExTime / 3600);
			int totalExMinutes = (int) (totalExTime % 3600)/60;

			result.add(month + ",総作業時間：" + totalHours + "時間" + totalMinutes + "分,総残業時間：" + totalExHours + "時間"
					+ totalExMinutes + "分");

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

}
