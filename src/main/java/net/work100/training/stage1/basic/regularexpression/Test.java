package net.work100.training.stage1.basic.regularexpression;

import java.util.regex.*;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 21:16
 * @url http://www.work100.net/training/java-regular-expression.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        // 判断给定字符串中是否包含子串
        matchTest();
        System.out.println("----------判断给定字符串中是否包含子串^------------");

        // 按指定模式在字符串查找
        regexMatches();
        System.out.println("----------按指定模式在字符串查找^------------");

        // start和end方法
        start_end();
        System.out.println("----------start和end方法^------------");

        // matches和lookingAt方法
        matches_lookingAt();
        System.out.println("----------matches和lookingAt方法^------------");

        // replaceFirst和replaceAll方法
        replace();
        System.out.println("----------replaceFirst和replaceAll方法^------------");

        // appendReplacement和appendTail方法
        append();
        System.out.println("----------appendReplacement和appendTail方法^------------");
    }

    static void matchTest() {
        String content = "I am xiaojun from work100.net";

        String pattern = ".*work100.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'work100' 子字符串? " + isMatch);
    }

    static void regexMatches() {
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }

    static void start_end() {
        final String REGEX = "\\bcat\\b";
        final String INPUT = "cat cat cat cattie cat";

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT); // 获取 matcher 对象
        int count = 0;

        while (m.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("start(): " + m.start());
            System.out.println("end(): " + m.end());
        }
    }

    static void matches_lookingAt() {
        final String REGEX = "foo";
        final String INPUT = "fooooooooooooooooo";
        final String INPUT2 = "ooooofoooooooooooo";
        Pattern pattern;
        Matcher matcher;
        Matcher matcher2;
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);
        matcher2 = pattern.matcher(INPUT2);

        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("Current INPUT is: " + INPUT);
        System.out.println("Current INPUT2 is: " + INPUT2);

        System.out.println("lookingAt(): " + matcher.lookingAt());
        System.out.println("matches(): " + matcher.matches());
        System.out.println("lookingAt(): " + matcher2.lookingAt());
    }

    static void replace(){
        String input = "The dog says meow. All dogs say meow.";
        final String REGEX = "dog";
        final String REPLACE = "cat";

        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(input);
        input = m.replaceAll(REPLACE);
        System.out.println(input);
    }

    static void append(){
        final String REGEX = "a*b";
        final String INPUT = "aabfooaabfooabfoobkkk";
        final String REPLACE = "-";

        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()){
            m.appendReplacement(sb,REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
