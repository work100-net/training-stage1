package net.work100.training.stage1.advance.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * <p>Title: SerializeDemo</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-serialization.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-07 11:51
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-07   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "xiaojun";
        e.address = "beijing";
        e.SSN = 112233;
        e.number = 101;
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        }catch (IOException i){
            i.printStackTrace();
        }
    }
}
