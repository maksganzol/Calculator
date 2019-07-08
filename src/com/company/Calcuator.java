package com.company;

public class Calcuator {

    private  Executer executer;

    public Calcuator(){
        executer = new Executer();
    }

    public int calc(String expr){
       String[] members = Parser.parse(expr);
       return executer.execute(members[0], members[1], members[2]);
    }
}
