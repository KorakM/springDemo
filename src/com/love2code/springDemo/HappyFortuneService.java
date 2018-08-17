package com.love2code.springDemo;

/**
 * Created by Korak Mitra
 * On: 8/17/2018,
 * At: 5:26 PM.
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
