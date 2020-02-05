package net.work100.training.stage1.oo.encapsulation;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 17:11
 * @url http://www.work100.net/training/java-encapsulation.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("xiaojun");
        person.setAge(18);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
