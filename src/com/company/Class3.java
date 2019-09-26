package com.company;

public class Class3 extends SuperClass implements Printable{
    private String variable4;

    public Class3 (int variable1, String variable4){
        setVariable1(variable1);
        this.variable4 = variable4;
    }

    @Override
    public void print() {
        System.out.println(getVariable1() + " " + variable4);
    }
}
