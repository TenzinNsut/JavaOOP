package com.OOP2.StaticExamples.Human;

import com.OOP2.StaticExamples.Human.Human;

public class Main {
//  Static: we use it when value of a property is same throughout multiple objects.
//  analogy: population (same for everyone)

//  Here in "psvm" we can access the "main" function without actually creating any objects under "class Main/anything"
//  we can see that we haven't created any object under "class Main". But still we are able to run "main function".
//  It is because of the "static" keyword.

//   Therefore, we can conclude that anything that is "non-static" belongs to any object.

    public static void main(String[] args) {
        Human h1 = new Human("John", 20, 5.9f);
        Human h2 = new Human("Raj", 22, 5.7f);

//        System.out.println(h1.name);
//        System.out.println(h2.name);

//      Printing static variable
//        System.out.println(h1.population);
//        System.out.println(h2.population);
//      Output: 2; because there are in  total two objects for this case;

//      C O N V E N T I O N A L way of printing is: className.staticVariable
        System.out.println(Human.population);
//      Note: static variables can be accessed, even before object creation.


//        greeting();
    }

//  function won't run until I add static in front of it.
    void greeting(){
        System.out.println("hello world");
    }
}
