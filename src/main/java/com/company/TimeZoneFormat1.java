package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeZoneFormat1 {
    public static void main(String[] args) throws ParseException {
//        LocalDateTime I=LocalDateTime.now();
//        System.out.println(I);
       System.setProperty("user.timezone", "UTC");
//        System.out.println("Peru-->"+System.getProperty("user.timezone"));
//
//        String stringInstant="2020-08-01 23:30";
//        SimpleDateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
//        SimpleDateFormat destFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        SimpleDateFormat destFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        SimpleDateFormat destFormat2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        TimeZone utc = TimeZone.getTimeZone("Europe/London");
//        destFormat.setTimeZone(utc);
//        Date convertedDate = sourceFormat.parse(stringInstant);
//        destFormat.format(convertedDate);
//        System.out.println("Europe/London-->"+destFormat.format(convertedDate));
//        TimeZone utc1 = TimeZone.getTimeZone("America/Denver");
//        destFormat1.setTimeZone(utc1);
//        Date convertedDate1 = sourceFormat.parse(stringInstant);
//        destFormat1.format(convertedDate1);
//        System.out.println("America/Denver-->"+destFormat1.format(convertedDate1));
//        TimeZone utc2 = TimeZone.getTimeZone("Asia/Kolkata");
//        destFormat2.setTimeZone(utc2);
//        Date convertedDate2 = sourceFormat.parse(stringInstant);
//        destFormat2.format(convertedDate2);
//        System.out.println("Asia/kolkata-->"+destFormat2.format(convertedDate2));
//        final LocalDateTime expiryDate = convertedDate.atZone(ZoneId.of("Asia/Calcutta")).toLocalDateTime();
//
//        System.out.println("date:"+ expiryDate);
//        TimeZone utc1 = TimeZone.getTimeZone("Australia/Canberra");
//        SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
//        SimpleDateFormat sourceFormat1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//        sourceFormat1.setTimeZone(utc1);
//        Date convertedDate1 = sourceFormat1.parse(I);
     //   System.out.println("Australia/Canberra-->"+destFormat.format(convertedDate));
//        TimeZone utc2 = TimeZone.getTimeZone("Europe/London");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
//        SimpleDateFormat sourceFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//        sourceFormat2.setTimeZone(utc2);
//        Date convertedDate2 = sourceFormat2.parse(I);
//        System.out.println("Europe/London-->"+convertedDate2);
//        TimeZone utc3 = TimeZone.getTimeZone("America/Denver");
//        SimpleDateFormat sdf3 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
//        SimpleDateFormat sourceFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//        sourceFormat3.setTimeZone(utc3);
//        Date convertedDate3 = sourceFormat3.parse(I);
//        System.out.println("America/Denver-->"+convertedDate3);
       // Instant dhskjd=Instant.now();
        Instant convertedDate = LocalDateTime.now().toInstant(ZoneOffset.UTC);
    System.out.println(convertedDate+"efewfewfw");
    }
}
