package com.OOP3.Polymorphism.TypesOfPolymorphism.Dynamic;

public class Child extends Parent {
//  This is called "annotation"; 
//  used to check whether method is overridden or not;
//  if not "@Override" will throw error.
    @Override
//  This function/method will run; when object of "Child" class is created;
//  Hence it is overriding, "Parent".
    void write(){
        System.out.println("I am child");
    }
}
