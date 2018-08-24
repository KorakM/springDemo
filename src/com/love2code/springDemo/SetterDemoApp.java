package com.love2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods on bean
        System.out.println("theCoach.getDailyWorkout() = " + theCoach.getDailyWorkout());

        System.out.println("theCoach.getDailyFortune() = " + theCoach.getDailyFortune());

        System.out.println("theCoach.getEmail() = " + theCoach.getEmail());

        System.out.println("theCoach.getTeam() = " + theCoach.getTeam());

        //close the context
        context.close();
    }
}
