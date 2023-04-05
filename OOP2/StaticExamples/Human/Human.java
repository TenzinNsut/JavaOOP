package com.OOP2.StaticExamples.Human;

class Human {
//  Static: we use it when value of a property is same throughout multiple objects.
//  analogy: population (same for everyone)
    String name;
    int age;
    float height;
//  Static variable
    static long population;

    public Human(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
//      By C O N V E N T I O N -> static:
        Human.population += 1;
    }
}
