package com.gunjan.springdemo;

public class BaseBallCoach implements Coach {
	
	public BaseBallCoach() {
		System.out.println("BaseBall bean created");
	}
	@Override
	public String getDailyWorkout() {
		return "practise 30 minutes daily";
	}

}
