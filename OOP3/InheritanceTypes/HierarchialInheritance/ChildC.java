package com.OOP3.InheritanceTypes.HierarchialInheritance;

public class ChildC extends Parent{
    int age;

    ChildC(){
        super(); // is same as "parent()" constructor. + this.weight = -1;
        this.age = -1;
    }

    ChildC(ChildA other){
        super(other); // same as calling "Parent(Parent other)" + this.weight = other.weight;
//        this.age = other.age;
    }

    ChildC(int length, int width, int height, int newAge){
        super(length, width, height); // same as calling "Parent(int length, int width, int height)" + this.weight = newWeight;
        this.age = newAge;
    }
}
