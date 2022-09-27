package com.bridgelabz;

public class MoodAnalyzer {

    public String analyseMood(String message){
        /*
          null in message it should give happy but it shows nullPointer Exception
         So we use try and catch for exception handling. if it is null then it gives sad using catch block
         */
        try {
            message.contains(null);
            System.out.println("HAPPY");
            return "HAPPY MOOD";
        }
        catch (NullPointerException e){
            System.out.println("SAD");
            return "SAD MOOD";
        }
    }
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        moodAnalyser.analyseMood("I'm in any mood today");
    }
}