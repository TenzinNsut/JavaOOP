package com.OOP3.Polymorphism.TypesOfPolymorphism.Dynamic;
// D Y N A M I C - Polymorphism: is achieved via "Method Overriding".

// Method overriding: When Parent and Child classes has exactly same function/method.

public class Main {
    public static void main(String[] args) {
//      Note: if "Child" class did not have any "write()" method; it would've called the "Parent method"
//      Since both classes have sameName functions/methods.

//      Note: child cannot call "Parent()" constructor.
        Child obj = new Child();
        obj.write(); // "I am child" or I am Parent

        Parent obj2 = new Parent();
        obj2.write();// "I am Parent"

//      it depends on "reference variable"
        Parent obj3 = new Child();
        obj3.write(); // "I am child" or I am Parent
//      output: "I am child"; since it is called "Child()" constructor.

    }
}
