package com.OOP1.Constructors;

import java.sql.SQLOutput;

public class Wrapper {
    public static void main(String[] args) {
//      Here "Integer" is Wrapper class
        Integer b = new Integer(5);

//      "final" keyword
        int a = 5;
        a = 3;
        System.out.println(a); // -> 3

//      Final does not allow value to be replaced;
//      "final" -> immutable (for primitive data types (int,char,float..))
        final int NUMBER = 5;

//      "final" -> mutable in case of reference variable of classes
        final Std s1 = new Std(5);
        s1.num = 3;
//      mutable but we cannot reassign it.
//       s1 = new Std(4);
    }
}


class Std{
    int num;
    Std(int num){
        this.num = num;
    }
}