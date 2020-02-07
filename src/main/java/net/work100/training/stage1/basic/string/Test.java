package net.work100.training.stage1.basic.string;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-string.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 17:34
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        // 创建字符串
        char[] helloArray = { 'w', 'o', 'r', 'k', '1', '0', '0', '.', 'n', 'e', 't'};
        String helloString = new String(helloArray);
        System.out.println( helloString );

        // 字符串长度
        String site = "www.work100.net";
        int len = site.length();
        System.out.println("光束云网址长度 : " + len);

        // 连接字符串
        String string1 = "光束云网址：";
        System.out.println("1、" + string1 + "www.work100.net");

        // 创建格式化字符串
        float floatVar = 234.5f;
        int intVar = 100;
        String stringVar = "光束云";
        System.out.printf("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s", floatVar, intVar, stringVar);
        System.out.println();

        String fs;
        fs = String.format("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                " %s", floatVar, intVar, stringVar);
        System.out.println(fs);
    }
}
