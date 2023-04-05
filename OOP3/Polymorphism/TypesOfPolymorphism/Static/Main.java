package com.OOP3.Polymorphism.TypesOfPolymorphism.Static;

// S T A T I C - Polymorphism: is achieved via "Method Overloading".
// Note: it is also called Compile-Time Polymorphism; as java determines; which method to call depending on "arguments" provided.

// Method overloading: When a class has multiple functions/methods with same name,
// but their "types"(void,int..) "return type", "arguments" and "ordering" is different.
// Example: Constructors()
public class Main {
//  Will Throw Error
//  int sum(int b, int a, int c); "Ordering" is different.
//  int sum(String b, int a, String c); "Type" and "arguments" are different.
//  String sum(String a, String b); "Return Type" is different.

    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b , int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Main s1 = new Main();

        System.out.println(s1.sum(2,4));
        System.out.println(s1.sum(2,4,4));
    }
}
