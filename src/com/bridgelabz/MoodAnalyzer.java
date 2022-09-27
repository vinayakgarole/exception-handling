package com.bridgelabz;

public class MoodAnalyzer {

    public String analyseMood(String message){
        try {
            message.contains("happy mood");
            System.out.println("HAPPY");
            return "HAPPY MOOD";
        }
        catch (Exception e){
            System.out.println("SAD");
            return "SAD MOOD";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        moodAnalyser.analyseMood("I'm in any mood today");
    }
}