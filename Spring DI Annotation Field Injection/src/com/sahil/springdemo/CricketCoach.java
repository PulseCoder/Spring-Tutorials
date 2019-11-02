package com.sahil.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	@Autowired
	FortuneService fortuneService;
	
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

}
