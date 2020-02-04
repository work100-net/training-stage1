package net.work100.training.stage1.basic.character;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 17:29
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        char ch = 'a';

        // Unicode 字符表示形式
        char uniChar = '\u039A';

        // 字符数组
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};

        Character ch1 = new Character('a');

        // 原始字符 'a' 装箱到 Character 对象 ch2 中
        Character ch2 = 'a';

        // 原始字符 'x' 用 test 方法装箱
        // 返回拆箱的值到 'c'
        // char c = test('x');

        // 转义字符
        System.out.println("访问\"光束云(work100.net)!\"");
    }
}
