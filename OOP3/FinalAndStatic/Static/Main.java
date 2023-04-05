package com.OOP3.FinalAndStatic.Static;

import com.sun.source.tree.ParenthesizedPatternTree;

public class Main {
//  "overriding" depends on objects
//  "static" does not depend on objects

//  Note: "static" prevents overriding;
//  Also, static methods can be"inherited"
    public static void main(String[] args) {
        Hello h1 = new Hello();

        h1.write();
//      Hello.write(); would throw error; not a static method.

//        h1.greet(); it works

//      It will work as this method is declared as static;
//      So, we can access the function without creating an object(h1).
        Hello.greet(); // "Greetings"


        Parent p1 = new Hello(); //Greetings! I am in Hello
        Parent.greet(); // Greetings! I am in Parent
//      So, we can conclude that, function to be called depends on reference variable.
    }
}
