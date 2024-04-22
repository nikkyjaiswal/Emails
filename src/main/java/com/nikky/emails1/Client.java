package com.nikky.emails1;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args)
        {
            ApplicationContext sapplicationContext= new AnnotationConfigApplicationContext(AppConfing.class);

        }
}
