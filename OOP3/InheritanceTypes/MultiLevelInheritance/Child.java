package com.OOP3.InheritanceTypes.MultiLevelInheritance;

public class Child extends Parent {
//  Will inherit properties of "Parent".
    int weight;

    Child(){
        super(); // is same as "parent()" constructor. + this.weight = -1;
        this.weight = -1;
    }

    Child(Child other){
        super(other); // same as calling "Parent(Parent other)" + this.weight = other.weight;
        this.weight = other.weight;
    }

    Child(int length, int width, int height, int newWeight){
        super(length, width, height); // same as calling "Parent(int length, int width, int height)" + this.weight = newWeight;
        this.weight = newWeight;
    }
}
