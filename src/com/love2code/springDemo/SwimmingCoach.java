package com.love2code.springDemo;

public class SwimmingCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim for 6 laps";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
