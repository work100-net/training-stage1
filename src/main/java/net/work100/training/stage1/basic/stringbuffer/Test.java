package net.work100.training.stage1.basic.stringbuffer;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-stringbuffer.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 17:43
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("光束云官网：");
        sBuffer.append("www");
        sBuffer.append(".work100");
        sBuffer.append(".net");
        System.out.println(sBuffer);

        System.out.println("reverse 结果->" + sBuffer.reverse());
        System.out.println("delete 结果->" + sBuffer.delete(0, 4));
    }
}
