package com.love2code.springDemo;

public class SwimmingCoach implements Coach {

    private FortuneService fortuneService;

    public SwimmingCoach() {
        System.out.println("SwimmingCoach: Inside the no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("SwimmingCoach: Inside the setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim for 6 laps";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
