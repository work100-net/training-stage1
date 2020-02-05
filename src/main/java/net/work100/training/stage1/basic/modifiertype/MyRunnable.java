package net.work100.training.stage1.basic.modifiertype;

/**
 * <p>Title: MyRunnable</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 16:41
 * @url http://www.work100.net/training/java-modifier-type.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class MyRunnable implements Runnable {

    private volatile boolean active;

    public void run()
    {
        active = true;
        while (active) // 第一行
        {
            // 代码
        }
    }

    public void stop()
    {
        active = false; // 第二行
    }
}
