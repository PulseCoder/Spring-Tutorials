package com.sahil.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	FortuneService fortuneService;
	
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
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
