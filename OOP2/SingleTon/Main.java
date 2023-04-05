package com.OOP2.SingleTon;

public class Main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton(); // this will throw error; as the constructor is private.
            Singleton obj = Singleton.getObject();

            Singleton obj2 = Singleton.getObject();
//        Will have the same value as first object;
//        Since purpose of singleton is to create only one object.
    }
}
