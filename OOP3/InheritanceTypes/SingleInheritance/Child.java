package com.OOP3.InheritanceTypes.SingleInheritance;

public class Child extends Parent{
    String name;
    String hobby;

    Child(){
        super();
        this.name = "";
        this.hobby = "";
    }

    Child(String name, int age, double Salary, String hobby){
        super(name, age, Salary);
        super.name = name; // will refer to Parent.
        this.name = name; // will refer to Child.
    }
}
