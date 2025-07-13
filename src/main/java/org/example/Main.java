package org.example;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG        ";
        String lowerCase = original.toLowerCase();
        String upperCase = original.toUpperCase(Locale.ROOT);
        String trimCase = original.trim();
        String substringCase = original.substring(3);
        String substringCaseArgs = original.substring(3,9);
        String replaceCase = original.replace('a' , 'z');
        String replaceCaseArgs = original.replace("abc" , "zo");

        System.out.println(lowerCase+ "-");
        System.out.println(upperCase + "-");
        System.out.println(trimCase + "-");
        System.out.println(substringCase);
        System.out.println(substringCaseArgs);
        System.out.println(replaceCase);
        System.out.println(replaceCaseArgs);
    }
}