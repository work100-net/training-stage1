package net.work100.training.stage1.basic.modifiertype;

/**
 * <p>Title: Caravan</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 16:37
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public abstract class Caravan {
    private double price;
    private String model;
    private String year;
    public abstract void goFast(); //抽象方法
    public abstract void changeColor();
}
