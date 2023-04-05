package com.OOP3.InheritanceTypes.HierarchialInheritance;

public class ChildB extends Parent{
    int Price;

    ChildB(){
        super(); // is same as "parent()" constructor. + this.weight = -1;
        this.Price = -1;
    }

    ChildB(ChildA other){
        super(other); // same as calling "Parent(Parent other)" + this.weight = other.weight;
//        this.Price = other.Price;
    }

    ChildB(int length, int width, int height, int newPrice){
        super(length, width, height); // same as calling "Parent(int length, int width, int height)" + this.weight = newWeight;
        this.Price = newPrice;
    }
}
