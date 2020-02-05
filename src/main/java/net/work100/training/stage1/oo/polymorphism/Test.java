package net.work100.training.stage1.oo.polymorphism;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 16:35
 * @url http://www.work100.net/training/java-polymorphism.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // 抽象类不能被实例化，编译报错

        show(new Cat());  // 以 Cat 对象调用 show 方法
        show(new Dog());  // 以 Dog 对象调用 show 方法
        System.out.println("------------------------");

        Animal a = new Cat();  // 向上转型
        a.eat();               // 调用的是 Cat 的 eat
        Cat c = (Cat) a;        // 向下转型
        c.work();        // 调用的是 Cat 的 work
    }

    public static void show(Animal a) {
        a.eat();
        // 类型判断
        if (a instanceof Cat) {  // 猫做的事情
            Cat c = (Cat) a;
            c.work();
        } else if (a instanceof Dog) { // 狗做的事情
            Dog c = (Dog) a;
            c.work();
        }
    }
}

/**
 * 抽象类
 */
abstract class Animal {
    /**
     * 吃
     */
    abstract void eat();
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    /**
     * 工作
     */
    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    /**
     * 工作
     */
    public void work() {
        System.out.println("看家");
    }
}
