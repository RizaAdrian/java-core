package com.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String args[]) {

        //Main sentence
        String s1 = "apple, apple and orange please";
        //replace all without regular expressions
        String s2 = s1.replaceAll("plea", "ricot");
        //replace all with regular expressions
        String s3 = s1.replaceAll("ple\\b", "ricot");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();

        String[] parts = s1.split("\\b");
        for(String partByPart : parts){
            if(partByPart.matches("\\w+")){
                System.out.println(partByPart);
            }
        }

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(s1);
        System.out.println("//// Matcher ////");
            while (matcher.find()){
                System.out.println();
                System.out.println(matcher.group());
        }

    }
}
