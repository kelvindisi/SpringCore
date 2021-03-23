package org.devkiu.spring.autowiring.byNameXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/byNameAutowiring.xml");
        System.out.println(context.getBean("teacher", Teacher.class));
    }
}
