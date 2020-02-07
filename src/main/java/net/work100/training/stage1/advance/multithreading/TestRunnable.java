package net.work100.training.stage1.advance.multithreading;

/**
 * <p>Title: TestRunnable</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-multi-threading.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-07 15:59
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-07   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class TestRunnable {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();
    }
}
