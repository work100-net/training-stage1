package net.work100.training.stage1.oo.overrideoverload;

/**
 * <p>Title: Overloading</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-override-overload.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 16:32
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Overloading {
    public int test() {
        System.out.println("test1");
        return 1;
    }

    public void test(int a) {
        System.out.println("test2");
    }

    //以下两个参数类型顺序不同
    public String test(int a, String s) {
        System.out.println("test3");
        return "return test3";
    }

    public String test(String s, int a) {
        System.out.println("test4");
        return "return test4";
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1, "test3"));
        System.out.println(o.test("test4", 1));
    }
}
