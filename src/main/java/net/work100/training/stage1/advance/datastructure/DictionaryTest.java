package net.work100.training.stage1.advance.datastructure;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * <p>Title: DictionaryTest</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 20:53
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class DictionaryTest {
    private static Dictionary<String, Object> dic = new Hashtable<String, Object>();

    public static void main(String[] args) {
        dic.put("key1", 123);
        dic.put("key2", "abc");
        dic.put("key3", 123.05f);

        System.out.println(dic);
        System.out.println("size: " + dic.size());
        Enumeration<Object> elements = dic.elements();
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement() + " ");
        }
        System.out.println();
        System.out.println("key1=" + dic.get("key1"));
        System.out.println("key2=" + dic.get("key2"));
        System.out.println("key3=" + dic.get("key3"));
        Enumeration<String> keys = dic.keys();
        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.print(key + "=" + dic.get(key) + ", ");
        }
        System.out.println();
    }
}
