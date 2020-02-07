package net.work100.training.stage1.oo.polymorphism;

/**
 * <p>Title: Demo</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-polymorphism.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 16:48
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Demo {
    public static void main(String[] args) {
        Salary s = new Salary("员工 A", "北京", 3, 3600.00);
        System.out.println("-------------------");
        Employee e = new Salary("员工 B", "上海", 2, 2400.00);
        System.out.println("-------------------");

        System.out.println("使用 Salary 的引用调用 mailCheck -- ");
        s.mailCheck();

        System.out.println("使用 Employee 的引用调用 mailCheck--");
        e.mailCheck();
    }
}
