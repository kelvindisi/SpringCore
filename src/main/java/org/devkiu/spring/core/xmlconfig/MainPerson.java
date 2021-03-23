package org.devkiu.spring.core.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerson {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("core/personContext.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
