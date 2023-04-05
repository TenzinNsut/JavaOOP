package com.OOP3.Encapsulation;

class Students {
//  Data Hiding
//  Note: these variables can't be access outside this class;
//  but with the help of "getters" and "setters" we access and modify them.

//  Private: means these variables can only be accessed within the same class.
    private String name;
    private int age;
    private int standard;

    public Students(){
        this.name = "";
        this.age = 0;
        this.standard = 0;
    }


    public Students(String name, int age, int standard){
        this.name = name;
        this.age = age;
        this.standard = standard;
    }

//  Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setStandard(int standard){
        this.standard = standard;
    }

//  getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public int getStandard(){
        return standard;
    }




}
