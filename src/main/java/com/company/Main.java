package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.mail.MessagingException;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws MessagingException {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookLibrary objSum=app.getBean("bookLibrary",BookLibrary.class);
           List<Book1> lstBook= objSum.getGetListBook();
        for (Book1 objBook:
            lstBook ) {
            System.out.println(objBook.getBookName()+"/t"+objBook.getBookID());
        }
        System.out.println("_______________________");
        Book1 singleBook= objSum.getGetFirstBook();
        System.out.println(singleBook.getBookName()+"/t"+singleBook.getBookID());
       // String peru=objSum.getFromResourceBundle("Dakshan","en_US");
      //  objSum.sendMIMEMessageWithAttachment("sathishkumar@agaramtech.com","Hi this is peru","Apadi erukuringa.neenga panathu dhaa ipo dha nan try panitu eruken...bless panungaaaa");
       // System.out.println(peru);
    }
}
