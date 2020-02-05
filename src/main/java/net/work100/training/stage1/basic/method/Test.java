package net.work100.training.stage1.basic.method;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 22:10
 * @url http://www.work100.net/training/java-method.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        // 比较2个整数，返回最大值
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println(i + " 和 " + j + " 比较，最大值是：" + k);

        // 打印成绩
        printGrade(78.5);

        // 调用swap方法
        int num1 = 1;
        int num2 = 2;
        System.out.println("交换前 num1 的值为：" + num1 + " ，num2 的值为：" + num2);
        swap(num1, num2);
        System.out.println("交换后 num1 的值为：" + num1 + " ，num2 的值为：" + num2);

        // 演示方法重载
        float fi = 2.5f;
        float fj = 2.2f;
        float fk = max(fi, fj);
        System.out.println(fi + " 和 " + fj + " 比较，最大值是：" + fk);

        // 演示可变参数
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }

    /**
     * 返回两个整型变量数据的较大值
     */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

    /**
     * 打印份数
     *
     * @param score
     */
    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        } else if (score >= 80.0) {
            System.out.println('B');
        } else if (score >= 70.0) {
            System.out.println('C');
        } else if (score >= 60.0) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }

    /**
     * 交换两个变量的方法
     */
    public static void swap(int n1, int n2) {
        System.out.println("\t进入 swap 方法");
        System.out.println("\t\t交换前 n1 的值为：" + n1 + "，n2 的值：" + n2);

        // 交换 n1 与 n2的值
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\t交换后 n1 的值为 " + n1 + "，n2 的值：" + n2);
    }

    /**
     * 方法重载
     */
    public static float max(float num1, float num2) {
        float result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

    /**
     * 演示可变参数
     *
     * @param numbers
     */
    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

}
