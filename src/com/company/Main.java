package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Class1");
        createObject("Class2");
        createObject( "Class3");

    }

    public static String createObject(String className) {
            switch (className) {
                case "Class1":
                    Class1 class1 = new Class1(10,"AAA");
                    return class1;
                case "Class2":
                    Class2 class2 = new Class2(20,"SSS");
                    return class2;
                    break;
                case "Class3":
                    Class3 class3 = new Class3(30, "DDD");
                    return class3;
                    break;
            }
    }


}
