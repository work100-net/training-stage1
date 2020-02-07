package net.work100.training.stage1.basic.variabletype;

/**
 * <p>Title: Employee1</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-variable-type.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 16:06
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Employee1 {
    //salary是静态的私有变量
    private static double salary;
    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";

    public static void main(String[] args) {
        salary = 10000;
        System.out.println(DEPARTMENT + "平均工资:" + salary);
    }
}
