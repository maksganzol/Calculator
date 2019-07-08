package com.company;

/**
 * This class parses string to operands and operators
 */

public class Parser {
    private static String a, b, operator;

    public static String[] parse(String expr){
        String[] operands = expr.split("\\+");
        if(operands.length !=2) {
            operands = expr.split("-");
            if(operands.length!=2) {
                operands = expr.split("\\*");
                if(operands.length!=2){
                    operands = expr.split("/");
                    if(operands.length!=2)
                        System.out.println("Illegal expression!");
                    else{
                        a = operands[0];
                        b = operands[1];
                        operator = "/";
                    }
                }else {
                    a = operands[0];
                    b = operands[1];
                    operator = "*";
                }
            }else {
                a = operands[0];
                b = operands[1];
                operator = "-";
            }
        }else {
            a = operands[0];
            b = operands[1];
            operator = "+";
        }

        return new String[]{a, b, operator};
    }
}
