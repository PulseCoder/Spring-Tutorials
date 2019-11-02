package com.sahil.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from spring container
		Coach theCoach = context.getBean("cricketCoach",Coach.class);
		Coach alphaCoach = context.getBean("cricketCoach",Coach.class);
		// check beans
		System.out.println(theCoach==alphaCoach);
		System.out.println("Memory address of theCoach"+theCoach);
		System.out.println("Memory address of alphaCoach"+alphaCoach);
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();
	}
}

