package net.work100.training.stage1.basic.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 18:01
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        // 获取当前日期时间
        get();
        System.out.println("-----------获取当前日期时间^----------");

        // 日期比较
        compare();
        System.out.println("-----------日期比较^----------");

        // 格式化
        format();
        System.out.println("-----------格式化^----------");

        // 使用printf格式化日期
        printf();
        System.out.println("-----------使用printf格式化日期^----------");

        // 解析字符串为时间
        parseString();
        System.out.println("-----------解析字符串为时间^----------");

        // 休眠(sleep)
        sleep();
        System.out.println("-----------休眠(sleep)^----------");

        // 测量时间
        diff();
        System.out.println("-----------测量时间^----------");

        // Calendar类
        calendar();
        System.out.println("-----------Calendar类^----------");

        // GregorianCalendar类
        gregorianCalendar();
        System.out.println("-----------GregorianCalendar类^----------");
    }

    static void get() {
        // 初始化 Date 对象
        Date date = new Date();

        // 使用 toString() 函数显示日期时间
        System.out.println(date.toString());
    }

    static void compare() {
        Date date1 = new Date(2020, 2, 1);
        Date date2 = new Date(2020, 2, 2);
        System.out.println("date1 : " + date1);
        System.out.println("date2 : " + date2);
        System.out.println("date1 < date2 : " + (date1.getTime() < date2.getTime()));
        System.out.println("date1 before date2 : " + date1.before(date2));
        System.out.println("date1 compareTo date2 : " + date1.compareTo(date2));
    }

    static void format() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为: " + ft.format(dNow));
    }

    static void printf() {

        // 初始化 Date 对象
        Date date = new Date();

        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n", date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n", date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n", date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR", date);

        System.out.println();

        System.out.println("定义日期格式的转换符可以使日期通过指定的转换符生成新字符串");
        //b的使用，月份简称
        String str = String.format(Locale.US, "英文月份简称：%tb", date);
        System.out.println(str);
        System.out.printf("本地月份简称：%tb%n", date);
        //B的使用，月份全称
        str = String.format(Locale.US, "英文月份全称：%tB", date);
        System.out.println(str);
        System.out.printf("本地月份全称：%tB%n", date);
        //a的使用，星期简称
        str = String.format(Locale.US, "英文星期的简称：%ta", date);
        System.out.println(str);
        //A的使用，星期全称
        System.out.printf("本地星期的简称：%tA%n", date);
        //C的使用，年前两位
        System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n", date);
        //y的使用，年后两位
        System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n", date);
        //j的使用，一年的天数
        System.out.printf("一年中的天数（即年的第几天）：%tj%n", date);
        //m的使用，月份
        System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n", date);
        //d的使用，日（二位，不够补零）
        System.out.printf("两位数字的日（不足两位前面补0）：%td%n", date);
        //e的使用，日（一位不补零）
        System.out.printf("月份的日（前面不补0）：%te", date);

        System.out.println();


    }

    static void parseString() {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

        String input = "2019-11-11";
        System.out.print(input + " 解析为 ");

        Date t;

        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("不能解析 " + ft);
        }
    }

    static void sleep() {
        try {
            System.out.println(new Date());
            Thread.sleep(1000 * 3);   // 休眠3秒
            System.out.println(new Date());
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }

    static void diff() {
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date());
            Thread.sleep(5 * 60 * 10);
            System.out.println(new Date());
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("间隔 : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }

    static void calendar() {
        //创建一个代表2019年6月12日的Calendar对象
        Calendar c1 = Calendar.getInstance();
        c1.set(2019, 6 - 1, 12);

        Calendar c2 = Calendar.getInstance();
        // 获得年份
        int year = c2.get(Calendar.YEAR);
        // 获得月份
        int month = c2.get(Calendar.MONTH) + 1;
        // 获得日期
        int date = c2.get(Calendar.DATE);
        // 获得小时
        int hour = c2.get(Calendar.HOUR_OF_DAY);
        // 获得分钟
        int minute = c2.get(Calendar.MINUTE);
        // 获得秒
        int second = c2.get(Calendar.SECOND);
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = c2.get(Calendar.DAY_OF_WEEK);

        System.out.println("Year : " + year);
        System.out.println("month : " + month);
        System.out.println("date : " + date);
        System.out.println("hour : " + hour);
        System.out.println("minute : " + minute);
        System.out.println("second : " + second);
        System.out.println("day : " + day);
    }

    static void gregorianCalendar() {
        String months[] = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};

        int year;
        // 初始化 Gregorian 日历
        // 使用当前时间和日期
        // 默认为本地时间和时区
        GregorianCalendar gcalendar = new GregorianCalendar();
        // 显示当前时间和日期的信息
        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        // 测试当前年份是否为闰年
        if(gcalendar.isLeapYear(year)) {
            System.out.println("当前年份是闰年");
        }
        else {
            System.out.println("当前年份不是闰年");
        }
    }
}
