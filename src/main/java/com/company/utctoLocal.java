package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class utctoLocal {
    public static void main(String[] args) {
        ObjectMapper Objmapper = new ObjectMapper();
//        Employee emp = new Employee();
//
//        Map<String, Object> map = Objmapper.convertValue(obj, Map.class);
//        Object peru = new Object();
//        for(int i=0;i<InputFields.size();i++) {
//            DateTimeFormatter f = DateTimeFormatter.ofPattern( "yyyy-MM-dd HH:mm:ss" ) ;
//            LocalDateTime ldt = LocalDateTime.parse((String)map.get(InputFields.get(i)) , f ) ;
//            ZoneId z = ZoneId.of(listTimeZone.get(i).toString()) ;
//            ZonedDateTime zdt = ldt.atZone( z ) ;
//            Instant Ins = zdt.toInstant();
//            map.put(InputFields.get(i),Ins);
//        }
//        peru=Objmapper.convertValue(map, Object.class);
//        return peru;
    }
}
