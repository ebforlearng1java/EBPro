package co.jp.chapter08;

public class Kicker {

    public static void main(String args) {
        Employee x = new Employee("1234");
        Employee y = new Employee("1234");
        System.out.println(x == y); // true ? false? 原因は ?//
        //答え：false； 原因：メモリアドレスは一致しません。
        System.out.println(x.equals(y)); // true ? false? 原因は ?
        //答え：true； 原因：文字列内容は一致します。
    }
}
