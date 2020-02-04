package net.work100.training.stage1.basic.variabletype;

/**
 * <p>Title: Employee</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 16:04
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Employee {
    // 这个实例变量对子类可见
    public String name;
    // 私有变量，仅在该类可见
    private double salary;

    //在构造器中对name赋值
    public Employee(String empName) {
        name = empName;
    }

    //设定salary的值
    public void setSalary(double empSal) {
        salary = empSal;
    }

    // 打印信息
    public void printEmp() {
        System.out.println("名字 : " + name);
        System.out.println("薪水 : " + salary);
    }

    public static void main(String[] args) {
        Employee empOne = new Employee("张三");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
