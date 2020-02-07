package net.work100.training.stage1.basic.method;

/**
 * <p>Title: MyClassConstructorDemo</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-method.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 22:26
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class MyClassConstructorDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();
        System.out.println(t1.x + " " + t2.x);

        MyClass t3 = new MyClass( 10 );
        MyClass t4 = new MyClass( 20 );
        System.out.println(t3.x + " " + t4.x);
    }
}
