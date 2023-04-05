package com.OOP3.InheritanceTypes.HierarchialInheritance;

import com.OOP3.InheritanceTypes.MultiLevelInheritance.Child;

public class ChildA extends Parent {
    int weight;

    ChildA(){
        super(); // is same as "parent()" constructor. + this.weight = -1;
        this.weight = -1;
    }

    ChildA(ChildA other){
        super(other); // same as calling "Parent(Parent other)" + this.weight = other.weight;
        this.weight = other.weight;
    }

    ChildA(int length, int width, int height, int newWeight){
        super(length, width, height); // same as calling "Parent(int length, int width, int height)" + this.weight = newWeight;
        this.weight = newWeight;
    }
}
