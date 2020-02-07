package net.work100.training.stage1.basic.modifiertype;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-modifier-type.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 16:34
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    final int value = 10;
    // 下面是声明常量的实例
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";

    public void changeValue() {
//         value = 12; //将输出一个错误
    }

    /**
     * synchronized 修饰符
     */
    public synchronized void showDetails(){
        //...
    }

    /**
     * transient 修饰符
     */
    public transient int limit = 55;   // 不会持久化
    public int b; // 持久化
}
