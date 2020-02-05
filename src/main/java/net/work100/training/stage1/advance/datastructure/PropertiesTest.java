package net.work100.training.stage1.advance.datastructure;

import java.io.*;
import java.util.Date;
import java.util.Properties;

/**
 * <p>Title: PropertiesTest</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 21:13
 * @url http://www.work100.net/training/java-data-structure.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class PropertiesTest {
    public static void main(String[] args) {
        // 写入属性
        writeProperties();
        System.out.println("---------------------");

        // 读取属性
        readProperties();
        System.out.println("---------------------");
    }

    static void writeProperties() {
        Properties properties = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream("config.properties");
            properties.setProperty("url", "jdbc:mysql://localhost:3306/");
            properties.setProperty("username", "root");
            properties.setProperty("password", "root");
            properties.setProperty("database", "users");//保存键值对到内存
            properties.store(output, "Xiaojun modify" + new Date().toString());
            // 保存键值对到文件中
            System.out.println("写入完成");
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void readProperties() {

        try {
            InputStream in = new BufferedInputStream(new FileInputStream(new File("config.properties")));
            Properties prop = new Properties();

            prop.load(in);
            System.out.println("url: " + prop.getProperty("url"));
            System.out.println("username: " + prop.getProperty("username"));
            System.out.println("password: " + prop.getProperty("password"));
            System.out.println("database: " + prop.getProperty("database"));
            System.out.println("读取完成");
        } catch (FileNotFoundException e) {
            System.out.println("properties文件路径书写有误，请检查！");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
