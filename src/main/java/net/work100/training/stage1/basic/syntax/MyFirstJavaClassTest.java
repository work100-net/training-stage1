package net.work100.training.stage1.basic.syntax;

/**
 * <p>Title: MyFirstJavaClassTest</p>
 * <p>Description:  </p>
 * <p>Url: http://www.work100.net/training/java-basic-syntax.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 14:17
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class MyFirstJavaClassTest {

    public static void main(String[] args) {

        // 类变量
        System.out.println("类变量 HELLO_WORLD: " + MyFirstJavaClass.HELLO_WORLD);

        // 访问修饰符
        MyFirstJavaClass myFirstJavaClass = new MyFirstJavaClass("abc");

        // 如下调用会报错
        // System.out.println(myFirstJavaClass.getArg());

        /* 通过对象实例的 public 方法调用 */
        myFirstJavaClass.printArg();
    }
}
