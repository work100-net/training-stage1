package net.work100.training.stage1.advance.serialization;

import java.io.Serializable;

/**
 * <p>Title: Employee</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-serialization.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-07 11:28
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-07   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Employee implements Serializable {

    public String name;
    public String address;
    public transient int SSN;   // 短暂性的
    public int number;

    public void mailCheck() {
        System.out.println("Mail a check to " + name + " " + address);
    }
}
