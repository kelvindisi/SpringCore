package org.devkiu.spring.core.bean.collections.merge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("core/mergeContext.xml");
        Staff staff = context.getBean(Staff.class);
        System.out.println(staff);
    }
}
