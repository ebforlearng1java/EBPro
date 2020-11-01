package co.jp.chapter13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ParseLog {

	private static String VIEWSTRING = "xxx.log";
	private static String USERTAG = "user：";

	public static void readFileByLines(String fileName) {
		File file = new File(fileName);
		BufferedReader reader = null;
		try {
			System.out.println("一行目毎読み込み：");
			InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
			reader = new BufferedReader(isr);
			String tempString = null;
			Map<String, Object> map = new HashMap<String, Object>();
			while ((tempString = reader.readLine()) != null) {
				if (tempString.contains(VIEWSTRING)) {
					int userindex = tempString.indexOf(USERTAG);
					String username = tempString.substring(userindex + 3, tempString.indexOf(",", userindex));
					int done = tempString.indexOf(VIEWSTRING);
					String ewId = tempString.substring(done + VIEWSTRING.length());

			reader.close();
			Iterator<Entry<String, Object>> it = map.entrySet().iterator();
			while (it.hasNext()) {
				Entry<String, Object> entry = it.next();
				System.out.println(entry.getKey() + "-----------" + entry.getValue());
			}
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
	}

	public static void main(String[] args) {
		ParseLog.readFileByLines("C:xxx.log");
	}

}