package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListChecking {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(1);

        Employee emp1 = new Employee();
        emp1.setId(2);

        Employee emp2 = new Employee();
        emp2.setId(3);


        Employee emp3 = new Employee();
        emp3.setId(3);

        Employee emp4 = new Employee();
        emp4.setId(2);

        List<Employee> listEmployee= new ArrayList<Employee>();
         listEmployee.add(emp);
         listEmployee.add(emp1);
        listEmployee.add(emp2);
        System.out.println(listEmployee);
        List<Employee> listEmployee1= new ArrayList<Employee>();
        listEmployee1.add(emp3);
        listEmployee1.add(emp4);
        System.out.println(listEmployee1);
//        listEmployee.removeAll(listEmployee1);
//        System.out.println(listEmployee);
     List<Employee> listemp= listEmployee.stream().filter( objfilter-> listEmployee1.stream()
      .noneMatch(obj->obj.getId()==objfilter.getId())).collect(Collectors.toList());
        System.out.println(listemp.toString());
    }
}
