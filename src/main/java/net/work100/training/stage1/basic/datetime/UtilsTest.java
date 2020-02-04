package net.work100.training.stage1.basic.datetime;

/**
 * <p>Title: UtilsTest</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 20:30
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class UtilsTest {
    public static void main(String[] args) {
        // 按照指定格式获取当前时间字符串
        System.out.println("当前时间：" + Utils.currentTime("yyyy-MM-dd HH:mm:ss"));

        // 按照指定格式获取当前日期字符串
        System.out.println("当前日期：" + Utils.currentDate("yyyy-MM-dd"));

        // 获取当前周的日期集合
        String[] daysOfCurrentWeek = Utils.currentWeekDays();
        System.out.println("当前周的日期(0表示周日)：");
        for (int i = 0; i < daysOfCurrentWeek.length; i++) {
            System.out.println(i + ":" + daysOfCurrentWeek[i]);
        }

        // 今天是周几(第一天为周日)
        System.out.println("今天是周几：" + Utils.dayOfWeek());

        // 获取某月天数及最后一天的日期
        System.out.println("2020-02-01 所在月天数：" + Utils.getDaysOfMonth("2020-02-01","yyyy-MM-dd"));
        System.out.println("2020-02-01 所在月最后一天：" + Utils.getLastDayOfMonth("2020-02-01","yyyy-MM-dd"));
    }
}
