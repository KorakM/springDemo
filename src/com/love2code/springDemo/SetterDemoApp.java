package com.love2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.support.AbstractSubscribableChannel;

/**
 * Created by Korak Mitra
 * On: 8/17/2018,
 * At: 7:24 PM.
 */
public class SetterDemoApp {
    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        SwimmingCoach theCoach = context.getBean("mySwimmingCoach", SwimmingCoach.class);

        //call methods on bean
        System.out.println("theCoach.getDailyWorkout() = " + theCoach.getDailyWorkout());

        System.out.println("theCoach.getDailyFortune() = " + theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
