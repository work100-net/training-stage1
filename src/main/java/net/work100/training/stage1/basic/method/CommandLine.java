package net.work100.training.stage1.basic.method;

/**
 * <p>Title: CommandLine</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-method.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 22:20
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class CommandLine {
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
