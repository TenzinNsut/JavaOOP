package com.OOP3.Abstraction;

//  abstract parent class;
abstract class ParentObject {
    void write(){
        System.out.println("Hello world");
    }

//  abstract methods;
    abstract void draw();
    abstract void resize();
}
