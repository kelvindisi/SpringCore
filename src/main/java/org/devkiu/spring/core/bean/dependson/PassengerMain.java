package org.devkiu.spring.core.bean.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengerMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("core/passengerContext.xml");
        Passenger passenger = context.getBean("prisoner", Passenger.class);
        System.out.println(passenger);
    }
}
