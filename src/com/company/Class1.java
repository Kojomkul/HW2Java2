package com.company;

public class Class1 extends SuperClass implements Printable{
    private String variable2;

    public Class1 (int variable1, String variable2){
        setVariable1(variable1);
        this.variable2 = variable2;
    }

    @Override
    public void print() {
        System.out.println(getVariable1() + " " + variable2);
    }
}
