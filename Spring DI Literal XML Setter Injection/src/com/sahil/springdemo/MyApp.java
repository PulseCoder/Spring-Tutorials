package com.sahil.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// load the Spring configuration file
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from Spring container
			CricketCoach theCoach = context.getBean("myCoach",CricketCoach.class);
		// call methods on the bean
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
			System.out.println(theCoach.getEmailAddress());
			System.out.println(theCoach.getTeam());
		// close the context
			context.close();
	}
}
