package co.jp.chapter07;

import java.util.Arrays;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		//05の質問7
		int[] array01 = { 3, 2, 1, 4 };//
		int[] array02 = array01.clone();
		Arrays.sort(array01);
		for (int i = 0; i < array01.length; i++) {
			System.out.println(i + "番目ソート前:" + array02[i] + "ソート後:" + array01[i]);
		}

	}

}
