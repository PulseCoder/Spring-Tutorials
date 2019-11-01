package com.sahil.springdemo;

public class TrackCoach implements Coach {
	FortuneService fortuneService;
	
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
