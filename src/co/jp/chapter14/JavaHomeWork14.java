package co.jp.chapter14;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaHomeWork14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 質問１
		try {
			String startTime = "2020-10-15";
			String lastTime = "2020-10-28";
			DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
			Date startTimeDate = df.parse(startTime);
			Date lastTimeDate = df.parse(lastTime);
			Long startTimLong = startTimeDate.getTime();
			Long lastTimeLong = lastTimeDate.getTime();
			Long oneDay = 1000 * 60 * 60 * 24l;

			Long time = startTimLong;
			while (time <= lastTimeLong) {
				Date day = new Date(time);
				DateFormat dft = new SimpleDateFormat("yyyy-mm-dd");
				System.out.println(df.format(day));
				time += oneDay;
				;
			}

		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}
