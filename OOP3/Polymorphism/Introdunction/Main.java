package com.OOP3.Polymorphism.Introdunction;

public class Main {
//  P O L Y M O R P H I S M:
//    Poly - > many
//    Morphism - > ways to represent.
    public static void main(String[] args) {

//      Here all class have same FunctionName yet there is no conflict; this is also polymorphism.
        Shapes shape =  new Shapes();
        shape.Print();

        Triangle Tri = new Triangle();
        Tri.Print();

        Square sqr = new Square();
        sqr.Print();
    }
}
