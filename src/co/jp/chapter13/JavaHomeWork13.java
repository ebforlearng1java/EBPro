package co.jp.chapter13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JavaHomeWork13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//質問１︓ログ分析アプリ作成してください。
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\data.txt")));
			BufferedWriter logFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\log.txt")));
			String line;
			int i = 0;
			while((line = br.readLine()) != null) {
				if(line.contains("ERROR")) {
					System.out.println(line);
					logFile.write(line);
					logFile.newLine();
					i++;
				}
				System.out.println("エラーの件数は：" + i);
				br.close();
				logFile.close();
			}
		}catch(FileNotFoundException e) {
			System.out.println("ファイルが存在しません。");
			e.printStackTrace();	
		}catch(IOException e) {
			System.out.println("読み取りエラー");
			e.printStackTrace();
		}
	}
	
	//質問２︓CSV編集ツールを作成してください。
	//作り方はわからない。
	
	//質問3
	//質問がありません。


}
