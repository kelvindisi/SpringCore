package org.devkiu.spring.core.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);
//        Using class to get bean container
        Student student = context.getBean(Student.class);
        System.out.println(student);
//        Using name and class to get bean container
        Student student1 = context.getBean("kelvin", Student.class);
        System.out.println(student1);
    }
}
