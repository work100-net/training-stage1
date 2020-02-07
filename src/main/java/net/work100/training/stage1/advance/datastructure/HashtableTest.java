package net.work100.training.stage1.advance.datastructure;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * <p>Title: HashtableTest</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-data-structure.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 21:06
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("key1", 123);
        ht.put("key2", "abc");
        ht.put("key3", 123.05f);

        System.out.println(ht);
        System.out.println("size: " + ht.size());
        Enumeration<Object> elements = ht.elements();
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement() + " ");
        }
        System.out.println();
        System.out.println("key1=" + ht.get("key1"));
        System.out.println("key2=" + ht.get("key2"));
        System.out.println("key3=" + ht.get("key3"));
        Enumeration<String> keys = ht.keys();
        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.print(key + "=" + ht.get(key) + ", ");
        }
        System.out.println();
    }
}
