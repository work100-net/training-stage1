package net.work100.training.stage1.basic.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 15:22
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
//        // 案例1
//        example1();
//        System.out.println("-------------案例1^--------------");
//
//        // 多重捕获块
//        example2();
//        System.out.println("-------------多重捕获块^--------------");

        // finally使用
        finallyTest();
        System.out.println("-------------finally使用^--------------");
    }

    static void example1() {
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }

    static void example2() {
        try {
            FileInputStream file = new FileInputStream("aaaa.test");
            Byte x = (byte) file.read();
        } catch (FileNotFoundException f) { // Not valid!
            f.printStackTrace();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    static void finallyTest(){
        int a[] = new int[2];
        try{
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        finally{
            a[0] = 6;
            System.out.println("First element value: " +a[0]);
            System.out.println("The finally statement is executed");
        }
    }


    public void pay(double amount) throws Exception
    {
        // 方法实现。。。

        throw new Exception();
    }



    public void order(double amount) throws Exception, IOException
    {
        // 方法实现。。。
    }
}
