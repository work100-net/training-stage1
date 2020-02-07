package net.work100.training.stage1.advance.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * <p>Title: VictorTest</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-data-structure.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 20:03
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class VictorTest {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<Integer>();

        v1.addElement(new Integer(1));
        v1.add(1, new Integer(20));
        System.out.println(v1);
        System.out.println(v1.get(0));
        System.out.println(v1.get(1));
        System.out.println("------------------------");

        Vector<String> v2 = new Vector<String>();
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        v2.addAll(list);
        System.out.println(v2);
        System.out.println(v2.firstElement());
        System.out.println(v2.lastElement());
        System.out.println("------------------------");
    }
}
