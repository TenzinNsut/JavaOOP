package com.OOP3.Inheritance;

public class Parent {
//    private double length;  // child would not be able to access it.
    double length;

    double width;
    double height;

//  suppose parent class also have "weight",
//  then we can access this "instance variable" using "super.weight" in the child.
    double weight;


    Parent(){
//        super(); This will refer to object class;
//        since, "Class Object" is the root of all classes.

        this.length = -1;
        this.width  = -1;
        this.height = -1;
    }

    Parent(double sides){

        this.length = sides;
        this.width = sides;
        this.height = sides;
    }
    Parent(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
//  Copy constructor; passed object as input argument;
    Parent(Parent data){
        this.length = data.length;
        this.width = data.width;
        this.height = data.height;
    }

}
