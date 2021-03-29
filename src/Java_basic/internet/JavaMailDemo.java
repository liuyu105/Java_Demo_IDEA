package Java_basic.internet;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class JavaMailDemo {
    public static void main(String[] args) throws MessagingException {
        //1. 通过JavaMail API连接到SMTP服务器上
        // 服务器地址:
        String smtp = "smtp.163.com";
        // 登录用户名:
        String username = "liuyu105@163.com";
        // 登录口令:
        String password = "LGTWZBRNBAKIMYQM";
        // 连接到SMTP服务器465端口:
        Properties props = new Properties();
        props.put("mail.smtp.host", smtp); // SMTP主机名
        props.put("mail.smtp.port", "465"); // 主机端口号
        props.put("mail.smtp.auth", "true"); // 是否需要用户认证
        props.put("mail.smtp.starttls.enable", "true"); // 启用TLS加密
        props.put("mail.smtp.ssl.enable", "true");
        // 获取Session实例:
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        // 设置debug模式便于调试:
        session.setDebug(true);

        //2. 发送邮件
        MimeMessage message = new MimeMessage(session);
        // 设置发送方地址:
        message.setFrom(new InternetAddress("liuyu105@163.com"));
        // 设置接收方地址:
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("liuyu957@qq.com"));
        // 设置邮件主题:
        message.setSubject("Hello", "UTF-8");
        // 设置邮件正文:
        message.setText("Hi Xiaoming...", "UTF-8");
        // 发送:
        Transport.send(message);
    }
}
