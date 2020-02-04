package net.work100.training.stage1.oo.overrideoverload;

/**
 * <p>Title: TestDog</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 16:26
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Dog 对象

        a.move(); // 执行 Animal 类的方法
        System.out.println("-------------------");
        b.move(); // 执行 Dog 类的方法
        // b.bark(); // 编译报错
    }
}
