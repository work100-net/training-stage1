package net.work100.training.stage1.oo.polymorphism;

/**
 * <p>Title: Employee</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 16:46
 * @url http://www.work100.net/training/java-polymorphism.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Employee 构造函数");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("邮寄支票给： " + this.name + " " + this.address);
    }

    @Override
    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}
