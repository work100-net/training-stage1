package net.work100.training.stage1.oo.inheritance;

/**
 * <p>Title: Dog</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 16:14
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Dog extends Animal {
    public Dog(String myName, int myid) {
        super(myName, myid);
    }

    @Override
    public void eat() {
        System.out.println("dog 正在吃");
    }

    void eatTest() {
        this.eat();   // this 调用自己的方法
        super.eat();  // super 调用父类方法
    }
}
