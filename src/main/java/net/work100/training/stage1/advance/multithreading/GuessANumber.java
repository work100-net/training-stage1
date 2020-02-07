package net.work100.training.stage1.advance.multithreading;

/**
 * <p>Title: GuessANumber</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-multi-threading.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-07 16:06
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-07   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class GuessANumber extends Thread {
    private int number;

    public GuessANumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int counter = 0;
        int guess = 0;
        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + " guesses " + guess);
            counter++;
        } while (guess != number);
        System.out.println("** Correct!" + this.getName() + "in" + counter + "guesses.**");
    }
}
