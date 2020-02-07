package net.work100.training.stage1.advance.email;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 * <p>Title: SendHtmlEmail</p>
 * <p>Description: </p>
 * <p>Url: http://www.work100.net/training/java-email.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-07 12:24
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-07   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class SendHtmlEmail {
    public static void main(String[] args) {
        // 收件人电子邮箱
        String to = "abcd@gmail.com";

        // 发件人电子邮箱
        String from = "web@gmail.com";

        // 指定发送邮件的主机为 localhost
        String host = "localhost";

        // 获取系统属性
        Properties properties = System.getProperties();

        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);

        // 获取默认的 Session 对象。
        Session session = Session.getDefaultInstance(properties);

        try {
            // 创建默认的 MimeMessage 对象。
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: 头字段
            message.setSubject("This is the Subject Line!");

            // 发送 HTML 消息, 可以插入html标签
            message.setContent("<h1>This is actual message</h1>", "text/html");

            // 发送消息
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
