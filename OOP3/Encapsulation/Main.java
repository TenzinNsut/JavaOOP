package com.OOP3.Encapsulation;
// source: https://www.youtube.com/watch?v=6T_HgnjoYwM

class Main {
//  ENCAPSULATION: restricts properties/instance-variables to accessed by outside world/classes.
//  Note: we are just restricting the access to properties; but we can still access these variables values with "getters and setters"
    public static void main(String[] args) {

        Test t1 = new Test();
        t1.name = "Tenzin";
        System.out.println(t1.name);//


//      Encapsulation example:
        Students s1 = new Students();
//      s1.name = "Tenzin"; Throws error as; these "instance variables" are set as private
//      and cannot be accessed by outside classes
        System.out.println(s1.getAge());
    }
}
