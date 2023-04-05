package com.OOP3.InheritanceTypes.SingleInheritance;

//In Single Inheritance there is only Parent and Child relation.
//Only two classes; Parent and child.

public class Parent {
    String name;
    int age;
    double salary;

    Parent(){
        this.name = "";
        this.age = 0;
        this.salary = 0;
    }

    public Parent(String name, int age, double salary){
        this.name = name;
        this.age =  age;
        this.salary = salary;
    }
}
