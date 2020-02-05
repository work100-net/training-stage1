package net.work100.training.stage1.oo.overrideoverload;

/**
 * <p>Title: Dog</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 16:25
 * @url http://www.work100.net/training/java-override-overload.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Dog extends Animal {
    @Override
    public void move() {
        super.move();
        System.out.println("狗可以跑和走");
    }

    public void bark(){
        System.out.println("狗可以吠叫");
    }
}
