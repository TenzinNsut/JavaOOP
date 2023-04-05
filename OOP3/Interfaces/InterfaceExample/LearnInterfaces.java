package com.OOP3.Interfaces.InterfaceExample;

//class Computer{
//    public void code(){};
//}

//   OR

interface Computer{
    public abstract void code();
}

//Devices possible;
class Laptop implements Computer {
    public void code(){
        System.out.println("code, compile, run [Laptop]");
    }
}

class Desktop implements Computer {
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



public class LearnInterfaces {
    public static void main(String[] args) {

            Computer lap = new Laptop();
            Computer desk = new Desktop();

            Developer dev = new Developer();
            dev.devApp(lap); // "code, compile, run [Laptop]"


    }
}
