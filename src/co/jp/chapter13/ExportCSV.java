package co.jp.chapter13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public class ExportCSV {
	 /*
	  * CSVファイル読み込む
	  */
	    public void  readCsv(){
	        try {
	        	//データの保存に使用する。
	                ArrayList<String[]> csvList = new ArrayList<String[]>();
	                String csvFilePath = "C:xxx.csv";
	                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(csvFilePath),"UTF-8"));
	                String line = null;
	                int i = 0;
	                while(line == br.readLine() && br.readLine() != null){
	                     i++;
	                }
	                br.close();

	                for(int row=0;row<csvList.size();row++){
	                     String  cell = csvList.get(row)[0];
	                     System.out.println(cell);
	                }
	            } catch (IOException ex) {
	                    System.out.println(ex);
	                }
	    }

	    /**
	     * CSVファイル書き込む
	     */
	    public static void WriteCsv(){
	        try {
	                String csvFilePath = "C:xxx.csv";
	                Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csvFilePath),"UTF-8"));
	                String contents = "操作不可";
	                out.write(contents);
	                out.close();
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	    }
	}
