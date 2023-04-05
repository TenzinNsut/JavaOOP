package com.OOP3.Inheritance;

public class Child extends Parent {
    double weight;

//    Child(Child other){
//        super(other);
//        weight = other.weight;
//    }

    public Child(){
        this.weight =-1;
    }
    public Child(double length, double width, double height, double weight){
//      Properties from parent constructor; refers to the constructor of parent.
        super(length, width, height);

//        This will refer to instance variable  of Parent class.
//        System.out.println(super.weight);

//        This will refer to instance variable  of current class.(child class)
//        System.out.println(this.weight);
        this.weight = weight;
    }

//   Copy constructor
    public  Child(Child data){
        this.length = data.length;
        this.width = data.width;
        this.height = data.height;
        this.weight = data.weight;
    }


//  Copy constructor;

}

