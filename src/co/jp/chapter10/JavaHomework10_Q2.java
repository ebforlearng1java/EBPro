package co.jp.chapter10;

import java.io.File;

public class JavaHomework10_Q2 {

	public static String getFileType(String fileName) {
		if (fileName == null) {
			return null;
		}

		// 最後の『 . 』の位置を取得します。
		int lastDotPosition = fileName.lastIndexOf(".");

		// 『 . 』が存在する場合は、『 . 』以降を返します。
		if (lastDotPosition != -1) {
			return fileName.substring(lastDotPosition + 1);
		}
		return null;
	}

	public String getFileType(File filePath) {
		// パス名が示すディレクトリが存在する場合はnullを返します。
		if (filePath.isDirectory()) {
			return null;
		}

		// パス名が示すファイルの名前を返します。
		String fileName = filePath.getName();

		return getFileType(fileName);
	}

	public static void main(String[] args) {
		System.out.print(getFileType("c://windows//aa.xlsx"));
	}

}
