package com.OOP3.Abstraction.Navin;

//class Computer{
//    public void code(){};
//}

//   OR

abstract class Computer{
    public abstract void code();
}

//Devices possible;
class Laptop extends Computer{
    public void code(){
        System.out.println("code, compile, run [Laptop]");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("code, compile, run; faster [Desktop]");
    }
}




// Suppose "Raj" is a developer; he needs a device to write code on.
// Loosely coupled; Developer object is not dependent on a Laptop or Desktop; but rather a "Computer"

class Developer{

    public void devApp(Computer comp){
      comp.code();
    }
}

public class LearnAbstraction {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();


        Developer dev = new Developer();
        dev.devApp(desk);

    }
}
