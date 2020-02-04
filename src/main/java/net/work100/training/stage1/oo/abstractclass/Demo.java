package net.work100.training.stage1.oo.abstractclass;

/**
 * <p>Title: Demo</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 16:54
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Demo {
    public static void main(String[] args) {
        /* 以下是不允许的，会引发错误 */
//        Employee e = new Employee("George W.", "Houston, TX", 43);

//        System.out.println("\n Call mailCheck using Employee reference--");
//        e.mailCheck();

        Salary s = new Salary("Xiaojun", "Beijing", 3, 36000.00);
        System.out.println("--------------------");
        Employee e = new Salary("Zhangsan", "Shanghai", 2, 24000.00);
        System.out.println("--------------------");

        System.out.println("调用 Salary 的 mailCheck --");
        s.mailCheck();

        System.out.println("调用 Employee 的 mailCheck --");
        e.mailCheck();
    }
}
