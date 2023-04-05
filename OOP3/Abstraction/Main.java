package com.OOP3.Abstraction;
// Source: https://www.youtube.com/watch?v=6T_HgnjoYwM

import com.OOP3.Polymorphism.TypesOfPolymorphism.Dynamic.Parent;

public class Main {
//  ABSTRACTION: hiding unnecessary detail and only showing valuable information.
//  Example: car, Gmail.

//  if a class is declared as "abstract" then we cannot call the "constructor" of this class; but we can call its child class.
//  Note: abstract methods are called without any "implementation"; no braces.
//  Example:
//  abstract void coordinate(double deltaX, double deltaY);
//  Note: the "child class" will declare the "IMPLEMENTATION" of the "Parents" abstract method();
    public static void main(String[] args) {

//  Note: R.H.S[constructor()] will determine the output;
        ParentObject circle = new Circle();
        circle.draw();// Drawing the Circle
        circle.resize();// Resizing the Circle


        ParentObject square = new Squre();
        square.draw();// Drawing square
        square.resize();// Resize square

//      Will throw error; as parentObject is itself "abstract"; and cannot define the implementation
//        ParentObject parent = new ParentObject();
    }
}
