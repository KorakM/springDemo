package com.love2code.springDemo;

/**
 * Created by Korak Mitra
 * On: 8/18/2018,
 * At: 1:15 AM.
 */
public class CricketCoach implements Coach  {
    private String email;
    private String team;
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: Inside the no-arg constructor");
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Inside the setter method for fortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        System.out.println("CricketCoach: Inside the setter method for email");
        this.email = email;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: Inside the setter method for team");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 1 hour.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
