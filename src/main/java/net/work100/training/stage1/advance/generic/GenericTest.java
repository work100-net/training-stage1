package net.work100.training.stage1.advance.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: GenericTest</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 19:31
 * @url http://www.work100.net/training/java-generic.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class GenericTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

        System.out.println("-------------------");

        //getUperNumber(name);//1
        getUperNumber(age);//2
        getUperNumber(number);//3
    }

    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }
}
