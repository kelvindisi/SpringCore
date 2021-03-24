package org.devkiu.spring.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConstructor {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/constructorAutowiring.xml");
        System.out.println(context.getBean("teacher", Teacher.class));
    }
}
