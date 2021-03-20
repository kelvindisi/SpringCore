package org.devkiu.spring.core.setterbased;

import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {
    public static void main(String[] args) {
//        using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("memberContext.xml");
        Member member = context.getBean(Member.class);
        System.out.println(member);
//        using core of DI - BeanFactory
        BeanFactory context1 = new ClassPathXmlApplicationContext("memberContext.xml");
        Member member1 = context1.getBean(Member.class);
        System.out.println(member1);
    }
}
