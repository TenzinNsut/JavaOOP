package com.OOP5.Abstraction;

//abstract class:
abstract class Parent {


    //regular method
    void normalMethod(){
        System.out.println("Just a normal method");
    }

    //Static method
    static void staticHello(){
        System.out.println("static says hello");
    }

    //abstract method
    abstract void career();
}
class Son extends Parent {
    // provide implementation of abstract method
    @Override
    void career() {
        System.out.println("Career: coding");
    }
}
class Daughter extends Parent {
    // provide implementation of abstract method
    @Override
    void career() {
        System.out.println("Career: doctor");
    }
}


public class Main {
    public static void main(String[] args) {

        Son son = new Son();
        son.career();//"Career: coding"

        Daughter daughter = new Daughter();
        daughter.career();//"Career: doctor"

//      Parent parent = new Parent(); throws error
        Parent obj = new Son(); // son() constructor can access the regular methods() of abstract classes
        obj.normalMethod(); // "Just a normal method"

//      Since, static methods don't need objects to initialised
        Parent.staticHello(); // "static says hello"
    }
}
