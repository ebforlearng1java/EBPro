package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		int i = 0;
		if (i > 0) 
		{
			//ア　上記条件はTRUEの場合、下記処理をを実行
			System.out.println("変数,iはプラス");
		} else if (i < 0) {
			//イ　ア条件がFAlSE、かつ上記の条件がTRUEの場合、下記の処理を実行
			System.out.println("変数,iはマイナス");
		}
		else 
		{
			//アの条件がFLASE、かつイの条件もFLASEの場合、下記の処理を実行
			System.out.println("変数,iはゼロ");
		}

		//switch
		switch (i) {
		case -1:
		case -2:
		case -3:
	    case -4:
	    case -5:
	    case -6:	
	    case -7:
	    case -8:
	    case -9:	
	    System.out.println("変数,iはマイナス");	
	    break;
	    case 1:
		case 2:
		case 3:
	    case 4:
	    case 5:
	    case 6:	
	    case 7:
	    case 8:
	    case 9:	
	    System.out.println("変数,iはプラス");		
	    break;
	    case 0:
	    System.out.println("変数,iは0");
	    break;
	    default:
	    System.out.println("計算対象外");
		}
		
		
		//loopの一つはFORループ
		//自然数 1 2 3 4 5
		//0はJAVAの一番目の位置
		//
		for (int a = 0; a < 10; a++) {
		System.out.println(a);}
	}

}
