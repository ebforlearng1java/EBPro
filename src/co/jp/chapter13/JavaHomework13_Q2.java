package co.jp.chapter13;

//CSV編集ツール

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class JavaHomework13_Q2 {

  public static void main(String[] args) {
    try {
      File csv = new File("sample.csv"); // CSVデータファイル
      // 追記モード
      BufferedWriter bw
        = new BufferedWriter(new FileWriter(csv, true));
      // 新たなデータ行の追加
      bw.write("a" + "," + "b" + "," + "c");
      bw.newLine();
      bw.close();

    } catch (FileNotFoundException e) {
      // Fileオブジェクト生成時の例外捕捉
      e.printStackTrace();
    } catch (IOException e) {
      // BufferedWriterオブジェクトのクローズ時の例外捕捉
      e.printStackTrace();
    }
  }
}


//プログラムを実行
//> javac javatips\WriteCSV.java
//> java javatips.WriteCSV
