package org.devkiu.spring.core.bean.separation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SeparationMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("core/graduateContext.xml");
        Graduate graduate = context.getBean(Graduate.class);
        System.out.println(graduate);
    }
}
