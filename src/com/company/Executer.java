package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Executer {

    private Map<String, Integer> romanToArab; //Each value of the Roman numeral in the map corresponds to the value of the Arabic
    private String[] romanNums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private String[] arabNums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public Executer(){
        romanToArab = new HashMap<>();
        for(int i = 0; i < romanNums.length; i++)
            romanToArab.put(romanNums[i], i+1);
    }


    public int execute(String a, String b, String operator){
        if(Arrays.asList(romanNums).contains(a)&&Arrays.asList(romanNums).contains(b))
            return executeRoman(a, b, operator);
        else if(Arrays.asList(arabNums).contains(a)&&Arrays.asList(arabNums).contains(b))
            return executeArab(Integer.parseInt(a), Integer.parseInt(b), operator);
        else System.out.println("Invalid input");

        return 0;
    }

    private int executeRoman(String a, String b, String operator){
        switch (operator) {
            case "+": return romanToArab.get(a) + romanToArab.get(b);
            case "-": return romanToArab.get(a) - romanToArab.get(b);
            case "/": return romanToArab.get(a) / romanToArab.get(b);
            case "*": return romanToArab.get(a) *  romanToArab.get(b);
        }
        return 0;
    }

    private int executeArab(int a, int b, String operator){
        switch (operator) {
            case "+": return a+b;
            case "-": return a-b;
            case "/": return a/b;
            case "*": return a*b;
        }
        return 0;
    }
}
