package org.devkiu.spring.core.bean.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionContext.xml");
        Student student = context.getBean("ndisi", Student.class);
        System.out.println(student);
    }
}
