package net.work100.training.stage1.basic.loop;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 18:40
 * @url http://www.work100.net/training/java-loop.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        // while
        whileTest();
        System.out.println("--------while^----------");

        // do-while
        doWhileTest();
        System.out.println("--------do-while^----------");

        // for
        forTest();
        System.out.println("--------for^----------");

        // for-plus
        forPlusTest();
        System.out.println("--------for-plus^----------");

        // break
        breakTest();
        System.out.println("--------break^----------");

        // continue
        continueTest();
        System.out.println("--------continue^----------");
    }

    public static void whileTest() {
        int x = 10;
        while (x < 20) {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        }
    }

    public static void doWhileTest() {
        int x = 10;

        do {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        } while (x < 20);
    }

    public static void forTest() {
        for (int x = 10; x < 20; x = x + 1) {
            System.out.print("value of x : " + x);
            System.out.print("\n");
        }
    }

    public static void forPlusTest() {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
        System.out.println();
    }

    public static void breakTest() {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            // x 等于 30 时跳出循环
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }

    public static void continueTest() {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}
