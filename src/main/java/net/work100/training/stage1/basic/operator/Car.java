package net.work100.training.stage1.basic.operator;

/**
 * <p>Title: Car</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 17:02
 * @url http://www.work100.net/training/java-operator.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Car extends Vehicle {
    public static void main(String[] args) {
        Vehicle a = new Car();
        boolean result = a instanceof Car;
        System.out.println(result);
    }
}

class Vehicle {
}
