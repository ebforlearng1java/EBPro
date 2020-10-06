package co.jp.chapter07;

public class JavaHomework07 {



	 // 質問：以下コードはコンバインエラー発生しますか理由は？

	 //  private String name;
	 //  protected int age = 10;
	 //  public String getName() {
	 //  return name;

	 //  }


	 //  public static void main(String...args) {
	 //	 Human man = new Human();
	 //	 System.out.println(man.name);// NG, nameはprivateの為、アクセス不可
	 //	 System.out.println(man.age);// OK, ageはprotected、同じPackageのクラスアクセス可能
	 //	 System.out.println(man.getName());

	 //  答え： アクセス修飾子がprivateに定義されると、クラスにて属性・メソッドはアクセス可能ではありません。



	 //  質問：上記UML図通り、Javaクラスを作成してください。
	 //        「private」、「protected」、「public」等キーワードを覚えておいてください。

	     public String name;
	     protected int age;
	     private int money;

	       public void setName(String name) {
	        	 this.name = name;
	       }

	        public static void sleep(long millis) {

	        }

		    public int getMoney() {
			  return money;
		    }

		    public void setMoney(int money) {
			     this.money = money;
		    }

	 //  質問：下記コードのBugを探します。

		  //  public class Human {
		  //  	 private String name;
		  //  	}
		    	// Kicker.java
		  //  	public class Kicker {
		  //  	 public static void main(String...args) {

		  //   Human obj = null;
		  //   System.out.println(obj.name); // Nullpointer：obj = null;
		  //    }
		  //   }

		  //  答え： null ポインター・アクセス: 変数 obj はこのロケーションでは必ず null です。

    //  質問：以下コンパイルエラー理由を教えてください。

		    //public class Sample {
		    //	 private final int a = 10;
		    //	 public void setA(int a) {
		    //	 this.a = a; // NG フィールドaの値を再代入しよう
		    //	 }
		    //	}

		 //  答え：  final フィールド JavaHomework07.a には代入できません。



	 //  質問：以下メソッドの静的メンバアクセス所を説明してください。（１箇所）

		    //public static void main(String...args) {
		    //	 System.out.println("some thing");
		    //	 }

		 //   1. 静的なフィールドは？                       答え：  System.out.println("some thing");
		 //   2. メソッドを呼び出していますか？             答え：  はい。
		 //   3. メソッドを呼び出す時、渡すの引数は？       答え：  args



	//  質問：以下ソースのコンパイルエラーを説明してください。

		  //  public class Kicker {
		  //  	 private String word = "abc";
		  //  	 public void print(String name) {
		  //  	 System.out.println(name);
		  // 	 }
		  //  	 public static void main(String...args) {
		  //  	 print("dcnet.java.教育");
		  //  	 System.out.println(word);
		  //  	 }
		  //  	}


		    // 答え：  word、print 静的ではないため、アクセスできない。

		    //正しいソース：

	    	// private static String word = "abc";
	    	// public static void print(String name) {
	    	// System.out.println(name);
	    	// }
	    	// public static void main(String...args) {
	    	// print("dcnet.java.教育");
	    	// System.out.println(word);
	    	// }


	//  質問：質問２に以下ソース修正したらコンパイルエラー解消できますが、理由を教えてください。

	    //	 private String word = "abc";
	    //	 public void print(String name) {
	    //	 System.out.println(name);
	    //	 }

	    //	 public static void main(String...args) {
	    //		 Kicker kicker = new Kicker();
	    //		 kicker.print("dcnet.java.教育");
	    //		 System.out.println(kicker.word);
	    //		 }


	    // 答え：  printメソッドを使え前に、一度再定義したため(new)、エラーが解消された。


	//  質問１︓以下コードのコンパイルエラー理由を教えてください。

	    //public String name;
	    // public void setName(String value) {
	    // this.name = value;
	    // }
	    //}

        // public static void main(String...args) {
	    // Pet cat = new Pet();
	    //cat.setAge(1234);
	    // }

	    //  答え： catが定義されていない。setAgeもAgeが作成していないから、使えない。



	//  質問２︓Mathクラスを作成してください。以下メソッドを定義します。

	    //	 1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
	    // 	 2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
	    //	 3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
	    //	 4. mainメソッドで上記それぞれメソッドを呼び出してください。


		//以下はメソッドの定義のソースの抜枠です。
	    //	 public class Math {
	    //		 public static int max(int[] input) {
	    //		 }
	    //	 }

		    public static void main(String[] args) {
		    	int[] i = new int[] {1,2,3,4,5,6,7,8};
		    	System.out.println(" 配列のMAX:" + JavaHomework07.searchMax(i));
		    	System.out.println(" 配列のMIN:" + JavaHomework07.searchMin(i));
		    	System.out.println(" 配列の平均値:" + JavaHomework07.searchAvg(i));

		    }

		    public static int searchMax(int[] d) {
				int max = d[0];
				for(int x = 0; x < d.length; x++) {
					if (d[x] > max) {
						max = d[x];
					}
			}
				return max;
			}


		    public static int searchMin(int[] d) {
				int min = d[0];
				for(int x = 0; x < d.length; x++) {
					if(d[x] < min) {
						min = d[x];
					}
			}
				return min;
			}


		    public static double searchAvg(int[] d) {
				int sum = 0;
				double avg = 0;
				for (int x = 0 ; x < d.length; x++){
					sum = sum + d[x];
				}
				avg = sum/d.length;
				return avg;
			}




		//2. 行列計算。2D行列クラスのコンストラクタには１配列引数設定してください。
	    //	 public class Matrix {
	    //		 private final int[][] data;
	    //		 /** construct method */
	    //		 public Matrix(int[][] data) {
	    //		 this.data = data;
	    //		 }
	    //		 // 行列 ADD
	    //		 public Matrix add(Matrix b) {
	    //		 //....
	    //		 return ???
	    //		 }
	    //		}

		   //答え：




		    private int[][] data;
			public void Matrix(int[][] d) {
				 this.setData(d);
				 }
			public int[][] getData() {
				return data;
			}
			public void setData(int[][] d) {
				this.data = d;
			}


}
