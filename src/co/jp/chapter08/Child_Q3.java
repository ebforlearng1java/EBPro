package co.jp.chapter08;

public class Child_Q3 extends Parent_Q3 {
	@Override // 親クラスの強制的にOverrideする意味（アノテーション）
	public void hello() {
//		super.hello();
		System.out.println("child_Q3 method");
	}

}
