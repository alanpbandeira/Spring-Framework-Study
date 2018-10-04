package com.springdemo;

public class BaseballCoach implements Coach {
	
	// Define the fortune property
	FortuneService coachFortune;
	
	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}
	
	// Constructor for dependency injection
//	public BaseballCoach(FortuneService fortune) {
//		this.coachFortune = fortune;
//	}
	
	@Override
	public String getDailyWorkout () {
		return "Spend 30 minutes running";
	}

	@Override
	public String getDailyFortune() {
		return coachFortune.getFortune();
	}
	
	public void setCoachFortune(FortuneService newFortune) {
		this.coachFortune = newFortune;
	} 
	
}
