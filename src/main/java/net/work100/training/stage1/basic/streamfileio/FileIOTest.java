package net.work100.training.stage1.basic.streamfileio;

import java.io.*;

/**
 * <p>Title: FileIOTest</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 13:50
 * @url http://www.work100.net/training/java-stream-file-io.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class FileIOTest {
    public static void main(String[] args) {
        // 创建目录
        createDir();
        System.out.println("----------创建目录^---------");

        // 创建文件
        createFile();
        System.out.println("----------创建文件^---------");

        // 读取目录
        listDir();
        System.out.println("----------读取目录^---------");

        // 删除目录或文件
        File folder = new File("testFolder");
        deleteFolder(folder);
        System.out.println("----------删除目录或文件^---------");
    }


    /**
     * 创建目录
     */
    static void createDir() {
        String dirName = "testFolder";
        File dir = new File(dirName);
        // 现在创建目录
        dir.mkdirs();

        String subDirName = "testFolder/abc";
        File subDir = new File(subDirName);
        subDir.mkdirs();
    }

    /**
     * 创建文件
     */
    static void createFile() {
        try {
            File f = new File("testFolder/test.txt");
            FileOutputStream fop = new FileOutputStream(f);
            // 构建FileOutputStream对象,文件不存在会自动新建

            OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
            // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

            writer.append("中文输入");
            // 写入到缓冲区

            writer.append("\r\n");
            // 换行

            writer.append("English");
            // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

            writer.close();
            // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

            fop.close();
            // 关闭输出流,释放系统资源

            FileInputStream fip = new FileInputStream(f);
            // 构建FileInputStream对象

            InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
            // 构建InputStreamReader对象,编码与写入相同

            StringBuffer sb = new StringBuffer();
            while (reader.ready()) {
                sb.append((char) reader.read());
                // 转成char加到StringBuffer对象中
            }
            System.out.println(sb.toString());
            reader.close();
            // 关闭读取流

            fip.close();
            // 关闭输入流,释放系统资源
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }

    static void listDir() {
        String dirname = "testFolder";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("目录 " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " 是一个目录");
                } else {
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        } else {
            System.out.println(dirname + " 不是一个目录");
        }
    }

    static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println("deleting:" + f.toPath());
                    deleteFolder(f);
                } else {
                    System.out.println("deleting:" + f.toPath());
                    f.delete();
                }
            }
        }
        folder.delete();
    }
}
