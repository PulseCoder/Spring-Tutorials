package com.sahil.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CricketCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;
	
	public CricketCoach() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Cricket Daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	//define my init method
		@PostConstruct
		public void doMyStartupStuff(){
			System.out.println("Cricket coach inside doMyStartupStuff");
		}
	//defining my destroy method
		@PreDestroy
		public void doMyCleanupStuff(){
			System.out.println("Cricket coach inside doMyCleanupStuff");
		}
}
