package net.work100.training.stage1.oo.inheritance;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-inheritance.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 16:16
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal("动物", 1);
        a.eat();
        Dog d = new Dog("狗", 101);
        d.eatTest();
    }
}
