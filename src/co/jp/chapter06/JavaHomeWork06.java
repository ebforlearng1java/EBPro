package co.jp.chapter06;

import java.util.Arrays;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
		//public static int max(String[] args);
		//修飾子：public static
		//返却型：int
		//関数名：max
		//引数：引数の型String,名称args

		//質問２.配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
//		public static int max(int[] arr) {
//			int max;
//			if (null != arr && arr.length > 0) {
//				max = arr[0];
//
//				for (int x : arr) {
//					if (x > max)
//						max = x;
//				}
//				System.out.println(max);
//				return max;
//
//			} else {
//				return 0;
//			}
//		}
//		public static int min(int[] arr) {
//			int min;
//			if (null != arr && arr.length > 0) {
//				min = arr[0];
//
//				for (int x : arr) {
//					if (x < min)
//						min = x;
//				}
//				System.out.println(min);
//				return min;
//			} else {
//				return 0;
//			}
//		}
//		public static int sum(int[] arr) {
//			int sum = 0;
//			for (int x : arr) {
//				sum += x;
//			}
//			System.out.println(sum);
//			return sum;
//		}

		//質問３.以下メソッドの実施結果を教えてください。
		//実施結果はnullと思う。

		//質問４.以下メソッドの実施結果を教えてください。
		//実施結果はvalue2と思う。

		//質問５.以下メソッドの実施結果を教えてください。
		//実施結果はtrueと思う。

		//質問６-０:配列は直接に印刷できません。下記メソッドを利用して、
		//配列をprintします。以下メソッドを呼び出してください。
//		public static void printArray(Object[] objs) {
//			 if(objs == null) {
//			 System.out.println("null");
//			 return;
//			 }
//			 String prefix = "";
//			 StringBuilder sb = new StringBuilder();
//			 sb.append("[");
//			 for(Object obj : objs) {
//			 sb.append(prefix);
//			 sb.append(String.valueOf(obj));
//			 prefix = ", ";
//			 }
//			 sb.append("]");
//			 System.out.println(sb.toString());
//			}

		//質問６-１:以下静的なメソッドを定義してください。
		//1. メソッド名: megerArray
		//2. 引数１︓intの配列 left
		//3. 引数２︓intの配列 right
		//4. 戻り値︓intの配列
		//5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
		//質問６-２:以下静的なメソッドを定義してください。
		//1. メソッド名: subArray
		//2. 引数１︓intの配列 array
		//3. 引数２︓開始のstartIndex
		//4. 引数３︓⻑さlength
		//5. 戻り値︓intの配列
		//6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
//		int[] megerArray(int[] left, int[] right) {
//		int[] megerArray1 = new int[left.length + right.length];
//		int index = 0;
//		// mege 処理
//		// mege left
//		//
//
//		for (int l : left) {
//			megerArray1[index] = l;
//			index++;
//
//		}
//		for (int r : right) {
//			boolean flg = false;
//
//			for (int m : left) {
//				if (r == m) {
//					flg = true;
//
//					break;
//				}
//			}
//			if (!flg) {
//				megerArray1[index] = r;
//				index++;
//			}
//		}
//
//		// 配列再定義
//		int[] reArray = new int[index];
//		for (int x = 0; x < reArray.length; x++) {
//			reArray[x] = megerArray1[x];
//		}
//
//		return reArray;
//	}


		//質問７︓以下静的なメソッドを定義してください。
		//1. メソッド名:trim
		//2. 引数１︓charの配列
		//3. 戻り値︓charの配列
		//4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
		//以下メソッドの実施例:
//		static char[] trim(char[] ip) {
//			// char[] input = new char[] { ' ', 'A', 'b', ' ', ' ', 'C', ' ' };
//			// String s = new String(input);
//			// s = s.trim();
//			// char[] charArray = s.toCharArray();
//			// return charArray;
//			String str = "";
//			for (char c : ip) {
//				str += c;
//				// str = str+c;
//			}
//			System.out.println(str);
//			return str.trim().toCharArray();


		//質問８︓バブルソート⽤メソッドを作成してください。
		//1. メソッド名︓bubbleSort
		//2. 引数１︓intの配列
		//3. 戻り値︓ソート済みの配列
		//4. 処理内容︓bubbleSortアルゴリズムを用い、入力した引数の配列をソートしてください。
		int[] bubbleSort (int[] arr) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			return;
		}


		//質問９︓メソッドの呼び出す練習。
		//1. 質問６-１を用い、２つ配列をマージします。
		//2. 質問８を用い、ステップ１のマージした配列をソートする。
		//3. 注意:コードを１行にしてください。
//		System.out.println(Arrays.toString(bubbleSort(megerArray(left, right))));


	}

}
