package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calcuator calcuator = new Calcuator();
        String answ;
        while (true) {
            System.out.println("Input your expression: ");
            System.out.println(calcuator.calc(sc.next()));
            System.out.println("If you want to continue, press Y");
            answ = sc.next();
            if(!answ.equals("Y"))
                break;

        }
    }
}
