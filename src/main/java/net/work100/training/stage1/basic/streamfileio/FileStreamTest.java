package net.work100.training.stage1.basic.streamfileio;

import java.io.*;

/**
 * <p>Title: FileStreamTest</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-02 22:37
 * @url http://www.work100.net/training/java-stream-file-io.html
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-02   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class FileStreamTest {
    public static void main(String[] args) {
        // 基础用法
        write1();
        System.out.println("-----------基础用法^------------");

        // 解决乱码问题
        write2();
        System.out.println("-----------解决乱码问题^------------");
    }

    static void write1() {
        try {
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("test1.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test1.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
            System.out.println();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }

    static void write2() {
        try {
            File f = new File("test2.txt");
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
}
