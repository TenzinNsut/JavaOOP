package com.OOP2.StaticExamples.InnerClass;

// We cannot use "static" with outer Class.
// Note: "static" is resolved during compile time; as it does not depend on objects.
public class OuterClass {

//  Inner class becomes Independent after using adding "static" keyword;
//  else it is dependent on outer class.
    static class InnerClass{
        String name;
        InnerClass(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClass obj = new InnerClass("Tenzin");
        InnerClass obj2 = new InnerClass("Rahul");

        System.out.println(obj.name);
        System.out.println(obj2.name);

    }
}
