package com.bridgelabz;

public class MoodAnalyzer {
    public String analyseMood(String message) {
        if (message.contains("happy mood")) {
            System.out.println("HAPPY");
            return "HAPPY MOOD";
        } else {
            System.out.println("SAD");
            return "SAD MOOD";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        moodAnalyser.analyseMood("I'm in sad mood today");
    }
}