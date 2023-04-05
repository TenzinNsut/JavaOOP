package com.OOP3.InheritanceTypes.HierarchialInheritance;

//In Hierarchical Inheritance 1 Parent will have multiple Child classes;
public class Parent {
    int length;
    int width;
    int height;

    Parent(){
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    Parent(Parent other){
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;
    }

    Parent(int newLength, int newWidth, int newHeight){
        this.length = newLength;
        this.width = newWidth;
        this.height = newHeight;
    }


}
