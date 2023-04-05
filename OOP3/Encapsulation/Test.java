package com.OOP3.Encapsulation;

class Test {
    String name;
    int age;
    int standard;

    Test(){
        this.name =  "";
        this.age = 0;
        this.standard = 0;
    }

    Test(String name, int age, int standard){
        this.name =  name;
        this.age = age;
        this.standard = standard;
    }
}
