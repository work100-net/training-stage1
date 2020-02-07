package net.work100.training.stage1.basic.variabletype;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-variable-type.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 16:01
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public void pupAge() {
        int age = 0;
        // int age; //不设置初始值会报编译错误
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.pupAge();
    }
}
