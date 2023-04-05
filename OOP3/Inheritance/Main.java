package com.OOP3.Inheritance;

public class Main {
    public static void main(String[] args) {
//      Inheritance: allows child class to access properties of Parent class ["super" keyword];
//      Note: we cannot access properties that are private.
//      "Private" can only be accessed within the same class not outside.

        Child c1 = new Child(4,6,7,20);
//      Copy constructor;
        Child c2 = new Child(c1);

//      Note: it is reference variable that determines; what members/properties can be accessed;
        Parent p1 =  new Child(2,5,6,7);
        System.out.println(p1.length);
//        System.out.println(p1.weight); // cannot be accessed because it belongs to "Child" and not "Parent"


        System.out.println(c1.length+" " +c1.width+ " " + c1.length +" " + c1.weight);
        System.out.println("Copy constructor: ");
        System.out.println(c2.length+" " +c2.width+ " " + c2.length +" " + c2.weight);

    }
}
