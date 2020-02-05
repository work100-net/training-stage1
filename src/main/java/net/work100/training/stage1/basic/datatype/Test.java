package net.work100.training.stage1.basic.datatype;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 18:51
 * @url http://www.work100.net/training/java-basic-datatype.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        // 基本数据类型
        basicType();
        System.out.println("-------------基本数据类型^--------------");

        // 默认值
        defaultValue();
        System.out.println("-------------默认值^--------------");

        // 常量
        finalTest();
        System.out.println("-------------常量^--------------");

        // 类型转换
        changeType();
        System.out.println("-------------类型转换^--------------");
    }

    public static void basicType() {
        // byte
        System.out.println("基本类型 byte 的二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型 Short 的二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型 int 的二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型 long 的二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型 float 的二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型 double 的二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型 char 的二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE);
        System.out.println();
    }

    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;

    public static void defaultValue() {

        System.out.println("Bool :" + bool);
        System.out.println("Byte :" + by);
        System.out.println("Character:" + ch);
        System.out.println("Double :" + d);
        System.out.println("Float :" + f);
        System.out.println("Integer :" + i);
        System.out.println("Long :" + l);
        System.out.println("Short :" + sh);
        System.out.println("String :" + str);
    }


    // 通常使用大写字母表示常量
    final double PI = 3.1415927;

    public static void finalTest() {
        byte b = 68;
        char c = 'A';

        int decimal = 100;
        int octal = 0144;
        int hexa = 0x64;

        // 转义
        System.out.println("Hello World");
        System.out.println("two\nlines");
        System.out.println("\"This is in quotes\"");
    }

    public static void changeType() {
        // 自动类型转换
        char c1 = 'a';    //定义一个char类型
        int i1 = c1;    //char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于" + i1);
        char c2 = 'A';  //定义一个char类型
        int i2 = c2 + 1;  //char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于" + i2);
        System.out.println();

        // 强制类型转换
        int i3 = 123;
        byte b = (byte)i3;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于"+b);
    }
}
