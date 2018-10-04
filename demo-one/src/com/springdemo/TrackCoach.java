package com.springdemo;

public class TrackCoach implements Coach{
	
	// Define the fortune property
		FortuneService coachFortune;
		
	// Constructor for dependency injection
	public TrackCoach(FortuneService fortune) {
		this.coachFortune = fortune;  
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return coachFortune.getFortune();
	}
}
