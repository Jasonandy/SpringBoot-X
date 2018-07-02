/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.boot.aggregation.mail.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.io.File;
import java.io.UnsupportedEncodingException;
/**
* @Title: MailTest
* @Package cn.ucaner.mail.test
* @Description: MailTest
* @Author Jason
* @Creator
* @Date 2017/12/9 -- 22:42
* @version V1.0
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {

    @Autowired
    private JavaMailSender mailSender; //自动注入的Bean

    @Value("${spring.mail.username}")
    private String from; //读取配置文件中的参数

    private String to = "jasonxXXXXXXX@hotmail.com";

    @Test
    public void sendSimpleMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject("you can do it");
        message.setText("this is a content");
        mailSender.send(message);
    }

    @Test
    public void sendHtmlMessage() {
        MimeMessage message = null;
        message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            InternetAddress fromAddress = new InternetAddress(MimeUtility.encodeText("Flyat") + "<" + from + ">");// 创建邮件发送者地址
            helper.setFrom(fromAddress);
            InternetAddress toAddress = new InternetAddress(MimeUtility.encodeText("to") + "<" + to + ">");// 创建邮件发送者地址
            helper.setTo(toAddress);
            helper.setSubject("Html");
            StringBuffer sb = new StringBuffer();
            sb.append("<h1>this-h1</h1>")
                    .append("<p style='color:red;'>redFont</p>");
            //第二个参数指定发送的是HTML格式
            helper.setText(sb.toString(), true);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        mailSender.send(message);
    }

    @Test
    public void sendAttachmentsMail() {
        MimeMessage message = null;
        try {
            message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            InternetAddress fromAddress = new InternetAddress(MimeUtility.encodeText("Flyat") + "<" + from + ">");// 创建邮件发送者地址
            helper.setFrom(fromAddress);
            InternetAddress toAddress = new InternetAddress(MimeUtility.encodeText("接收方") + "<" + to + ">");// 创建邮件发送者地址
            helper.setTo(toAddress);
            helper.setSubject("带附件的邮件");
            StringBuffer sb = new StringBuffer();
            sb.append("<h1>带附件的邮件内容</h1>")
                    .append("<p style='color:red;'>红色字</p>");
            //第二个参数指定发送的是HTML格式
            helper.setText(sb.toString(), true);
            //注意项目路径问题，自动补用项目路径
            FileSystemResource file = new FileSystemResource(new File("src/main/resources/static/forbidden.jpg"));
            helper.addAttachment("图片.jpg", file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mailSender.send(message);
    }

    @Test
    public void sendInlineMail() {
        MimeMessage message = null;
        try {
            message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            InternetAddress fromAddress = new InternetAddress(MimeUtility.encodeText("Flyat") + "<" + from + ">");// 创建邮件发送者地址
            helper.setFrom(fromAddress);
            InternetAddress toAddress = new InternetAddress(MimeUtility.encodeText("接收方") + "<" + to + ">");// 创建邮件发送者地址
            helper.setTo(toAddress);
            helper.setSubject("带静态资源的邮件");
            //第二个参数指定发送的是HTML格式
            helper.setText("<html><body>带静态资源的邮件内容 图片:<img src='cid:forbidden' /></body></html>", true);

            FileSystemResource file = new FileSystemResource(new File("src/main/resources/static/forbidden.jpg"));
            helper.addInline("forbidden", file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mailSender.send(message);
    }

}