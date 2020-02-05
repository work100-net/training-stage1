package net.work100.training.stage1.basic.modifiertype;

/**
 * <p>Title: SuperClass</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 16:38
 * @url http://www.work100.net/training/java-modifier-type.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public abstract class SuperClass {
    abstract void m(); // 抽象方法
}

class SubClass extends SuperClass{

    //实现抽象方法
    @Override
    void m() {

    }
}
