package com.sahil.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println(">>TennisCoach : Inside default constructor");
	}
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}



	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
