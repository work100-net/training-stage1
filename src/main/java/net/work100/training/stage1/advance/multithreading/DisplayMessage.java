package net.work100.training.stage1.advance.multithreading;

/**
 * <p>Title: DisplayMessage</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-multi-threading.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-07 16:05
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-07   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while (true) {
            System.out.println(message);
        }
    }
}
