package com.company;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class UTC {
    public static void main(String[] args) throws ParseException {
//        String stringInstant= Instant.now().toString();
//        SimpleDateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//        SimpleDateFormat destFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//        Date convertedDate = sourceFormat.parse(stringInstant);
//        String stringUTCFormat=destFormat.format(convertedDate);
//        System.out.println(destFormat.parse(stringUTCFormat));

//        Instant instant = Instant.now();
//        Timestamp timestamp = Timestamp.from(instant);
//        System.out.println(instant.toEpochMilli()+"-->"+ timestamp.getTime());

        Instant convertedDate = Instant.now().atZone(ZoneId.of(Locale.getDefault().toString())).toInstant();
        System.out.println(convertedDate);

    }
}
