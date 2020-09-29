package co.jp.chapter06;

public class JavaHomework06_Q2 {
	

	public static void main(String[] args) {
	
	
	//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。

	int [] arr = new int [] {20,40,10,50};
	int maxTest = max(arr);
	int minTest = min(arr);
	int sumTest = sum(arr);

	System.out.println(maxTest);
	System.out.println(minTest);
	System.out.println(sumTest);
	}
	
    //最大値：
    public static int max(int [] datas)
    {
    	int max = datas[0];
    	for (int i = 1; i < datas.length; i++) {
    		int v =datas[i];
    		if (v> max) {
    			max = v;

    		}
    	}
    	return max;
    }


    //最小値：
    public static int min(int [] datas)
       {
        int min = datas[1];
        for (int i = 1; i < datas.length; i++) {
        	int v =datas[i];
        	if (v< min) {
        		min = v;

        	}
        }
       	return min;
    }


    //和：

    public static int sum(int [] datas)
    {
     int sum = datas[0];
     for (int i = 1; i < datas.length; i++) {
     	sum = sum + datas[0];

     	}
    	return sum;

    }


	

}
