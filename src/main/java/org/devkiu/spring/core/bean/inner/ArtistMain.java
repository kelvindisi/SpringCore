package org.devkiu.spring.core.bean.inner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArtistMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("core/innerContext.xml");
        Artist artist = context.getBean("kamba", Artist.class);
        System.out.println(artist);
    }
}
