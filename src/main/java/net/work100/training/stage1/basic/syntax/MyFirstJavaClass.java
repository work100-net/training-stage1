package net.work100.training.stage1.basic.syntax;

/**
 * <p>Title: MyFirstJavaClass</p>
 * <p>Description: 第一个Java类 </p>
 * <p>Url: http://www.work100.net/training/java-basic-syntax.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 12:23
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class MyFirstJavaClass {

    // 大小写敏感
    private static final String helloWorld = "helloWorld";
    private static final String HelloWorld = "HelloWorld";

    public static final String HELLO_WORLD = "Hello World";

    /**
     * 主入口函数
     *
     * @param args
     */
    public static void main(String[] args) {
        // 大小写敏感
        System.out.println("helloWorld 变量：" + helloWorld);
        System.out.println("HelloWorld 变量：" + HelloWorld);
        System.out.println("HELLO_WORLD 变量：" + HELLO_WORLD);

        // 访问修饰符
        MyFirstJavaClass myFirstJavaClass = new MyFirstJavaClass("abc");

        // Class 中 main 入口函数可以调用 private 方法
         System.out.println("获取 arg：" + myFirstJavaClass.getArg());

        // 通过对象实例的 public 方法调用
        myFirstJavaClass.printArg();
    }

    private String arg;

    /**
     * 私有方法
     *
     * @return
     */
    private String getArg() {
        return this.arg;
    }

    /**
     * 类构造函数
     *
     * @param arg
     */
    public MyFirstJavaClass(String arg) {
        this.arg = arg;
    }

    /**
     * 公有方法
     */
    public void printArg() {
        System.out.println("打印成员变量 arg:" + this.getArg());
    }
}
