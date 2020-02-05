package net.work100.training.stage1.basic.objectandclass;

import java.lang.*;

/**
 * <p>Title: Employee</p>
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
public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    // Employee 类的构造器
    public Employee(String name) {
        this.name = name;
    }

    /* 设置 age 的值 */
    public void setAge(int age) {
        this.age = age;
    }

    /* 设置 designation 的值 */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /* 设置 salary 的值 */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /* 打印 Employee 的信息 */
    public void printEmployee() {
        System.out.println("名字:"+ this.name );
        System.out.println("年龄:" + this.age );
        System.out.println("职位:" + this.designation );
        System.out.println("薪水:" + this.salary);
    }
}
