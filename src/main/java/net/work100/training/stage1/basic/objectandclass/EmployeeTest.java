package net.work100.training.stage1.basic.objectandclass;

/**
 * <p>Title: EmployeeTest</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 15:02
 * @url http://www.work100.net/training/java-object-class.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class EmployeeTest {
    public static void main(String[] args) {
        /* 使用构造器创建2个对象 */
        Employee empOne = new Employee("张三");
        Employee empTwo = new Employee("李四");

        // 调用这2个对象的成员方法
        empOne.setAge(28);
        empOne.setDesignation("经理");
        empOne.setSalary(20000);
        empOne.printEmployee();

        empTwo.setAge(24);
        empTwo.setDesignation("职员");
        empTwo.setSalary(10000);
        empTwo.printEmployee();
    }
}
