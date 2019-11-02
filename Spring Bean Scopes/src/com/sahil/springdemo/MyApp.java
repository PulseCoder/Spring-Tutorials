package com.sahil.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// load the Spring configuration file
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from Spring container
			Coach theCoach = context.getBean("myCoach",Coach.class);
			Coach alphaCoach = context.getBean("myCoach",Coach.class);
		// Checking the two references are same or not.
			System.out.println(theCoach==alphaCoach);
			System.out.println("Memory location of thecoach"+theCoach);
			System.out.println("Memory location of alphacoach"+alphaCoach);
//		// call methods on the bean
//			System.out.println(theCoach.getDailyWorkout());
//			System.out.println(theCoach.getDailyFortune());
		// close the context
			context.close();
	}
}
