package net.work100.training.stage1.basic.ifelse;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 18:45
 * @url http://www.work100.net/training/java-if-else.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        // if
        ifTest();
        System.out.println("----------if^----------");

        // if-else
        ifElseTest();
        System.out.println("----------if-else^----------");

        // if-elseif-else
        ifElseifElseTest();
        System.out.println("----------if-elseif-else^----------");

        // nested
        nestedTest();
        System.out.println("----------nested^----------");
    }

    public static void ifTest(){
        int x = 10;

        if (x < 20) {
            System.out.print("这是 if 语句");
        }
        System.out.println();
    }

    public static void ifElseTest(){
        int x = 30;

        if (x < 20) {
            System.out.print("这是 if 语句");
        } else {
            System.out.print("这是 else 语句");
        }
        System.out.println();
    }

    public static void ifElseifElseTest(){
        int x = 30;

        if( x == 10 ){
            System.out.print("Value of X is 10");
        }else if( x == 20 ){
            System.out.print("Value of X is 20");
        }else if( x == 30 ){
            System.out.print("Value of X is 30");
        }else{
            System.out.print("这是 else 语句");
        }
        System.out.println();
    }

    public static void nestedTest(){
        int x = 30;
        int y = 10;

        if (x == 30) {
            if (y == 10) {
                System.out.print("X = 30 and Y = 10");
            }
        }
        System.out.println();
    }
}
