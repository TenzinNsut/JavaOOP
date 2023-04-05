package com.OOP3.Abstraction;

class Squre extends ParentObject{
    @Override
    void draw() {
        System.out.println("Drawing square");
    }

    @Override
    void resize() {
        System.out.println("Resize square");
    }
}
