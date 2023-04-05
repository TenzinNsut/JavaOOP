package com.OOP2.StaticExamples.StaticAndNonStatic;

public class StaticInsideNonStatic {

    static void greet(){
// "Static" can run without having any object under any class.
//  It will throw error.
//        fun();
//  "fun()" can't be called because it is non-static;

//  Alternatively, we can create an object to run the "non-static" function.
        StaticInsideNonStatic obj = new StaticInsideNonStatic();
        obj.fun(); // it will run without any error
    }

    void fun(){
//      Note "Static" can be called inside a "Non-static" function.
        greet();
        System.out.println("Its fun");
    }
}
