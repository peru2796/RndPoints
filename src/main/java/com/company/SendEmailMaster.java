package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Locale;
import java.util.logging.Logger;

public class SendEmailMaster {

    @Autowired
    private SendEmail sendMail;
    private  MessageSource objMessageSource;

    public MessageSource getObjMessageSource() {
        return objMessageSource;
    }

    public void setObjMessageSource(MessageSource objMessageSource) {
        this.objMessageSource = objMessageSource;
    }

    public String getFromResourceBundle(String searchString,String Language) {
       try{
           Locale l = new Locale(Language);
           return objMessageSource.getMessage(searchString,null,l);
       }catch (NoSuchMessageException e){
           System.out.println(e);
           return searchString;
       }
    }
    public void sendSimpleMessage(
            String to, String subject, String text) {
        JavaMailSender objJavaMailSender=sendMail.SendEmailThroughJava();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("LIMS");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        objJavaMailSender.send(message);
        System.out.println("Email sent successfully....");
    }
    public void sendMIMEMessageWithAttachment(
            String to, String subject, String text) throws MessagingException {
        JavaMailSender objJavaMailSender=sendMail.SendEmailThroughJava();
        MimeMessage message = objJavaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, true);

       // SimpleMailMessage message = new SimpleMailMessage();
        helper.setFrom("LIMS");
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(text);

        FileSystemResource file
                = new FileSystemResource(new File("D:\\sql.txt"));
        helper.addAttachment("SQLFile.txt", file);
        objJavaMailSender.send(message);
        System.out.println("Email sent successfully....");
    }
    public void init(){
        System.out.println("i am in init method of sum of two number... ");
    }

    public void destroy(){
        System.out.println("i am in destroy method of sum of two number... ");
    }
}
