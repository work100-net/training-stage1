package net.work100.training.stage1.oo.packageexample.animals;

/**
 * <p>Title: MammalInt</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-package.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 17:31
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class MammalInt implements Animal {
    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
