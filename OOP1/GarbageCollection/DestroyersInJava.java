package com.OOP1.GarbageCollection;
import java.util.*;
public class DestroyersInJava {
    public static void main(String[] args) {
// In "JAVA" we cannot destroy objects manually;
// but we can "Specify" some action that must be performed after "Destruction" of the object.
        Car c1;
        for(int i = 0; i < 1000000000; i++){
            c1 = new Car("random");
        }

    }
}
class Car{
    String data;
    Car(String data){
        this.data = data;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object has been destroyed...");
    }
}
