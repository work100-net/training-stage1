package net.work100.training.stage1.advance.multithreading;

/**
 * <p>Title: TestThread</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-multi-threading.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-07 16:02
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-07   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class TestThread {
    public static void main(String[] args) {
        ThreadDemo T1 = new ThreadDemo("Thread-1");
        T1.start();

        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.start();
    }
}
