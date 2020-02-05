package net.work100.training.stage1.oo.interfaceexample;

/**
 * <p>Title: MammalInt</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 17:15
 * @url http://www.work100.net/training/java-interface.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class MammalInt implements Animal {
    @Override
    public void eat() {
        System.out.println("哺乳动物 - eat");
    }

    @Override
    public void travel() {
        System.out.println("哺乳动物 - travel");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
