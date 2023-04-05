package com.OOP3.Abstraction;

class Circle extends ParentObject {
//  writing the implementation of "abstract methods()" from Parent object
    @Override
    void draw() {
        System.out.println("Drawing the Circle");
    }

    @Override
    void resize() {
        System.out.println("Resizing the Circle");
    }
}
