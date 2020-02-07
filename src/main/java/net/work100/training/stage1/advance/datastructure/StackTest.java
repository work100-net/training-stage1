package net.work100.training.stage1.advance.datastructure;

import java.util.Enumeration;
import java.util.Stack;

/**
 * <p>Title: StackTest</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-data-structure.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 20:37
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<String>();
        stack1.push("aaa");
        stack1.push("bbb");
        stack1.push("ccc");
        System.out.println(stack1);
        //显示枚举（stack ）中的所有元素
        Enumeration<String> elements1 = stack1.elements();
        while (elements1.hasMoreElements())
        {
            System.out.print(elements1.nextElement() + " ");
        }
        System.out.println();
        System.out.println(stack1.peek()); // 返回栈顶元素，不移除
        System.out.println(stack1.search("ccc"));

        System.out.println(stack1.pop()); // 弹出栈顶元素
        System.out.println(stack1.search("ccc"));
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println("---------------------");

        Stack stack2 = new Stack();
        stack2.push(123);
        stack2.push("abc");
        stack2.push(123.05f);
        System.out.println(stack2);
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println("---------------------");

    }
}
