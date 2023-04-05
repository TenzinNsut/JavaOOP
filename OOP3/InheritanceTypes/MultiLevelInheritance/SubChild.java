package com.OOP3.InheritanceTypes.MultiLevelInheritance;

public class SubChild extends Child{
//  Will inherit properties of both "Child" and "Parent".
    int price;

    SubChild(){
        super(); // this will refer to "Child()" which intern will refer to "Parent()".
        this.price = -1;
    }

    SubChild(SubChild other){
        super(other); // this will refer to "Child(Child other)" which intern will refer to "Parent(Parent other)".
        this.price = other.price;
    }

    SubChild(int length, int width, int height, int weight, int newPrice){
        super(length, width, height, weight); //this will refer to "Child(...int height int weight)" which intern will refer to "Parent(..int height)".
        this.price = newPrice;
    }
}
