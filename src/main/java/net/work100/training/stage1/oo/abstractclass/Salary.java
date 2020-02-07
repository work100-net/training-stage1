package net.work100.training.stage1.oo.abstractclass;

/**
 * <p>Title: Salary</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-abstract.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 16:56
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Salary extends Employee {
    private double salary; //Annual salary

    public Salary(String name, String address, int number, double
            salary) {
        super(name, address, number);
        setSalary(salary);
    }

    @Override
    public void mailCheck() {
        System.out.println("Salary 类内部 mailCheck ");
        System.out.println("邮寄支票给 " + getName() + " ，工资： " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    @Override
    public double computePay() {
        System.out.println("计算支付给 " + getName() + " 的工资");
        return salary / 52;
    }
}
