package com.love2code.springDemo;

public class MyApp {
    public static void main(String[] args) {
        Coach theCoach = new TrackCoach();

        System.out.println("daily workout = " + theCoach.getDailyWorkout());
    }
}
