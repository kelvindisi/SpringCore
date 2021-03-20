package org.devkiu.spring.core.xmlreference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollaborationMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("studentContext.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
