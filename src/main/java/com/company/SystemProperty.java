package com.company;

import java.util.Properties;

public class SystemProperty {
    public static void main(String[] args) {

        //System.setProperty("user.timezone", "UTC");
        Properties pros = System.getProperties();
        pros.list(System.out);
     //   System.out.println(pros.getProperty("user.timezone"));
    }
}

