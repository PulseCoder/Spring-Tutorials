package com.sahil.springdemo;

public class TrackCoach implements Coach {
	FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
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
	
	// add an init method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach : Inside method doMyStartupStuff");
	}
	// add an destroy method
	public void doMyCleanupStuff(){
		System.out.println("TrackCoach : Inside method doMyCleanupStuff");
	}
}
