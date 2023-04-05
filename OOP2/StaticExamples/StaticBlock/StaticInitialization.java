package com.OOP2.StaticExamples.StaticBlock;

public class StaticInitialization {
    static int a = 5;
    static int b;

//   STATIC BLOCK
    static {
    System.out.println("I am called..");
    b = a * 3;
    }

    public static void main(String[] args) {
//      Same values will be passed to both the objects
        StaticInitialization obj1 = new StaticInitialization();
        System.out.println(obj1.a + " " + obj1.b);

        StaticInitialization obj2 = new StaticInitialization();
        System.out.println(obj2.a + " " + obj2.b);
    }


}
