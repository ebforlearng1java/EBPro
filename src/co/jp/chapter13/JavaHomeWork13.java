package co.jp.chapter13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaHomeWork13 {

	public static void main(String[] args) {

		//質問１︓ログ分析アプリ作成してください。
		String logfile = "C:\\Log\\server.log";
		String result = "C:\\Log\\result.txt";
		logAnalyze(logfile,result);

		//質問２︓CSV編集ツールを作成してください。
		String[] str = {"e-business.co.jp","e-business.com"};
		String inCSV = "C:\\CSV\\input.csv";
		String outCSV = "C:\\CSV\\output.csv";
		editCSV(inCSV,outCSV,str);
	}

	public static void logAnalyze(String logfile, String result) {
		try {
			File infile = new File(logfile);
			File outfile = new File(result);
			BufferedReader reader = new BufferedReader(new FileReader(infile));
			//書き込みファイルを作成
			BufferedWriter writer  = new BufferedWriter(new FileWriter(outfile));

			String line;
			int i = 0;
			//行毎でログを読み取り
			while ((line = reader.readLine()) != null) {
				if (line.contains("ERROR")) {
					//ERRORログを取得する
					System.out.println(line);
					writer.write(line);
					writer.newLine();
					i++;
				}
			}

			System.out.println("ERRORログ件数："+i);
			reader.close();
			writer.close();
        } catch (FileNotFoundException e) {
			System.out.println("ファイルが存在していません。");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("読み取り・書き込みエラー");
			e.printStackTrace();
		}
	}


	public static void editCSV(String inCSV, String outCSV, String[] str) {
        File inFile = new File(inCSV);
        File outFile = new File(outCSV);
        String inString;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            while((inString = reader.readLine())!= null){
            	//ドメインを置換する
            	inString = inString.replace(str[0], str[1]);
               writer.write(inString);
               writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
			System.out.println("ファイルが存在していません。");
			e.printStackTrace();
        } catch (IOException e) {
			System.out.println("読み取り・書き込みエラー");
			e.printStackTrace();
        }
    }

}
