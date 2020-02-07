package net.work100.training.stage1.basic.switchcase;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-switch-case.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 17:19
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        // 正常方式
        using();
        System.out.println("-----------正常方式^----------");

        // break示例
        usingBreak();
        System.out.println("-----------break示例^----------");
    }

    public static void using() {
        //char grade = args[0].charAt(0);
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("你需要再努力努力");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }

    public static void usingBreak() {
        int i = 1;
        switch (i) {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
            default:
                System.out.println("default");
        }
    }
}
