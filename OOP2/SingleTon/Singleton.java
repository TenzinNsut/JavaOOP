package com.OOP2.SingleTon;

public class Singleton {
//    Singleton: used to create only one object under same class only; not outside.
//    so we must prevent other classes from accessing its "constructor()"
//    since "constructor()" is responsible for creating objects.

//    Constructor
    private Singleton(){
    }

    private static Singleton obj; // same as: "ClassName objectName" = new ClassName();

    public static Singleton getObject(){
//  Check whether 1 object is created or not.
        if(obj == null){
            obj = new Singleton();
        }
        return obj;
    }
}
