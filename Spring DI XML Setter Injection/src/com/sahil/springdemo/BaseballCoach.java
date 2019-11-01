package com.sahil.springdemo;

public class BaseballCoach implements Coach{
	FortuneService fortuneService;
	
	
	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}
	
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
