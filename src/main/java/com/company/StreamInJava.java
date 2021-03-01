package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamInJava {

    public static void main(String[] args) {
        List<Employee> lstObject = new ArrayList<Employee>();
        List<Employee> lstObject1 = new ArrayList<Employee>();
        Employee emp = new Employee();
        final int searchId=1;
        emp.setId(1);
        emp.setName("peru");
        emp.setDescription("pp");
        Employee emp1 = new Employee();
        emp1.setId(2);
        emp1.setName("peru-02");
        emp1.setDescription("pp");
        Employee emp3 = new Employee();
        emp3.setId(3);
        emp3.setName("peru3");
        emp3.setDescription("pp-001");
        lstObject.add(emp);
        lstObject.add(emp1);
        lstObject.add(emp3);
        Employee emp5 = new Employee();
        emp5.setId(1);
        emp5.setName("peru");
        emp5.setDescription("pp");
        Employee emp4 = new Employee();
        emp4.setId(2);
        emp4.setName("peru-02");
        emp4.setDescription("pp");
        lstObject1.add(emp4);
        lstObject1.add(emp5);
        System.out.println(lstObject);
        System.out.println(lstObject1);
        lstObject1.retainAll(lstObject);
        System.out.println(lstObject1);
//      Map peru= lstObject.stream()
//                .collect(Collectors.groupingBy(
//                        Employee::getName,
//                        Collectors.mapping(s -> s,
//                                Collectors.collectingAndThen(Collectors.toList(), ArrayList::new))));
//
//       // String peru=lstObject.stream().map(object->String.valueOf(object.getId())).collect(Collectors.joining(","));
//    System.out.println(peru);
    }
}
