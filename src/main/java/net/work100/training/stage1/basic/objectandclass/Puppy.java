package net.work100.training.stage1.basic.objectandclass;

/**
 * <p>Title: Puppy</p>
 * <p>Description: 小狗类</p>
 * <p>Url: http://www.work100.net/training/java-object-class.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 14:44
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Puppy {

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 构造函数
     *
     * @param name 名字（参数）
     */
    public Puppy(String name){
        System.out.println("小狗的名字是：" + name);
    }

    public static void main(String[] args) {
        /* 实例化一个 Puppy 对象 */
        Puppy puppy = new Puppy("tommy");

        /* 通过方法设定 age */
        puppy.setAge(2);

        /* 调用另一个方法获取 age */
        System.out.println("小狗的年龄为：" + puppy.getAge());

        /* 也可通过下面的方式访问成员变量 */
        System.out.println("变量值：" + puppy.age);
    }
}
