package org.devkiu.spring.core.currentInCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCurrentMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("core/inCreationContext.xml");
        Department department = context.getBean("department", Department.class);
        System.out.println(department);
    }
}
