package net.work100.training.stage1.advance.generic;

/**
 * <p>Title: Box</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 19:29
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("光束云智"));

        System.out.printf("整型值为 :%d", integerBox.get());
        System.out.println();

        System.out.printf("字符串为 :%s", stringBox.get());
        System.out.println();
    }
}
