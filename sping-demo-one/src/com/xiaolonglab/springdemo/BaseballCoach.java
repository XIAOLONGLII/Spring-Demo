package com.xiaolonglab.springdemo;

public class BaseballCoach implements Coach
{
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minitues on batting practice";
	}

	@Override
	public String getDailFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
