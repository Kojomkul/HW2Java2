package com.company;

public class Class2 extends SuperClass implements Printable{
    private String variable3;

    public Class2 (int variable1, String variable3){
        setVariable1(variable1);
        this.variable3 = variable3;
    }


    @Override
    public void print() {
        System.out.println(getVariable1() + " " + variable3);
    }
}
