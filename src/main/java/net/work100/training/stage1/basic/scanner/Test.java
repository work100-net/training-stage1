package net.work100.training.stage1.basic.scanner;

import java.util.Scanner;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-scanner.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 15:05
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
//        // 使用next方法
//        nextTest();
//        System.out.println("------------使用next方法^-------------");
//
//        // 使用nextLine方法
//        nextLineTest();
//        System.out.println("------------使用nextLine方法^-------------");
//
//        // int or float输入数据
//        intOrFloatInput();
//        System.out.println("------------int or float输入数据^-------------");

        // 输入多个数字(以非数据结束)
        multiInput();
        System.out.println("------------输入多个数字^-------------");
    }

    static void nextTest() {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }

    static void nextLineTest() {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
        scan.close();
    }

    static void intOrFloatInput() {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        int i = 0;
        float f = 0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()) {
            // 判断输入的是否是整数
            i = scan.nextInt();
            // 接收整数
            System.out.println("整数数据：" + i);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat()) {
            // 判断输入的是否是小数
            f = scan.nextFloat();
            // 接收小数
            System.out.println("小数数据：" + f);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }

    static void multiInput(){
        System.out.print("输入多个整数，每个整数以回车换行，输入任何非数字字符结束：");
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }

        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
        scan.close();
    }
}
