package net.work100.training.stage1.oo.encapsulation;

/**
 * <p>Title: Person</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 17:06
 * @url http://www.work100.net/training/java-encapsulation.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
