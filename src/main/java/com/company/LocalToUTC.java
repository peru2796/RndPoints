package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class LocalToUTC {
    public static void main(String[] args) throws ParseException {
        System.getProperty("user.timezone","UTC");
//        String I= "2020-09-25 08:30:65.567";
//        DateFormat formatterIST = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//        formatterIST.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta")); // better than using IST
//        Date date = formatterIST.parse(I);
//        DateFormat formatterUTC = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//        formatterUTC.setTimeZone(TimeZone.getTimeZone("UTC")); // UTC timezone
//        System.out.println(formatterUTC.format(date));


        //        Date date1 =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(I);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
//        String I1=sdf.format(date1);
//        System.out.println(I1);
//        Date date2 =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(I1);
//       LocalDateTime l1=date2.toInstant().atZone(ZoneId.of("Asia/Calcutta")).toLocalDateTime();
//
//        DateTimeFormatter destFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//System.out.println(destFormat.format(l1));


//        ------------

        System.out.println(Instant.now());
        Instant I= Instant.now();

        LocalDateTime zdt = ZonedDateTime.ofInstant(I,ZoneId.of("Asia/Kolkata")).toLocalDateTime();
System.out.println(zdt);
System.out.println(I);
        //        DateTimeFormatter f = DateTimeFormatter.ofPattern( "yyyy-MM-dd HH:mm:ss" ) ;
//        LocalDateTime ldt = LocalDateTime.parse( I , f ) ;
//        ZoneId z = ZoneId.of("Asia/Kolkata") ;
//        ZonedDateTime zdt = ldt.atZone( z ) ;
//        Instant Ins = zdt.toInstant();
//        System.out.println("UTC-->"+Ins);
//        System.out.println("America-->"+Ins.atZone(ZoneId.of("America/Denver")).toLocalDateTime());
//        System.out.println("Asia/Kolkatta"+Ins.atZone(ZoneId.of("Asia/Kolkata")).toLocalDateTime());
    }
}
